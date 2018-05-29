package education.by.training.thread2;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Один");
        new NewThread("Два");
        new NewThread("Три");

        try {//ожидать завершения других потоков исполнения
            Thread.sleep(10000);
            } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
    }

