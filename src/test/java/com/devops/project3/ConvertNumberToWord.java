package com.devops.project3;

import java.util.Scanner;

import static org.junit.Assert.*;
import org.junit.Test;
import com.devops.project3.*;

public class ConvertNumberToWord {

	@Test
	public void testInPutNumber() {
		 int n=0;

	        Scanner scanf = new Scanner(System.in);
		 System.out.println("Enter an integer number: ");
	        n = scanf.nextInt();
	        

		assertEquals(n>0 && n <100, true);
	}
}
