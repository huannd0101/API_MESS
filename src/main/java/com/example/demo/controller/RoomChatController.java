package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.RoomChatDTO;
import com.example.demo.model.RoomChat;
import com.example.demo.repository.RoomChatRepository;

@RestController
@RequestMapping("/api/roomchats")
public class RoomChatController {
	
	@Autowired
	private RoomChatRepository roomChatRepository;
	
	@GetMapping
	public ResponseEntity<?> getAllRoomChat () throws Exception{
		List<RoomChat> accounts = roomChatRepository.findAll();
		if (accounts.size()==0) {
			throw new Exception("Empty");
		}
		return ResponseEntity.status(200).body(accounts);
	}
	
	@PostMapping
	public ResponseEntity<?> createRoomChat (@RequestBody RoomChatDTO romChatDTO){
		
		RoomChat roomChat = new RoomChat(romChatDTO.getSender(), romChatDTO.getReceiver());
		RoomChat roomChat2 = roomChatRepository.save(roomChat);
		
		return ResponseEntity.status(200).body(roomChat2);		
	}
}
