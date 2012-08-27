/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.service.serializer;

import java.io.UnsupportedEncodingException;

import org.eclipse.vjet.dsf.json.serializer.ArraySerializer;
import org.eclipse.vjet.dsf.json.serializer.BeanSerializer;
import org.eclipse.vjet.dsf.json.serializer.BooleanSerializer;
import org.eclipse.vjet.dsf.json.serializer.DateSerializer;
import org.eclipse.vjet.dsf.json.serializer.DictionarySerializer;
import org.eclipse.vjet.dsf.json.serializer.EnumSerializer;
import org.eclipse.vjet.dsf.json.serializer.JsonRpcSerializer;
import org.eclipse.vjet.dsf.json.serializer.ListSerializer;
import org.eclipse.vjet.dsf.json.serializer.MapSerializer;
import org.eclipse.vjet.dsf.json.serializer.NumberSerializer;
import org.eclipse.vjet.dsf.json.serializer.PrimitiveSerializer;
import org.eclipse.vjet.dsf.json.serializer.SerializationException;
import org.eclipse.vjet.dsf.json.serializer.SetSerializer;
import org.eclipse.vjet.dsf.json.serializer.StringSerializer;
import org.eclipse.vjet.dsf.services.IRequestValidator;

/**
 * 
 */
public class JsonSerializer implements ISerializer {

	private static JsonSerializer s_instance;
	private JsonRpcSerializer m_rpcSerializer;

	public static JsonSerializer getInstance() {
		if (s_instance == null) {
			s_instance = new JsonSerializer();
		}
		return s_instance;
	}

	/**
	 * 
	 */
	private JsonSerializer() {
		super();
		try {
			m_rpcSerializer = new JsonRpcSerializer();
			/* registering default serializers */ 		
			m_rpcSerializer.registerSerializer(new ArraySerializer());
			m_rpcSerializer.registerSerializer(new DictionarySerializer());
			m_rpcSerializer.registerSerializer(new MapSerializer());
			m_rpcSerializer.registerSerializer(new SetSerializer());
			ListSerializer listSer = new ListSerializer();
			listSer.setMarshallClassHints(false);
			m_rpcSerializer.registerSerializer(listSer);
			m_rpcSerializer.registerSerializer(new DateSerializer());
			m_rpcSerializer.registerSerializer(new StringSerializer());
			m_rpcSerializer.registerSerializer(new NumberSerializer());
			m_rpcSerializer.registerSerializer(new BooleanSerializer());
			m_rpcSerializer.registerSerializer(new PrimitiveSerializer());
			m_rpcSerializer.registerSerializer(new EnumSerializer());
			/* Do not add the class name in the JSON string */
			BeanSerializer bSer = new BeanSerializer();
			bSer.setMarshallClassHints(false);
			m_rpcSerializer.registerSerializer(bSer);
			//m_rpcSerializer.registerSerializer(new VjoObjSerializer());
		} catch (SerializationException e) {
			//TODO
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.vjet.dsf.services.Serializer#deserialize(String, Class)
	 */
	public Object deserialize(
		final String aContent, final Class aClass, final IRequestValidator validator)
			throws SerializationException
	{
		return m_rpcSerializer.fromJSON(aContent, aClass, validator);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.vjet.dsf.services.Serializer#serialize(java.lang.Object)
	 */
	public String serialize(final Object aSource)
		throws SerializationException, UnsupportedEncodingException
	{
		String str = m_rpcSerializer.toJSON(aSource);
		return str;
		//return (str == null) ? null : str.getBytes("utf-8");
	}
	
	public org.eclipse.vjet.dsf.json.serializer.ISerializer getSerializer(final Object obj) {
		if (obj==null) {
			return null;
		}
		return m_rpcSerializer.getSerializer(obj.getClass(), null);
	}
}