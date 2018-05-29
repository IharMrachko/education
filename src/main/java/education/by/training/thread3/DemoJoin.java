package education.by.training.thread3;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");
        System.out.println("Поток один запущен " + ob1.t.isAlive());
        System.out.println("Поток два запущен " + ob2.t.isAlive());
        System.out.println("Поток три запущен " + ob3.t.isAlive());
        //ожидать завершение потока
        try {
            System.out.println("Ожидание завершения потока");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Первый поток запущен " + ob1.t.isAlive());
        System.out.println("Второй поток запущен " + ob2.t.isAlive());
        System.out.println("Третий поток запущен " + ob3.t.isAlive());
        System.out.println("Главный поток завершен");
    }
}
