import java.io.*;
import java.util.*;

public class Sort{
	//sorts datasets 
	public void Sort()
	{
		Results result = new Results();
		String str[] = result.getResults();
		int i, j, n;

		for (int i = 0; i < str.length ; i++)
		{
			for (int j = i + 1; j < str.length; j++)
			{
				//comparing adjacent strings
				if (str[i].compareTo(str[j])<0)
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			result = str[i];
		}
		return result;
	}
}