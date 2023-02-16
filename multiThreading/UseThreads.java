package multiThreading;

class MyThread implements Runnable {
    String thrdName;
    MyThread(String name) {
        thrdName = name;
    }

    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(500);
                System.out.println("In " + thrdName + " , count is " + count);
            }
        }catch(InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}

public class UseThreads {
    public static void main(String args[]){
        System.out.println("Main thread starting.");

        MyThread mt = new MyThread("Child #1");
        Thread newthrd = new Thread(mt);
        newthrd.start();

        for(int i=0; i<50; i++) {
            //System.out.println("Main Thread is Executing-["+(i+1)+"]");
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch(InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
