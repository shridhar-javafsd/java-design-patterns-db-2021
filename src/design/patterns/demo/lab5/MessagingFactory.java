package design.patterns.demo.lab5;

public class MessagingFactory {
	public static Messaging createNotification(String channel) {
		if (channel == null || channel.isEmpty())
			return null;
		if ("SMS".equals(channel)) {
			return new SMSMessaging();
		} else if ("EMAIL".equals(channel)) {
			return new EmailMessaging();
		} else if ("PUSH".equals(channel)) {
			return new PushNotificationMessage();
		}
		return null;
	}
}