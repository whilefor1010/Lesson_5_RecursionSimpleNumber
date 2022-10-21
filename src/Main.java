public class Main {

    public static void main(String[] args) {

        int number = 18;

        boolean isSeample = isSeampleNumber(number, number-1);

        System.out.print("The number " + number + " is "
                        + (isSeample ? "simple" : "non simple"));

    }

    static boolean isSeampleNumber(int number, int div){

        System.out.print("test " + number +" / "+ div+" ");

        if (div<=1) {
            System.out.println("ok");
            return true;
        }

        if (number % div == 0){
            System.out.println(" oops");
            return false;
        }

        div--;

        System.out.println(" ok");

        return isSeampleNumber(number, div);

    }

}