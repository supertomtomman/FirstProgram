package Day3;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double lengthOfLine(){

        return startPoint.checkDistanceFromOtherPoint(endPoint);
    }
}
