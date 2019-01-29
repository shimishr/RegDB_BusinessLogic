package com.example.demoproducer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regdb_form")
public class User {
	@Id
	//@Column(name = "EMP_CODE")
	private int empCode;
	
	//@Column(name = "Efname")
	private String Efname;
	
	//@Column(name = "Elname")
	private String Elname;
	
	//@Column(name = "Jfname")
	private String Jfname;
	
	//@Column(name = "Jlname")
	private String Jlname;
	
	//@Column(name = "ho_userId")
	private int ho_userId;
	
	//@Column(name = "intraId")
	private int intraId;
	
	//@Column(name = "mode")
	private boolean mode;
	
	//@Column(name = "mode1")
	private boolean mode1;
	
	//@Column(name = "mode2")
	private boolean mode2;
	
	//@Column(name = "mode3")
	private boolean mode3;
	
	//@Column(name = "mode4")
	private boolean mode4;
	
	//@Column(name = "mode5")
	private boolean mode5;
	
	//@Column(name = "regionalOfficeCode")
	private String regionalOfficeCode;
	
	//@Column(name = "salesOfficeCode")
	private String salesOfficeCode;
	
	//@Column(name = "salesRepCode")
	private String salesRepCode;
	
	//@Column(name = "upName")
	private String upName;
	
	//@Column(name = "upNameOffice")
	private String upNameOffice;
	
	//@Column(name = "userName")
	private String userName;

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEfname() {
		return Efname;
	}

	public void setEfname(String efname) {
		Efname = efname;
	}

	public String getElname() {
		return Elname;
	}

	public void setElname(String elname) {
		Elname = elname;
	}

	public String getJfname() {
		return Jfname;
	}

	public void setJfname(String jfname) {
		Jfname = jfname;
	}

	public String getJlname() {
		return Jlname;
	}

	public void setJlname(String jlname) {
		Jlname = jlname;
	}

	public int getHo_userId() {
		return ho_userId;
	}

	public void setHo_userId(int ho_userId) {
		this.ho_userId = ho_userId;
	}

	public int getIntraId() {
		return intraId;
	}

	public void setIntraId(int intraId) {
		this.intraId = intraId;
	}

	public boolean isMode() {
		return mode;
	}

	public void setMode(boolean mode) {
		this.mode = mode;
	}

	public boolean isMode1() {
		return mode1;
	}

	public void setMode1(boolean mode1) {
		this.mode1 = mode1;
	}

	public boolean isMode2() {
		return mode2;
	}

	public void setMode2(boolean mode2) {
		this.mode2 = mode2;
	}

	public boolean isMode3() {
		return mode3;
	}

	public void setMode3(boolean mode3) {
		this.mode3 = mode3;
	}

	public boolean isMode4() {
		return mode4;
	}

	public void setMode4(boolean mode4) {
		this.mode4 = mode4;
	}

	public boolean isMode5() {
		return mode5;
	}

	public void setMode5(boolean mode5) {
		this.mode5 = mode5;
	}

	public String getRegionalOfficeCode() {
		return regionalOfficeCode;
	}

	public void setRegionalOfficeCode(String regionalOfficeCode) {
		this.regionalOfficeCode = regionalOfficeCode;
	}

	public String getSalesOfficeCode() {
		return salesOfficeCode;
	}

	public void setSalesOfficeCode(String salesOfficeCode) {
		this.salesOfficeCode = salesOfficeCode;
	}

	public String getSalesRepCode() {
		return salesRepCode;
	}

	public void setSalesRepCode(String salesRepCode) {
		this.salesRepCode = salesRepCode;
	}

	public String getUpName() {
		return upName;
	}

	public void setUpName(String upName) {
		this.upName = upName;
	}

	public String getUpNameOffice() {
		return upNameOffice;
	}

	public void setUpNameOffice(String upNameOffice) {
		this.upNameOffice = upNameOffice;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	

}
