package com.kata.test;

import java.util.ArrayList;

public class KataTest_1 {
	public int Add(String numbers) throws Exception 
	{
		String errorMessage="";
		boolean errorFlags = false;
		ArrayList<String> wrongNumber = new ArrayList<String>();
		int res=0;
		String defaultDelimiters = ",";
		if(numbers.startsWith("//"))
		{
			String[] getDeliList =numbers.split("\n");
			defaultDelimiters = getDeliList[0].replace("//", "");
			numbers = numbers.replace(getDeliList[0], "");
			//these replace to solve question 9
			defaultDelimiters = defaultDelimiters.replace("[", "[\\"); 
			defaultDelimiters = defaultDelimiters.replace("][", "]|[");
		}
		if(!numbers.isEmpty())
		{
			//ignore case 1,\n
			if(numbers.substring(numbers.length()-1).equals("\n"))
			{
				throw new MyException("Wrong format exception");	
			}
			//for step 1 to add number and step 2 to add unlimited numbers
			//can use multiple delimiters in split method of java 
			
			//String[] listNumbers= numbers.split(",|\n"); // this is the first code for only commas delimiter
			
			String[] listNumbers= numbers.split(defaultDelimiters+"|[\n]"); // code to able to change delimiter and can use multiple symbol of delimiters
			for (String numStr : listNumbers) {
				
				
				//multiple negatives symbol
				if(numStr.contains("-"))
				{
					int count=0;
					for(int i=0;i<numStr.length();i++)
					{
						if(numStr.charAt(i)=='-')
						{
							count++;
						}
						else
							if(i>1) break;
					}
					if((count%2)==1)
					{
						numStr.replace("-", "");
						numStr = "-" +numStr;
					}
					else
						numStr =numStr.replace("-", "");
				}
					
					
					//for step 1 to add number and step 2 to add unlimited numbers
				if(!numStr.equals(""))
				{
					int num = Integer.parseInt(numStr);
					
					if(num<0)
					{
						errorFlags = true;
						wrongNumber.add(numStr);
					}
					//number can not bigger than 1000
					if(num >1000)
					{
						num =0;
					}
					res+= num;
				}
			}
		}
		if(errorFlags)
		{
			errorMessage = "negatives not allowed: ";
			for (String wrongNum : wrongNumber) {
				errorMessage = errorMessage + wrongNum + ",";
			}
			throw new MyException(errorMessage);
		}
		return res;
		
	}
}
