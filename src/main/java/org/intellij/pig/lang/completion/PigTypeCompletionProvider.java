package org.intellij.pig.lang.completion;

import consulo.language.ast.IElementType;
import consulo.language.editor.completion.CompletionParameters;
import consulo.language.editor.completion.CompletionProvider;
import consulo.language.editor.completion.CompletionResultSet;
import consulo.language.editor.completion.lookup.LookupElementBuilder;
import consulo.language.util.ProcessingContext;
import org.intellij.pig.psi.PigTokenType;
import org.jetbrains.annotations.NotNull;

class PigTypeCompletionProvider implements CompletionProvider {
    public void addCompletions(@NotNull CompletionParameters parameters,
                               ProcessingContext context,
                               @NotNull CompletionResultSet resultSet) {
        IElementType[] types = PigTokenType.getDataTypes().getTypes();
        for (IElementType type : types) {
            resultSet.addElement(LookupElementBuilder.create(type.toString().toLowerCase()));
        }
    }
}
