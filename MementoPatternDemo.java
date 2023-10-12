// Task-9 (Memento Pattern)

class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }
}

class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State 1");

        Memento memento = originator.createMemento();

        originator.setState("State 2");

        originator.restore(memento);

        System.out.println(originator.getState()); 
    }
}

