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

public class PigDistinctClauseImpl extends PigPsiElementImpl implements PigDistinctClause {

  public PigDistinctClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigPartitionClause getPartitionClause() {
    return findChildByClass(PigPartitionClause.class);
  }

  @Override
  @NotNull
  public PigRel getRel() {
    return findNotNullChildByClass(PigRel.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitDistinctClause(this);
    else super.accept(visitor);
  }

}
