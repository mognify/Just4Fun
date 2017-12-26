import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mivel {
 /* 
  * GOALS
  * relate call duration and call mark (when the call was connected to agent)
  * average break time per 
  */

 public static void main(String[] args) {
  pln("> Detect operating system");
  String os = System.getProperty("os.name").toLowerCase();
  pln("... operating system identified as " + os);
  pln("... checking compatibility (continuing if true)");
  compatCheck(os);

  pln("> Grab \"ch.txt\" from " + os + " desktop");
  String desktop = System.getProperty("user.home") + "/Desktop/";
  File wfs = new File(desktop + "wfs.txt");

  Scanner fileScanner = new Scanner(System.in);
  try {
   fileScanner = new Scanner(wfs);
  } catch (FileNotFoundException e) {
   pln("!.. unable to read from file, program stopping.");
   fileScanner.close();
   System.exit(0);
  }
  pln("... first line from file: " + fileScanner.nextLine());
  fileScanner.close();

  //String response = inputScanner.nextLine().toLowerCase();
 }

 protected boolean compatCheck(String os) {
  if (os.contains("mac") || os.contains("windows")) {
   return true;
   else {
    pln("!.. " + os + " is not a compatible operating system." + "\n!.. incompatible operating system program stopping...");
    System.exit(0);
   }
  }

  protected void pln(String s) {
   System.out.println(s);
  }
 }
