package com.example.demoproducer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproducer.dto.UserDto;
import com.example.demoproducer.entity.User;
import com.example.demoproducer.service.IUserService;

@CrossOrigin(origins ="https://regdb-ui-dev.apps.eas.pcf.manulife.com",maxAge=31536000)
@RestController
public class AdminController {
	@Autowired
	IUserService iUserService;

	@RequestMapping(value="/SaveUserDetails",method=RequestMethod.POST,produces = "application/json")
	public String SaveEmpDetails(@RequestBody UserDto user) throws Exception{
		System.out.println("Namehey :"+user.getEfname());
		//String result=iUserService.insertUserData(user);
		return iUserService.insertUserData(user);	
	}
	
	/*@RequestMapping(value="/getUserDetails",method=RequestMethod.GET)
    public User EmpDetails(@RequestParam int empCode,String userName){
		return	iUserService.getUserData(empCode,userName);
	}*/
	
	@RequestMapping(value="/getAllUserDetails",method=RequestMethod.GET)
    public List<User> EmpDetails() throws Exception{
		return	iUserService.getAllUserData();
	}
	
	@DeleteMapping(value="/deleteUserDetails")
    public boolean deleteUser(@RequestParam int empCode) throws Exception{
		iUserService.deleteUserData(empCode);
		return true;
	}
	
	@RequestMapping(value="/updateUserDetails", method=RequestMethod.PUT, 
            produces="application/json", consumes="application/json")
    public String updateStudent(@RequestParam int empCode, @RequestBody User user) throws Exception
    {
		String result=iUserService.updateStudent(user);
		return result;
    }
	

}
