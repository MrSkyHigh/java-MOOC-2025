
public class TriangleAndChristmasTree {
     
    // The method prints a number of stars, based on the ‘number’ value.  
    public static void printStars(int number) {
        for(int i = 0;i<number;i++){
            System.out.print("*"); 
        }
        System.out.println("");
    // After the loop is completed, add the line break, so each line prints separately. 
       
    }

    public static void printSpaces(int number) {
        for (int i = 0; i<number;i++){
            System.out.print(" ");
        }
    // Prints the given number of spaces.  
          
    }

    public static void printTriangle(int size) {
        for (int i = 1; i<=size;i++){
            printSpaces(size-i);
            printStars(i);
   // Use printSpaces(size-i) to print a decreasing number of spaces. 
   // Then use printStars(i) to gradually print more stars and form the triangle. 
        }
    }

    public static void christmasTree(int height) {
            
        for (int i = 1;i<=height;i++){
            printSpaces(height-i);
            printStars(2*i-1);
   //Use printStars (2*i-1) to increase the number of stars printed with each iteration. 2*i-1 ensures that a proper symmetrical triangle is printed.
        }
        for (int g = 1;g<2;g++){
            printSpaces(height - 2*g);
            printStars(3);
                
        }
        for (int g = 1;g<2;g++){
            printSpaces(height - 2*g);
            printStars(3);
  // Trunk of the Christmas tree
 // I used two identical loops instead of one loop with two iterations,
 // Because U couldn't come up with a better way. 
 // This was my own solution and I was proud of it because it worked!
                
        }
        
    }
            
     

    public static void main(String[] args){
 //Main method execution and printing a triangle and a Christmas tree.      

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
