package m_interview_prep_questions;
import java.io.*;
import java.util.*;

public class Count_Occurence_Of_Each_Character_Hashmap_way {
	

	    public static void main(String[] args)
	    {
	        String str = "GeeksForGeeks";
	        ArrayList<Character> al = new ArrayList<>();
	        for (int i = 0; i < str.length(); i++) {
	            al.add(str.charAt(i));
	        }
	        HashMap<Character, Integer> hm = new HashMap<>();
	        for (int i = 0; i < str.length(); i++) {
	            hm.putIfAbsent(al.get(i),
	                           Collections.frequency(al,al.get(i)));
	        }
	 
	        for (Map.Entry<Character,Integer> e : hm.entrySet()) {
	            System.out.println(
	                "Character is :"+e.getKey()+ " and its count is string is "+ e.getValue());
	        }
	    }
	}

