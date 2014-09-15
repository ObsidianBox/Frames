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

public interface IGradient extends IWidget {
    /**
     * Gets the top color of the gradient to render.
     *
     * @return the top {@link org.obsidianbox.frames.util.Color}.
     */
    Color getTopColor();

    /**
     * Sets the top color of the gradient to render.
     *
     * @param color the top {@link org.obsidianbox.frames.util.Color}.
     * @return the gradient.
     */
    IGradient setTopColor(Color color);

    /**
     * Gets the bottom color of the gradient to render.
     *
     * @return the bottom {@link org.obsidianbox.frames.util.Color}.
     */
    Color getBottomColor();

    /**
     * Sets the bottom color of the gradient to render
     *
     * @param color the bottom {@link org.obsidianbox.frames.util.Color}.
     * @return the gradient.
     */
    IGradient setBottomColor(Color color);

    /**
     * Sets the bottom and top color of the gradient to render.
     * 
     * @param color the {@link org.obsidianbox.frames.util.Color} for top and bottom.
     * @return the gradient.
     */
    IGradient setColor(Color color);

    /**
     * Set the direction the gradient is drawn.
     * Default is VERTICAL, if using HORIZONTAL then read top as left and bottom as right.
     * 
     * @param axis the {@link org.obsidianbox.frames.OrientationType} to draw in.
     * @return the gradient.
     */
    IGradient setOrientation(OrientationType axis);

    /**
     * Gets the direction the gradient is drawn.
     * Default is VERTICAL, if using HORIZONTAL then read top as left and bottom as right.
     * 
     * @return the {@link org.obsidianbox.frames.OrientationType} being used.
     */
    OrientationType getOrientation();
}

