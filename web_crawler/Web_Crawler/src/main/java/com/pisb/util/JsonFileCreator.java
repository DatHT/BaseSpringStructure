package com.pisb.util;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileCreator {

	protected static final ObjectMapper JSON_MAPPER = new ObjectMapper();
	protected static final JsonParser PARSER = new JsonParser(JSON_MAPPER);
	public static <T> boolean createFile(T model) {
		String json = PARSER.toJson(model);
		FileWriter writer = null;
		try {
			 writer = new FileWriter("C://Workspace//abc.txt");
			writer.write(json);
			System.out.println("Write success");
			return true;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
}
