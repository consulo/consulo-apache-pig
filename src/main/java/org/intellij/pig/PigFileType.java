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

import com.intellij.openapi.fileTypes.LanguageFileType;
import consulo.apache.pig.icon.PigIconGroup;
import consulo.ui.image.Image;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PigFileType extends LanguageFileType {
    public static final PigFileType INSTANCE = new PigFileType();

    private PigFileType() {
        super(PigLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getId() {
        return "Pig file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Pig language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "pig";
    }

    @Nullable
    @Override
    public Image getIcon() {
        return PigIconGroup.pig_icon();
    }
}