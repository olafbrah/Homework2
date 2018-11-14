package Homework;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
public class COW {
	public static void main(String args[]) throws IOException {
		final String DATA_FILE1 = "cow.in";
		final String DATA_FILE2 = "cow.out";
		BufferedWriter out = new BufferedWriter(new FileWriter(DATA_FILE2));
		BufferedWriter inFile = new BufferedWriter(new FileWriter(DATA_FILE1));
		int total =0;
		String cow = "COW";
		Scanner input = new Scanner(System.in);
		String in = input.next();
		System.out.println(in);
		char[] chars = in.toCharArray();
		for(int i =0; i<chars.length;i++) {
			System.out.print(chars[i]);
		}
		for(int  i =0; i<chars.length;i++) {
			if(chars[i]==(cow.charAt(0))) {
				System.out.println(chars[i]);
			for(int j = i+1; j<chars.length;j++) {
				if(chars[j]==cow.charAt(1)) {
					System.out.println(chars[j]);
					for(int h=j+1;h<chars.length;h++) {
						if(chars[h]==cow.charAt(2)) {
							System.out.println(chars[h]);
							total++;
						}
					}
				}
			}
		}
	}
		String len = ""+in.length();
		inFile.write(len);
		inFile.newLine();
		inFile.write(in);
		
		inFile.close();
		String totalS=""+total;
		out.write(totalS);
		out.close();
}
}
