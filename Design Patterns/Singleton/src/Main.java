import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0 ; i < 10 ; i++){
            threadPool.execute(() -> createSingletonObj());
        }

        //threadPool.execute(() -> createSingletonObj());

        threadPool.shutdown();
    }

    public static void createSingletonObj(){
        //Singleton singletonObj = Singleton.getInstance();
        SingletonForMultithreading singletonObj = SingletonForMultithreading.getInstance();
        System.out.println("Singleton object created by thread - "
                + Thread.currentThread().getName() + " is: " +
                singletonObj);
    }
}