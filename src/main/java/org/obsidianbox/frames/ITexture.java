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

public interface ITexture extends IWidget {
    /**
     * Gets the url of this texture to render.
     *
     * @return the url.
     */
    String getUrl();

    /**
     * Sets the url of this texture to render. All textures must be of png type and a size that is a factor of 2
     * (e.g 64x128). Use the alpha channel for hiding empty space.
     *
     * @param url the url to set this texture to.
     * @return the texture.
     */
    ITexture setUrl(String url);

    /**
     * Gets if the texture draws the full alpha channel instead of just using a bit-mask.
     *
     * @return true if drawing the alpha channel, false if not.
     */
    boolean isDrawingAlphaChannel();

    /**
     * Sets if the texture should draw the full alpha channel instead of just using a bit-mask.
     *
     * @param draw true to draw the alpha channel, false to not draw it.
     * @return the texture.
     */
    ITexture setDrawAlphaChannel(boolean draw);

    /**
     * Set the offset to the top of the image.
     * Setting this to a anything other than -1 will draw a 1:1 slice of the texture rather than scaling it to fit the
     * width and height.
     *
     * @param top the top offset.
     * @return the texture.
     */
    ITexture setTop(int top);

    /**
     * Get the offset to the top of the image.
     *
     * @return the top offset.
     */
    int getTop();

    /**
     * Set the offset to the left of the image.
     * Setting this to a anything other than -1 will draw a 1:1 slice of the texture rather than scaling it to fit the
     * width and height.
     *
     * @param left the left offset.
     * @return the texture.
     */
    ITexture setLeft(int left);

    /**
     * Get the offset to the left of the image.
     *
     * @return the left offset.
     */
    int getLeft();

    /**
     * @see ITexture#setFinishDelegate(Runnable).
     * @return the finish delegate.
     */
    Runnable getFinishDelegate();

    /**
     * Given delegates run() method will be called when the download of the image has been completed.
     * The internal delegate variable will be set to null after that.
     *
     * @param finishDelegate the delegate.
     * @return the texture.
     */
    ITexture setFinishDelegate(Runnable finishDelegate);

    /**
     * Gets the actual width of the image.
     *
     * @return the actual width of the image.
     */
    int getOriginalWidth();

    /**
     * Gets the actual height of the image.
     *
     * @return the actual height of the image.
     */
    int getOriginalHeight();
}
