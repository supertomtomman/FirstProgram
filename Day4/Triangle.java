package Day4;

 class Triangle extends Shape {
    private double base=0;
    private double height=0;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        super.area=this.area();

    }

    public double area(){
        return (this.base*this.height)/2;
    }
}
