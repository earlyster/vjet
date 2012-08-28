@rem ***************************************************************************
@rem Copyright (c) 2012 eBay Inc. and others.
@rem All rights reserved. This program and the accompanying materials
@rem are made available under the terms of the Eclipse Public License v1.0
@rem which accompanies this distribution, and is available at
@rem http://www.eclipse.org/legal/epl-v10.html
@rem
@rem Contributors:
@rem     eBay Inc. - initial API and implementation
@rem ***************************************************************************
REM create this file as we need start.bat for reverse engineering for build scripts tool
REM set env variables. please use / instead of \
REM use set root.home=c:/yourDir to set root.home


@echo off
set TEST_HOME=%CLEARCASE_HOME%\nexustools\com.ebay.tools\com.ebay.tools.testframework\tests\com.ebay.tools.testframework.test\pdebuild\TestFrameWorkBuild

set ede.eclipse.home=%ECLIPSE_HOME%
set component.name=TestFrameWork

set root.home=%AUTOTEST_HOME%



ant -buildfile %TEST_HOME%\build.xml

pause