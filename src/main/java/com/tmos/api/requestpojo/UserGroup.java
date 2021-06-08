package com.tmos.api.requestpojo;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class UserGroup 
{
	private String _id;
	private String name;
	private boolean root;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRoot() {
		return root;
	}
	public void setRoot(boolean root) {
		this.root = root;
	}
}
