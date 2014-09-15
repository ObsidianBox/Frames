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

import org.obsidianbox.frames.util.Color;

public interface IButton extends IControl, ILabel {
    /**
     * Gets the text that is displayed when the control is disabled.
     *
     * @return the disabled text.
     */
    String getDisabledText();

    /**
     * Sets the text that is displayed when the control is disabled.
     *
     * @param text the text to display.
     * @return the button.
     */
    IButton setDisabledText(String text);

    /**
     * Gets the color of the control while the mouse is hovering over it.
     *
     * @return the {@link org.obsidianbox.frames.util.Color}.
     */
    Color getHoverColor();

    /**
     * Sets the color of the control while the mouse is hovering over it.
     *
     * @param color the hover {@link org.obsidianbox.frames.util.Color} to use.
     * @return the button.
     */
    IButton setHoverColor(Color color);

    /**
     * Sets the text that is displayed.
     *
     * @param text the text to set.
     * @return the button.
     */
    IButton setText(String text);

    /**
     * Sets the text color to use.
     *
     * @param color the {@link org.obsidianbox.frames.util.Color} to set.
     * @return the button.
     */
    IButton setTextColor(Color color);

    /**
     * Sets if the button should automatically resize for the text.
     *
     * @param auto set to auto.
     * @return the button.
     */
    IButton setAuto(boolean auto);

    /**
     * Sets the alignment of the button.
     *
     * @param align the {@link org.obsidianbox.frames.Anchor} alignment.
     * @return the button.
     */
    IButton setAlign(Anchor align);

    /**
     * Fires when this button is clicked on the screen.
     */
    void onButtonClick();
}

