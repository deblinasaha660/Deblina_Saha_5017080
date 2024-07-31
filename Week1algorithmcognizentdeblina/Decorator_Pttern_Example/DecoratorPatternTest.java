package DecoratorPatternExample;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        String message = "Important notification!";

        // Create a basic email notifier
        Notifier emailNotifier = new EmailNotifier();
        System.out.println("Sending notification via email only:");
        emailNotifier.send(message);
        System.out.println();

        // Decorate with SMS notification
        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        System.out.println("Sending notification via email and SMS:");
        emailAndSMSNotifier.send(message);
        System.out.println();

        // Decorate with Slack notification
        Notifier allChannelsNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);
        System.out.println("Sending notification via email, SMS, and Slack:");
        allChannelsNotifier.send(message);
    }
}
