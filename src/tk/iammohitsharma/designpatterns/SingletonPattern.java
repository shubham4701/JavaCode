package tk.iammohitsharma.designpatterns;

import java.util.concurrent.*;

public class SingletonPattern {
    private ExecutorService executor;

    public static void main(String[] args) {
        boolean isTrulySingleTon = checkSingleton();
        System.out.println("Is truly singleton? " + isTrulySingleTon);
    }

    private static boolean checkSingleton() {
        boolean isTrulySingleton = true;
//        Creating initial instance to get first object reference
        SingletonPatternEntity initialInstance = SingletonPatternEntity.getInstance();
//        Creating a thread pool to execute same code 1 million times
        ExecutorService executor = Executors.newCachedThreadPool();
//        A callable that will check if the references are same or not
        Callable fetchNewObject = () -> {
            SingletonPatternEntity anotherInstance = SingletonPatternEntity.getInstance();
            return (initialInstance == anotherInstance);
        };
//        Run code 1 million times
        for (int i = 0; i < 100_000; i++) {
            Future<Boolean> result = executor.submit(fetchNewObject);
            try {
                isTrulySingleton = isTrulySingleton && result.get();
            } catch (InterruptedException | ExecutionException e) {
                isTrulySingleton = false;
            }
        }
//        Data cleanup
        executor.shutdown();
        return isTrulySingleton;
    }
}
