package it.progess.model;

public class ModelUtils {
	public static String getAddress(String street,String number){
		if (number != null){
			return street + " "+number;
		}else{
			return street;
		}
	}
	public static String getAddress2(String zipcode,String city,String zone){
		return zipcode+" "+city+" ("+zone+")";
	}
}
