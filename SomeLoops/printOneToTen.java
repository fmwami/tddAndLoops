package SomeLoops;

import java.util.Scanner;

public class printOneToTen {
	
	public static void main(String[]args){
		reverseNumber();
	}
	public static void printNumber(){
	for(int i=1;i<=10;i++){
		System.out.println("Number :"+i);
		
	}
	}
	public static void sumNaturalNumbers(){
		int sum=0;
				for(int i=1;i<=10;i++){
					sum +=i;
				}
			System.out.println(sum); 

}
	public static void multiplicationTable(){
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num=sc.nextInt();
		
		for(int i=1;i<=10;i++){
			System.out.println(num +"x"+i+"="+num*i);
		}
	}
	public static void factorial(){
		//Stores a number
		int num=0;
		//stores the factorial
		int fact=0;
		
		//enter the number we want to find the factorial for
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		for(int i=1;i<num;i++){
			fact *=i;
		}
		System.out.println("factorial :"+ fact);
		
	}
	public static void reverseNumber(){
		int number;
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number ");
        number = sc.nextInt();
        
        int temp = number;
        int remainder = 0;
        
        while(temp>0)
        {
	    remainder = temp % 10;
	    reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
	}
}
