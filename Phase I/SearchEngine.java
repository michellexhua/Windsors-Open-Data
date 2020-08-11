import java.io.*;
import java.util.*;

public class SearchEngine{
	private String input;
	private String results; 
	private ArrayList dataList = new ArrayList();

	//obtains input
	public void SearchEngine(){
		Scanner scan = new Scanner(System.in); 
		String input = scan.nextLine(); 
		return input;
	}

	//search for one letter at a time 
	public void incrementalSearch(String input){
		ArrayList<String> result = new ArrayList<String>(); 
		for (String s : urls){
			if (s.contains(searchWord)){
				result.add(s)
			}
		}
		return result;
	}
	//goes through the list of datasets 
	public searchData(String result){
		ArrayList<String> list = new ArrayList<String>();
		//list of datasets
		System.out.println("Results: ");
		for (String element : list){
			if(element.contains("input")){
				result.add(input)
			}
		}
		return result;
	}
}
