import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
public class MiniBookstore{
	public static void main(String[]args){
		//Creating objects for storing books from the chosen genre file
		Scanner scanner = new Scanner(System.in);
		ArrayList <Book> chosenBooks = new ArrayList<>();
		ArrayList <Book> cartBooks = new ArrayList<>();
		System.out.println();
		System.out.println("Hello. Welcome to SkyHigh's bookstore! Choose which genre of books would you prefer:");
		System.out.println("Choose and send one of these: SciFi.txt, Novel.txt, Dystopian.txt, Horror.txt");
		System.out.println();
		String chosenGenre = scanner.nextLine();
		//Reading the chosen file and adding book info from it to the object 
		try (Scanner scan = new Scanner(Paths.get(chosenGenre))){
			while (scan.hasNextLine()){
				String readFile = scan.nextLine();
				String [] bookInfo = readFile.split(",");
				//Skipping empty/broken lines from the file
				if (readFile.length()<5){
					continue;
				}
				String name = bookInfo[0];
				String writer = bookInfo[1];
				int publYear = Integer.parseInt(bookInfo[2]);
				int pages = Integer.parseInt(bookInfo[3]);
				double price = Double.parseDouble(bookInfo[4]);
				chosenBooks.add(new Book(name, writer, publYear, pages, price));
			}

		}catch (Exception e){
			System.out.println("The error: "+e.getMessage());
		}
		for (Book cb:chosenBooks){
			System.out.println(cb);
		}
		//Adding chosen books to the cart
		System.out.println("Choose what books you wish to buy:");
		while (true){
			System.out.println("Use numbers to choose. Enter -1 when all wanted books are chosen");
			int booksToBuy = Integer.valueOf(scanner.nextLine());
			if (booksToBuy == -1){
				break;
			}
			cartBooks.add(chosenBooks.get(booksToBuy));
			

		}
		//Showing the list of chosen books and calculating the total price
		double totalPrice = 0;
		System.out.println();
		System.out.println("Chosen books:");
		int positionCounter = 0;
		for (Book cart:cartBooks){
			System.out.println(cart);
			positionCounter++;
			totalPrice += cart.getTotalPrice();
		}
		System.out.println("Positions in your cart: "+positionCounter);
		System.out.printf("Total price: $%.2f.\n", totalPrice);
		
	}
}