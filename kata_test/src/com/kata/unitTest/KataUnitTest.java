package com.kata.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kata.test.KataTest_1;

public class KataUnitTest {
	@Test
	public void testAdd() throws Exception
	{
		KataTest_1 kata = new KataTest_1();
		//simple test q1
		int result = kata.Add("1,2");
		assertEquals(3, result);
		
		result = kata.Add("");
		assertEquals(0, result);
		
		//simple test q2
		result = kata.Add("1,5,7,14");
		assertEquals(27, result);
		
		//simple test q3
		result = kata.Add("1\n,5\n\n,7,14");
		assertEquals(27, result);
		
		//simple test q4
		result = kata.Add("//;\n1;2;3");
		assertEquals(6, result);
		
		result = kata.Add("//;\n1;2;3");
		assertEquals(6, result);
		
		//simple test q5
		result = kata.Add("//;\n--1;2;3");
		assertEquals(6, result);
		
		//simple test q6
		result = kata.Add("//;\n1001;2;3");
		assertEquals(5, result);
		
		//simple test q7
		result = kata.Add("//[***]\n1***2***3");
		assertEquals(6, result);
		
		result = kata.Add("//[&&&]\n1&&&2&&&3");
		assertEquals(6, result);
		
		//simple test q8
		result = kata.Add("//[*][&]\n1*2&3");
		assertEquals(6, result);
		
		//simple test q9
		result = kata.Add("//[***][&&]\n1***2&&3");
		assertEquals(6, result);
		
		/* 
		 * these codes is test for wrong format exception
			
			result = kata.Add("1,\n");
			assertEquals(1, result);
		*/
	} 
}
