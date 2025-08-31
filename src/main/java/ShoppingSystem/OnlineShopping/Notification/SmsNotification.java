package ShoppingSystem.OnlineShopping.Notification;

public class SmsNotification implements  Notification{
    @Override
    public String emailNotification(String subject, String to, String from, String message) {
        throw new UnsupportedOperationException(" EmailNotification not supported in SMS notification");
    }

    @Override
    public String smsNotification(String to, String message) {
        return "sms sent to" + to;
    }

    @Override
    public String sendOtp_Phone(String phoneNumber) {
       throw new UnsupportedOperationException("OTP notification not supported in SMS notification");
    }
}
