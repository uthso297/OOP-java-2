package Design_Pattern.Observer;

import java.util.List;
import java.util.ArrayList;

interface Observer {
    void update(String stockName, double price);
}

interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class StockData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public void setStockData(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        System.out.println("\n--- Price Changed for " + stockName + " to $" + price + " ---");
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

}

class MobileApp implements Observer {
    private String userName;

    public MobileApp(String name) {
        this.userName = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("\n");
        System.out.println("Mobile App: " + userName);
        System.out.println("Stock Name: " + stockName);
        System.out.println("Price: $" + price);
        System.out.println("\n");

    }

}

class StockTickerDisplay implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("LED Ticker Board: " + stockName.toUpperCase() + " : " + price);
    }
}

public class StockDemo {
      public static void main(String[] args) {
        StockData stockData = new StockData();

        MobileApp mobileApp1 = new MobileApp("User1");
        MobileApp mobileApp2 = new MobileApp("User2");
        StockTickerDisplay stockTickerDisplay = new StockTickerDisplay();

        stockData.addObserver(mobileApp1);
        stockData.addObserver(mobileApp2);      
        stockData.addObserver(stockTickerDisplay);

        stockData.setStockData("AAPL", 150.0);
        stockData.setStockData("GOOGL", 2800.0);
        stockData.setStockData("MSFT", 300.0);  
        stockData.removeObserver(mobileApp1);
        stockData.setStockData("AMZN", 3200.0); 

      }
}
