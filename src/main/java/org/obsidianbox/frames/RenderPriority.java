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

public enum RenderPriority {
    /**
     * Will render before all other textures and widgets.
     */
    Highest(0),
    /**
     * Will render before most other textures and widgets.
     */
    High(1),
    /**
     * Will render in line with most other textures and widgets.
     */
    Normal(2),
    /**
     * Will render after most other textures and widgets.
     */
    Low(3),
    /**
     * Will render after all other textures and widgets.
     */
    Lowest(4);

    private final int id;
    private RenderPriority(int id) {
        this.id = id;
    }

    /**
     * Gets the render priority ID.
     *
     * @return the id.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the render priority from an ID.
     *
     * @param id the id to look up the priority with.
     * @return the priority.
     */
    public static RenderPriority getRenderPriorityFromId(int id) {
        for (RenderPriority rp : values()) {
            if (rp.getId() == id) {
                return rp;
            }
        }
        return null;
    }
}

