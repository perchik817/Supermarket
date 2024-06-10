package supermarket;

/**
 *
 * @author Perchik
 */
public class Supermarket {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }
}
