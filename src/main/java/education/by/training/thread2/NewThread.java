package education.by.training.thread2;

public class NewThread implements Runnable {
   String name;//название потока
    Thread t;

    NewThread(String threadname){
       name = threadname;
       t = new Thread(this, name);
        System.out.println("Новый поток "+ t);
        t.start();//зваускаем поток
    }

    //точка входа потока на исполнение
    @Override
    public void run() {
       try {
           for (int i = 0; i < 5; i++) {
               System.out.println(name+" прерван");
               Thread.sleep(1000);
           }
       } catch (InterruptedException e) {
           System.out.println(name+" завершен");
       }
    }
}

