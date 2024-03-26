import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
    private String data;

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }

    public String getData() {
        return this.data;
    }
}

class MyObserver implements Observer {
    private MyObservable observable;

    public MyObserver(MyObservable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == observable) {
            System.out.println("Data has changed to: " + observable.getData());
        }
    }
}

public class Observable_6 {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver(observable);

        observable.setData("Hello World!");
    }
}
