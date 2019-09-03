import java.util.Date;

public class Book {

		private String bookId;
		private String bookTitle;
		private String author;
		private Date date;
		
		
		Book(String bookId ,String bookTitle ,String author,Date date){
			this.bookId = bookId;
			this.bookTitle = bookTitle;
			this.author = author;
			this.date = date;
		}


		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", date=" + date
					+ "]";
		}
		
		
		
		
}
