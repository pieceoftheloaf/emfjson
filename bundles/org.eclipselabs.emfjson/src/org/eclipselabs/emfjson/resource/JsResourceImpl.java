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
package org.eclipselabs.emfjson.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipselabs.emfjson.map.EObjectMapper;

/**
 * A {@link Resource} implementation that read and write it's content in JSON.
 */
public class JsResourceImpl extends ResourceImpl {

	public JsResourceImpl() {
		super();
	}

	public JsResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		if (options == null) {
			options = Collections.<String, Object> emptyMap();
		}

		final EObjectMapper mapper = new EObjectMapper();
		mapper.from(inputStream, this, options);
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		if (options == null) {
			options = Collections.<String, Object> emptyMap();
		}

		final EObjectMapper mapper = new EObjectMapper();
		mapper.write(outputStream, this, options);
	}

}
