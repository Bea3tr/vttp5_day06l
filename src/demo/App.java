package demo;

// Compile (in the project root folder)
// javac -d bin --source-path . ./*.java (compile any .java files)

// Run
// java -cp bin App (if no package name)

public class App {

    public static void main(String[] args) {
        
        Thread th = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " -> " + i);
                }
            }
        });
    th.start();
    }
}