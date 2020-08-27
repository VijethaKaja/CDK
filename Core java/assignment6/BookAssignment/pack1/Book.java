package BookAssignment.pack1;

public class Book {
	private String name,publication,author;
	private long ISBN;
	private double price;
	public Book()
	{
		
	}
	public Book(long isbn,String name,double price)
	{
		this.ISBN=isbn;
		this.name=name;
		this.price=price;
	}
	public Book(long isbn,String name,String publication,String author)
	{
		this.ISBN=isbn;
		this.name=name;
		this.publication=publication;
		this.author=author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return ISBN+"\t"+name+"\t"+author+"\t"+publication+"\t"+price;
}


}
