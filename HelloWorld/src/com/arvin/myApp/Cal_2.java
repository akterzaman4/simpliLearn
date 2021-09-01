package com.arvin.myApp;

public class Cal_2 {

	public static void main(String[] args) {
         int a =7;
         
         if (a == 8) {
        	 System.out.println("hi everyone");
        	 
         } else {
        	 System.out.println("ok its something else");
         }
            int b = 80 / 4;
            if (b == 80 / 4) {
            	System.out.println(b);
            }
         String rt = "arvin zaman-";
        System.out.println(rt);
        bar_1(100,5);
        Bar_2(9,3);
        
	}
	public static void bar_1(int ew,int lt) {
		int a =ew;
		int b=lt;
		int result =a*b;
				
		System.out.println("value of a+b :" +result);
	}
	
	public static void Bar_2(int tt,int alh) {
	   int at = tt;
	   int bt = alh;
	   int add = at/bt;
	   
	   System.out.println("value :" +add);
	}
	
}
