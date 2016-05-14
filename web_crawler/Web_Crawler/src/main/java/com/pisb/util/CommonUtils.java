package com.pisb.util;

public class CommonUtils {
	
	public static String[] generateSynonym (String tempString) {
	    Integer count = 0;
	    String[] elements = tempString.split("\\s+");
	      String[] result = new String[elements.length];
	      StringBuilder newString = new StringBuilder();
	    for (int i = 0; i<elements.length; i++) {
	      newString.append(" " + elements[i]);
	      result[count] = newString.toString();
	      count++;
	    }
	    return  result;
	  }

}
