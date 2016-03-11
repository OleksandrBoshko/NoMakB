package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "time")
	private int time;
	
	@Column(name = "text")
	private String text;
	
	@ManyToOne
	private User user;
	@ManyToOne
	private User userTo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public User getFrom() {
		return user;
	}
	public void setFrom(User from) {
		this.user = from;
	}
	public User getTo() {
		return userTo;
	}
	public void setTo(User to) {
		this.userTo = to;
	}


}
