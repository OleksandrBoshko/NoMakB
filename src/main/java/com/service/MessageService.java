package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository message;
	
	public void save(){
		
	}
	
	public void getAll(){
		
	}
}
