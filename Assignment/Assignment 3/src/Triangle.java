public class Triangle extends GeometricObject {
    private double sideA, sideB, sideC;

    /**
     * Construct a default triangle
     */
    public Triangle() {
    }

    /**
     * Construct a default triangle with three sides
     */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Return side a value
     */
    public double getSideA() {return sideA;}

    /**
     * Set a new side a value
     */
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    /**
     * Return side b value
     */
    public double getSideB() {return sideB;}

    /**
     * Set a new side b value
     */
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    /**
     * Return side c value
     */
    public double getSideC() {
        return sideC;
    }

    /**
     * Set a new side c value
     */
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    /**
     * Return perimeter
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Return area
     */
    @Override
    public double getArea() {
        double semiPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
}
