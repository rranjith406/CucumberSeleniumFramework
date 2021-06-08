package com.tmos.api.responsepojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackDetails {

	private String name;
	private String shortName;
	private double line;
	private double track;
	private UserGroup userGroup;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public double getLine() {
		return line;
	}
	public void setLine(double line) {
		this.line = line;
	}
	public double getTrack() {
		return track;
	}
	public void setTrack(double track) {
		this.track = track;
	}
	public UserGroup getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}
}
