package com.example.demo.DTO;

public class RoomChatDTO {
	private String sender;
	private String receiver;
	
	public RoomChatDTO() {
		super();
	}
	public RoomChatDTO(String sender, String receiver) {
		super();
		this.sender = sender;
		this.receiver = receiver;
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
	
	
}
