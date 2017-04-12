/*Eugene Vasquez
COMP/ITSE
Homework 16
Programs rolls pair of dice and counts the number of times 
both dies land on 6, 1000 times
*/

  import java.util.Random;

  public class DicePair{
  
       public static void main (String[] argStr) {
  
  Random objRandom = new Random();
  
  int intBoxcars = 0;                               
  int intRolls = 1000;
  int intBoxes = 12;
  int intDie1 = 0;
  int intDie2 = 0;
  int intTotal = 0;
  
  intDie1 = objRandom.nextInt(6) + 1;
  intDie2 = objRandom.nextInt(6) + 1;
	
  intTotal = IntDie1+IntDie2;
  
	for (int i = 0; i < intRolls; i++) { 
  
	    if (intTotal== intBoxes) {
      
		Boxcars++;
	    }
	}


	System.out.println ("Rolled " + intRolls + " pairs of dice with " +   intBoxcars + " boxcars.");
    }
}
