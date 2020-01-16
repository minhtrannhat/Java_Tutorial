package Circle;

public class Circle {

    private double radius = 1;
    private static int numberOfObjects = 0;

    // constructor
    public Circle(){
        numberOfObjects++;
    }

    public Circle(double newRadius){
        this.radius= newRadius;
        numberOfObjects++;
    }

    // radius getter
    public double getRadius(){
        return radius;
    }

    // radius setter
    public void setRadius(double newRadius){
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
