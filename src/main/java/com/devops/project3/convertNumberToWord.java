package com.devops.project3;

public class convertNumberToWord {
	public void pw(int n,String ch)
	  {
	    String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
	 
	    String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};
	 
	    if(n > 19) { System.out.print(ten[n/10]+" "+one[n%10]);} else { System.out.print(one[n]);}
	    //if(n > 0)System.out.print(ch);
	  }
}
