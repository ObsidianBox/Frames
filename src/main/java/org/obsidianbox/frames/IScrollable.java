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

import java.awt.Rectangle;

import org.obsidianbox.frames.util.Color;

public interface IScrollable extends IControl {
    /**
     * Renders the contents of the Scrollable.
     *
     * The view port is already transformed and a matrix is pushed.
     */
    void renderContents();

    /**
     * Gets the inner size for given axis, in pixels.
     *
     * @param axis the axis of the size vector.
     * @return the size of the view port on given axis.
     */
    int getInnerSize(OrientationType axis);

    /**
     * Gets the scroll position, in pixels.
     *
     * @param axis the axis of the scroll vector.
     * @return the position of the view port on given axis.
     */
    int getScrollPosition(OrientationType axis);

    /**
     * Sets the scroll position on the axis, in pixels.
     * The allowed scroll amount ranges from 0 to getMaximumScrollPosition for given axis.
     *
     * @param axis the axis to scroll.
     * @param position the position of the view port on given axis.
     */
    void setScrollPosition(OrientationType axis, int position);

    /**
     * Adds x and y to the Horizontal and Vertical scroll position.
     *
     * @param x the x-coordinate scroll value.
     * @param y the y-coordinate scroll value.
     */
    void scroll(int x, int y);

    /**
     * Adjusts the scroll position so that the given rectangle will fit into the view port.
     * If the given rect is too big, it will scroll to the x or y position of the rectangle.
     *
     * @param rect the {@link java.awt.Rectangle}.
     */
    void ensureVisible(Rectangle rect);

    /**
     * Gets the maximum allowed scroll position.
     *
     * @param axis the {@link org.obsidianbox.frames.OrientationType}.
     * @return the maximum scroll position. Use the return value to scroll to the very bottom. Returns
     *         0 if not scrolling is possible which means the whole content will fit in the view port.
     */
    int getMaximumScrollPosition(OrientationType axis);

    /**
     * Depending on the set ScrollBarPolicy, returns whether to show or not to show a scroll bar on the given axis.
     *
     * @param axis the axis to check if it should view a scroll bar.
     * @return if the scroll bar should be shown for that axis.
     */
    boolean needsScrollBar(OrientationType axis);

    /**
     * Sets the scroll bar policy for the given axis.
     *
     * @param axis the {@link org.obsidianbox.frames.OrientationType}.
     * @param policy the {@link org.obsidianbox.frames.ScrollBarPolicy}.
     */
    void setScrollBarPolicy(OrientationType axis, ScrollBarPolicy policy);

    /**
     * Gets the scroll bar policy for the given axis.
     *
     * @param axis the {@link org.obsidianbox.frames.OrientationType}.
     * @return the {@link org.obsidianbox.frames.ScrollBarPolicy} for the given axis.
     */
    ScrollBarPolicy getScrollBarPolicy(OrientationType axis);

    /**
     * Gets the size of the rectangle inside the scrollable. This is usually getWidth/Height() - 16 when the corresponding scrollbar is visible.
     *
     * @param axis the axis
     * @return the size of the rectangle inside the scrollable
     */
    int getViewportSize(OrientationType axis);

    /**
     * Gets the margin.
     *
     * @param pos the {@link org.obsidianbox.frames.PositionOrientation}.
     * @return the margin value.
     */
    int getMargin(PositionOrientation pos);

    /**
     * Gets the background color of this list.
     *
     * @return the {@link org.obsidianbox.frames.util.Color}.
     */
    Color getBackgroundColor();

    /**
     * Sets the background color of this list.
     *
     * @param color the {@link org.obsidianbox.frames.util.Color} to set.
     * @return the scrollable.
     */
    IScrollable setBackgroundColor(Color color);
}

