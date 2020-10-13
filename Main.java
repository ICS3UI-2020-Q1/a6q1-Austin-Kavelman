import java.util.Scanner;
/**
 * Calculates the average heights
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //lets the user enter how many values they want
    System.out.println("How many heights would you like to enter");
    int amount = input.nextInt();

    //create array to store the heights
    double[] heights = new double[amount];

    //use a for loop to get all the heights from the user input
    for(int i = 0; i < heights.length; i++){
      //ask the user for height
      System.out.println("Enter height " + (i+1) + "(cm)");
      //fill the array with the value
      heights[i] = input.nextDouble();
    }
    
    //create a variable to store the total of all heights
    double total = 0;
    //use for loop to add each value to total
    for(int i = 0; i < heights.length; i++){
      //add each height into total
      total = total + heights[i];
    }

    //calculate the average height
    double average = total/heights.length;

    //let the user know the average
    System.out.println("Your average height is " + average);
    
  }
}
