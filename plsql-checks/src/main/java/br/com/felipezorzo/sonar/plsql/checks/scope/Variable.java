/*
 * Sonar PL/SQL Plugin (Community)
 * Copyright (C) 2015 Felipe Zorzo
 * felipe.b.zorzo@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package br.com.felipezorzo.sonar.plsql.checks.scope;

import com.sonar.sslr.api.AstNode;

public class Variable {
    private final AstNode declaration;
    private int usage = 0;

    public Variable(AstNode declaration) {
        this.declaration = declaration;
    }

    public Variable(AstNode declaration, int usage) {
        this.declaration = declaration;
        this.usage = usage;
    }

    public void increaseUsage() {
        this.usage++;
    }

    public AstNode getDeclaration() {
        return declaration;
    }

    public int getUsage() {
        return usage;
    }
}