import java.util.Scanner;
public class App{
    static final Scanner inputScanner = new Scanner(System.in);
    private static Calculator calc = new Calculator();
    public static void main(String[] args){

    boolean keepGoing = true;
    while(keepGoing == true){
        double num1 = getDouble("enter a double: ");
        double num2 = getDouble("enter another double: ");
        String question = getString("What math operation do you wish to run? : add, subtract, multiply, divide ?");

        if(question.equals("add")){
            System.out.println(String.format("You want to add %f and %f", num1, num2));
            System.out.println(calc.add(num1, num2));
            String result = getString("Do you wish to continue: Yes or No?");    
            if(result.equals("Yes")){
                keepGoing = true;
            }
             else{
                 System.out.println("GoodBye");
                keepGoing = false;
             }
        }
        if(question.equals("subtract")){
            System.out.println(String.format("You want to subtract %f and %f", num1, num2));
            System.out.println(calc.subtract(num1, num2));
            String result = getString("Do you wish to continue: Yes or No?");    
            if(result.equals("Yes")){
                keepGoing = true;
            }
             else{
                 System.out.println("GoodBye");
                keepGoing = false;
             }
        }
        if(question.equals("multiply")){
            System.out.println(String.format("You want to multiply %f and %f", num1, num2));
            System.out.println(calc.multiply(num1, num2));
            String result = getString("Do you wish to continue: Yes or No?");    
            if(result.equals("Yes")){
                keepGoing = true;
            }
             else{
                 System.out.println("GoodBye");
                keepGoing = false;
             }
        }
        if(question.equals("divide")){
            System.out.println(String.format("You want to divide %f and %f", num1, num2));
            if(num2 == 0){
                System.out.println("cannot divide by zero");
                break;
            }
            System.out.println(calc.divide(num1, num2));
            String result = getString("Do you wish to continue: Yes or No?");    
            if(result.equals("Yes")){
                keepGoing = true;
            }
             else{
                 System.out.println("GoodBye");
                keepGoing = false;
             }
        }
    }
    //     boolean keepGoing = true;

    //     while(keepGoing){
    //     double num1 = getDouble("enter a double: ");
    //     double num2 = getDouble("enter another double: ");

    //     System.out.println(String.format("You want to add %f and %f", num1, num2));
    //     System.out.println(calc.add(num1, num2));
    //     System.out.println(String.format("You want to subtract %f and %f", num1, num2));
    //     System.out.println(calc.subtract(num1, num2));
    //     System.out.println(String.format("You want to multiply %f and %f", num1, num2));
    //     System.out.println(calc.multiply(num1, num2));
    //     System.out.println(String.format("You want to divide %f and %f", num1, num2));
    //     System.out.println(calc.divide(num1, num2));

    //     String result = getString("Do you wish to continue: Yes or No?");
    //     System.out.println(result);

    //     if(result.equals("Yes")){
    //         keepGoing = true;
    //     }
    //      else{
    //          System.out.println("GoodBye");
    //         keepGoing = false;
    //      }
    //     }
    }

    private static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.next();
    }
    private static double getDouble(String prompt){
        double workingdub;
        System.out.println(prompt);
        String inputString = inputScanner.nextLine();
        workingdub = Double.parseDouble(inputString);
        return workingdub;
    }

}