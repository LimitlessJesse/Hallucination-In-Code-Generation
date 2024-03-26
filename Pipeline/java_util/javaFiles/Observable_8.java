import java.util.Observable;

public class Observable_8 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.addObserver(new MyObserver());
        observable.setChanged();
        observable.notifyObservers();
    }
}

class MyObservable extends Observable {
    public void setChanged() {
        super.setChanged();
    }
}

class MyObserver implements java.util.Observer {
    public void update(Observable o, Object arg) {
        System.out.println("State has changed");
    }
}
