public class TestCircle {
    /**
     * Main method
     */
    public static void main(String[] args) {

        GeometricObject geoObject1 = new Circle(-5);
        GeometricObject geoObject2 = new Circle(5);

        displayGeometricObject(geoObject1);
        displayGeometricObject(geoObject2);


    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }

}