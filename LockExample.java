import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String [] args){
        Lock lock = new ReentrantLock();
        lock.lock();

        System.out.println("Trying the Reentrant lock");

        lock.unlock();
    }
}
