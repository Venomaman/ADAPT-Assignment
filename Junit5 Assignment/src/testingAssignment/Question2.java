package testingAssignment;

import java.util.Arrays;

public class Question2 {
	
	public int[] findMinMax(int A[]) {  
		int[] minmax= new int[2];
		Arrays.sort(A);
		minmax[0]=A[0];
		minmax[1]=A[(A.length)-1];
		
		return minmax;

}}
