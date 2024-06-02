/**
 * MIT License
 * Copyright (c) 2024 Tristan Mahinay
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * pet-management-system
 *
 * @author rjtmahinay
 * 2024
 */
package com.jugph.contest.domain;

import com.jugph.contest.behaviors.Feedable;
import com.jugph.contest.behaviors.Playable;

// This is a generic Pet
public abstract class Pet implements Feedable, Playable {

    // A pet can have a name, type and mood state (Sad, Happy, Hungry). These attributes can be inheritable.
    private String name;
    private Type type;
    private State hungry;

    public enum Type {
        DOG,
        CAT,
        RABBIT,
        PARROT,
        TURTLE,
        HAMSTER,
        FISH,
        MOUSE,
        GUINEA_PIG
    }

    private enum State{
        SAD,
        HAPPY,
        HUNGRY
    }

    abstract void talk();

    abstract void walk();

    public Type getType() {
        return type;
    }
}
