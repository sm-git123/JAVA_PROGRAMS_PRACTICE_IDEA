package m_interview_prep_questions;

public class Remove_Vowels {
	

	    public static void main(String[] args) {
	        String originalString = "Hello, Welcome To PrepBytes!!!";
	        String modifiedString = originalString.replaceAll("[aeiouAEIOU]", "");
	        System.out.println("Modified string: " + modifiedString);
	    }
	}


