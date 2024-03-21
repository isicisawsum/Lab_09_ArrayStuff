public class ExtraCreditMethods {
    public static int min(int values[]){
        int lowestNumber = values[0];

        for (int x = 1; x < values.length; x++) {
            if (values[x] < lowestNumber) {
                lowestNumber = values[x];
            }
        }

        return  lowestNumber;
    }
    public static int max(int values[]){
        int highestNumber = values[99];

        for (int x = 1; x < values.length; x++) {
            if (values[x] > highestNumber) {
                highestNumber = values[x];
            }
        }

        return  highestNumber;
    }

    public static int occuranceScan(int values[], int target){
        int timesFound = 0;
        for (int x = 0; x < values.length; x++) {
            if (values[x] == target) {
                timesFound +=1;
            }
        }
        System.out.println("The integer " + target + " was found " + timesFound + " times");
        return timesFound;
    }

    public static int sum(int values[]){
        int sum = 0;
        for (int x = 0; x < values.length; x++){
            sum += values[x];
        }
        return sum;
    }
    public boolean contains(int values[], int target){
        boolean Found = false;
        for (int x = 0; x < values.length; x++) {
            if (values[x] == target) {
                Found = true;
                break;
            }
            else {
                Found = false;
            }
        }
        return Found;
    }
}
