package emailapp;

public class EmailApp {
	public static void main(String[] args) {
		
		Email eml1 = new Email("Getu", "Tad");
		
//		eml1.setAlternateEmail("get22@gmail.com");
//		System.out.println("Your alternate email is: "+ eml1.getAlternateEmail());
		
		//Show all Information
		System.out.println(eml1.showInfo());
		
	}
}
