import java.util.Observable;
import java.util.Observer;

public class Observable_3 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();

        observable.addObserver(observer);
        observable.setChanged();
        observable.notifyObservers();

        observable.deleteObservers();
    }
}

class MyObservable extends Observable {
    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data has changed!");
    }
}
