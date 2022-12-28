public interface ExceptionInterface {
    /**
     * Throws exception if the value of width is negative
     */
    void setWidth(double width) throws IllegalArgumentException;

    /**
     * Throws exception if the value of height is negative
     */
    void setHeight(double height) throws IllegalArgumentException;
}
