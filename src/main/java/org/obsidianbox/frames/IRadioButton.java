/**
 * This file is part of Frames, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2014 ObsidianBox <http://obsidianbox.org/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.obsidianbox.frames;

public interface IRadioButton extends IButton {
    /**
     * Is true if the radio button is selected.
     *
     * @return true if selected, false if not.
     */
    boolean isSelected();

    /**
     * Sets the radio button's selected state.
     *
     * @param selected the selected state of the radio button.
     * @return the radio button.
     */
    IRadioButton setSelected(boolean selected);

    /**
     * Gets the group id for this radio button. Radio buttons on the same screen, with the same group id will be grouped together.
     *
     * @return the group id.
     */
    int getGroup();

    /**
     * Sets the group id for this radio button.
     *
     * @param group the group id to set.
     * @return the radio button.
     */
    IRadioButton setGroup(int group);
}

