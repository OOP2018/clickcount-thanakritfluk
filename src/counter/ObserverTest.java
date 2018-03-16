package counter;

import java.util.Scanner;

/**
 * Test the Observer-Observable behavior for Counter object.
 *
 * @author Thanakrit Daorueang
 */
public class ObserverTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.create the subject (Observer)
        Counter counter = new Counter();
        //2.Create the observer with the reference to subject
        ConsoleView view = new ConsoleView(counter);
        //3.add observer to subject
        counter.addObserver(view);
        //4 run the app

        while (true) {
            System.out.println("how much? ");
            int howmuch = sc.nextInt();
            counter.add(howmuch);
        }
    }
}
