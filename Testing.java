
public class Testing {

	public static void main(String[] args) {
		Person person1 = new Person("Laura",16, 'f');
		Person person2 = new Person("Tito",18, 'm');
		Person person3 = new Person("Sandra",21, 'f');
		Person person4 = new Person("Tom",16, 'm');

		System.out.println("Expecting Cannot generate DL, got ");
		DMV.generateDL(person1.age, true);
		System.out.println("Expecting Cannot generate DL, got ");
		DMV.generateDL(person2.age, false);
		System.out.println("Expecting generate DL, got ");
		DMV.generateDL(person3.age, true);
		System.out.println("Expecting Cannot generate DL, got ");
		DMV.generateDL(person4.age, true);
		
		assert((DMV.calculateExpirationDate(2014)!= 2024)):"Test has not Passed";
		assert((DMV.calculateExpirationDate(2014)!= 2023)):"Test has not Passed";
	}

}
