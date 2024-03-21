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
        int [] datapoints;
        datapoints = new int[100];
        for (int x = 0; x < datapoints.length; x++){
            datapoints[x] = rnd.nextInt(99) + 1;
            sum += datapoints[x];
            avg = sum / datapoints.length;
        }
        for (int x = 0; x < datapoints.length; x++) {
            System.out.print(datapoints[x] + "|");
        }

        System.out.printf("\nThe sum of the numbers in the table is %d, and the average of all of the numbers is %.3f", sum, avg);

        //Second part
        int rangedInt = SafeInput.getRangedInt(in, "\nEnter an integer ", 1, 100);
        int timesFound = 0;
        int location = 0;
        for (int x = 0; x < datapoints.length; x++) {
            if (datapoints[x] == rangedInt) {
                timesFound +=1;
            }
        }
        System.out.println("The integer " + rangedInt + " was found " + timesFound + " times");

        rangedInt = SafeInput.getRangedInt(in, "Enter another integer ", 1, 100);
        for (int x = 0; x < datapoints.length; x++) {
            if (datapoints[x] == rangedInt) {
                location = x;
                break;
            }
        }
        if (location == 0) {
            System.out.println("The integer " + rangedInt + " was not found in the table.");
        }
        else {
            System.out.println("The integer " + rangedInt + " was found at array index " + location + ".");
        }

        int highestNumber = datapoints[99];

        for (int x = 1; x < datapoints.length; x++) {
            if (datapoints[x] > highestNumber) {
                highestNumber = datapoints[x];
            }
        }
        System.out.println("The highest number in the data table is " + highestNumber);

        int lowestNumber = datapoints[0];

        for (int x = 1; x < datapoints.length; x++) {
            if (datapoints[x] < lowestNumber) {
                lowestNumber = datapoints[x];
            }
        }
        System.out.println("The lowest number in the data table is " + lowestNumber);


        System.out.println("The average of all of the numbers in the data table is " + getAverage(datapoints));
    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        int avg = 0;
        for (int x = 0; x < values.length; x++){
            sum += values[x];
            avg = sum/values.length;
        }
        return avg;
    }

}

