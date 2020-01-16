package Circle;

public class TestCircleWithPrivateDataField {
    public static void main(String[] args){

        Circle myCircle = new Circle(5.0);

        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        // increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of circle objects created is " + myCircle.getNumberOfObjects());
    }
}
