package demo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
// import java.util.concurrent.*;
import java.util.stream.Collectors;

// Compile (in the project root folder)
// javac -d bin --source-path . ./*.java (compile any .java files)

// Run
// java -cp bin App (if no package name)

public class App {

    public static void main(String[] args) {

        // Thread th = new Thread(new Runnable() {
        // public void run() {
        // for(int i = 0; i < 10; i++) {
        // System.out.println(Thread.currentThread().getName() + " -> " + i);
        // }
        // }
        // });
        // th.start();

        // MyImplementation my1 = new MyImplementation();
        // MyImplementation my2 = new MyImplementation();
        // MyImplementation my3 = new MyImplementation();
        // MyImplementation my4 = new MyImplementation();
        // MyImplementation my5 = new MyImplementation();

        // Execute tasks using a single thread
        // ExecutorService ex = Executors.newSingleThreadExecutor();
        // ex.execute(my1);
        // ex.execute(my2);
        // ex.shutdown();

        // Execute the tasks using a fixed thread pool
        // ExecutorService thrPool = Executors.newFixedThreadPool(5);
        // thrPool.execute(my1);
        // thrPool.execute(my2);
        // thrPool.execute(my3);
        // thrPool.execute(my4);
        // thrPool.execute(my5);
        // // To clear memory
        // thrPool.shutdown();

        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1L, "Apple iPad", "Apple tablet", "computer"));
        products.add(new Product(2L, "Apple Macbook Pro", "Apple laptop", "computer"));
        products.add(new Product(3L, "Mouse", "Logitech mouse", "computer"));
        products.add(new Product(4L, "Samsung monitor", "32 inch monitor", "computer"));
        products.add(new Product(5L, "Huawei 5", "Huawei phone", "mobile"));
        products.add(new Product(6L, "Oppo 7 Pro", "Oppo phone", "mobile"));
        products.add(new Product(7L, "Galaxy 24", "Samsung phone", "mobile"));
        products.add(new Product(8L, "iPhone 15", "Apple phone", "mobile"));

        // products.forEach(prod -> {
        //     System.out.println(prod);
        // });
        // // Alternative method
        // products.forEach(System.out::println);

        // Only retrieve products of mobile category
        // List<Product> filtered = new ArrayList<>();
        // filtered = products.stream()  
        //             .filter(p -> p.getCategory().equals("mobile"))
        //             .collect(Collectors.toList());

        // filtered.forEach(Product::print);

        LocalDate ld = LocalDate.of(1990, 1, 12);
        Date currentDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        List<Person> persons = new LinkedList<>();
        persons.add(new Person(1L, "Bernard", "Low", 30000.0, currentDate));
        persons.add(new Person(2L, "Bernard", "Lee", 28000.0, currentDate));
        persons.add(new Person(3L, "Leonard", "Tan", 29000.0, currentDate));
        persons.add(new Person(4L, "Alicia", "Sim", 30000.0, currentDate));
        persons.add(new Person(5L, "Victoria", "Lee", 28000.0, currentDate));
        persons.add(new Person(6, "Ming Xuan", "Lee", 29000.0, currentDate));
        persons.add(new Person(7L, "Alicia", "Lee", 30000.0, currentDate));
        persons.add(new Person(8L, "Perez", "Tan", 29500.0, currentDate));
        persons.add(new Person(9L, "Gloria", "Low", 31000.0, currentDate));
        persons.add(new Person(10L, "Lily", "Sim", 33500.0, currentDate));

        // Comparing by firstname
        // Comparator<Person> compare = Comparator.comparing(p -> p.getFirstName());
        // persons.sort(compare.reversed());
        // persons.forEach(p -> System.out.println(p));

        Comparator<Person> compareMultiple = Comparator.comparing(Person::getFirstName)
                                                        .thenComparing(Person::getLastName);
        persons.sort(compareMultiple);
        //persons.forEach(p -> System.out.println(p));

        MyInterface<Integer> addOperation = (a, b) -> {
            return a + b;
        };

        MyInterface<Integer> multiplyOperation = (a, b) -> {
            return a * b;
        };

        System.out.println("addOperation: " + addOperation.process(3, 2));
        System.out.println("multiplyOperation: " + multiplyOperation.process(3, 2));

        List<Person> filteredPerson = new ArrayList<>();
        filteredPerson = persons.stream()       
                        .filter(person -> person.getSalary() < 30000.0)
                        .collect(Collectors.toList());

        filteredPerson.forEach(System.out::println);
    }
}