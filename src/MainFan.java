import java.util.Scanner;

public class MainFan {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();


        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.toString();
        System.out.println(fan1.toString());

        fan2.setSpeed(2);
        System.out.println(fan2.toString());
    }
}
