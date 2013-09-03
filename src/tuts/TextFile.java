package tuts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFile {

  /**
   * @param args
   */
  public static void main(String[] args) {
    File file = new File("text.txt");

    try {
      Scanner in = new Scanner(file);
      PrintWriter out = new PrintWriter(file);
      
      try {
        out.println("This is the line 1");
        out.println("This is the line 2");
        out.println("This is the line 3");
        out.println("This is the line 4");
        out.println("This is the line 5");
      } finally {
        out.close();
      }
      try {
        String contents = in.nextLine();
        while(in.hasNextLine()){
          contents += "\n" + in.nextLine();
        }
        System.out.println(contents);
      } finally {
        in.close();
      }
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    

  }

}
