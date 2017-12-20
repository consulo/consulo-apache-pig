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

public class PigMrClauseImpl extends PigPsiElementImpl implements PigMrClause {

  public PigMrClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public PigLoadClause getLoadClause() {
    return findNotNullChildByClass(PigLoadClause.class);
  }

  @Override
  @Nullable
  public PigPathList getPathList() {
    return findChildByClass(PigPathList.class);
  }

  @Override
  @NotNull
  public PigStoreClause getStoreClause() {
    return findNotNullChildByClass(PigStoreClause.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitMrClause(this);
    else super.accept(visitor);
  }

}
