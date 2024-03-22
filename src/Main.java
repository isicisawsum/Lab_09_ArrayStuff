import java.util.Random; //importing Random
import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // First Part
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        
        int sum = 0;
        double avg = 0;
        int [] datapoints;//defining variables
        datapoints = new int[100]; //making datapoints from 0 to 100
        for (int x = 0; x < datapoints.length; x++){ //loop to add 100 numbers to array datapoints
            datapoints[x] = rnd.nextInt(99) + 1;
            sum += datapoints[x]; 
            avg = sum / datapoints.length;//variables for later
        }
        for (int x = 0; x < datapoints.length; x++) {
            System.out.print(datapoints[x] + "|"); //printing integers in the array and putting a | in between them
        }

        System.out.printf("\nThe sum of the numbers in the table is %d, and the average of all of the numbers is %.3f", sum, avg); //outputting what the sum and average are from the previous variables

        //Second part
        int rangedInt = SafeInput.getRangedInt(in, "\nEnter an integer ", 1, 100); //using methods to get a ranged integer
        int timesFound = 0;
        int location = 0; //defining more variables
        
        for (int x = 0; x < datapoints.length; x++) {
            if (datapoints[x] == rangedInt) {
                timesFound +=1; //adding the amount of times the entered integer was found in the array
            }
        }
        System.out.println("The integer " + rangedInt + " was found " + timesFound + " times"); //outputting how many times it was found

        rangedInt = SafeInput.getRangedInt(in, "Enter another integer ", 1, 100); //using the same ranged int method
        for (int x = 0; x < datapoints.length; x++) {//loop to find location of the integer
            location +=1; //adding the location to be + 1 more
            if (datapoints[x] == rangedInt) {
                break; //stop the loop
            }
        }
        if (location == 0) {
            System.out.println("The integer " + rangedInt + " was not found in the array."); //int is not found in the array
        }
        else {
            System.out.println("The integer " + rangedInt + " was found at array index " + location + "."); //int was found
        }

        int highestNumber = datapoints[99];//finding the greatest value of the array

        for (int x = 1; x < datapoints.length; x++) { //loop to calculate the highest number
            if (datapoints[x] > highestNumber) {
                highestNumber = datapoints[x];
            }
        }
        System.out.println("The highest number in the data table is " + highestNumber); //outputting the highest number in the array

        int lowestNumber = datapoints[0]; //finding the least value of the array

        for (int x = 1; x < datapoints.length; x++) {
            if (datapoints[x] < lowestNumber) {
                lowestNumber = datapoints[x];
            }
        }
        System.out.println("The lowest number in the data table is " + lowestNumber); //outputting the lowest number

        System.out.println("The average of all of the numbers in the data table is " + getAverage(datapoints)); //outputting average with method
    }
    public static double getAverage(int values[])
    {
        int sum = 0; 
        int avg = 0; //defining variables
        for (int x = 0; x < values.length; x++){ //loop to calculate avg and sum
            sum += values[x]; //sum = all of the values
            avg = sum/values.length; //avg = sum divided by length of the array.
        }
        return avg; //returning the average
    }

}

