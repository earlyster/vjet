/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.vjet.testframework;

import org.eclipse.vjet.testframework.artifact.ArtifactManagerRegistry;
import org.eclipse.vjet.testframework.artifact.IArtifactDef;
import org.eclipse.vjet.testframework.artifact.IArtifactManager;
import org.eclipse.vjet.testframework.artifactmanager.project.ZipProjectArtifactManager;
import org.eclipse.vjet.testframework.fixture.FixtureDefManager;
import org.eclipse.vjet.testframework.fixture.FixtureManager;
import org.eclipse.vjet.testframework.fixture.FixtureUtils;
import org.eclipse.vjet.testframework.fixture.IFixtureDef;
import org.eclipse.vjet.testframework.sandbox.ISandbox;
import org.eclipse.vjet.testframework.sandbox.Sandbox;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;


public class ProjectArtifactManagerTests extends TestCase {


	static int WAIT_COUNTDOWN = 10;

	public void testFixturesSetup() {
		
		FixtureManager fixtureManager = null;
		try {
			
			fixtureManager = new FixtureManager(this);
			fixtureManager.setUpAll();
			
		} catch (Throwable e) {
			fail("Something really bad happened: " + e.getMessage());
		} finally {
			
			if (fixtureManager != null) {
				fixtureManager.tearDown();
			}
		}
	}

	
	/*
	 * This is a negative testcase for ProjectArtifactManager.init()
	 */
	public void testInit() {

		ISandbox sandBox = new Sandbox(this);
		sandBox.setUp();
		FixtureDefManager fixtureDefManager = FixtureUtils.createFixtureDefManagerFromXml(
															TestConstants.INVALID_FIXTURE_FILENAME, 
															this, sandBox);

		FixtureManager fixtureManager = new FixtureManager(this, fixtureDefManager);

		//Find out the fixture and artifact definition with no project name
		IFixtureDef testFixture = fixtureManager.getFixtures().getFixtureDef(TestConstants.ZIP_PROJECT_NO_NAME_FIXTURE_ID);
		System.out.println("Using Fixture Definition : " + testFixture.getFixtureId());

		IArtifactDef artifactDef = ArtifactTestHelper.getArtifactDefWithType(testFixture, new ZipProjectArtifactManager().getArtifactType());
		IArtifactManager projectArtifactManager = ArtifactManagerRegistry.getInstance().
														getArtifact(ZipProjectArtifactManager.ARTIFACT_MANAGER_ID);

		try {

			// We expect an exception here as there is no 'project name' associated with the artifact
			projectArtifactManager.init(artifactDef, sandBox);
			fail("ProjectArtifactManagerTests.testInit() : Expected exception not thrown ...");

		} catch (Exception e) {

			System.out.println("ProjectArtifactManagerTests.testInit() : Expected exception thrown");
		}
		
		finally {
			
			sandBox.tearDown();
		}
	}
	

	/*
	 * This is a negative testcase for ProjectArtifactManager.setUp()
	 */
	public void testSetUp() {

		ISandbox sandBox = new Sandbox(this);
		sandBox.setUp();
		
		FixtureDefManager fixtureDefManager = FixtureUtils.createFixtureDefManagerFromXml(
																TestConstants.VALID_FIXTURE_FILENAME, 
																this, sandBox);

		FixtureManager fixtureManager = new FixtureManager(this, fixtureDefManager);

		//Find out the fixture and artifact definition with no project name
		IFixtureDef testFixture = fixtureManager.getFixtures().getFixtureDef(TestConstants.VALID_ZIP_PROJECT_FIXTURE_ID);
		System.out.println("Using Fixture Definition : " + testFixture.getFixtureId());

		IArtifactDef artifactDef = ArtifactTestHelper.getArtifactDefWithType(testFixture, ZipProjectArtifactManager.ARTIFACT_MANAGER_ID);
		IArtifactManager projectArtifactManager = ArtifactManagerRegistry.getInstance().
																getArtifact(ZipProjectArtifactManager.ARTIFACT_MANAGER_ID);		
		
		try {

			projectArtifactManager.init(artifactDef, sandBox);
			projectArtifactManager.setUp();

			// This should result in an exception because the sandbox folder got deleted
			fixtureManager.tearDown();
			projectArtifactManager.setUp();

			fail("ProjectArtifactManagerTests.testInit() : Expected exception not thrown ...");

		} catch (AssertionFailedError assertFail) {

			System.out.println("Expected Exception not thrown ...");
			fail("Expected Exception not thrown ...");

		} catch (Exception ex) {

			System.out
					.println("testProjectUtilImportProject: Expected exception thrown ..."
							+ ex.getMessage());
			ex.printStackTrace();
		}

		finally {
			
			sandBox.tearDown();
		}
	}

}
