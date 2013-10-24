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

public class PigStreamCmdImpl extends PigPsiElementImpl implements PigStreamCmd {

  public PigStreamCmdImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigFuncClause getFuncClause() {
    return findChildByClass(PigFuncClause.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitStreamCmd(this);
    else super.accept(visitor);
  }

}