package org.intellij.pig.lang.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.ProcessingContext;
import consulo.codeInsight.completion.CompletionProvider;
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
