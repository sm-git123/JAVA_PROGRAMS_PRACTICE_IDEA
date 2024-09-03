package m_interview_prep_questions;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;



	public class Count_Occurence_of_each_string_in_Sentence {
		

		    public static void main(String[] args)
		    {
		        String str = "i am a fool i am a dead body";
		        System.out.println("str:"+ str.length());
		        
		
		        List<String> al = Arrays.stream(str.split("[. ]+")).collect(Collectors.toList());
		        
		        System.out.println("size:"+al.size());
		        HashMap<String, Integer> hm = new HashMap<>();
		        for (int i=0;i< al.size();i++) {
		            hm.putIfAbsent(al.get(i),
		                           Collections.frequency(al,al.get(i)));
		        }
		     
		        for (Map.Entry<String,Integer> e : hm.entrySet()) {
		            System.out.println(
		                "Word in the sentence:"+e.getKey()+ " and its count is: "+ e.getValue());
		        }
		    }
		}






