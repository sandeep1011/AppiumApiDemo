package appium.demo;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReader {
	 public static void main(String[] args) throws Exception  
	    { 
	        // parsing file "JSONExample.json" 
	        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\sandeepgupta01\\workspace\\demo\\src\\test\\java\\appium\\demo\\data.json")); 
	          
	        // typecasting obj to JSONObject 
	        JSONObject jo = (JSONObject) obj; 
	          
	        
	        String String1 = (String) jo.get("String1");
	        String String2 = (String) jo.get("String2");
	        String String3 = (String) jo.get("String3");
	        String String4 = (String) jo.get("String4");
	        String String5 = (String) jo.get("String5");
	        String String6 = (String) jo.get("String6");
	        String String7 = (String) jo.get("String7");
	        String String8 = (String) jo.get("String8");
	        String String9 = (String) jo.get("String9");
	        String String10 = (String) jo.get("String10");
	        String String11 = (String) jo.get("String11");
	        String String12 = (String) jo.get("String12");
	        
	         
	          
	        System.out.println(String1); 
	        System.out.println(String2); 
	          
	        
	          
	        
	          
	        
	    } 
	} 
	


