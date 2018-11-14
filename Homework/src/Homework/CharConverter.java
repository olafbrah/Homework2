package Homework;

public class CharConverter {
	public static void main(String[] args) {
		String str = "ping";
		boolean noIng = true;
		for(int h=0; h<str.length()-3;h++)
		if(str.substring(h, h+3).equals("ing"))
		{
			noIng = false;
			break;
		}
		if(noIng==true) {
		
		char[] arr1 = new char[str.length()];
		for(int i =0; i<arr1.length;i++) {
			arr1[i]=str.charAt(i);
			System.out.print(arr1[i]+"\t");
		}
		String newStr="";
		for(int i =0; i<arr1.length;i++) {
			newStr+=arr1[i];
		}
		System.out.println(newStr);
		}
	
		if(noIng==false) {
			System.out.println("no words with \"ing\"");
		}
	}
}
