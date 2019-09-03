

public class SubClassification {
	
	private String subClassificationId;
	private String name;
	
	private Book[] books = new Book[5];
	private Integer index = 0;

	public void setSubClassificationId(String subClassificationId) {
		this.subClassificationId = subClassificationId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void addBooks(Book book) {
		this.books[index] = book;
		index++;
	}
	

	

	@Override
	public String toString() {
		return "SubClassification [subClassificationId=" + subClassificationId + ", name=" + name + "]";
	}

	public void getAllBooks() {
		System.out.println("	Sub classification");
		System.out.println(" 	ID : " + this.subClassificationId + " Name"  + this.name);
		
		for(int i=0 ; i<5 ; i++ ) {
			System.out.println("		"+this.books[i].toString());
		}
	}
}
