package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by MrGeekr.
 * Date : 2020/1/8.
 * Description :1114. 按序打印

 */
public class PrintinOrder {

    static ReentrantLock lock = new ReentrantLock();
    static Condition firstCondition = lock.newCondition();
    static Condition secondCondition = lock.newCondition();
    static Condition thirdCondition = lock.newCondition();
    static int state = 1;


    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        while (state!=1){
            firstCondition.await();
        }

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        state=2;
        secondCondition.signal();
        lock.unlock();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        while (state!=2){
            secondCondition.await();
        }

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        state=3;
        thirdCondition.signal();
        lock.unlock();
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();

        while (state!=3){
            thirdCondition.await();
        }

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();

        state=1;
        firstCondition.signal();
        lock.unlock();
    }
}
