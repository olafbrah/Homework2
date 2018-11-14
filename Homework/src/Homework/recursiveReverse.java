package Homework;

public class recursiveReverse {
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			System.out.print(arr[i]+"\t");
		}
		reverse(arr,1,4);
	}
public static void reverse(int[] arr, int index1, int index2) {
	int i =index1;
	int i2 = index2;
	if(i<i2) {
		int start = arr[i];
		arr[i]=arr[i2];
		arr[i2]=start;
		i++;
		i2--;
		reverse(arr, i, i2);
	}
	else {
		System.out.print("reversed array: ");
		for(int j =0;j<arr.length;j++) {
			System.out.print(arr[j]+"\t");
		}
	}
	}
}
