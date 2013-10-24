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

public class PigMapTypeImpl extends PigPsiElementImpl implements PigMapType {

  public PigMapTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigExplicitMapType getExplicitMapType() {
    return findChildByClass(PigExplicitMapType.class);
  }

  @Override
  @Nullable
  public PigImplicitMapType getImplicitMapType() {
    return findChildByClass(PigImplicitMapType.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitMapType(this);
    else super.accept(visitor);
  }

}