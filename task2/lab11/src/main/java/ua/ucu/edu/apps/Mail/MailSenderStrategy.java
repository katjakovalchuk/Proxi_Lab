package ua.ucu.edu.apps.Mail;

import ua.ucu.edu.apps.MailInfo;

interface MailSenderStrategy {
    String sendMail(MailInfo mailInfo);
}
