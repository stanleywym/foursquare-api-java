/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.entities;

import java.util.Arrays;

/**
 * Group of Likes
 * 
 * @author Stanley Wong
 */
public class LikeGroup extends Group<Like> {
	private static final long serialVersionUID = 1010398499637066892L;

	@Override
	public Like[] getItems() {
		return items;
	}

	private Like[] items;

	@Override
	public String toString() {
		return "LikeGroup{" + "items=" + Arrays.toString(items) + '}';
	}
}
