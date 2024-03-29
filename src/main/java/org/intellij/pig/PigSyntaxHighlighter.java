/*
 * Copyright 2012-2013 Brandon Kearby
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.pig;

import consulo.codeEditor.DefaultLanguageHighlighterColors;
import consulo.colorScheme.TextAttributesKey;
import consulo.language.ast.IElementType;
import consulo.language.ast.TokenType;
import consulo.language.editor.highlight.SyntaxHighlighterBase;
import consulo.language.lexer.Lexer;
import org.intellij.pig.psi.PigTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;


public class PigSyntaxHighlighter extends SyntaxHighlighterBase
{
	public static final TextAttributesKey ILLEGAL = TextAttributesKey.createTextAttributesKey("PIG_ILLEGAL", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
	public static final TextAttributesKey LINE_COMMENT = TextAttributesKey.createTextAttributesKey("PIG_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BLOCK_COMMENT = TextAttributesKey.createTextAttributesKey("PIG_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
	public static final TextAttributesKey DOC_COMMENT = TextAttributesKey.createTextAttributesKey("PIG_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
	public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("PIG_STRING", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("PIG_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
	public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("PIG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey PARENTHESES = TextAttributesKey.createTextAttributesKey("PIG_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
	public static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey("PIG_BRACES", DefaultLanguageHighlighterColors.BRACES);
	public static final TextAttributesKey BRACKETS = TextAttributesKey.createTextAttributesKey("PIG_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
	public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey("PIG_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
	public static final TextAttributesKey OP_SIGN = TextAttributesKey.createTextAttributesKey("PIG_OP_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);

	public static Set<IElementType> NUMBER_ELEMENTS = new HashSet<IElementType>();

	static
	{
		NUMBER_ELEMENTS.add(PigTypes.PIG_DOUBLE_LITERAL);
		NUMBER_ELEMENTS.add(PigTypes.PIG_INTEGER_LITERAL);
		NUMBER_ELEMENTS.add(PigTypes.PIG_FLOAT_LITERAL);
		NUMBER_ELEMENTS.add(PigTypes.PIG_LONG_LITERAL);
	}

	public static Set<IElementType> KEYWORD_ELEMENTS = new HashSet<IElementType>();

	static
	{
		KEYWORD_ELEMENTS.add(PigTypes.PIG_AS);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_ASC);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_BAG);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_BY);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_BYTEARRAY);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_CHARARRAY);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_COGROUP);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_CROSS);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_CUBE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DESC);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DECLARE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DISTINCT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DEFAULT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DOUBLE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DEFINE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DATETIME);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_DUMP);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_FALSE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_FILTER);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_FLOAT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_FULL);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_FLATTEN);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_FOREACH);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_GENERATE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_GROUP);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_IF);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_ILLUSTRATE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_IMPORT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_INTEGER);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_INTO);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_INT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_IS);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_LIMIT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_LOAD);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_LONG);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_MAP);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_NULL);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_ORDER);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_OTHERWISE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_ONSCHEMA);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_MAPREDUCE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_PARALLEL);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_PARTITION);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_ROLLUP);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_RANK);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_REGISTER);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_RMF);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_SAMPLE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_SPLIT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STORE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STREAM);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_SET);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_THROUGH);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_TRUE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_TUPLE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_USING);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_UNION);

		KEYWORD_ELEMENTS.add(PigTypes.PIG_STR_OP_MATCHES);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STR_OP_GT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STR_OP_GTE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STR_OP_LT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STR_OP_LTE);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STR_OP_EQ);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_STR_OP_NE);

		// Join
		KEYWORD_ELEMENTS.add(PigTypes.PIG_AND);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_OR);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_NOT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_JOIN);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_LEFT);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_INNER);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_OUTER);
		KEYWORD_ELEMENTS.add(PigTypes.PIG_RIGHT);
	}

	@NotNull
	@Override
	public Lexer getHighlightingLexer()
	{
		return new _PigLexer();
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType type)
	{
		if(type == TokenType.BAD_CHARACTER)
		{
			return pack(ILLEGAL);
		}
		if(type == PigTypes.PIG_TRADITIONAL_COMMENT)
		{
			return pack(BLOCK_COMMENT);
		}
		if(type == PigTypes.PIG_END_OF_LINE_COMMENT)
		{
			return pack(LINE_COMMENT);
		}
		if(type == PigTypes.PIG_DOC_COMMENT)
		{
			return pack(DOC_COMMENT);
		}
		if(type == PigTypes.PIG_QUOTEDSTRING)
		{
			return pack(STRING);
		}
		if(type == PigTypes.PIG_EXECCOMMAND)
		{
			return pack(STRING);
		}
		if(type == PigTypes.PIG_FILENAME)
		{
			return pack(STRING);
		}
		if(type == PigTypes.PIG_EQUAL)
		{
			return pack(OP_SIGN);
		}
		if(type == PigTypes.PIG_LP || type == PigTypes.PIG_RP)
		{
			return pack(PARENTHESES);
		}
		if(type == PigTypes.PIG_RBRACE || type == PigTypes.PIG_LBRACE)
		{
			return pack(BRACES);
		}
		if(type == PigTypes.PIG_RBRACKET || type == PigTypes.PIG_LBRACKET)
		{
			return pack(BRACKETS);
		}
		if(type == PigTypes.PIG_IDENTIFIER || type == PigTypes.PIG_ID)
		{
			return pack(IDENTIFIER);
		}
		if(KEYWORD_ELEMENTS.contains(type))
		{
			return pack(KEYWORD);
		}
		if(NUMBER_ELEMENTS.contains(type))
		{
			return pack(NUMBER);
		}
		return EMPTY;
	}
}
