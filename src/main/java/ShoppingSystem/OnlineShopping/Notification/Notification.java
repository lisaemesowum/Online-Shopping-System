package ShoppingSystem.OnlineShopping.Notification;

public interface Notification {
    String emailNotification(String subject, String to, String from, String message);
    String smsNotification(String to,String message);
  String sendOtp_Phone(String phoneNumber);
}


