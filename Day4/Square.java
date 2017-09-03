package Day4;

 class Square extends Shape {
    private double side=0;

    public Square(double side) {
        this.side = side;
        super.area=this.area();
    }

    public double area(){
        return this.side*this.side;
    }
}


