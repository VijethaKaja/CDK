import java.util.Scanner;
import BookAsiignment.pack1.Book;
import BookAssignment.pack2.BookNotFoundException;
import BookAssignment.pack3.BookStoreimp;
public class TestBookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStoreimp bookstore=new BookStoreimp();
		long ISBN;
		double price;
		int num;
		Scanner sc=new Scanner(System.in);
		Book[] book=bookstore.getBooks();
		System.out.println("Enter operation to perform \n 1. find Book\n2. Update Book\n3. Display Books\n4.Stop");
		while(true)
		{
			System.out.println("Select operation");
			num=sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("Enter details");
				ISBN=sc.nextLong();
				Book b=bookstore.findBookById(ISBN);
				if(b==null)
				{
					try {
						throw new BookNotFoundException("Book not present");
					} catch (BookNotFoundException e) {
						// TODO Auto-generated catch block
						e.display();
					}
			}
				else
				{
					System.out.println(b.toString());
				}
				break;
			
			case 2:  
				System.out.println("Enter details");
				ISBN=sc.nextLong();
				price=sc.nextDouble();
				Book b1=bookstore.updateBook(ISBN,price);
				if(b1==null)
				{
					try {
						throw new BookNotFoundException("Book not present");
					} catch (BookNotFoundException e) {
						// TODO Auto-generated catch block
						e.display();
					}
			}
				else
				{
					System.out.println(b1.toString());
				}
				break;
			case 3:
				bookstore.displayBooks(book);
				break;
			case 4:	
				sc.close();
				System.exit(0);
			}
			}
	}
}

		

		


