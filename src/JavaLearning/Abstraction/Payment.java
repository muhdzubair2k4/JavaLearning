package JavaLearning.Abstraction;

import java.lang.reflect.Array;

public interface  Payment {
    public void pay(double amount);
}

class PayPal implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Amount " + amount + " has been paid through PayPal");
    }
}

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Amount " + amount + " paid through CreditCard");
    }
}

class MainPayment {
    public static void main(String[] args) {
        Payment[] payment = new Payment[3];

        payment[0] = new PayPal();
        payment[1] = new CreditCard();

        payment[0].pay(1000);
        payment[1].pay(2000);


    }
}
