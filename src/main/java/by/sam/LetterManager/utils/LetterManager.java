package by.sam.LetterManager.utils;

import java.time.LocalDate;
import java.util.Date;

public class LetterManager {

    public Letter createLetter(String sender, String addressee, String text, String app, LocalDate date) {
        Letter letter = new Letter();
        letter.setSender(sender);
        letter.setAddressee(addressee);
        letter.setText(text);
        letter.setApp(app);
        letter.setDate(date);
        return letter;
    }

    public void sendLetter(Letter letter) {
        System.out.println("Письмо отправлено:\n" + letter.getText());
    }

    public void receiveLetter(Letter letter) {
        System.out.println("Письмо получено:\n" + letter.getText());
    }
}
