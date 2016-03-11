package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository user;
	
	public void save(){
		
	}
	
	public void getAll(){
		
	}
	
//	@Override
//    public List<User> getAll() {
//        return users;
//    }
//
//    @Override
//    public void updateUser(User user) {
//        for (User us : users) {
//            if (us.getId().longValue() == user.getId().longValue()) {
//                int index = users.indexOf(us);
//                users.set(index, user);
//                break;
//            }
//        }
//    }

//    @Override
//    public void deleteUser(Long id) {
//        for(User u : users){
//            if(u.getId().longValue() == id.longValue()) {
//                users.remove(u);
//                break;
//            }
//        }
//    }
//
//    @Override
//    public void addUser(User user) {
//        Long l = Long.MAX_VALUE;
//        for (User u : users) {
//            l = u.getId();
//        }
//        user.setId(l + 1);
//        users.add(user);
//    }    
}
