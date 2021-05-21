package com.example.demo.DTO;

public class MessageDTO {

	private String content;
	
	private String sender;
	
	private String receiver;
	
	private Integer roomChatId;

	public MessageDTO(String content, String sender, String receiver, Integer roomChatId) {
		super();
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.roomChatId = roomChatId;
	}

	public MessageDTO() {
		super();
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

	public Integer getRoomChatId() {
		return roomChatId;
	}

	public void setRoomChatId(Integer roomChatId) {
		this.roomChatId = roomChatId;
	}

	@Override
	public String toString() {
		return "MessageDTO [content=" + content + ", sender=" + sender + ", receiver=" + receiver + ", roomChatId="
				+ roomChatId + "]";
	}
	
	
}
