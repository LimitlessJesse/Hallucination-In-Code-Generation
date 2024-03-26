import java.util.Observable;

public class Observable_5 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        observable.addObserver(new MyObserver());
        observable.addObserver(new MyObserver());
        System.out.println("Number of observers: " + observable.countObservers());
    }
}

class MyObservable extends Observable {
    // Your custom code here
}

class MyObserver implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        // Your custom code here
    }
}
