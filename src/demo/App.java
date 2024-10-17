package demo;

import java.util.concurrent.*;

// Compile (in the project root folder)
// javac -d bin --source-path . ./*.java (compile any .java files)

// Run
// java -cp bin App (if no package name)

public class App {

    public static void main(String[] args) {
        
    //     Thread th = new Thread(new Runnable() {
    //         public void run() {
    //             for(int i = 0; i < 10; i++) {
    //                 System.out.println(Thread.currentThread().getName() + " -> " + i);
    //             }
    //         }
    //     });
    // th.start();

    MyImplementation my1 = new MyImplementation();
    MyImplementation my2 = new MyImplementation();
    MyImplementation my3 = new MyImplementation();
    MyImplementation my4 = new MyImplementation();
    MyImplementation my5 = new MyImplementation();

    // Execute tasks using a single thread
    // ExecutorService ex = Executors.newSingleThreadExecutor();
    // ex.execute(my1);
    // ex.execute(my2);
    // ex.shutdown();

    // Execute the tasks using a fixed thread pool
    ExecutorService thrPool = Executors.newFixedThreadPool(5);
    thrPool.execute(my1);
    thrPool.execute(my2);
    thrPool.execute(my3);
    thrPool.execute(my4);
    thrPool.execute(my5);
    // To clear memory 
    thrPool.shutdown();
    }
}