package com.happynovember;

public class ServicesItemModel {
	
	private int id;
	private int date;
	private int views;
	private String title;
	private String text;
	private String image;
	private String author;
	
	public ServicesItemModel(){
		
	}
	
	public ServicesItemModel(int id, int date, int views, String title, String text, String image, String author){
		this.id = id;
		this.date = date;
		this.views = views;
		this.title = title;
		this.text = text;
		this.image = image;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
