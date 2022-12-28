import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object with date value
     */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with color, filled, date value
     */
    public GeometricObject(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }

    /**
     * Return color value
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color value
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled value
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled value
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Return date value
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    /**
     * Abstract method to return area of a geometric object
     */
    public abstract double getArea();

    /**
     * Abstract method to return perimeter of a geometric Object
     */
    public abstract double getPerimeter();
}
