package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.ComentRepository;

@Service
public class ComentService {
	
	@Autowired
	private ComentRepository coment;
	
	public void save(){
		
	}
	
	public void getAll(){
		
	}
}
