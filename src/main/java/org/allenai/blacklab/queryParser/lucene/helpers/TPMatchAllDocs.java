/*******************************************************************************
 * Copyright (c) 2010, 2012 Institute for Dutch Lexicology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.allenai.blacklab.queryParser.lucene.helpers;

import org.allenai.blacklab.search.QueryExecutionContext;
import org.allenai.blacklab.search.TextPattern;
import org.allenai.blacklab.search.TextPatternTranslator;

public class TPMatchAllDocs extends TextPattern {

	public TPMatchAllDocs() {
		throw new RuntimeException("Match all docs is not supported");
	}

	@Override
	public <T> T translate(TextPatternTranslator<T> translator, QueryExecutionContext context) {
		throw new RuntimeException("Match all docs is not supported");
	}

}