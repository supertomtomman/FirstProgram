package Day3;

public class Circle implements HasArea,HasCircumference {
    private Point centre;
    private double radius;

    public Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
    public boolean hasCommonArea(Circle otherCircle){


        if (this.centre.checkDistanceFromOtherPoint(otherCircle.centre)<(this.radius+otherCircle.radius))
        {return true;}
        return false;
    }

    public boolean isThePointInsideTheCircle(Point p){

        return false;
    }
}
