// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigStatement extends PigPsiElement {

  @NotNull
  List<PigDOLLARVAR> getDOLLARVARList();

  @Nullable
  PigIDENTIFIER getIDENTIFIER();

  @Nullable
  PigDeclareStatement getDeclareStatement();

  @Nullable
  PigDefaultStatement getDefaultStatement();

  @Nullable
  PigForeachGenerateSimple getForeachGenerateSimple();

  @Nullable
  PigForeachPlanComplex getForeachPlanComplex();

  @Nullable
  PigForeachStatement getForeachStatement();

  @Nullable
  PigImportClause getImportClause();

  @Nullable
  PigOpClause getOpClause();

  @Nullable
  PigParallelClause getParallelClause();

  @Nullable
  PigRealiasClause getRealiasClause();

  @Nullable
  PigRel getRel();

  @Nullable
  PigSplitClause getSplitClause();

}
