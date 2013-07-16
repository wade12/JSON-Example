package com.skynetlabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class FromGsonExample {
	public static void main(String[] args) {

		Gson gson = new Gson();

		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					"c:\\file.jsonexample"));

			// re-convert the JSON string back to object
			DataObject object = gson.fromJson(bufferedReader, DataObject.class);

			System.out.println(object);

		} // end try
		catch (IOException exception) {
			exception.printStackTrace();
		} // end catch

	} // end method main

} // end Class FromGsonExample
