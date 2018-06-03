package com.personal;

public class SaravanaPriyaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST+"Saravanapriya");
		System.out.println(ProfileConstant.SECOND+"R");
		System.out.println(ProfileConstant.THIRD+18);
	}

	@Override
	public void myHobbies() {
		System.out.println("Roaming");
		
		
	}

	
}
