package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "messages")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer messageId;
	
	@Nationalized
	private String content;
	
	private String sender;
	
	private String receiver;
	
	private Integer roomChat;

	@CreationTimestamp
	private Timestamp createAt;

	public Message(Integer messageId, String content, String sender, String receiver, Integer roomChat,
			Timestamp createAt) {
		super();
		this.messageId = messageId;
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.roomChat = roomChat;
		this.createAt = createAt;
	}

	public Message(String content, String sender, String receiver, Integer roomChat) {
		super();
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.roomChat = roomChat;
	}

	public Message() {
		super();
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", content=" + content + ", sender=" + sender + ", receiver="
				+ receiver + ", roomChat=" + roomChat + ", createAt=" + createAt + "]";
	}

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Integer getRoomChat() {
		return roomChat;
	}

	public void setRoomChat(Integer roomChat) {
		this.roomChat = roomChat;
	}

	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}
	
	
	
}
