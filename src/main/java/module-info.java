/**
 * @author VISTALL
 * @since 15/01/2023
 */
module org.apache.pig {
  requires consulo.application.api;
  requires consulo.code.editor.api;
  requires consulo.color.scheme.api;
  requires consulo.document.api;
  requires consulo.language.api;
  requires consulo.language.editor.api;
  requires consulo.language.impl;
  requires consulo.localize.api;
  requires consulo.project.api;
  requires consulo.ui.api;
  requires consulo.virtual.file.system.api;

  exports consulo.apache.pig.icon;
  exports org.intellij.pig;
  exports org.intellij.pig.lang.completion;
  exports org.intellij.pig.parser;
  exports org.intellij.pig.psi;
  exports org.intellij.pig.psi.impl;
}
