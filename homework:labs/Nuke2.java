
import java.io.*;
public class Nuke2 {			
	 public static void main(String args[])throws Exception{
	 BufferedReader keyboard; 
	 keyboard = new BufferedReader(new InputStreamReader(System.in));
	 String word = keyboard.readLine();
	 for(int i=0;i<word.length();i++){
		 if(i!=1) System.out.print(word.charAt(i));			 
	 }
}
}
