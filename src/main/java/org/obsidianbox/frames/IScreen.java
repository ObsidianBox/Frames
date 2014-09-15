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

import java.util.Set;
import java.util.UUID;

public interface IScreen extends IWidget {
    /**
     * Gets an array of all the attached widgets to this screen. Modifying this array will not affect the screen.
     *
     * @return array of all {@link org.obsidianbox.frames.IWidget}s.
     */
    IWidget[] getAttachedWidgets();

    /**
     * Gets an array of all the attached widgets to this screen, and if recursive, any widgets of screens attached to this screen.
     *
     * @param recursive whether to get widgets attached to screens attached to this screen.
     * @return array of all {@link org.obsidianbox.frames.IWidget}s.
     */
    IWidget[] getAttachedWidgets(boolean recursive);

    /**
     * Gets a set of all the attached widgets to this screen. Modifying this array will not affect the screen.
     *
     * @return set of all {@link org.obsidianbox.frames.IWidget}s.
     */
    Set<IWidget> getAttachedWidgetsAsSet();

    /**
     * Gets a set of all the attached widgets to this screen, and if recursive, any widgets of screens attached to this screen.
     *
     * @param recursive whether to get widgets attached to screens attached to this screen.
     * @return set of all {@link org.obsidianbox.frames.IWidget}s.
     */
    Set<IWidget> getAttachedWidgetsAsSet(boolean recursive);

    /**
     * Attaches a widget to this screen.
     *
     * @param widget the {@link org.obsidianbox.frames.IWidget} to attach.
     * @param plugin the plugin that created this widget.
     * @return the screen.
     */
    IScreen attachWidget(String plugin, IWidget widget);

    /**
     * Attaches an array of widgets to this screen.
     *
     * @param plugin the plugin that created this widget.
     * @param widget the {@link org.obsidianbox.frames.IWidget}s to attach.
     * @return the screen.
     */
    IScreen attachWidgets(String plugin, IWidget... widget);

    /**
     * Removes a widget from this screen.
     *
     * @param widget the {@link org.obsidianbox.frames.IWidget} to remove.
     * @return the screen.
     */
    IScreen removeWidget(IWidget widget);

    /**
     * Is true if the screen has the given widget attached to it. Uses a linear search, takes O(n) time to complete.
     *
     * @param widget the {@link org.obsidianbox.frames.IWidget} to search for.
     * @return true if the widget was found, false if not.
     */
    boolean containsWidget(IWidget widget);

    /**
     * Is true if the screen has a widget with the given id attached to it. Uses a linear search, takes O(n) time to complete.
     *
     * @param id the id to search for.
     * @return true if the widget was found, false if not.
     */
    boolean containsWidget(UUID id);

    /**
     * Gets the widget that is associated with the given id, or null if none was found.
     *
     * @param id the id to search for.
     * @return widget if found, null if not.
     */
    IWidget getWidget(UUID id);

    /**
     * Gets the height of the screen.
     *
     * @return the height.
     */
    double getHeight();

    /**
     * Gets the width of the screen.
     *
     * @return the width.
     */
    double getWidth();

    /**
     * Gets the x-coordinate of the mouse on this screen.
     *
     * @return the x-coordinate of the mouse.
     */
    int getMouseX();

    /**
     * Gets the y-coordinate of the mouse on this screen.
     *
     * @return the y-coordinate of the mouse.
     */
    int getMouseY();
}

