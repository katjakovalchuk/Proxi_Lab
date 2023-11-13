package ua.ucu.edu.apps.Mail;

import ua.ucu.edu.apps.MailInfo;

public class BirthadayMailSender implements MailSenderStrategy {

    @Override
    public String sendMail(MailInfo mailInfo) {
        return "Happy Birthday";
    }
}
