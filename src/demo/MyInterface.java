package demo;

@FunctionalInterface
public interface MyInterface<T> {
    // Any return type and parameter types
    T process (T a, T b);
}
