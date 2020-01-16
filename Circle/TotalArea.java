package Circle;

public class TotalArea {
    public static void main(String[] args){

        // Declare circleArray
        Circle[] circleArray;

        // Create circleArray
        circleArray = createCircleArray();

        // print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    // create an array of Circle objects
    public static Circle[] createCircleArray(){

        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++){
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return circleArray;
    }

    // print an array of circles and their total area
    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");

        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }

        System.out.println("_____________________________________");

        System.out.printf("%-30s%-15f\n", "Total area of circles is ", sum(circleArray));
    }

    // add circle areas
    public static double sum(Circle[] circleArray){
        // initialize sum
        double sum = 0;

        // add areas to sum
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();

            return sum;
    }
}
