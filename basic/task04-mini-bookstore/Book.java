public class Book{
	private String name;
	private String writer; 
	private int year;
	private int pages;
	private double price;

	public Book (String iniName,String iniWriter,int iniYear,int iniPages,double iniPrice){
		this.name = iniName;
		this.writer = iniWriter;
		this.year = iniYear;
		this.pages = iniPages;
		this.price = iniPrice;
	
	}
	public String toString(){
		return this.name + ", writer: "+this.writer+", Publication date: "+this.year+", pages: "+this.pages+", price: $"+this.price; 
	}
	public double getTotalPrice(){ 
		return this.price;
	}

}