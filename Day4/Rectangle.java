package Day4;

 class Rectangle extends Shape {
    private double width=0;
    private double height=0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        super.area=this.area();
    }

    public double area(){
        return this.height*this.width;
    }
}
