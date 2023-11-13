package ua.ucu.edu.apps.Mail;

import ua.ucu.edu.apps.MailInfo;

public class MailSender {
    private MailSenderStrategy senderStrategy;

    public MailSender(MailSenderStrategy senderStrategy) {
        this.senderStrategy = senderStrategy;
    }

    public void sendMail(MailInfo mailInfo) {
        senderStrategy.sendMail(mailInfo);
    }
}
