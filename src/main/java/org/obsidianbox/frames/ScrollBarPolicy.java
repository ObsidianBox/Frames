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

import java.util.HashMap;

public enum ScrollBarPolicy {
    /**
     * Shows the scroll bar when getMaximumScrollPosition is greater than 0.
     */
    SHOW_IF_NEEDED(0),
    /**
     * Never show the scroll bar. However, you'll still be able to scroll with the scroll wheel, your track pad or with arrow keys if the widget implemented that (like the list widget).
     */
    SHOW_NEVER(1),
    /**
     * Always show the scroll bar
     */
    SHOW_ALWAYS(2);

    private final int id;
    private static HashMap<Integer, ScrollBarPolicy> ids = new HashMap<Integer, ScrollBarPolicy>();
    ScrollBarPolicy(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static ScrollBarPolicy getById(int id) {
        return ids.get(id);
    }

    static {
        for (ScrollBarPolicy s: values()) {
            ids.put(s.id, s);
        }
    }
}
