import java.io.*;
import java.util.*;

public class User{
	private String input;
	private String result;

	//obtains users input
	public Input(){
		Scanner scan = new Scanner(System.in); 
		System.out.println("Search..")
		String input = scan.nextLine(); 
		return input;
	}

	//display search engines result 
	public static void main(String[] args){
		Results r = new Results();
		String result = r.Result();

		System.out.println(result);
	}
	
