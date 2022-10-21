public class Main {

    public static void main(String[] args) {

        int number = 31;

        boolean isSeample = isSeampleNumber(number, number-1);

        System.out.print("The number " + number + " is "
                        + (isSeample ? "simple" : "non simple"));

    }

    static boolean isSeampleNumber(int number, int div){

        if (div<=1) {
            return true;
        }

        if (number % div == 0){
            return false;
        }

        div--;

        return isSeampleNumber(number, div);

    }

}