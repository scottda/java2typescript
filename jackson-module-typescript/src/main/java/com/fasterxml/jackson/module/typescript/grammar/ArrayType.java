/*******************************************************************************
 * Copyright 2013 Raphael Jolivet
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.fasterxml.jackson.module.typescript.grammar;

import java.io.IOException;
import java.io.Writer;

import com.fasterxml.jackson.module.typescript.grammar.base.AbstractType;

public class ArrayType extends AbstractType {
	private AbstractType itemType;

	public ArrayType() {
	}

	public ArrayType(AbstractType aType) {
		itemType = aType;
	}

	@Override
	public void write(Writer writer) throws IOException {
		itemType.write(writer);
		writer.write("[]");
	}

	public void setItemType(AbstractType itemType) {
		this.itemType = itemType;
	}

}
