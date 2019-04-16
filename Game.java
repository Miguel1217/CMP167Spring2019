
public class Game {
	public static void main(String[] args) {
		Human person1 = new Human();
		Human person2 = new Human();
		person2.age=5;
		System.out.println("age"+person2.age);
		System.out.println("age"+person1.age);
		
		System.out.println(person1.hunger);
		System.out.println("Food: "+person1.food);
		
		System.out.println("Eating command");
		person1.eat();
		System.out.println("Eating command");
		person1.eat();
		System.out.println("Eating command");
		person1.eat();
		
		System.out.println("hunger: "+person1.hunger);
		System.out.println("Food: "+person1.food);
		
		System.out.println("Buying food command");
		person1.buyFood();
		
		System.out.println("Working command");
		person1.work();
		
		System.out.println("Buying food command");
		person1.buyFood();
		
		System.out.println("Working command");
		person1.work();
		System.out.println("Working command");
		person1.work();
		System.out.println("Eating command");
		person1.eat();
		System.out.println("Working command");
		person1.work();
	}

}
