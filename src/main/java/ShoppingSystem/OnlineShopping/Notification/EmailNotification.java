package ShoppingSystem.OnlineShopping.Notification;

public class EmailNotification implements  Notification{
    @Override
    public String emailNotification(String subject, String to, String from, String message) {
        return "Email sent to "+ to + "with subject"+ subject + "from"+from;
    }

    //EmailNotification implements Notification, you must override all 3 methods

    //This tells the program: “This method exists (because of the interface), but this particular class doesn’t support it.”
    @Override
    public String smsNotification(String to, String message) {
       throw new UnsupportedOperationException("SMS notification not supported in EmailNotification.");
    }

    @Override
    public String sendOtp_Phone(String phoneNumber) {
       throw new UnsupportedOperationException("OTP notification not supported in EmailNotification.");
    }

}


