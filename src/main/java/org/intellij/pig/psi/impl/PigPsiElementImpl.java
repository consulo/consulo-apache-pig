package org.intellij.pig.psi.impl;

import consulo.language.ast.ASTNode;
import consulo.language.impl.psi.ASTWrapperPsiElement;
import org.intellij.pig.psi.PigPsiElement;

public class PigPsiElementImpl extends ASTWrapperPsiElement implements PigPsiElement {
    public PigPsiElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }

}