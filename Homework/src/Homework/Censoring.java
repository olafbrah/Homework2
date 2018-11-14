package Homework;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Censoring {
	public static void main(String[] args) throws IOException {
		final String DATA_FILE1 = "cow.in";
		final String DATA_FILE2 = "cow.out";
		BufferedWriter out = new BufferedWriter(new FileWriter(DATA_FILE2));
		BufferedWriter inFile = new BufferedWriter(new FileWriter(DATA_FILE1));
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String censor = "shit";
		
		for(int i =0; i<=input.length()-censor.length();i++) {
			String w = input.substring(i,i+censor.length());
			if(w.equals(censor)) {
				input = input.substring(0,i)+input.substring(i+censor.length());
			i--;
			}
		}
		
		inFile.write(input);
		inFile.close();
		out.write(input);
		out.close();
	}
}
