package education.by.training.thread;

public class NewThread extends Thread {
    NewThread(){//создаем новый поток
        super("Демонстрационный поток");
        System.out.println("Дочерний поток "+ this);
        start();//запустить поток на исполнение
    }
    //точка входа во второй поток
    public void run(){
        try {
            for (int i = 0; i <5 ; i++) {
                System.out.println("Дочерний поток "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}
