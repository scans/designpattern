package cn.coolcc.designPatterns.singleton;

/**
 * Created by chencheng on 17/1/5.
 */
public class TestSingleton {
/*    private static boolean isRunning = true;


    public static void main(String[] args) throws InterruptedException {
        Set<Singleton> set = Collections.synchronizedSet(new HashSet<>());
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            pool.submit(() -> {
                while (isRunning) {
                    set.add(Singleton.getInstance());
                }
            });
        }

        TimeUnit.SECONDS.sleep(5);
        isRunning = false;
        TimeUnit.SECONDS.sleep(5);
        set.forEach(System.out::println);
        pool.shutdown();
    }*/
}
