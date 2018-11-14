package Homework;
import java.util.Scanner;
public class MorseCode {
	
	public static void main(String[] args){

	    char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	                  'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
	                  'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
	                  ',', '.', '?' };

	    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
	                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
	                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
	                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
	                "-----", "--..--", ".-.-.-", "..--.." };

	    Scanner keyboard = new Scanner(System.in);

	    System.out.println(" This is an English to Morse Code Translator.  ");
	    System.out.println(" Please enter 'morse' for english to morse code or 'english' for morse code to English ");
	    System.out.println(" ============================================ ");
	    String userIn = keyboard.nextLine();
	    if(userIn.equals("morse")) {
	    String userInput = keyboard.nextLine().toLowerCase();
	    

	    char[] chars = userInput.toCharArray();

	    String str = "";
	    for (int i = 0; i < chars.length; i++){
	        for (int j = 0; j < english.length; j++){

	            if (english[j] == chars[i]){
	                str = str + morse[j] + " ";  
	            }
	        }
	    }
	    System.out.println(str);
	} 
	
	else if(userIn.equals("english")) {
		System.out.println("put a space after your morse code");
		String str = "";
		String outStr="";
String userInput = keyboard.nextLine().toLowerCase();
	    char[] chars = userInput.toCharArray();
	    for(int i =0;i<chars.length;i++) {
	    	str+=chars[i];
	    	for(int j =0; j<morse.length;j++) {
	    		if(str.equals(morse[j]+" ")) {
	    			outStr+=english[j];
	    			str="";
	    	}
	    	}
	    }
	System.out.println(outStr);
	}
}
}
