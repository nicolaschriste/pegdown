/*
 * Copyright (C) 2010 Mathias Doenitz
 *
 * Based on peg-markdown (C) 2008-2010 John MacFarlane
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pegdown.ast;

import org.parboiled.common.ImmutableList;

import java.util.List;

public class SimpleNode implements Node {
    public enum Type { Apostrophe, Ellipsis, Emdash, Endash, HRule, Linebreak, Nbsp }

    private final Type type;

    public SimpleNode(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public List<Node> getChildren() {
        return ImmutableList.of();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}