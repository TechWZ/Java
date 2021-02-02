public class ThreadPractice {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread() {
            public void run() {
                System.out.println("Thread run...");
                try {
                    Thread.sleep(10);    
                } catch (Exception e) {
                    //TODO: handle exception
                }
                System.out.println("Thread end.");
            };
        };
        t.start();
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("main end...");
    }
}
