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

public interface ITextField extends IControl {
    /**
     * Gets the position of the cursor in the text field. Position zero is the start of the text.
     *
     * @return the cursor position.
     */
    int getCursorPosition();

    /**
     * Sets the position of the cursor in the text field.
     *
     * @param position the position to set the cursor to.
     * @return the text field.
     */
    ITextField setCursorPosition(int position);

    /**
     * Gets the text typed in this text field.
     *
     * @return the text.
     */
    String getText();

    /**
     * Sets the text visible in this text field.
     *
     * @param text the text inside of the text field.
     * @return the text field.
     */
    ITextField setText(String text);

    /**
     * Gets the maximum characters that can be typed into this text field.
     *
     * @return the maximum characters allowed.
     */
    int getMaximumCharacters();

    /**
     * Sets the maximum characters that can be typed into this text field. If zero is passed, the text field will hold
     * as many characters as it can depending on its size.
     *
     * @param max the maximum characters that can be typed.
     * @return the text field.
     */
    ITextField setMaximumCharacters(int max);

    /**
     * Gets the maximum line this text field can hold.
     *
     * @return the maximum lines.
     */
    int getMaximumLines();

    /**
     * Sets the maximum lines this text field can hold. If zero is passed, the text field will hold as many lines as it
     * can depending on its size.
     *
     * @param max the maximum lines (0 – 127).
     * @return the text field.
     */
    ITextField setMaximumLines(int max);

    /**
     * Gets the {@link org.obsidianbox.frames.util.Color} of the inner field area of the text box.
     *
     * @return the field {@link org.obsidianbox.frames.util.Color}.
     */
    Color getFieldColor();

    /**
     * Sets the field {@link org.obsidianbox.frames.util.Color} of the inner field area of the text box.
     *
     * @param color the field {@link org.obsidianbox.frames.util.Color} to render as.
     * @return the text field.
     */
    ITextField setFieldColor(Color color);

    /**
     * Gets the outside {@link org.obsidianbox.frames.util.Color} of the field area of the text box.
     *
     * @return the border {@link org.obsidianbox.frames.util.Color}.
     */
    Color getBorderColor();

    /**
     * Sets the outside {@link org.obsidianbox.frames.util.Color} of the field area of the text box.
     *
     * @param color the border {@link org.obsidianbox.frames.util.Color} to render as.
     * @return the text field.
     */
    ITextField setBorderColor(Color color);

    /**
     * Gets the tab index for this text field.
     *
     * @return the tab index.
     */
    int getTabIndex();

    /**
     * <p>Sets the tab index for this text field. When the player presses the tabulator key the text field with index+1
     * will obtain the focus.
     *
     * <p>Text fields using the same index may not obtain focus when pressing the tabulator key. The behaviour
     * discontinuous index sequences is undefined.
     *
     * @param index the tab index (0 – 127).
     * @return the text field.
     */
    ITextField setTabIndex(int index);

    /**
     * Gets the text processor.
     *
     * @return the assigned text processor.
     */
    ITextProcessor getTextProcessor();

    /**
     * Sets the text processor.
     *
     * @param processor the text processor to assign.
     * @return the text field.
     */
    ITextField setTextProcessor(ITextProcessor processor);

    /**
     * Fires when this text field is typed into on the screen. This event will also be sent to the screen listener.
     */
    void onTextFieldChange();

    /**
     * Fires when the user presses Enter.
     */
    void onTypingFinished();

    /**
     * Sets the placeholder to text. The placeholder will be displayed when no text is in the text field.
     *
     * @param text the placeholder text to set.
     * @return the text field.
     */
    ITextField setPlaceholder(String text);

    /**
     * Gets the placeholder text.
     *
     * @return the placeholder text.
     */
    String getPlaceholder();
}
