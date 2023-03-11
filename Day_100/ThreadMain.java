// A program to check the properties of the main thread

public class ThreadMain {
    public static void main(String args[]) {
        System.out.println("Main thread : " + Thread.currentThread());
        // set the name of the Thread as My_Thread
        Thread.currentThread().setName(" My_Thread");
        System.out.println("Name of the Main thread :" + Thread.currentThread().getName());
        System.out.println("ID of the Main thread :" + Thread.currentThread().getId());
        System.out.println("Priority of the Main thread :" + Thread.currentThread().getPriority());
    }
}
