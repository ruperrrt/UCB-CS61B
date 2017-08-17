/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class HW1 {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    String link = "http://www."+inputLine+".com/";
    System.out.println (link);
    URL link1 = new URL (link);
    BufferedReader in = new BufferedReader(new InputStreamReader(link1.openStream()));
    String a[] = new String[5];
    for (int i=4;i>=0;i--){
    	a[i]=in.readLine();
    }
    for (int i=0;i<=4;i++){
    System.out.println(a[i]);
    }
    in.close();
  }
}
