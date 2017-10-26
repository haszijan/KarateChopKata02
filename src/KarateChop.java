public class KarateChop {

    public int chop(int value, int[] array) {
        int lowestValue = 0;
        int highestValue = array.length - 1;


        if(array.length == 0) {
            return -1;
        }

        while(lowestValue <= highestValue) {
            int middleValue = (lowestValue + highestValue) / 2;
            if(value == array[middleValue]) {
                return middleValue + 1;
            }
            else if(array[middleValue] < value) {
                lowestValue = middleValue + 1;
            }
            else {
                highestValue = middleValue;
            }
        }
        return -1;
    }
}
