package org.obsidianbox.frames;

public interface IMaskedField extends ITextField {
    /**
     * Gets the current character used to mask text input. Defaults to an asterisk (*).
     *
     * @return the mask character.
     */
    char getMaskCharacter();

    /**
     * Sets the character to use to mask text that is put into this field.
     *
     * @param character the mask character.
     * @return the masked field.
     */
    IMaskedField setMaskCharacter(char character);
}
