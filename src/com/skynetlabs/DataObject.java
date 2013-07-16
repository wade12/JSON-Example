package com.skynetlabs;

import java.util.ArrayList;
import java.util.List;

public class DataObject {

	private final int data1 = 264;
	private final String data2 = "java";

	@SuppressWarnings("serial")
	private final List<String> list = new ArrayList<String>() {
		{
			add("1st string");
			add("2nd string");
			add("3rd string");
		} // end addition of strings
	}; // end ArrayList<String>

	// getter and setter methods
	public int getData1() {
		return data1;
	} // end getData1

	public String getData2() {
		return data2;
	} // end getData2

	public List<String> getList() {
		return list;
	} // end getList

	@Override
	public String toString() {
		return "DataObject [data1=" + data1 + ", data2=" + data2 + ", list="
				+ list + "]";
	} // end method toString

} // end Class DataObject
