package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Message;

public interface MessageReponsitory extends JpaRepository<Message, Integer>{

}
