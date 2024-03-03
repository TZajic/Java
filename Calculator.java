import java.util.Scanner;

class Operation {

    void add(double a, double b) {

        double result = a + b;
        System.out.println("A + B = " +result);

    }

    void subtract(double a, double b) {

        double result = a - b;
        System.out.println("A - B = " +result);

    }

    void multiply(double a, double b) {

        double result = a - b;
        System.out.println("A * B = " +result);

    }

    void divide(double a, double b) {

        double result = a * b;
        System.out.println("A / B = " +result);
    }



}
public class Calculator {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();

        System.out.println("Welcome to the calculator app!");
        System.out.println("Would you like do some calculations?");
        System.out.println("Y/N");
        String continueCalc = sc.nextLine();

        while(continueCalc.equalsIgnoreCase("Y")){

            System.out.println("What would you like to do?");
            System.out.println("A) Addition");
            System.out.println("B) Subtraction");
            System.out.println("C) Multiplication");
            System.out.println("D) Division");
            String typeOfCalc = sc.nextLine();

            if (typeOfCalc.equalsIgnoreCase("A")){

                System.out.println("Insert number A:");
                double numberA = sc.nextDouble();
                System.out.println("Insert number B:");
                double numberB = sc.nextDouble();
                sc.nextLine();
                op.add(numberA,numberB);
                System.out.println("Would you like to continue? Y/N");
                continueCalc = sc.nextLine();
            }
            else if ((typeOfCalc.equalsIgnoreCase("B"))) {

                System.out.println("Insert number A:");
                double numberA = sc.nextDouble();
                System.out.println("Insert number B:");
                double numberB = sc.nextDouble();
                sc.nextLine();
                op.subtract(numberA,numberB);
                System.out.println("Would you like to continue? Y/N");
                continueCalc = sc.nextLine();

            } else if ((typeOfCalc.equalsIgnoreCase("C"))) {
                System.out.println("Insert number A:");
                double numberA = sc.nextDouble();
                System.out.println("Insert number B:");
                double numberB = sc.nextDouble();
                sc.nextLine();
                op.multiply(numberA,numberB);
                System.out.println("Would you like to continue? Y/N");
                continueCalc = sc.nextLine();
            } else if ((typeOfCalc.equalsIgnoreCase("D"))) {
                System.out.println("Insert number A:");
                double numberA = sc.nextDouble();
                System.out.println("Insert number B:");
                double numberB = sc.nextDouble();
                sc.nextLine();
                op.divide(numberA,numberB);
                System.out.println("Would you like to continue? Y/N");
                continueCalc = sc.nextLine();
            } else {
                System.out.println("Sorry, unknown operation! Would you like to continue?");
                continueCalc = sc.nextLine();
            }
        System.out.println("Thank you for using our calculator");
        }
    }
}
