package com.swing.interprinter;

import java.util.ArrayList;
import java.util.HashMap;

public class SwingInterprinter {
	private final static String[] CODE_VALUE_DEF = {"은", "는"};
	private final static String[] CODE_VALUE_ADD = {"이", "가"};
	private final static String[] CODE_VALUE_SUB = {"을", "를"};
	private final static String[] CODE_VALUE_AND = {"와", "과"};
	private final static String CODE_VALUE_PRE = "그것";
	private final static String[] CODE_ADD = {"되", "된", "될"};
	private final static String[] CODE_SUB = {"되었", "됐"};
	private final static String CODE_PRINT_VALUE = "알겠";
	private final static String CODE_PRINT_CHAR = "생각";
	private final static String CODE_END_LINE = "다\\. ";
	
	private HashMap<String, Integer> mValues;
	
	public SwingInterprinter()
	{
		mValues = new HashMap<String, Integer> ();
	}
	
	public void interPrinting(String code)
	{
		code = code.replace("\n", "").replace("\r", "");
		String[] lines = code.split(CODE_END_LINE);
		HashMap<String, Integer> nowValues = new HashMap<String, Integer>();
		
		for(int index = 0; index < lines.length; index++)
		{
			String line = lines[index];
			ArrayList<String> subject = new ArrayList<String>();
			ArrayList<Integer> valueQueue = new ArrayList<Integer>();
			
			String[] words = line.split(" ");
			boolean findSub = false;
			int value = 0;
			int wdIdx = 0;
			
			int defAddSub = 0;
			
			if(words[0].startsWith(CODE_VALUE_PRE))
			{
				wdIdx ++;
				if(words[0].endsWith(CODE_VALUE_ADD[0]) || words[0].endsWith(CODE_VALUE_ADD[1]))
				{
					defAddSub = 1;
				}
				else if(words[0].endsWith(CODE_VALUE_SUB[0]) || words[0].endsWith(CODE_VALUE_SUB[1]))
				{
					defAddSub = -1;
				}
				else
				{
					defAddSub = 0;
				}
				findSub = true;
			}else{
				nowValues.clear();
			}
			
			for(; wdIdx < words.length - 1; wdIdx++)
			{
				if(!findSub){
					if(words[wdIdx].length() > 1 && (words[wdIdx].endsWith(CODE_VALUE_DEF[0]) || words[wdIdx].endsWith(CODE_VALUE_DEF[1])))
					{
						String strSub = "";
						for(String sub : subject)
						{
							strSub += sub + " ";
						}
						strSub += words[wdIdx].substring(0, words[wdIdx].length() - 1);
						
						if(mValues.containsKey(strSub)){
							nowValues.put(strSub, mValues.get(strSub));
						}else{
							nowValues.put(strSub, new Integer(0));
						}
						subject.clear();
						defAddSub = 0;
						findSub = true;
					}
					else if(words[wdIdx].length() > 1 && (words[wdIdx].endsWith(CODE_VALUE_ADD[0]) || words[wdIdx].endsWith(CODE_VALUE_ADD[1])))
					{
						String strSub = "";
						for(String sub : subject)
						{
							strSub += sub + " ";
						}
						strSub += words[wdIdx].substring(0, words[wdIdx].length() - 1);
						
						if(mValues.containsKey(strSub)){
							nowValues.put(strSub, mValues.get(strSub));
						}else{
							nowValues.put(strSub, new Integer(0));
						}
						subject.clear();
						defAddSub = 1;
						findSub = true;
					}
					else if(words[wdIdx].length() > 1 && (words[wdIdx].endsWith(CODE_VALUE_SUB[0]) || words[wdIdx].endsWith(CODE_VALUE_SUB[1])))
					{
						String strSub = "";
						for(String sub : subject)
						{
							strSub += sub + " ";
						}
						strSub += words[wdIdx].substring(0, words[wdIdx].length() - 1);
						
						if(mValues.containsKey(strSub)){
							nowValues.put(strSub, mValues.get(strSub));
						}else{
							nowValues.put(strSub, new Integer(0));
						}
						subject.clear();
						defAddSub = -1;
						findSub = true;
					}
					else if(words[wdIdx].endsWith(CODE_VALUE_AND[0]) || words[wdIdx].endsWith(CODE_VALUE_AND[1]))
					{
						String strSub = "";
						for(String sub : subject)
						{
							strSub += sub + " ";
						}
						strSub += words[wdIdx].substring(0, words[wdIdx].length() - 1);
						
						if(mValues.containsKey(strSub)){
							nowValues.put(strSub, mValues.get(strSub));
						}else{
							nowValues.put(strSub, new Integer(0));
						}
						
						subject.clear();
					}
					else
					{
						subject.add(words[wdIdx].replace(" ", ""));
					}
				}
				else{
					if(words[wdIdx].startsWith(CODE_SUB[0]) || words[wdIdx].startsWith(CODE_SUB[1]))
					{
						valueQueue.add(new Integer(-1));
						valueQueue.add(new Integer(value));
						value = 0;
						continue;
					}
					
					if(words[wdIdx].startsWith(CODE_ADD[0]) || words[wdIdx].startsWith(CODE_ADD[1]) || words[wdIdx].startsWith(CODE_ADD[2]))
					{
						valueQueue.add(new Integer(value));
						value = 0;
						continue;
					}
					
					if(value == 0){
						value = 1;
					}else{
						value *= 2;
					}
				}
			}
			
			valueQueue.add(new Integer(value));
			
			int totalValue = 0;
			boolean isMinus = false;
			for(Integer savedValue : valueQueue)
			{
				if(savedValue.intValue() == -1){
					isMinus = true;
					continue;
				}
				
				if(isMinus)
				{
					totalValue += (-1 * savedValue.intValue());
					isMinus = false;
					continue;
				}
				
				totalValue += savedValue.intValue();
			}
			
			if(defAddSub == 1)
			{
				
				for(String name : nowValues.keySet()){
					nowValues.put(name, new Integer(nowValues.get(name).intValue() + totalValue));
				}
			}
			else if(defAddSub == -1)
			{
				for(String name : nowValues.keySet()){
					nowValues.put(name, new Integer(nowValues.get(name).intValue() - totalValue));
				}
			}
			else{
				for(String name : nowValues.keySet()){
					nowValues.put(name, new Integer(totalValue));
				}
			}
			
			if(words[words.length-1].startsWith(CODE_PRINT_VALUE))
			{
				for(String name : nowValues.keySet()){
					System.out.print(nowValues.get(name));
				}
			}
			
			if(words[words.length-1].startsWith(CODE_PRINT_CHAR))
			{
				for(String name : nowValues.keySet()){
					System.out.print((char)nowValues.get(name).intValue());
				}
			}
			
			
			
			for(String name : nowValues.keySet()){
				mValues.put(name, nowValues.get(name));
			}
		}
	}
}
