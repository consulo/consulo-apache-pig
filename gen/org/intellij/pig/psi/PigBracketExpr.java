// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigBracketExpr extends PigPsiElement {

  @NotNull
  List<PigKeyvalue> getKeyvalueList();

  @NotNull
  List<PigProjection> getProjectionList();

  @NotNull
  List<PigRealArg> getRealArgList();

}
