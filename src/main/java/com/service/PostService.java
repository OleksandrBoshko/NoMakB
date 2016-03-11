package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository post;
	
	public void save(){
		
	}
	
	public void getAll(){
		
	}
}
