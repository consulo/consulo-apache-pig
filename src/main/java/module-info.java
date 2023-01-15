/**
 * @author VISTALL
 * @since 15/01/2023
 */
module org.apache.pig {
  requires consulo.ide.api;

  exports consulo.apache.pig.icon;
  exports org.intellij.pig;
  exports org.intellij.pig.lang.completion;
  exports org.intellij.pig.parser;
  exports org.intellij.pig.psi;
  exports org.intellij.pig.psi.impl;
}