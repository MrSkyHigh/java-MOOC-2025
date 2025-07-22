Christmas Tree Exercise

This exercise asks the user to write a method, using two helper methods (stars and spaces), that prints a triangle. Then the user has to create another method to print a symmetrical Christmas tree with a trunk, placed right beneath the tree. 
For example, christmasTree(4) should print 
<pre>
   *
  ***
 *****
*******
  ***
  ***
</pre>
My Experience 

I struggled to write a proper code for christmasTree() for more than 24 hours. Eventually, I decided to visualize the tree by drawing stars on the paper and counting spaces, stars and the variable i. 
Suddenly, I could see a pattern. 

That helped me solve the first half of the problem: I printed a symmetrical triangle. I still had to print a trunk somehow. I didn’t know how to do that, so I was stuck again. 
The following morning, I woke up and suddenly realized that I should try adding another loop with a new variable. 
IT WORKED!  

How to Run:

Open your terminal or command prompt:

javac TriangleAndChristmasTree.java
java TriangleAndChristmasTree

Notes:
The trunk is printed using two identical loops. It's not the most efficient way, but it was an important personal breakthrough. I've decided to keep it that way. 
