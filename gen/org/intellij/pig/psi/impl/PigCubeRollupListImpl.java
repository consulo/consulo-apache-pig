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

public class PigCubeRollupListImpl extends PigPsiElementImpl implements PigCubeRollupList {

  public PigCubeRollupListImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigRealArg> getRealArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigRealArg.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitCubeRollupList(this);
    else super.accept(visitor);
  }

}
