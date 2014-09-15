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

/**
 * This is used to define the orientation for Scrollable widgets.
 */
public enum OrientationType {
    /**
     * Horizontal axis (left-right)
     */
    HORIZONTAL(0),
    /**
     * Vertical axis (top-bottom)
     */
    VERTICAL(1);

    private final int id;
    OrientationType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private static final HashMap<Integer, OrientationType> lookupId = new HashMap<>();

    static {
        for (OrientationType t : values()) {
            lookupId.put(t.getId(), t);
        }
    }

    public static OrientationType getOrientationFromId(int id) {
        return lookupId.get(id);
    }

    public OrientationType getOther() {
        switch (this) {
            case HORIZONTAL:
                return VERTICAL;
            case VERTICAL:
                return HORIZONTAL;
        }
        return null;
    }
}

