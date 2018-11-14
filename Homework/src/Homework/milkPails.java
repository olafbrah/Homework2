package Homework;

import java.util.*;
import java.io.*;

public class milkPails {

	public static void main(String[] args) throws Exception {
		final String DATA_FILE1 = "pails.in";
		final String DATA_FILE2 = "pails.out";
		BufferedWriter out = new BufferedWriter(new FileWriter(DATA_FILE2));
		BufferedWriter inFile = new BufferedWriter(new FileWriter(DATA_FILE1));
		int a = 17;
		int b = 25;
		int total = 77;

		int res = 0;

		
		for (int i=0; i<=total; i+=a)
			for (int j=i; j<=total; j+=b)
				res = Math.max(res, j);

		inFile.write(a+" "+b+" "+total);
		inFile.close();
		out.write(""+res);
		out.close();
	}
}