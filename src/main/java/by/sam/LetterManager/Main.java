package by.sam.LetterManager;

import by.sam.LetterManager.utils.Letter;
import by.sam.LetterManager.utils.LetterManager;

import java.time.LocalDate;

/*Создать класс LetterManager.
Создать класс Письмо. Реализовать с использованием интерфейса возможности:
- Добавить/удалить текст письма;
- добавить/удалить отправителя;
- добавить/удалить приложения к письму;
- поставить дату отправки;
- отправить/принять письмо;
- проверить адресат на существование.
Реализовать код так, чтобы из метода main можно было вызвать LetterManager, но нельзя было обратиться к методам самого класса Письма.
Произвести над письмом различные манипуляции из метода main.*/
public class Main {
    public static void main(String[] args) {
        LetterManager letterManager = new LetterManager();
        Letter letter1 = letterManager.createLetter("Сергей", "Юра", "Здарова кабан!", "Приложение №1", LocalDate.of(2024, 11, 11));

        letterManager.sendLetter(letter1);
        System.out.println();
        letterManager.receiveLetter(letter1);
    }
}
