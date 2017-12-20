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

public class PigNestedCommandImpl extends PigPsiElementImpl implements PigNestedCommand {

  public PigNestedCommandImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public PigIDENTIFIER getIDENTIFIER() {
    return findNotNullChildByClass(PigIDENTIFIER.class);
  }

  @Override
  @Nullable
  public PigCond getCond() {
    return findChildByClass(PigCond.class);
  }

  @Override
  @Nullable
  public PigNestedOp getNestedOp() {
    return findChildByClass(PigNestedOp.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitNestedCommand(this);
    else super.accept(visitor);
  }

}
