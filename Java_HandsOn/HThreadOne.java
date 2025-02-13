class HThreadOne extends Thread{
    public void run(){
        System.out.println("R_Thread_One");
        System.out.println("R_Thread_One");
        System.out.println("R_Thread_One");
    }
}

class Test{
    public static void main(String[] args) {
        HThreadOne thread1 = new HThreadOne();
        thread1.run();
    }
}
