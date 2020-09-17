package com.todolist.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "create_dt")
	private Date createDate;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "last_update_date")
	private Date lastupdatedDate;
	
	/*
	 * public Task() {
	 * 
	 * }
	 * 
	 * public Task(int id, Date createDate, String description, String status,
	 * String userId, Date lastupdatedDate) { super(); this.id = id; this.createDate
	 * = createDate; this.description = description; this.status = status;
	 * this.userId = userId; this.lastupdatedDate = lastupdatedDate; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getLastupdatedDate() {
		return lastupdatedDate;
	}
	public void setLastupdatedDate(Date lastupdatedDate) {
		this.lastupdatedDate = lastupdatedDate;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", createDate=" + createDate + ", description=" + description + ", status=" + status
				+ ", userId=" + userId + ", lastupdatedDate=" + lastupdatedDate + "]";
	}
	
}
