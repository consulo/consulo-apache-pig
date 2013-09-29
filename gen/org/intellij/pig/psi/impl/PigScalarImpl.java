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

public class PigScalarImpl extends PigPsiElementImpl implements PigScalar {

  public PigScalarImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigDOLLARVAR getDOLLARVAR() {
    return findChildByClass(PigDOLLARVAR.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitScalar(this);
    else super.accept(visitor);
  }

}
