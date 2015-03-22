package com.happynovember.gui;

public class MenuItemModel {
	
	private int id;
	private String text;
	private String url;
	private String type;
	
	public MenuItemModel() {
		
	}
	
	public MenuItemModel(int id, String text, String url, String type) {
		this.id = id;
		this.text = text;
		this.url = url;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
