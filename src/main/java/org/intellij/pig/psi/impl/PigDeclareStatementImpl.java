// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi.impl;

import java.util.List;

import org.intellij.pig.psi.PigDeclareStatement;
import org.intellij.pig.psi.PigEid;
import org.intellij.pig.psi.PigFuncName;
import org.intellij.pig.psi.PigScalar;
import org.intellij.pig.psi.PigVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

public class PigDeclareStatementImpl extends PigPsiElementImpl implements PigDeclareStatement {

  public PigDeclareStatementImpl(ASTNode node) {
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
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitDeclareStatement(this);
    else super.accept(visitor);
  }

}
