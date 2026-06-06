public class SingletonForMultithreading {
    private static SingletonForMultithreading instance = null;

    private SingletonForMultithreading(){
    }

    public static SingletonForMultithreading getInstance(){
        // Double checked locking
        if (instance == null){
            synchronized (SingletonForMultithreading.class){
                if(instance == null){
                    instance = new SingletonForMultithreading();
                }
            }
        }

        return instance;
    }
}
