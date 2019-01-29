package com.example.demoproducer.service;

import java.util.List;
import com.example.demoproducer.dto.UserDto;
import com.example.demoproducer.entity.User;

public interface IUserService {

	public String insertUserData(UserDto user) throws Exception; 
	//public User getUserData(int empCode,String userName);
	public List<User> getAllUserData() throws Exception;
	public boolean deleteUserData(int empCode) throws Exception;
	public String updateStudent(User user) throws Exception;
}
