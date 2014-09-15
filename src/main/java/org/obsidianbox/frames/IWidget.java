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
import java.io.IOException;
import java.util.UUID;

public interface IWidget {
    /**
     * The type of widget this is. Required for proper synchronization between the server and client.
     *
     * @return the widget type.
     */
    WidgetType getType();

    /**
     * Returns a unique id for this widget.
     *
     * @return the unique id.
     */
    UUID getId();

    /**
     * Called after this widget this created for serialization.
     *
     * @param compound the NBTTagCompound.
     * @throws IOException
     */
    void fromNBT(NBTTagCompound compound) throws IOException;

    /**
     * Called when this widget is serialized to the client.
     *
     * @param compound the NBTTagCompound.
     * @throws IOException
     */
    void toNBT(NBTTagCompound compound) throws IOException;

    /**
     * Gets the plugin that attached this widget to the screen, or null if this screen is unattached.
     *
     * @return the plugin that attached this widget to the screen.
     */
    String getPlugin();

    /**
     * Gets the render priority for this widget. Highest priorities render first (in the background), the lowest priorities render on top (in the foreground).
     *
     * @return the priority.
     */
    RenderPriority getPriority();

    /**
     * Sets the render priority for this widget. Highest priorities render first (in the background), the lowest priorities render on top (in the foreground).
     *
     * @param priority the {@link org.obsidianbox.frames.RenderPriority} to render at.
     * @return the widget.
     */
    IWidget setPriority(RenderPriority priority);

    /**
     * Gets the actual unscaled width of this widget, in pixels.
     *
     * @return the unscaled width.
     */
    double getActualWidth();

    /**
     * Gets the width of this widget, in pixels.
     *
     * @return the scaled width.
     */
    double getWidth();

    /**
     * Sets the width of this widget, in pixels.
     *
     * @param width the width to set.
     * @return the widget.
     */
    IWidget setWidth(int width);

    /**
     * Gets the actual unscaled height of this widget, in pixels.
     *
     * @return the unscaled height.
     */
    double getActualHeight();

    /**
     * Gets the height of this widget, in pixels.
     *
     * @return the scaled height.
     */
    double getHeight();

    /**
     * Sets the height of this widget, in pixels.
     *
     * @param height the height to set.
     * @return the widget.
     */
    IWidget setHeight(int height);

    /**
     * Gets the screen this widget is attached to, or null if unattached.
     *
     * @return the screen.
     */
    IScreen getScreen();

    /**
     * Gets the x-coordinate of this widget. Widgets (and screens) render from the top left corner the screen. 0,0 represents the top left corner.
     *
     * @return the x-coordinate.
     */
    int getX();

    /**
     * Gets the scaled x-coordinate of this widget.
     *
     * @return the scaled x-coordinate.
     */
    double getScreenX();

    /**
     * Gets the y-coordinate of this widget. Widgets (and screens) render from the top left corner the screen. 0,0 represents the top left corner.
     *
     * @return the y-coordinate.
     */
    int getY();

    /**
     * Gets the scaled y-coordinate of this widget.
     *
     * @return the scaled y-coordinate.
     */
    double getScreenY();

    /**
     * Sets the x-coordinate of this widget. Widgets (and screens) render from the top left corner the screen. 0,0 represents the top left corner.
     *
     * @param pos the position to set.
     * @return the widget.
     */
    IWidget setX(int pos);

    /**
     * Sets the y-coordinate of this widget. Widgets (and screens) render from the top left corner the screen. 0,0 represents the top left corner.
     *
     * @param pos the position to set.
     * @return the widget.
     */
    IWidget setY(int pos);

    /**
     * Shifts this widget the given number of pixels in the x direction.
     *
     * @param x the x-coordinate pixels to shift.
     * @return the widget.
     */
    IWidget shiftXPos(int x);

    /**
     * Shifts this widget the given number of pixels in the y direction.
     *
     * @param y the y-coordinate pixels to shift.
     * @return the widget.
     */
    IWidget shiftYPos(int y);

    /**
     * Is true if this widget is visible and rendering on the screen.
     *
     * @return true if visible, false if not.
     */
    boolean isVisible();

    /**
     * Sets the visibility of this widget. If true, it will render normally. If false, it will not appear on the screen.
     *
     * @param enable enables or disables the visibility.
     * @return the widget.
     */
    IWidget setVisible(boolean enable);

    /**
     * Called each tick this widget is updated. This widget is processed for isDirty() immediately afterwords.
     */
    void onTick();

    /**
     * Set the widget's tooltip.
     *
     * @param component the IChatComponent to set the tooltip text.
     * @return the widget.
     */
    IWidget setTooltip(IChatComponent component);

    /**
     * Gets the widget's tooltip.
     *
     * @return the IChatComponent for the tooltip text.
     */
    IChatComponent getTooltip();

    /**
     * Gets the widget's container.
     *
     * @return the {@link IContainer}
     */
    IContainer getContainer();

    /**
     * Does the widget have a container.
     *
     * @return true if it has a {@link org.obsidianbox.frames.IContainer}, false if not.
     */
    boolean hasContainer();

    /**
     * Sets the parent container for this widget.
     *
     * @param container the {@link org.obsidianbox.frames.IContainer} to set as parent.
     */
    void setContainer(IContainer container);

    /**
     * Container Layout - Set whether the widget will be resized with its container.
     *
     * @param fixed set if it is a static size.
     * @return the widget.
     */
    IWidget setFixed(boolean fixed);

    /**
     * Container Layout - Whether the widget is fixed size inside its container.
     *
     * @return true if fixed, false if not.
     */
    boolean isFixed();

    // NOTE: Margins follow the same order as CSS
    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginAll the margin to set.
     * @return the widget.
     */
    IWidget setMargin(int marginAll);

    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginTopBottom the top margin.
     * @param marginLeftRight the left margin.
     * @return the widget.
     */
    IWidget setMargin(int marginTopBottom, int marginLeftRight);

    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginTop the top margin.
     * @param marginLeftRight the left and right margin.
     * @param marginBottom the bottom margin.
     * @return the widget.
     */
    IWidget setMargin(int marginTop, int marginLeftRight, int marginBottom);

    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginTop the top margin.
     * @param marginRight the right margin.
     * @param marginBottom the bottom margin.
     * @param marginLeft the left margin.
     * @return the widget.
     */
    IWidget setMargin(int marginTop, int marginRight, int marginBottom, int marginLeft);

    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginTop the top margin.
     * @return the widget.
     */
    IWidget setMarginTop(int marginTop);

    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginRight the right margin.
     * @return the widget.
     */
    IWidget setMarginRight(int marginRight);

    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginBottom the bottom margin.
     * @return the widget.
     */
    IWidget setMarginBottom(int marginBottom);

    /**
     * Container Layout - Padding to use for automatic container layout - not included in dimensions.
     *
     * @param marginLeft the left margin.
     * @return the widget.
     */
    IWidget setMarginLeft(int marginLeft);

    /**
     * Container Layout - Get the margin used for container layout.
     *
     * @return the top margin.
     */
    int getMarginTop();

    /**
     * Container Layout - Get the margin used for container layout.
     *
     * @return the right margin.
     */
    int getMarginRight();

    /**
     * Container Layout - Get the margin used for container layout.
     *
     * @return the bottom margin.
     */
    int getMarginBottom();

    /**
     * Container Layout - Get the margin used for container layout.
     *
     * @return the left margin.
     */
    int getMarginLeft();

    /**
     * Container Layout - Set the minimum width for this widget.
     *
     * @param min the minimum width to allow.
     * @return the widget.
     */
    IWidget setMinWidth(int min);

    /**
     * Container Layout - Get the minimum width for this widget.
     *
     * @return the minimum width allowed.
     */
    int getMinWidth();

    /**
     * Container Layout - Set the maximum width for this widget.
     *
     * @param max the maximum width to allow.
     * @return the widget.
     */
    IWidget setMaxWidth(int max);

    /**
     * Container Layout - Get the maximum width for this widget.
     *
     * @return the maximum width allowed.
     */
    int getMaxWidth();

    /**
     * Container Layout - Set the minimum height for this widget.
     *
     * @param min the minimum height to allow.
     * @return the widget.
     */
    IWidget setMinHeight(int min);

    /**
     * Container Layout - Get the minimum height for this widget.
     *
     * @return the minimum height allowed.
     */
    int getMinHeight();

    /**
     * Container Layout - Set the maximum height for this widget.
     *
     * @param max the maximum height to allow.
     * @return the widget.
     */
    IWidget setMaxHeight(int max);

    /**
     * Container Layout - Get the maximum height for this widget.
     *
     * @return the maximum height allowed.
     */
    int getMaxHeight();

    /**
     * Container Layout - Save the position for later restoration.
     *
     * @return the widget.
     */
    IWidget savePosition();

    /**
     * Container Layout - Restore the earlier saved position.
     *
     * @return the widget.
     */
    IWidget restorePosition();

    /**
     * Set the anchor point for this widget, default is CENTER.
     *
     * @param anchor the {@link org.obsidianbox.frames.Anchor} to set.
     * @return the widget.
     */
    IWidget setAnchor(Anchor anchor);

    /**
     * Get the current anchor position.
     *
     * @return the current {@link org.obsidianbox.frames.Anchor} position.
     */
    Anchor getAnchor();

    /**
     * Gets the unscaled x-coordinate.
     *
     * @return the unscaled x-coordinate.
     */
    double getActualX();

    /**
     * Gets the unscaled y-coordinate.
     *
     * @return the unscaled y-coordinate.
     */
    double getActualY();

    /**
     * Gets the widgets coordinates and size in one object.
     *
     * @return the bounds of the widget.
     */
    Rectangle getBounds();

    /**
     * Sets the widgets coordinates and size with one object.
     *
     * @param rect the new {@link java.awt.Rectangle} of the widget.
     * @return the widget.
     */
    IWidget setBounds(Rectangle rect);

    /**
     * Sets the widgets coordinates and size.
     *
     * @param x the x-coordinate.
     * @param y the y-coordinate.
     * @param width the width.
     * @param height the height.
     * @return the widget.
     */
    IWidget setBounds(int x, int y, int width, int height);
}

