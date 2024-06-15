package oopsInJava;
// class -> class , interface-> interface = extends
// class -> interface = implements
interface E
{

//    Inside interfaces we can define variable but by default they are "final and static"
//      so we need to initialise teh variable since its final
    int age = 12;
    String name = "Payal";
//  Both of these methods are public abstract automatically
    void show();
    void show2();
}
class F implements E
{

    @Override
    public void show() {
        System.out.println("Show");
    }

    @Override
    public void show2() {
        System.out.println("In show 2");
    }
}

 class InterfaceConcept {

    public static void main(String[] args) {

// you cant create an object of interfaces

        F f = new F();
         f.show();
// A class can implement multiple interfaces
    }

}


// In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They provide a way to achieve abstraction and multiple inheritance in Java. An interface is a contract that a class can implement, which means that the class agrees to perform the specific behaviors declared by the interface.
//
//Real-Life Scenario
//Let's consider a real-life scenario involving a payment system in an online store. There are multiple ways to process payments, such as credit cards, PayPal, and bank transfers. Each payment method has its own way of processing payments but they all share the common behavior of processing a payment.
//
//Step-by-Step Explanation:
//Define the Interface:
//
//We define an interface PaymentMethod that declares the processPayment method. This method will be implemented by different classes representing different payment methods.
//
//java
//Copy code
//public interface PaymentMethod {
//    void processPayment(double amount);
//}
//Implement the Interface:
//
//We create classes for different payment methods like CreditCard, PayPal, and BankTransfer, each implementing the PaymentMethod interface.
//
//java
//Copy code
//public class CreditCard implements PaymentMethod {
//    @Override
//    public void processPayment(double amount) {
//        System.out.println("Processing credit card payment of $" + amount);
//    }
//}
//
//public class PayPal implements PaymentMethod {
//    @Override
//    public void processPayment(double amount) {
//        System.out.println("Processing PayPal payment of $" + amount);
//    }
//}
//
//public class BankTransfer implements PaymentMethod {
//    @Override
//    public void processPayment(double amount) {
//        System.out.println("Processing bank transfer payment of $" + amount);
//    }
//}
//Use the Interface:
//
//In our payment processing system, we can use the PaymentMethod interface to process payments without worrying about the specific implementation. This provides flexibility and allows for easy addition of new payment methods in the future.
//
//java
//Copy code
//public class PaymentProcessor {
//    private PaymentMethod paymentMethod;
//
//    public PaymentProcessor(PaymentMethod paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public void process(double amount) {
//        paymentMethod.processPayment(amount);
//    }
//}
//Test the Implementation:
//
//We can create instances of different payment methods and use the PaymentProcessor to process payments.
//
//java
//Copy code
//public class Main {
//    public static void main(String[] args) {
//        PaymentMethod creditCard = new CreditCard();
//        PaymentMethod payPal = new PayPal();
//        PaymentMethod bankTransfer = new BankTransfer();
//
//        PaymentProcessor processor = new PaymentProcessor(creditCard);
//        processor.process(100.0); // Output: Processing credit card payment of $100.0
//
//        processor = new PaymentProcessor(payPal);
//        processor.process(200.0); // Output: Processing PayPal payment of $200.0
//
//        processor = new PaymentProcessor(bankTransfer);
//        processor.process(300.0); // Output: Processing bank transfer payment of $300.0
//    }
//}
//Benefits:
//Abstraction: The interface provides a way to define methods without implementing them. The actual implementation is left to the classes that implement the interface.
//
//Flexibility: You can easily switch between different implementations of the interface without changing the client code.
//
//Maintainability: Adding a new payment method only requires creating a new class that implements the PaymentMethod interface. The existing code does not need to be modified.
//
//Multiple Inheritance: Java does not support multiple inheritance of classes, but a class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
