
//This small program calculates a gift tax value which one has to pay for making gifts in Finland.   
//Import the Scanner tool inside the program. It's used for reading the user's input.
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Create a scanner tool inside the program and name it. 
        System.out.println("Value of the gift?");
        //Ask the user for a value of the gift they're wishing to give. 
        int first = Integer.valueOf(scan.nextLine());
        // Create an integer-type variable and named it 'first'. scan.nextLine() is used to read the user's input as a string. The user's input is converted to an integer and assigned to the variable 'first'.   
        if (first<5000){
        //I'm using multiple conditional statements 'If... else If' because they match my task the best. In this case: if the variable 'first'<5000 then the program prints 'No tax!' and ends. 
            System.out.println("No tax!");
        }else if (first>=5000 && first<=25000){
        //If the variable 'first' is between 5000 and 25000 then the double-type variable 'tax' is created, and is calculated according to the formula I've taken from the problem description.
            double tax = 1.0*(100+(first-5000)*0.08);
            System.out.println("Tax: " + tax);
            //Printing Tax: ('tax' value that has been calculated by the program). "Tax: " is a string so it will print text Tax:. '+' for connecting a string with a double-type variable 'tax', which is a floating-point number.  
        }else if (first>=25000 && first<=55000){
            double tax2 = 1.0*(1700+(first-25000)*0.1);
            System.out.println("Tax: " + tax2 );
        }else if (first>=55000&&first<=200000){
            double tax3 = 1.0*(4700+(first-55000)*0.12);
            System.out.println("Tax: " + tax3);
        }else if(first>=200000&&first<=1000000){
            double tax4 = 1.0*(22100+(first-200000)*0.15);
            System.out.println("Tax: " + tax4);
        }else{
            double tax5 = 1.0*(142100+(first-1000000)*0.17);
            System.out.println("Tax: " + tax5);
        }
        //Everything else is done the same way: If 'first' is between the given range, then you have to create a new double-type variable, write the right formula for it, and write a text for printing the tax.  
    }
}
