/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
		       Matthias Butz <matze@odinms.de>
		       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tools;

import java.io.Serializable;

public class Pair<E, F> implements Serializable {
	private static final long serialVersionUID = -634786879149311046L;
	private E left;
	private F right;

	public Pair(E left, F right) {
		this.left = left;
		this.right = right;
	}

	public E getLeft() {
		return left;
	}

	public F getRight() {
		return right;
	}
	
	@SuppressWarnings("rawtypes")
	public boolean equals(Object o) {
	    if (this.getClass() != o.getClass()) return false;
	    if (this == (Pair) o) return true;
	    Pair compare = (Pair) o;
	    return compare.getLeft() == this.getLeft() && compare.getRight() == this.getRight();
	}
}