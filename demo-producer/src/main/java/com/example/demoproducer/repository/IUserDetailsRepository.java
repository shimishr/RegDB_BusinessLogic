package com.example.demoproducer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoproducer.entity.User;

@Repository
public interface IUserDetailsRepository extends JpaRepository<User, Integer> {
	//@Query("Select e from User e where e.empCode=?1 and e.userName=?2")
	//public User getALlData(int empCode,String userName);

	public void delete(int empCode);
}
