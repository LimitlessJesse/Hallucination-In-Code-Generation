import java.util.Observable;

public class Observable_9 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.addObserver(new MyObserver());
        observable.setChanged();
        observable.notifyObservers();
        observable.clearChanged();
    }
}

class MyObservable extends Observable {
    public void changeState() {
        setChanged();
        notifyObservers();
    }
}

class MyObserver implements java.util.Observer {
    public void update(Observable o, Object arg) {
        System.out.println("State has changed");
    }
}
