import java.io.*;
import java.util.*;
import java.lang.*;
//package com.prac.go;

	class ThisPrg { 
	    int first = 22; 
	    int second = 33; 
	  
	    void ramu(int a, int b) 
	    { 
	        a = this.first; 
	        b = this.second; 
	        System.out.println(first); 
	        System.out.println(second); 
	        System.out.println(a); 
	        System.out.println(b); 
	    } 
	  
	    void rakesh(int m, int n) 
	    { 
	        this.first = m; 
	        this.second = n; 
	        System.out.println(first); 
	        System.out.println(second); 
	        System.out.println(m); 
	        System.out.println(n); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        new ThisPrg().ramu(100, 200); 
	        new ThisPrg().rakesh(1, 2); 
	    } 
	} 