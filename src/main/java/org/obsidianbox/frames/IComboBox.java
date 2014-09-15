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

import java.util.List;

public interface IComboBox extends IButton {
    /**
     * Sets the list of items in the combo box.
     *
     * @param items the list of items.
     * @return the combo box.
     */
    IComboBox setItems(List<String> items);

    /**
     * Gets the list of items in the combo box.
     *
     * @return the list of items in the combo box.
     */
    List<String> getItems();

    /**
     * Opens the combo box list.
     *
     * @return the combo box.
     */
    IComboBox openList();

    /**
     * Closes the combo box list.
     *
     * @return the combo box.
     */
    IComboBox closeList();

    /**
     * Gets the selected item's string value.
     *
     * @return the selected item's string value.
     */
    String getSelectedItem();

    /**
     * Gets the selected row.
     *
     * @return the selected row's index number.
     */
    int getSelectedRow();

    /**
     * Sets the selected row.
     *
     * @param row the row to select.
     * @return the combo box.
     */
    IComboBox setSelection(int row);

    /**
     * Fires when a selection has changed in the combo box.
     *
     * @param i the selected row's index number.
     * @param text the selected item's string.
     */
    void onSelectionChanged(int i, String text);

    /**
     * Gets the open status of the combo box.
     *
     * @return true if open, false if not.
     */
    boolean isOpen();

    /**
     * Sets the format of the text on the button. Default is "%text%: %selected%".
     *
     * %text% will be replaced with whatever can be obtained by Button.getText().
     * %selected% will be replaced with the text of the selected item.
     * @param format the format of the text on the button.
     * @return the combo box.
     */
    IComboBox setFormat(String format);

    /**
     * Gets the current format of the text on the button.
     *
     * @return the format string.
     */
    String getFormat();
}

