
public class Classification {
	
	private String classificationId;
	private String name;
	private SubClassification[] subclassifications = new SubClassification[3];
	private Integer index = 0;
	

	public void setClassificationId(String classificationId) {
		this.classificationId = classificationId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addSubClassification(SubClassification SubClassification) {
		this.subclassifications[index] =SubClassification;
		index++;
	}
	
	public void getAllSubClassification() {
		System.out.println("Classification");
		System.out.println(" ID : " + this.classificationId + " Name : " +this.name);
		
		for(int i=0 ; i<2 ; i++ ) {
			this.subclassifications[i].getAllBooks();
		}
	}
	
	
	
}
