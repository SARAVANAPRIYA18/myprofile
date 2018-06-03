package com.personal;

public class Ishu implements IProfile {

	@Override
	public void myBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println(ProfileConstant.FIRST +" Ish");
		System.out.println(ProfileConstant.SECOND+" R");
		System.out.println(ProfileConstant.THIRD+ 22);
	}

	@Override
	public void myHobbies() {
		// TODO Auto-generated method stub
		System.out.println("Reading Book");
	}
	

}
