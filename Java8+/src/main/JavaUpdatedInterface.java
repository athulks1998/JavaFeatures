package main;

/**
 * @author Athul K S
 * All the methods currently used in an interface 
 *
 */
public interface JavaUpdatedInterface {

    // Private method in interface
    private String privateMethod() {
        return "This is a private method in interface";
    }

    // Private static method in interface
    private static String privateMethodStatic() {
        return "This is a private static method in interface";
    }

    // Default method in interface
    default String defaultMethod() {
        // Accessing private static method in interface
        privateMethodStatic();

        // Accessing private method in interface
        return privateMethod();
    }

    // Static method in interface
    static void staticMethod() {
        System.out.println("This is a static method in interface");
    }

    // Private method that can be used by other default methods
    private void helperMethod() {
        System.out.println("This is a private helper method");
    }

    // Private method that returns a value and can be used by other default methods
    private String helperMethodWithReturnValue() {
        return "This is a private helper method with a return value";
    }

    // Default method that calls a private helper method
    default void methodWithHelper() {
        helperMethod();
    }

    // Default method that calls a private helper method with return value
    default String methodWithHelperAndReturnValue() {
        return helperMethodWithReturnValue();
    }
}
