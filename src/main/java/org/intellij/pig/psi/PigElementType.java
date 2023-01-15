package org.intellij.pig.psi;

import consulo.language.ast.IElementType;
import org.intellij.pig.PigLanguage;

public class PigElementType extends IElementType {
    public PigElementType(String debugName) {
        super(debugName, PigLanguage.INSTANCE);
    }
}