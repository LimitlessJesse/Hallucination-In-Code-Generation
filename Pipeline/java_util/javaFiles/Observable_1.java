import java.util.Observable;
import java.util.Observer;

public class Observable_1 {
    public static void main(String[] args) {
        Observable observable = new Observable() {
            @Override
            public void notifyObservers(Object arg) {
                super.notifyObservers(arg);
            }
        };

        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Observer notified");
            }
        };

        observable.addObserver(observer);
        observable.notifyObservers();
    }
}
