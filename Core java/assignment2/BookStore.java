
public class BookStore {
	public Book[] getBooks()
	{
		Book[] b=new Book[5];
		b[0]=new Book(1234,"A",10);
		b[1]=new Book(456,"B",20);
		b[2]=new Book(789,"C",30);
		b[3]=new Book(101,"D","sss","vvv");
		b[4]=new Book(102,"E","GGG","HH");
		return b;
	}
	public Book findBookById(long id) {
		Book b = null;
		for (Book i : getBooks()) {
			if (i.getISBN() == id) {
				b = i;
				break;
			}
		}
		return b;
	}

	public Book updateBook(long id, double price) {
		Book b = findBookById(id);
		if (b != null) {
			b.setPrice(price);
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore bs = new BookStore();
		Book b = bs.findBookById(456);
		if (b!= null) {
			System.out.println("Book found ");
		} else {
			System.out.println("Book not found ");
		}
		b = bs.updateBook(789, 30);
		if (b!= null) {
			System.out.println("Book price updated ");
		} else {
			System.out.println("Book not found ");
		}


	}

	}
