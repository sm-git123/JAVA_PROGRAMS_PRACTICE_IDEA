package m_interview_prep_questions;

import java.util.Collections;

public class diff_question {

	
	public static void main(String args[])
	{
		int start =1000;
		int end = 6000;
		
	
		
		for (int i=1000;i<=6000;i++)
		{
			//for (int k=6000; k>=1000;k--)
			//{
			computeOpr(i, start, end);
			//}
		}
		
		
	}
	
	public static void computeOpr(int j,int start, int end )
	
	{
		int interviewerNum =5000;
		String strt = String.valueOf(start);
		StringBuffer sbr = new StringBuffer(strt);
        sbr.reverse();
        System.out.println(sbr.toString());
		String ed = String.valueOf(end);
		StringBuffer endd = new StringBuffer(ed);
		endd.reverse();
        System.out.println(endd.toString());
        
        int s = Integer.parseInt(sbr.toString());
        int e = Integer.parseInt(endd.toString());
        
       int subvalue =  Math.subtractExact(s, e); 
       System.out.println("subvalue"+subvalue);
       
       if(subvalue==interviewerNum)
       {
    	   System.out.println("num is reached:"+subvalue);
       }
	}
}
