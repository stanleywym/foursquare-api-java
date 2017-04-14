/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2014 - Blake Dy / Wallaby
 * http://walla.by
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.entities.venue;

import fi.foyt.foursquare.api.FoursquareEntity;

/**
 * Class representing Open entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/hoursformatted.html" target="_blank">https://developer.foursquare.com/docs/responses/
 *      hoursformatted.html</a>
 * 
 * @author Stanley Wong
 */
public class Open implements FoursquareEntity {
	private static final long serialVersionUID = 5180965002598165147L;
	
	private String renderedTime;

	public String getRenderedTime() {
		return renderedTime;
	}

}
