package PThreads;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) throws InterruptedException {
    
System.out.println("\n-- Part 3: Race condition demo (broken counter) --");

    BrokenCounter counter = new BrokenCounter(); // shared mutable state
    int threads = 8, repeats = 50_000;
    List<Thread> list = new ArrayList<>();
    for (int i = 0; i < threads; i++) {
        Thread t = new Thread(() -> {
            for (int r = 0; r < repeats; r++) counter.increment(); // not synchronized
        });
        list.add(t);
        t.start();
    }
    for (Thread t : list) t.join();
    System.out.println("Expected: " + (threads * repeats) + " | Actual (broken): " + counter.value());

        SyncCounter safeCounter = new SyncCounter();
threads = 8; list.clear();
for (int i = 0; i < threads; i++) {
    Thread t = new Thread(() -> {
        for (int r = 0; r < repeats; r++) safeCounter.increment();
    });
    list.add(t);
    t.start();
}
for (Thread t : list) t.join();
System.out.println("Expected: " + (threads * repeats) + " | Actual (sync): " + safeCounter.value());
    }}
    class BrokenCounter {
        private int count = 0;
        void increment() { count = count + 1; } // NOT atomic
        int value() { return count; }
    }

class SyncCounter {
    private int count = 0;
    synchronized void increment() { count = count + 1; } // critical section
    synchronized int value() { return count; }
}


/*
 * Threading:
 *  - A path of execution in a process. One process can have many threads. 
 *  - run independently but share resources - like memory. 
 *  
 * Why threads:
 *  - Resposiveness: backgrounds tasks shouldnt block UI/ user tasks.
 *  - Parallelism: handling multiple requests simultaneously. 
 *  - IO + cpu bottlenecks. 
 * 
 * Common problems:
 *  - Race conditions - Multiple threads accessing shared data.
 *  - Visibility: chnages by thread might not be visable to another. 
 *  - Blockinfg and deadlocked threads.
 * 
 *  Concurreny:
 *   - how many tasks are being undertaken at same time. 
 *   - True Parallelism - per core.
 * 
 *   Main Thread:
 *      - system.out.println
 *      - call methods directly from main thread. 
 *      - Create new threads
 *      - Thread.sleep()
 *      - Thread.currentThread()
 *      - uncaught Exceptions crash entire program. 
 * 
 *  New thread:
 *      - start() - builds a frame/stack for the new thread. 
 *      - run() - Executes logic in current thread (not used)
 *      - join() - wait for a thread to finish its process.
 *      - sleep()
 *      - setPririoty - not guarenteed. 
 *      - isalive() - is the thread running? 
 *      - sychronised: protect resources from race conditions.
 * 
 * Orchestration:
 *      - executorservice: manage thread pools
 *      - Threadgroups: lets us pool threads togeather.
 *      - wait()
 *      - notify()
 *      - volaile()
 * 
 * Lifecycle:
 *  new - runs - blocks/waiting - terminated
 * 
 * Termination conditions:
 *  - Normal completion
 *  - exceptions thrown
 *  - Manually stop - interupted.
 *  - daemon-threads - cautious - stops if all other threads stop. 
 * 
 * - Start() vs run()
 * start:
 *  - tells the JVM to build new thread and get it to run its run().
 *  - thread is then independant of main.
 * 
 * run:
 *  - just runs the method but on main thread.
 *  - synchronicty and blocking of main thread.
 * 
 * JVM optimisation:
 *  - Thread scheduling - delgates to OS
 *  - Thread complilation
 *  - Garbage collection is also concurent.
 *  
 * CANT:
 *  - Intent cant be infered.
 *  - Wont add in safety.
 *  - manage resources.
 *  - OS issues. 
 * 
 * example: 
 * 
 * Thread daemon = new Thread(() -> {
        while(true){
            try{Thread.sleep(1000000000);}catch(InterruptedException e){}
            System.out.println("This is from Daemon thread");
        }
    });

    daemon.setDaemon(true);
    daemon.start();

    // extending the thread class.
    Thread t1 = new Thread() {
        @Override public void run(){
            System.out.println("This is from T1");
        }
    };
    // Implemation of runnable interface (preferred)
    Runnable task = () -> System.out.println("This is from T2");
    Thread t2 = new Thread(task);


t1.start();
t2.start();

t1.join();
t2.join();

System.out.println("[MAIN] - all threads finished");
}
}
 * 
 * 
 *  Thread a = new Thread(new Worker("a", 10));
    Thread b = new Thread(new Worker("b", 10));

    a.start();
    b.start();
    a.join();
    b.join();

}}


class Worker implements Runnable {
    String label;
    int times;

    Worker(String label, int times){
        this.label = label;
        this.times = times;
    }

    @Override
    public void run(){
        for (int i = 0 ; i < times; i++){
            System.out.println("Worker " + label + ": " + i);
            mySleep(10);
        }
    }
    static void mySleep(long ms){
        try {Thread.sleep(ms);} catch (InterruptedException e){}}
    }
 * 
 * 
 * Race conditions:
 * 
 * - 2 or more threads want to access the same data.
 * - incrmening is not atomic (atomic = cant be divisable)
 * - i++ 
 * - 1) Read the value 2) adds 1 3) write 
 * 
 *  problem:
 *      - 2 threads read at same time (100)
 *      - both add 1
 *      - both try to write back 101
 *      - but..... i should have been on 102.   
 * 
 */