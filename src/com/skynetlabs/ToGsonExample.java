package com.skynetlabs;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class ToGsonExample {
	public static void main(String[] args) {

		DataObject object = new DataObject();
		Gson gson = new Gson();

		// convert java object to JSON format,
		// then return as a JSON formatted string
		String json = gson.toJson(object);

		try {
			// write converted JSON data to a file titled "file.jsonexample"
			FileWriter fileWriter = new FileWriter("c:\\file.jsonexample");
			fileWriter.write(json);
			fileWriter.close();
		} // end try
		catch (IOException exception) {
			exception.printStackTrace();
		} // end catch

		System.out.println(json);

	} // end method main

} // end Class ToGsonExample
