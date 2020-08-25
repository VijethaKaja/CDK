
public class Book {
	private String name,publication,author;
	private long ISBN;
	private double price;
	Book()
	{
		
	}
	Book(long id,String n,double p)
	{
		this.ISBN=id;
		this.name=n;
		this.price=p;
	}
	Book(long id,String n,String pu,String a)
	{
		this.ISBN=id;
		this.name=n;
		this.publication=pu;
		this.author=a;
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




}
