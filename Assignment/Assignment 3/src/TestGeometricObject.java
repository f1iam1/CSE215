public class TestGeometricObject {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Declare and initialize three geometric objects
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);
        GeometricObject geoObject3 = new Triangle(7, 5, 3);

        System.out.println("The three objects have the same area? " +
                equalArea(geoObject1, geoObject2, geoObject3));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);

        // Display triangle
        displayGeometricObject(geoObject3);
    }

    /**
     * A method for comparing the areas of two geometric objects
     */
    public static boolean equalArea(GeometricObject object1,
                                    GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /**
     * A method for comparing the areas of three geometric objects
     */
    public static boolean equalArea(GeometricObject object1,
                                    GeometricObject object2, GeometricObject object3) {
        return object1.getArea() == object2.getArea() && (object2.getArea() != object3.getArea() || object3.getArea() == object1.getArea());
    }

    /**
     * A method for displaying a geometric object
     */
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println(object.getClass().getName());
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
