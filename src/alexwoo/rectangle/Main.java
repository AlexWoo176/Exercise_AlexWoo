package alexwoo.rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        System.out.println("The Information Of Rectangle 1: ");
        rect1.setLength(10);
        rect1.setWidth(20);
        System.out.println(rect1.toString());

        Rectangle rect2 = new Rectangle(50,75);
        System.out.println("The Information Of Rectangle 2: ");
        System.out.println(rect2.toString());
    }
}
