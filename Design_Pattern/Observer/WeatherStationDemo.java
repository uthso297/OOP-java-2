package Design_Pattern.Observer;

import java.util.List;
import java.util.ArrayList;

interface Observer {
    void update(int temperature);
}

interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    void setTemperature(int temperature) {
        this.temperature = temperature;
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

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class MobileDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Mobile Display: Temperature is " + temperature + " degrees");
    }
}


class TVDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("TV Display: Current temperature is " + temperature + "°C");
    }

}

public class WeatherStationDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        MobileDisplay mobileDisplay = new MobileDisplay();
        TVDisplay tvDisplay = new TVDisplay();
        weatherStation.addObserver(mobileDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
        weatherStation.setTemperature(28);

        weatherStation.removeObserver(mobileDisplay);
        weatherStation.setTemperature(22);  
    }

}
