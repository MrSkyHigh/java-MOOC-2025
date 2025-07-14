Task 01 - Gift Tax. 

Task description: write a program that asks for the value of a gift and then calculates the gift tax based on a given tax table.


Tax Table (Finland):

| Gift Value (€)        | Base Tax (€) | Tax Rate on exceeding part |
|-----------------------|--------------|-----------------------------|
| Less than 5,000       | 0            | 0%                          |
| 5,000–25,000          | 100          | 8%                          |
| 25,000–55,000         | 1,700        | 10%                         |
| 55,000–200,000        | 4,700        | 12%                         |
| 200,000–1,000,000     | 22,100       | 15%                         |
| Over 1,000,000        | 142,100      | 17%                         |

For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).

I wrote this program myself using simple conditional statements 'if-else if'. The code asks the user to give a gift value and calculates the tax based on the range. 
I used 'double'-type variables so the tax is calculated correctly. Because If I had used integer variables, then it would have shown the whole numbers only. 
See my code comments inside 'GiftTax.java' for more detailed explanation.    