public class KarateChop {

    public int chop(int value, int[] array) {
        int lowestValue = 0;
        int highestValue = array.length - 1;


        if(array.length == 0) {
            return -1;
        }

        while(lowestValue <= highestValue) {
            int middleValue = (lowestValue + highestValue) / 2;
            if(array[middleValue] == value) {
                return middleValue;
            }
            else if(array[middleValue] < value) {
                lowestValue = middleValue + 1;
            }
            else if (array[middleValue] > value){
                highestValue = middleValue - 1;
            }
        }
        return -1;

        /* Wynikiem jest indeks szukanej wartosci */
    }
}
