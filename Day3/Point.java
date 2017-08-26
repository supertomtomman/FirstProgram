package Day3;

public class Point {

    private double coordinateX;
    private double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }


//    c2 = a2 + b2

    public double checkDistanceFromOtherPoint(Point p) {

        double distance;
        return distance = Math.sqrt(Math.pow(p.coordinateX - this.coordinateX,2) + Math.pow(p.coordinateY - this.coordinateY,2));


    }
}
