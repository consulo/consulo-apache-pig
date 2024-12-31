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

import consulo.annotation.component.ExtensionImpl;
import consulo.language.Language;
import consulo.language.ast.ASTNode;
import consulo.language.ast.IFileElementType;
import consulo.language.ast.TokenSet;
import consulo.language.ast.TokenType;
import consulo.language.file.FileViewProvider;
import consulo.language.lexer.Lexer;
import consulo.language.parser.ParserDefinition;
import consulo.language.parser.PsiParser;
import consulo.language.psi.PsiElement;
import consulo.language.psi.PsiFile;
import consulo.language.version.LanguageVersion;
import org.intellij.pig.parser.PigParser;
import org.intellij.pig.psi.PigFile;
import org.intellij.pig.psi.PigTokenType;
import org.intellij.pig.psi.PigTypes;
import org.jetbrains.annotations.NotNull;

import jakarta.annotation.Nonnull;

@ExtensionImpl
public class PigParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

    public static final IFileElementType FILE = new IFileElementType(Language.<PigLanguage>findInstance(PigLanguage.class));

    @Nonnull
    @Override
    public Language getLanguage() {
        return PigLanguage.INSTANCE;
    }

    @NotNull
    @Override
    public Lexer createLexer(@NotNull LanguageVersion languageVersion) {
        return new _PigLexer();
    }

    @Override
    @NotNull
    public TokenSet getWhitespaceTokens(@NotNull LanguageVersion languageVersion) {
        return WHITE_SPACES;
    }

    @Override
    @NotNull
    public TokenSet getCommentTokens(@NotNull LanguageVersion languageVersion) {
        return PigTokenType.getCommentSet();
    }

    @Override
    @NotNull
    public TokenSet getStringLiteralElements(@NotNull LanguageVersion languageVersion) {
        return TokenSet.create(PigTypes.PIG_QUOTEDSTRING);
    }

    @Override
    @NotNull
    public PsiParser createParser(@NotNull LanguageVersion languageVersion) {
        return new PigParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new PigFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @Override
    @NotNull
    public PsiElement createElement(@NotNull ASTNode node) {
        return PigTypes.Factory.createElement(node);
    }
}