package step1;

public class HackerRankArraysDS {
	
//	An array is a type of data structure that stores elements of the same type in a contiguous block of memory.
//	In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).
//
//	Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.
//
//	Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
//
//	Input Format
//
//	The first line contains an integer,  (the number of integers in ). 
//	The second line contains  space-separated integers describing .
//
//	Constraints
//
//	Output Format
//
//	Print all  integers in  in reverse order as a single line of space-separated integers.
	
	
    public static int[] reverseArray(int[] a) {
       int temp;
    	
    	for (int i=0,j=a.length-1; i<a.length/2; i++, j--) {
    		temp = a[i];
    		a[i] = a[j];
    		a[j] = temp;
    	}
    	
    	return a;

    }
}
