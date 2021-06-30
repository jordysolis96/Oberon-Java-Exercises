package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What's the radius of the circle?");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumfrence of the circle is: " + circle.getCircumference());
    }

}
