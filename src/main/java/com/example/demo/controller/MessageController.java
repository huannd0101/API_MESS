package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.MessageDTO;
import com.example.demo.model.Message;
import com.example.demo.repository.MessageReponsitory;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
	@Autowired
	private MessageReponsitory messageReponsitory;
	
	@GetMapping
	public ResponseEntity<?> getMessages() throws Exception{
		List<Message> messages = messageReponsitory.findAll();
		if (messages.size()==0) {
			throw new Exception("Empty");
		}
		return ResponseEntity.status(200).body(messages);
	}
	
	@PostMapping
	public ResponseEntity<?> createMessage (@RequestBody MessageDTO messageDTO){
		Message message = new Message(messageDTO.getContent(), messageDTO.getSender(), messageDTO.getReceiver(), messageDTO.getRoomChatId());
		Message message2 = messageReponsitory.save(message);
		
		return ResponseEntity.status(200).body(message2);	
	}
}
