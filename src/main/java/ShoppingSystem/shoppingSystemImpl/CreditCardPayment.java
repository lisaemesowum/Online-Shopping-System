package ShoppingSystem.shoppingSystemImpl;

import ShoppingSystem.OnlineShopping.Notification.Notification;
import ShoppingSystem.OnlineShopping.Payment;

public class CreditCardPayment  implements Payment, Notification {
    @Override
    public void pay(double amount) {
        System.out.println("The amount you paid is ₦"+ amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("The refund process for this amount is ₦"+amount);
    }


    @Override
    public String emailNotification(String subject, String to, String from, String message) {
        return "Email sent successfully";
    }

    @Override
    public String smsNotification(String to, String message) {

        return "Check your sms sent..";
    }

    @Override
    public String sendOtp_Phone(String phoneNumber) {
        return "Otp sent to" +phoneNumber;
    }

}
