// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigSplitClause extends PigPsiElement {

  @NotNull
  PigRel getRel();

  @NotNull
  List<PigSplitBranch> getSplitBranchList();

  @Nullable
  PigSplitOtherwise getSplitOtherwise();

}
