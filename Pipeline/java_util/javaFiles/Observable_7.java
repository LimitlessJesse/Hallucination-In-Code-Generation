import java.util.Observable;
import java.util.Observer;

public class Observable_7 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);
        observable.setChanged();
        observable.notifyObservers("Hello, World!");
    }
}

class MyObservable extends Observable {
    public void setChanged() {
        super.setChanged();
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Received update: " + arg);
    }
}
