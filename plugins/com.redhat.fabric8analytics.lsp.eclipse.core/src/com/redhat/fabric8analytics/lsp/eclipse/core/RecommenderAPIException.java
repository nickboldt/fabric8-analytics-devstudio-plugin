/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Incorporated - initial API and implementation
 *******************************************************************************/

package com.redhat.fabric8analytics.lsp.eclipse.core;

import org.json.JSONObject;

public class RecommenderAPIException extends Exception {

	private static final long serialVersionUID = 5832040983192144417L;

	private JSONObject jsonObject;
	
	public RecommenderAPIException(JSONObject jsonObj) {
		this.jsonObject = jsonObj;
	}
	
	public RecommenderAPIException(Exception e) {
		super(e);
	}

	public RecommenderAPIException(String msg) {
		super(msg);
	}

	@Override
	public String getMessage() {
		if (jsonObject != null) {
			return jsonObject.toString();
		}
		return super.getMessage();
	}
}
