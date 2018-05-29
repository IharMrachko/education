package education.by.training.thread5;

public class Q {
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while (!valueSet)
            try {
            wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Получено " +n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
       while (valueSet)
       try {
           wait();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        this.n = n;
       valueSet = true;
        System.out.println("Отправлено "+n);
        notify();
    }
}
