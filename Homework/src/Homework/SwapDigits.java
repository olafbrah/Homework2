package Homework;

public class SwapDigits {
public static void main(String[] args) {
	System.out.println(swapDigitPairs(3473));
	
}
public static int swapDigitPairs(int num) {
	int digits = 1;
	int numOg = num;
	double left;
	while(num>0) {
		if(num%10!=0) {
			digits++;
			num/=10;
		}
		else {
			break;
		}
	}
	digits--;
	System.out.println(digits);
		if(digits%2!=0) {
			left = (numOg/(int)(Math.pow(10, digits-1)))*Math.pow(10,digits-1);
			numOg-=left;
		}
		else {
			left=0;
		}
	double[] arr = new double[digits];
	for(int i =digits-1; i>=0;i--) {
		arr[i]=(numOg/(int)(Math.pow(10, i))*Math.pow(10, i));
		numOg-=arr[i];
	}
	double[] arrEven=new double[digits/2+2];
	double[] arrOdd=new double[digits/2+2];
	for(int i =0;i<arr.length;i++) {
		if(i%2==0) {
			arrEven[i/2]=arr[i];
		}
		else {
			arrOdd[i/2]=arr[i];
		}
	}
	double out = 0;
	for(int i = 0; i<arrEven.length;i++) {
		arrEven[i]=arrEven[i]*=10;
		arrOdd[i]=arrOdd[i]/=10;
		out=out+arrEven[i]+arrOdd[i];
	}
	return (int)(out+left);
	}
}

