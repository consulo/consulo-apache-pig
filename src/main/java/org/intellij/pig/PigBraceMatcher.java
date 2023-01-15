/*
 * Copyright 2012-2013 Brandon Kearby
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.pig;

import consulo.annotation.component.ExtensionImpl;
import consulo.language.BracePair;
import consulo.language.Language;
import consulo.language.PairedBraceMatcher;
import org.intellij.pig.psi.PigTypes;

import javax.annotation.Nonnull;

@ExtensionImpl
public class PigBraceMatcher implements PairedBraceMatcher {
    private static final BracePair[] PAIRS = new BracePair[] {
            new BracePair(PigTypes.PIG_LBRACE, PigTypes.PIG_RBRACE, true),
            new BracePair(PigTypes.PIG_LBRACKET, PigTypes.PIG_RBRACKET, false),
            new BracePair(PigTypes.PIG_LP, PigTypes.PIG_RP, false)

    };
    @Override
    public BracePair[] getPairs() {
        return PAIRS;
    }

    @Nonnull
    @Override
    public Language getLanguage() {
        return PigLanguage.INSTANCE;
    }
}
