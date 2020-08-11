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

	//sorts obtained datasets
	public void sort(String result){
		for (int i = 0; i <n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (result[i].compareTo(names[j])>0)
				{
					temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		return result
	}
}
