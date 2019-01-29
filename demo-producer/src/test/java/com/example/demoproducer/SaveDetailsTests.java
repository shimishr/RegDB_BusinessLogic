/*package com.example.demoproducer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.demoproducer.controller.AdminController;
import com.example.demoproducer.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoProducerApplication.class)
public class SaveDetailsTests {
	@Autowired
	AdminController adminController;
	@Test
	public void testP()throws Exception
	{
		UserDto userDto= new UserDto();
		userDto.setEfname("Shivani");
		userDto.setElname("Mishra");
		userDto.setJfname("Shivani");
		userDto.setJlname("Mishra");
		userDto.setEmpCode(117824);
		userDto.setHo_userId(1256);
		userDto.setIntraId(78954);
		userDto.setMode(true);
		userDto.setMode1(true);
		userDto.setMode2(true);
		userDto.setMode3(false);
		userDto.setMode4(true);
		userDto.setMode5(true);
		userDto.setRegionalOfficeCode("JPATOK14");
		userDto.setSalesOfficeCode("JPATOK25");
		userDto.setSalesRepCode("TOKYO123");
		userDto.setUpName("mishshi");
		userDto.setUpNameOffice("mishshi");
		userDto.setUserName("shimishr");
		String actual= adminController.SaveEmpDetails(userDto);
		String expected="success";
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testN()throws Exception
	{
		UserDto userDto= new UserDto();
		userDto.setEfname("Meera");
		userDto.setElname("Mishra");
		userDto.setJfname("Meera");
		userDto.setJlname(null);;
		userDto.setEmpCode(117827);
		userDto.setHo_userId(1265);
		userDto.setIntraId(78564);
		userDto.setMode(true);
		userDto.setMode1(true);
		userDto.setMode2(true);
		userDto.setMode3(false);
		userDto.setMode4(true);
		userDto.setMode5(true);
		userDto.setRegionalOfficeCode("JPATOK14");
		userDto.setSalesOfficeCode("JPATOK25");
		userDto.setSalesRepCode("TOKYO123");
		userDto.setUpName("mishmee");
		userDto.setUpNameOffice("mishmee");
		userDto.setUserName("meemishr");
		String actual= adminController.SaveEmpDetails(userDto);
		String expected="failure";
		Assert.assertEquals(expected,actual);
		
	}

}
*/