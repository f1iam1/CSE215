public class Stock {
    String symbol, name;
    double previousClosingPrice, currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return (previousClosingPrice - currentPrice) / currentPrice * 100;
    }

    void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
