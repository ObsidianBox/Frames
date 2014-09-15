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

public interface IContainer extends IWidget {
    /**
     * Adds a single widget to a container.
     *
     * @param child the {@link org.obsidianbox.frames.IWidget} to add.
     * @return the container.
     */
    IContainer addChild(IWidget child);

    /**
     * Adds a single widget to a container.
     *
     * @param index the position to insert it at, use -1 for append.
     * @param child the {@link org.obsidianbox.frames.IWidget} to add.
     * @return the container.
     */
    IContainer insertChild(int index, IWidget child);

    /**
     * Adds a list of children to a container.
     *
     * @param children the {@link org.obsidianbox.frames.IWidget}s to add.
     * @return the container.
     */
    IContainer addChildren(IWidget... children);

    /**
     * Removes a single widget from this container.
     *
     * @param child the {@link org.obsidianbox.frames.IWidget} to add.
     * @return the container.
     */
    IContainer removeChild(IWidget child);

    /**
     * Get a list of widgets inside this container.
     *
     * @return the {@link org.obsidianbox.frames.IWidget}s in the container.
     */
    IWidget[] getChildren();

    /**
     * Set the automatic layout type for children, triggered by setWidth() or setHeight().
     *
     * @param type the {@link org.obsidianbox.frames.ContainerType}.
     * @return the container.
     */
    IContainer setLayout(ContainerType type);

    /**
     * Get the automatic layout type for children.
     *
     * @return the container type.
     */
    ContainerType getLayout();

    /**
     * <p>Force the container to re-layout all non-fixed children.
     *
     * <p>Unless you specifically need to update the layout at this instant,
     * you should use use deferLayout() instead.
     *
     * <p>This will re-position and resize all child elements.
     *
     * @return the container.
     */
    IContainer updateLayout();

    /**
     * <p>Automatically call updateLayout during the next onTick().
     *
     * <p>This is automatically called when anything changes that would affect the container layout.
     *
     * <p>NOTE: Subclasses should ensure they don't prevent Container.onTick() from running.
     *
     * @return the container.
     */
    IContainer deferLayout();

    /**
     * Set the contents alignment.
     *
     * @return the container.
     */
    IContainer setAlign(Anchor anchor);

    /**
     * Get the contents alignment.
     *
     * @return the {@link org.obsidianbox.frames.Anchor}
     */
    Anchor getAlign();

    /**
     * Reverse the drawing order (right to left or bottom to top).
     *
     * @param reverse set to the reverse direction.
     * @return the container.
     */
    IContainer setReverse(boolean reverse);

    /**
     * If this is drawing in reverse order.
     *
     * @return true if reversed, false if not.
     */
    boolean getReverse();

    /**
     * Determines if children expand to fill width and height.
     *
     * @param auto set to auto.
     * @return the container.
     */
    IContainer setAuto(boolean auto);

    /**
     * Returns if the children will expand to fill width and height.
     *
     * @return true if auto, false if not.
     */
    boolean isAuto();
}
