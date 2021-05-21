package com.example.demo.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "roomChat")
public class RoomChat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String sender;
	
	private String receiver;
	
	private Timestamp createAt;

	public RoomChat(Integer id, String sender, String receiver, Timestamp createAt) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.createAt = createAt;
	}

	public RoomChat() {
		super();
	}

	public RoomChat(String sender, String receiver) {
		super();
		this.sender = sender;
		this.receiver = receiver;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}


	
	
}
