
package org.intellij.pig.psi;

import consulo.language.file.FileViewProvider;
import consulo.language.impl.psi.PsiFileBase;
import org.intellij.pig.PigLanguage;
import org.jetbrains.annotations.NotNull;

public class PigFile extends PsiFileBase {
  public PigFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, PigLanguage.INSTANCE);
  }
}