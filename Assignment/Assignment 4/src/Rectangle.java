public class Rectangle extends GeometricObject implements ExceptionInterface {
    private double width, height;

    /**
     * Construct a default rectangle object
     */
    public Rectangle() {
    }

    /**
     * Construct a rectangle object with width and height
     */
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    /**
     * Return width value
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width value
     */
    public void setWidth(double width) {
        try {
            if (width >= 0) {
                this.width = width;
            } else {
                this.width = 0;
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("An exception occurred: " + "Width value can not be negative.");
        }
    }

    /**
     * Return height value
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height value
     */
    public void setHeight(double height) throws IllegalArgumentException {
        try {
            if (height >= 0) {
                this.height = height;
            } else {
                this.height = 0;
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("An exception occurred: " + "Height value can not be negative.");
        }
    }

    /**
     * Return area value of a rectangle object
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Return perimeter value of a rectangle object
     */
    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
