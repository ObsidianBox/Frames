package org.obsidianbox.frames;

public interface Texture extends IWidget {
    /**
     * Gets the url of this texture to render.
     *
     * @return the url.
     */
    public String getUrl();

    /**
     * Sets the url of this texture to render. All textures must be of png type and a size that is a factor of 2
     * (e.g 64x128). Use the alpha channel for hiding empty space.
     *
     * @param url the url to set this texture to.
     * @return the texture.
     */
    public Texture setUrl(String url);

    /**
     * Gets if the texture draws the full alpha channel instead of just using a bit-mask.
     *
     * @return true if drawing the alpha channel, false if not.
     */
    public boolean isDrawingAlphaChannel();

    /**
     * Sets if the texture should draw the full alpha channel instead of just using a bit-mask.
     *
     * @param draw true to draw the alpha channel, false to not draw it.
     * @return the texture.
     */
    public Texture setDrawAlphaChannel(boolean draw);

    /**
     * Set the offset to the top of the image.
     * Setting this to a anything other than -1 will draw a 1:1 slice of the texture rather than scaling it to fit the
     * width and height.
     *
     * @param top the top offset.
     * @return the texture.
     */
    public Texture setTop(int top);

    /**
     * Get the offset to the top of the image.
     *
     * @return the top offset.
     */
    public int getTop();

    /**
     * Set the offset to the left of the image.
     * Setting this to a anything other than -1 will draw a 1:1 slice of the texture rather than scaling it to fit the
     * width and height.
     *
     * @param left the left offset.
     * @return the texture.
     */
    public Texture setLeft(int left);

    /**
     * Get the offset to the left of the image.
     *
     * @return the left offset.
     */
    public int getLeft();

    /**
     * @see Texture#setFinishDelegate(Runnable).
     * @return the finish delegate.
     */
    public Runnable getFinishDelegate();

    /**
     * Given delegates run() method will be called when the download of the image has been completed.
     * The internal delegate variable will be set to null after that.
     *
     * @param finishDelegate the delegate.
     * @return the texture.
     */
    public Texture setFinishDelegate(Runnable finishDelegate);

    /**
     * Gets the actual width of the image.
     *
     * @return the actual width of the image.
     */
    public int getOriginalWidth();

    /**
     * Gets the actual height of the image.
     *
     * @return the actual height of the image.
     */
    public int getOriginalHeight();
}
