package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RoomChat;

public interface RoomChatRepository extends JpaRepository<RoomChat, Integer>{

}
