package Homework;
import java.util.Scanner;
public class SieveOfEratosthenes {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		 boolean prime[] = new boolean[num+1]; 
	        for(int i=0;i<=num;i++) 
	            prime[i] = true; 
	          
	        for(int p = 2; p*p <=num; p++) 
	        { 
	            if(prime[p] == true) 
	            { 
	                for(int i = p+p; i <= num; i += p) 
	                    prime[i] = false; 
	            } 
	        }
	        for(int i = 0; i <= num; i++) 
	        { 
	            if(prime[i] == true) 
	                System.out.print(i + " "); 
	        } 
	    } 
		}
	

