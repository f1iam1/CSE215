public class Rectangle {
    double width = 1, height = 1;

    Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }
}
