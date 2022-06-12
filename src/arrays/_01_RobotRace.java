package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robot = new Robot[5];
		int[] stuff = new int[5];
		int[] stuffone = new int[50];
		for (int i = 0; i < 5; i++) {
			robot[i] = new Robot();
			robot[i].setY(400);
			robot[i].setX(150 * i + 50);
			robot[i].setSpeed(10);
			stuff[i] = 150 * i + 50;
			stuffone[i] = 0;
		}

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		boolean touchTop = false;
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		while (touchTop == false) {
			for (int i = 0; i < 5; i++) {
				Random ran = new Random();
				robot[i].penDown();
				for (int j = 0; j < ran.nextInt(100); j++) {
					robot[i].move(1);
					robot[i].turn(1);
					stuffone[i]+=1;

					if (robot[i].getX() == stuff[i] && stuffone[i]>300) {
						touchTop = true;
						System.out.println("Robot #" + i + " has WON!!!");
						System.out.println("party thrown");
						
					break;
					}
				
				
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
