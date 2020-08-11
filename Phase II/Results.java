import java.io.*;
import java.util.*;

public class Result{
	private int searchNum;
	private String result;

	//get method
	public String getResult(){
		return result;
	}

	//set method
	public String setResult(String result)
	{
		this.result = result; 
	}

	//obtains datasets and returns results 
	public void display(String result){
		Result r = result.getResult();
	}
}
