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

public class PigSetClauseImpl extends PigPsiElementImpl implements PigSetClause {

  public PigSetClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigEid> getEidList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigEid.class);
  }

  @Override
  @Nullable
  public PigFuncName getFuncName() {
    return findChildByClass(PigFuncName.class);
  }

  @Override
  @Nullable
  public PigScalar getScalar() {
    return findChildByClass(PigScalar.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitSetClause(this);
    else super.accept(visitor);
  }

}
