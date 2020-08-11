import java.io.*;
import java.util.*;

public class User{
	private String input;
	private String result;

	//obtains users input
	public void Input(){
		Scanner scan = new Scanner(System.in); 
		System.out.println("Search..");
		String nextInput = scan.next(); 
		input += nextInput;
	}

	public String getInput(){
		return input;
	}

	//display search engines result 
	public static void main(String[] args){
		SearchEngine r = new SearchEngine();
		String result = r.SearchEngine();

		System.out.println(result);
	}
	