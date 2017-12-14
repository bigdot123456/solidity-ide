/**
 * Copyright (c) 2017 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Andreas Muelder - Itemis AG - initial API and implementation
 * 	Karsten Thoms   - Itemis AG - initial API and implementation
 * 	Florian Antony  - Itemis AG - initial API and implementation
 * 	committers of YAKINDU 
 * 
 */
package com.yakindu.solidity.compiler.parameter;

/**
 * 
 * @author Florian Antony - Initial contribution and API
 *
 */
public class Metadata {

	private Boolean useLiteralContent;

	public Boolean getUseLiteralContent() {
		return useLiteralContent;
	}

	public void setUseLiteralContent(Boolean useLiteralContent) {
		this.useLiteralContent = useLiteralContent;
	}
}
