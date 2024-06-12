package BtAccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        CirCle c1 = new CirCle(2);
        double radius = c1.getRadius();
        double area = c1.getarea();
        System.out.println("Radius: " + radius + " Area: " + area);
    }
}
