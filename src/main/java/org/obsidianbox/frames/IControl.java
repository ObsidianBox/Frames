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

public interface IControl extends IWidget {
    /**
     * Gets the status of the control, if it is enabled and can receive input.
     *
     * @return true if enabled and receives input, false if not.
     */
    boolean isEnabled();

    /**
     * Disables input to the control, but still allows it to be visible.
     *
     * @param enable the enabled status.
     * @return the control.
     */
    IControl setEnabled(boolean enable);

    /**
     * Gets the color of this control.
     *
     * @return the {@link org.obsidianbox.frames.util.Color}.
     */
    Color getColor();

    /**
     * Sets the color of this control.
     *
     * @param color the {@link org.obsidianbox.frames.util.Color} to set.
     * @return the control.
     */
    IControl setColor(Color color);

    /**
     * Gets the color of this control when it is disabled.
     *
     * @return the disabled {@link org.obsidianbox.frames.util.Color}.
     */
    Color getDisabledColor();

    /**
     * Sets the color of this control when it is disabled.
     *
     * @param color the disabled {@link org.obsidianbox.frames.util.Color} to set.
     * @return the control.
     */
    IControl setDisabledColor(Color color);

    /**
     * Gets the focused status of the control.
     *
     * @return true if control has focus, false if not.
     */
    boolean isFocus();

    /**
     * Sets the focus status of the control.
     *
     * @param focus true to give focus, false to remove focus.
     * @return the control.
     */
    IControl setFocus(boolean focus);

    /**
     * Will be called if this control has focus and a key was pressed.
     *
     * @param key the pressed key.
     * @return true if you handled the key press and it shouldn't be handled elsewhere.
     */
    boolean onKeyPressed(Keyboard key);

    /**
     * Will be called if this control has focus and a key was released.
     *
     * @param key the released key.
     * @return true if you handled the key release and it shouldn't be handled elsewhere.
     */
    boolean onKeyReleased(Keyboard key);
}

