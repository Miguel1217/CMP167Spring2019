
public class Human {
	public int age;
	public String name;
	public double wealth;
	public boolean hasVehicle;
	public double hunger;
	public int food;
	
	public Human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
	}
	
	public void eat() {
		if (food>4.5) {
			hunger -= 1.0;
			food -= 1.5;
			System.out.println("Yummy, I ate all");
		}
		 else {
			System.out.println("Not enough food, please buy food");
		}
	}
		public void grow() {
			age++;
		}
		public void work() {
			if(hunger<5) {
				wealth += 10.5;
			hunger += 0.5;
			System.out.println("Whoa, I worked a lot");
		}
		else {
				System.out.println("Too hungry to work");
		}
		}
		public void buyFood() {
			if(wealth>5) {
				wealth -= 4.5;
				food++;
				System.out.println("Yoohoo! I bought some food");
			}
			else {
				System.out.println("No enough money, please work");
			}
		}
		}
		

