import java.text.DecimalFormat;

public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("Geometric Object 1");
        GeometricObject geoObject1 = new Rectangle(0, 0);
        displayGeometricObject(geoObject1);

        System.out.println("Geometric Object 2");
        GeometricObject geoObject2 = new Rectangle(-4, 6);
        displayGeometricObject(geoObject2);

        System.out.println("Geometric Object 3");
        GeometricObject geoObject3 = new Rectangle(4, -6);
        displayGeometricObject(geoObject3);

        System.out.println("Geometric Object 4");
        GeometricObject geoObject4 = new Rectangle(4, 6);
        displayGeometricObject(geoObject4);

        System.out.println("Geometric Object 5");
        GeometricObject geoObject5 = new Rectangle(-4, -6);
        displayGeometricObject(geoObject5);

        System.out.println("Geometric Object 6");
        GeometricObject geoObject6 = new Rectangle(4, 0);
        displayGeometricObject(geoObject6);

        System.out.println("Geometric Object 7");
        GeometricObject geoObject7 = new Rectangle(29.4, 31.7);
        displayGeometricObject(geoObject7);
    }

    public static void displayGeometricObject(GeometricObject object) {

        // Checks if object is an instance of Rectangle class
        if (object instanceof Rectangle rectangleObject) {

            // Checks of height and width is greater than 0
            if (rectangleObject.getHeight() > 0 && rectangleObject.getWidth() > 0) {
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println("Area: " + df.format(object.getArea()) + ", Perimeter: " + df.format(object.getPerimeter()));
            } else {
                // A rectangle must have both a length and a width that are greater than 0 in order to be a valid shape
                System.out.println("INVALID RECTANGLE");
            }
        } else {
            System.out.println("NOT_AN_INSTANCE_OF_RECTANGLE_CLASS");
        }
        System.out.println();
    }
}