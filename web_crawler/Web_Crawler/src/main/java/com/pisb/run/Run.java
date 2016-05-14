package com.pisb.run;

import com.pisb.model.ExampleObject;
import com.pisb.util.JsonFileCreator;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleObject ex = new ExampleObject();
		ex.setName("dat");
		ex.setAddress("123");
		JsonFileCreator.createFile(ex);
	}

}
