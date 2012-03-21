/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfjson.twitter.junit.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.eclipselabs.emfjson.search.ResultType;
import org.eclipselabs.emfjson.search.SearchPackage;
import org.eclipselabs.emfjson.twitter.Search;
import org.junit.Before;
import org.junit.Test;

public class TestSearchBasic {

	final Map<String ,Object> options = new HashMap<String, Object>();
	ResourceSet resourceSet;
	
	@Before
	public void tearUp() {
		resourceSet = new ResourceSetImpl();
		
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("text/json", new JsResourceFactoryImpl());
	}
	
	@Test
	public void testOneSearch() throws IOException {
		Search search = new Search("cat")
			.count(1)
			.resultType(ResultType.MIXED);
		
		Resource resource = resourceSet.createResource(search.getURI(), "text/json");
		options.put(EMFJs.OPTION_ROOT_ELEMENT, SearchPackage.eINSTANCE.getResult());
		
		assertNotNull(resource);
		
		resource.load(options);
		
		assertFalse(resource.getContents().isEmpty());
		
		System.out.println(resource.getContents());
	}
	
}