package com.src.backend;

public class DbFactiry {
	
	
	
	private DbFactiry(){
		
		
		
		
	}
	
	
	private static DbIntr di;
	
	public static DbIntr getInstance(){
		
		di=new DbImpl();
		return di;
		
	}

}
