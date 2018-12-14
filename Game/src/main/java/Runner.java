import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome, you are lost in a large grey swamp!");
		System.out.println("To escape you must use your magical compass to locate the missing treassure!");
		System.out.println("Type north, south, east or west to select the direction you wish to go");
		String input = sc.next();

		Player movement = new Player();
		Treasure location = new Treasure();
		Directions north = new Directions();
		Directions east = new Directions();
		Directions south = new Directions();
		Directions west = new Directions();

		movement.setPosition(6, 6);
		location.setLocation(Math.random());

		int currentX = movement.getPositionX();
		int currentY = movement.getPositionY();

		while (!movement.equals(location)) {

			if (input.equals("north")) {

				movement.setPosition(currentX + 1, currentY + 1);
				System.out.print("You have moved north" + " " + Math.random() + "m " + "now type the next direction you would like to go");
				String input2 = sc.next();
			}

			else if (input.equals("east")) {

				movement.setPosition(currentX + Math.random(), currentY + Math.random());
				System.out.print("You have moved east" + " " + Math.random() + "m " + "now type the next direction you would like to go");
				String input3 = sc.next();

			}

			else if (input.equals("south")) {

				movement.setPosition(currentX - Math.random(), currentY + Math.random());
				System.out.print("You have moved south" + " " + Math.random() + "m " + "now type the next direction you would like to go");
				String input4 = sc.next();

			}

			else if (input.equals("west")) {

				movement.setPosition(currentX + Math.random(), currentY + Math.random());
				System.out.print("You have moved east" + " " + Math.random() + "m " + "type the next direction you would like to go");
				String input5 = sc.next();

			}

			if (movement.equals(location)) {
				System.out.print("You see a box sitting on the plain. Its filled with treasure!  You win!");

			}

		}

	}

	public static void parameters() {

	}

}
