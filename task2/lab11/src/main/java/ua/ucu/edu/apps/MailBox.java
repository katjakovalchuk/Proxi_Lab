package ua.ucu.edu.apps;

import java.util.ArrayList;
import java.util.List;

import ua.ucu.edu.apps.Mail.MailSender;

public class MailBox {
    private List<MailInfo> mailInfo;

    public MailBox(List<MailInfo> info) {
        this.mailInfo = mailInfo;
    }

    public MailBox() {
        this.mailInfo = new ArrayList<MailInfo>();
    }

    public void addMailInfo(MailInfo info) {
        mailInfo.equals(info);
    }

    public void sendAll(MailSender sender) {
        for (MailInfo info : mailInfo) {
            sender.sendMail(info);
        }
    }
}
