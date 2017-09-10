import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
	// This recipe draws the first letter of your name using the Robot
	//
	// 1. Create a class called RobotGraffiti
	// 2. Use the Robot to draw the first letter of your name
	// HINT: Use the RobotSquare recipe to help remember how to draw using Robot
	// 3. BONUS: Write your entire first name using the Robot\
	
	Robot a1 = new Robot(); 
	a1.setSpeed(10);
	a1.setAngle(25);
	a1.penDown();
	a1.move(190);
	a1.setAngle(155);
	a1.move(140);
	a1.setAngle(-90);
	a1.move(115);
	a1.penUp();
	a1.setAngle(0);
	a1.move(160);
	a1.setAngle(90);
	a1.move(115);
	a1.penDown();
	a1.setAngle(180);
	a1.move(206);
	a1.setAngle(90);
	a1.move(138);
	a1.penUp();
	a1.setAngle(0);
	a1.move(20);
	a1.setAngle(-90);
	a1.penDown();
	a1.move(120);
	a1.setAngle(0);
	a1.move(185);
	a1.setAngle(90);
	a1.move(120);
	a1.penUp();
	a1.setAngle(-90);
	a1.move(120);
	a1.setAngle(180);
	a1.move(185/2);
	a1.setAngle(90);
	a1.penDown();
	a1.move(185);
	
	
	
	
	
}
}
