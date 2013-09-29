// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.pig.psi.PigTypes.*;
import org.intellij.pig.psi.*;

public class PigKeyvalueImpl extends PigPsiElementImpl implements PigKeyvalue {

  public PigKeyvalueImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public PigLiteral getLiteral() {
    return findNotNullChildByClass(PigLiteral.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitKeyvalue(this);
    else super.accept(visitor);
  }

}
