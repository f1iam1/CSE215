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
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println(object);
        System.out.println();
    }
}
