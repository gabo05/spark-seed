package com.util;

public class StringUtil{
	public static String getAsUnixPath(String wPath){
		return wPath.replace("\\","/").replaceAll("[A-Z][:]","");
	}
}