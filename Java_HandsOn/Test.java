class HThreadOne extends Thread{
    public void run(){
        System.out.println("H_Thread_One");
        System.out.println("H_Thread_One");
        System.out.println("H_Thread_One");
    }
}

class HThreadTwo extends Thread{
    public void run() {
        System.out.println("H_Thread_Two");
        System.out.println("_HThread_Two");
        System.out.println(100/0);
        }
    }

class HThreadThree extends Thread{
    public void run(){
        System.out.println("H_Thread_Three");
        System.out.println("H_Thread_Three");
        System.out.println("H_Thread_Three");
        System.out.println("H_Thread_Three");
        System.out.println("H_Thread_Three");
    }

}

class ThreadRunnableOne implements Runnable{
    public void run() {
        System.out.println("From ThreadRunnableOne");
        System.out.println("From ThreadRunnableOne");
    }
}

class ThreadRunnableTwo implements Runnable{
    public void run(){
        System.out.println("From ThreadRunnableTwo");
        System.out.println("From ThreadRunnableTwo");
        System.out.println("From ThreadRunnableTwo");
    }
}


class Test{
    public static void main(String[] args) {
        HThreadOne thread1 = new HThreadOne();
        thread1.start();

        HThreadTwo thread2 = new HThreadTwo();
        thread2.start();

        HThreadThree thread3 = new HThreadThree();
        thread3.run();

        ThreadRunnableOne run1 = new ThreadRunnableOne();
        run1.run();

        ThreadRunnableTwo run2 = new ThreadRunnableTwo();
        run2.run();
    }
}