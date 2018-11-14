package Homework;

public class PowerSet {
	public static void main (String[] args) throws java.lang.Exception
	{
		// WTF!!
		int []set={1,2,3,4};
		int len=set.length;
		System.out.println((1<<len)); //16
		for(int i=0;i<(1<<len);i++) { //1<<len is 2 power n
			int selectedset=i; //for i = 10 it'd be 1010 it means chose 2nd and 4th item
			int ind=0;
			while(selectedset!=0) {
				if((selectedset&1)==1) System.out.print(set[ind]+" ");
				selectedset = selectedset>>1; //1010 101 10 1 0
				ind++;
			}
			System.out.println();
		}
	}
}
