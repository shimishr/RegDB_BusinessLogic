package com.example.demoproducer.service;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoproducer.dto.UserDto;
import com.example.demoproducer.entity.User;
import com.example.demoproducer.repository.IUserDetailsRepository;

@Service
public class UserServiceImpl implements IUserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	

	@Autowired
	IUserDetailsRepository iUserDetailsRepository;
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public String insertUserData(UserDto userdto)throws IOException{
		String result;
		try{
			User user = new User();	
			ModelMapper mapper=new ModelMapper();
			user= mapper.map(userdto,User.class);
			iUserDetailsRepository.save(user);	
			result="success";
		}
		catch (Exception e) {
			result="failure";
			//throw new UserNotFoundException("Unable to add PA user\",e");
			
			logger.error("Unable to add PA user",e);
		//	logger.debug("Hello,this is debug message");
			//throw new UserNotFoundException("Unable to add PA user",e);
		}
		return result;
	}
	
	/*@Override
	public User getUserData(int empCode,String userName){
	User user1 =iUserDetailsRepository.getALlData(empCode,userName);
	if(user1==null){
		System.out.println("User does not exist!!!!!");
	}
	else
	{
		System.out.println("User Exist");
	}
	return user1;
	}*/

	@Override
	public List<User> getAllUserData()throws Exception {
			
		return iUserDetailsRepository.findAll();
	}

	@Override
	public boolean deleteUserData(int empCode) throws Exception {
		try {
		iUserDetailsRepository.delete(empCode);
		}catch(Exception e) {
			logger.error("User not Found");
			//throw new UserNotFoundException("User not Found",e);
		}
		return true;
	}

	@Override
	public String updateStudent(User user)throws Exception {
		String result=null;
		try{
			//User user1 = new User();	
			ModelMapper mapper=new ModelMapper();
			user= mapper.map(user,User.class);
			iUserDetailsRepository.save(user);	
			result="success";
		}
		catch (Exception e) {
			result="failure";
			logger.error("Couldn't update the PA user",e);
		//	throw new UserNotFoundException("Couldn't update the PA user",e);
		}
		return result;
	}
}
