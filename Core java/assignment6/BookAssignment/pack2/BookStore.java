package BookAssignment.pack2;
import BookAssignment.pack1.Book;
public interface BookStore {
	public Book[] getBooks();
	public Book findBookById(long id);
	public Book updateBook(long id, double price);
}
