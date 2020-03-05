package service;
import java.lang.String;
import java.util.Scanner;
import model.User;

public class AstroCalculator {
	
	 public String findSign(model.User u) {
		 String month=u.getMonth();
		String date=u.getDate();
		
		if(month=="12") {
			if(date < ="22") {
				return "Sagitarius";
			}
			else {
				return "capricorn";
			}
			
		}
		else if(month=="01") {
				if(date<"20") {
					return "capricorn";
				}
				else {
					return "aquarious";
				}
				
			}
		else if(month=="02") {
			if(date<"19") {
				return "aquarious";
			}
			else {
				return "pisces";
			}
			
		}
	
		else if(month=="03") {
			if(date<"21") {
				return "pisces";
			}
			else {
				return "aries";
			}
			
		}
	
		else if(month=="04") {
			if(date<"20") {
				return "aries";
			}
			else {
				return "taurus";
			}
			
		}
		else if(month=="05") {
			if(date<"21") {
				return "taurus";
			}
			else {
				return "gemini";
			}
			
		}
		else if(month=="06") {
			if(date<"21") {
				return "gemini";
			}
			else {
				return "cancer";
			}
			
		}
		else if(month=="07") {
			if(date<"23") {
				return "cancer";
			}
			else {
				return "leo";
			}
			
		}
		else if(month=="08") {
			if(date<"23") {
				return "leo";
			}
			else {
				return "virgo";
			}
			
		}
		else if(month=="09") {
			if(date<"23") {
				return "virgo";
			}
			else {
				return "libra";
			}
			
		}
		else if(month=="10") {
			if(date<"23") {
				return "libra";
			}
			else {
				return "scorpio";
			}
			
		}
		else {
			if(date<"22") {
				return "scorpio";
			}
			else {
				return "Sagitarius";
			}
			
		
		}
		
	
	 }
	 
	 
	 
	 
	 
	 
	 
	 
