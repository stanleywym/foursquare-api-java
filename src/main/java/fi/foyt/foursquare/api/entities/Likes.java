package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

/**
 * Class representing Likes entity. This entity contains the count of users who have liked this venue, and groups containing any friends and others who have
 * liked it. The groups included are subject to change.
 * 
 * @author Stanley Wong
 */
public class Likes implements FoursquareEntity {
	private static final long serialVersionUID = -5831437288848097375L;

	public Integer getCount() {
		return count;
	}

	public LikeGroup[] getGroups() {
		return groups;
	}

	public String getSummary() {
		return summary;
	}

	private Integer count;
	private LikeGroup[] groups;
	private String summary;
}
