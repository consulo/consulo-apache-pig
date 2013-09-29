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

public class PigRankColImpl extends PigPsiElementImpl implements PigRankCol {

  public PigRankColImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigColRange getColRange() {
    return findChildByClass(PigColRange.class);
  }

  @Override
  @Nullable
  public PigColRef getColRef() {
    return findChildByClass(PigColRef.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitRankCol(this);
    else super.accept(visitor);
  }

}
