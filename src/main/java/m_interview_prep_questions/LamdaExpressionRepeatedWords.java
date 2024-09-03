package m_interview_prep_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LamdaExpressionRepeatedWords {

	
	public static void main(String args[])
	{
		
		String sentence = " It is a bad world.money and money only matters.Love waste It is a opportunist world";
		List<String> wordsList = Arrays.stream(sentence.split("[. ]+")).collect(Collectors.toList());

		Set<String> tempSet = new HashSet<>();
		
		//long cnt = Collections.frequency(wordsList, sentence);
		
		//System.out.println("count:"+cnt); 
		
		
		List<String> duplicateWords = wordsList.stream()
		    .filter(w -> !tempSet.add(w))
		    .collect(Collectors.toList());

		
		togetandCountRepeatedWords(sentence, wordsList);
		System.out.println(duplicateWords); 
		
		
	}
	
	public static void togetandCountRepeatedWords(String sen, List<String> words)
	{
		System.out.println("Inside togetandCountRepeatedWords" ); 
List<String> tempLst = new ArrayList<>();
		
		//long cnt = Collections.frequency(wordsList, sentence);
		
		//System.out.println("count:"+cnt); 
		
		
		List<String> duplicateWords = words.stream()
		    .filter(w -> tempLst.add(w))
		    .collect(Collectors.toList());

		System.out.println(duplicateWords); 
		
	}
}
