// Simple personal info collector with average calculations and filtering
import java.util.ArrayList;
import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList <String> tattoos = new ArrayList<>();
        //The list to store names of people without tattoos. 
        int age = 0;
        int agecount = 0;
        int agesum = 0;
        double height = 0;
        int weight = 0; 
        int oldest= 0;
        String nameOfOldest = "";
        int youngest= 100;
        String nameOfYoungest = "";
        String longestName = "";
        int longestNameCount = 0;
        double bmi = 0;
        double sumOfBmi = 0;
        int bmiCount = 0;
        int tattooCount = 0;
        // All the needed variables for statistics. 
        while (true){
        //Loop to collect the user data until an empty line is entered. 
            System.out.println("Enter: your name,sex,age,height,weight,eye color,number of your tattoos,your marital status.");
            System.out.println("");
            System.out.println("(To stop the program hit 'Enter' on your keyboard.)");
            System.out.println("");
            String input = scanner.nextLine();
            if (input.equals("")){
                break;            
            }
            //An array to sort and store the data. 
            String [] info = input.split(",");
            System.out.println("Personal information:");
            System.out.println("Name: " + info[0]+ ".");
            System.out.println("Sex: " + info[1]+ ".");
            age = Integer.valueOf(info[2]);
            agesum = agesum + age;
            agecount++;
            System.out.println ("Age: " + info[2]+ " y.o.");
            height = Double.valueOf(info[3]);
            System.out.println ("Height (meters): " +  info[3] + " m.");
            weight = Integer.valueOf(info[4]);
            System.out.println("Weight (kg): " + info[4] + " kg.");
            bmi = 1.0* weight/(height*height);
            sumOfBmi = sumOfBmi + bmi;
            bmiCount++; 
            System.out.printf ("BMI: %.2f.\n", bmi);
            System.out.println("Eye color: " + info[5] + ".");
            tattooCount = Integer.valueOf(info[6]);
            System.out.println("Number of tattoos: " + info[6] + ".");
           System.out.println("Status: " + info[7]+ ".");
            //Conditional statements to identify the oldest and the youngest person.  
            if (oldest<Integer.valueOf(info[2])){
                oldest=Integer.valueOf(info[2]);
                nameOfOldest = info[0];
            }
            if(youngest>Integer.valueOf(info[2])){
                youngest = Integer.valueOf(info[2]);
                nameOfYoungest = info[0];
            }
            if (longestNameCount<info[0].length()){
                longestNameCount = info[0].length();
                longestName = info[0];
            }
            //Adding names of people without tattoos to the list. 
             if (tattooCount==0){
                tattoos.add(info[0]);
             
            }
            System.out.println("");
            
        }
        System.out.println ("Additional info:");
        System.out.println("Oldest: " + nameOfOldest + ".");
        System.out.println("Youngest: " + nameOfYoungest + ".");
        //Checking if at least one person info was given. 
        if (agecount >0){
        // %.2f.\n to show 2 decimal places. 
            System.out.printf("Average age: %.2f.\n", 1.0*agesum/agecount);
        }
        System.out.println("Longest name: " + longestName+ ".");
        if (bmiCount>0){
            System.out.printf("Average BMI: %.2f.\n", sumOfBmi/ bmiCount);
        }
        System.out.println ("No tattoos: " + tattoos+ ".");
             
    }
}
