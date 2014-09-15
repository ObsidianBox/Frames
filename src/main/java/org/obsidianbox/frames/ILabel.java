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

public interface ILabel extends IWidget {
    /**
     * Gets the text of the label.
     *
     * @return the current text.
     */
    String getText();

    /**
     * Sets the text of the label.
     *
     * @param text the text to set.
     * @return the label.
     */
    ILabel setText(String text);

    /**
     * Gets the color for the text.
     *
     * @return the {@link org.obsidianbox.frames.util.Color} of the text.
     */
    Color getTextColor();

    /**
     * Sets the color for the text.
     *
     * @param color the {@link org.obsidianbox.frames.util.Color} to set.
     * @return the label.
     */
    ILabel setTextColor(Color color);

    /**
     * Determines if text expands to fill width and height.
     * If word wrapping and auto is enabled, the height of the ILabel will reflect the height of all lines.
     *
     * @param auto set to auto.
     * @return the label.
     */
    ILabel setAuto(boolean auto);

    /**
     * Gets if the text will expand to fill width and height.
     *
     * @return true if auto, false if not.
     */
    boolean isAuto();

    /**
     * Gets the current anchor.
     *
     * @return the current {@link org.obsidianbox.frames.Anchor}.
     */
    Anchor getAlign();

    /**
     * SEts the current anchor.
     *
     * @param anchor the {@link org.obsidianbox.frames.Anchor} to set.
     * @return the label.
     */
    ILabel setAlign(Anchor anchor);

    /**
     * Set the scale of the text.
     *
     * @param scale the scale to set.
     * @return the label.
     */
    ILabel setScale(float scale);

    /**
     * Gets the scale of the text.
     *
     * @return the scale of text.
     */
    float getScale();

    /**
     * Sets whether or not the label has a shadow.
     *
     * @param shadow show a shadow or not.
     */
    ILabel setShadow(boolean shadow);

    /**
     * Gets whether or not the label has a shadow.
     *
     * @return true if it has a shadow, false if not.
     */
    boolean hasShadow();
}
