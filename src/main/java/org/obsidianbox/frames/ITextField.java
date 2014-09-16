package org.obsidianbox.frames;

import org.obsidianbox.frames.util.Color;

public interface ITextField extends IControl {
    /**
     * Gets the position of the cursor in the text field. Position zero is the start of the text.
     *
     * @return the cursor position.
     */
    public int getCursorPosition();

    /**
     * Sets the position of the cursor in the text field.
     *
     * @param position the position to set the cursor to.
     * @return the text field.
     */
    public ITextField setCursorPosition(int position);

    /**
     * Gets the text typed in this text field.
     *
     * @return the text.
     */
    public String getText();

    /**
     * Sets the text visible in this text field.
     *
     * @param text the text inside of the text field.
     * @return the text field.
     */
    public ITextField setText(String text);

    /**
     * Gets the maximum characters that can be typed into this text field.
     *
     * @return the maximum characters allowed.
     */
    public int getMaximumCharacters();

    /**
     * Sets the maximum characters that can be typed into this text field. If zero is passed, the text field will hold
     * as many characters as it can depending on its size.
     *
     * @param max the maximum characters that can be typed.
     * @return the text field.
     */
    public ITextField setMaximumCharacters(int max);

    /**
     * Gets the maximum line this text field can hold.
     *
     * @return the maximum lines.
     */
    public int getMaximumLines();

    /**
     * Sets the maximum lines this text field can hold. If zero is passed, the text field will hold as many lines as it
     * can depending on its size.
     *
     * @param max the maximum lines (0 – 127).
     * @return the text field.
     */
    public ITextField setMaximumLines(int max);

    /**
     * Gets the {@link org.obsidianbox.frames.util.Color} of the inner field area of the text box.
     *
     * @return the field {@link org.obsidianbox.frames.util.Color}.
     */
    public Color getFieldColor();

    /**
     * Sets the field {@link org.obsidianbox.frames.util.Color} of the inner field area of the text box.
     *
     * @param color the field {@link org.obsidianbox.frames.util.Color} to render as.
     * @return the text field.
     */
    public ITextField setFieldColor(Color color);

    /**
     * Gets the outside {@link org.obsidianbox.frames.util.Color} of the field area of the text box.
     *
     * @return the border {@link org.obsidianbox.frames.util.Color}.
     */
    public Color getBorderColor();

    /**
     * Sets the outside {@link org.obsidianbox.frames.util.Color} of the field area of the text box.
     *
     * @param color the border {@link org.obsidianbox.frames.util.Color} to render as.
     * @return the text field.
     */
    public ITextField setBorderColor(Color color);

    /**
     * Gets the tab index for this text field.
     *
     * @return the tab index.
     */
    public int getTabIndex();

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
    public ITextField setTabIndex(int index);

    /**
     * Determines if this text field is a password field
     *
     * @return true if password field, false if not.
     */
    public boolean isPasswordField();

    /**
     * Sets whether the text will be obfuscated by asterisk (*) characters. Setting to true forces the maximum lines to
     * be 1.
     *
     * @param password true if the field is a password field, false if not.
     * @return the text field.
     */
    public ITextField setPasswordField(boolean password);

    /**
     * Gets the text processor.
     *
     * @return the assigned text processor.
     */
    public ITextProcessor getTextProcessor();

    /**
     * Sets the text processor.
     *
     * @param processor the text processor to assign.
     * @return the text field.
     */
    public ITextField setTextProcessor(ITextProcessor processor);

    /**
     * Fires when this text field is typed into on the screen. This event will also be sent to the screen listener.
     */
    public void onTextFieldChange();

    /**
     * Fires when the user presses Enter.
     */
    public void onTypingFinished();

    /**
     * Sets the placeholder to text. The placeholder will be displayed when no text is in the text field.
     *
     * @param text the placeholder text to set.
     * @return the text field.
     */
    public ITextField setPlaceholder(String text);

    /**
     * Gets the placeholder text.
     *
     * @return the placeholder text.
     */
    public String getPlaceholder();
}
