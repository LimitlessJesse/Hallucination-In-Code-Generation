import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public class Component_4 {
    public static void main(String[] args) {
        Container container = new Container() {
            @Override
            public void addNotify() {
                super.addNotify();
                revalidate();
            }
        };

        container.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                return new Dimension(100, 100);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return new Dimension(100, 100);
            }

            @Override
            public void layoutContainer(Container parent) {
            }
        });

        container.add(new Component() {
            @Override
            public void addNotify() {
                super.addNotify();
                revalidate();
            }
        });
    }
}
