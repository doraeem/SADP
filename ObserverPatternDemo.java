// Task-10 (Observer Pattern)

import java.util.ArrayList;
import java.util.List;

interface Subject {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

    void setState(String state);

    String getState();
}

class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }
}

interface Observer {

    void update();
}

class Observer1 implements Observer {
    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Observer 1 received update: " + subject.getState());
    }
}

class Observer2 implements Observer {
    private Subject subject;

    public Observer2(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Observer 2 received update: " + subject.getState());
    }
}
public class ObserverPatternDemo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject(); 

        Observer observer1 = new Observer1(subject);
        Observer observer2 = new Observer2(subject); 

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState("State 1");

        subject.notifyObservers();

        subject.setState("State 2");

        subject.notifyObservers();
    }
}