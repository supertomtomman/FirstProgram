package Day4;

 class Circle extends Shape {

    private double radius=0;

    public Circle(double radius) {
        this.radius = radius;
        super.area=this.area();
    }

    public double area(){
        return (this.radius*this.radius)*Math.PI;
    }
}
