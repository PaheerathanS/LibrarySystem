import java.util.Date;

public class BookTest {

	public static void main(String args[]) {
		
		Classification classficationObj = new Classification();
		
		classficationObj.setClassificationId("CI001");
		classficationObj.setName("Maths");
		
		Book book1 = new Book("B001","Order of Statitstics","Mr.Arivu",new Date());
		Book book2 = new Book("B004","Statistical Theory","Mr.Sakar",new Date());
		Book book3 = new Book("B005","Basic Stats","Mr.Ramanan",new Date());
		Book book4 = new Book("B041","Stats And Maths","Mr.Ravi",new Date());
		Book book5 = new Book("B056","Order of THeory","Mr.Ram",new Date());
		
		SubClassification subclassificationObj1 = new SubClassification();
		
		subclassificationObj1.setSubClassificationId("SCI001");
		subclassificationObj1.setName("Statisitics");
		
		subclassificationObj1.addBooks(book1);
		subclassificationObj1.addBooks(book2);
		subclassificationObj1.addBooks(book3);
		subclassificationObj1.addBooks(book4);
		subclassificationObj1.addBooks(book5);
		
		
		Book book11 = new Book("B001","PMM101","Mr.Arivu",new Date());
		Book book22 = new Book("B004","PMM102","Mr.Sakar",new Date());
		Book book33 = new Book("B005","Basic Stats","Mr.Ramanan",new Date());
		Book book44 = new Book("B041","Stats And Maths","Mr.Ravi",new Date());
		Book book55 = new Book("B056","Order of THeory","Mr.Ram",new Date());
		
		SubClassification subclassificationObj2 = new SubClassification();
		
		subclassificationObj2.setSubClassificationId("SCI001");
		subclassificationObj2.setName("Pure Mathematics");
		
		subclassificationObj2.addBooks(book11);
		subclassificationObj2.addBooks(book22);
		subclassificationObj2.addBooks(book33);
		subclassificationObj2.addBooks(book44);
		subclassificationObj2.addBooks(book55);
		
		
		classficationObj.addSubClassification(subclassificationObj1);
		
		classficationObj.addSubClassification(subclassificationObj2);
		
		classficationObj.getAllSubClassification();
		
	}
}
