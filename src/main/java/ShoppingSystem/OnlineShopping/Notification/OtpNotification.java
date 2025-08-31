package ShoppingSystem.OnlineShopping.Notification;

public class OtpNotification implements Notification{
    @Override
    public String emailNotification(String subject, String to, String from, String message) {
        throw new UnsupportedOperationException(" EmailNotification not supported in OtpNotification");
    }

    @Override
    public String smsNotification(String to, String message) {
        throw new UnsupportedOperationException(" SMS notification not supported in OtpNotification.");
    }

    @Override
    public String sendOtp_Phone(String phoneNumber) {
        return "OTP sent to" + phoneNumber;
    }
}
