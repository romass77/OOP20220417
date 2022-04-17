package lt.bit.email;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mail {

    private ArrayList<Email> sentEmails;
    private ArrayList<Email> deletedEmails;

    public void sendEmail(Email email) {
        email.setSentDate(LocalDate.now());
        sentEmails.add(email);
    }

    public void deleteEmail(Email email) {
        if (!sentEmails.contains(email)) {
            System.out.println("Toks laiškas nebuvo išsiųstas");
        } else {
            sentEmails.remove(email);
            deletedEmails.add(email);
        }
    }

    public void deleteEmailAtAll(LocalDate startDate, LocalDate endDate) {
        for (Email sentEmail : sentEmails) {
            if (startDate.isAfter(sentEmail.getSentDate()) && endDate.isBefore(sentEmail.getSentDate())) {
                sentEmails.remove(sentEmail);
            }
        }

        for (Email deletedEmail : deletedEmails) {
            if (startDate.isAfter(deletedEmail.getSentDate()) && endDate.isBefore(deletedEmail.getSentDate())) {
                deletedEmails.remove(deletedEmail);
            }
        }
    }
}
