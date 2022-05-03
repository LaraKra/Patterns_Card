package ru.netology.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.netology.data.DataGenerator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardDelivPattern {
    @BeforeEach
    public void setUp() {
        open("http://localhost:9999");
    }

    @Test
    public void shouldSendCorrectForm() {
        $(".input__control[type='text'][placeholder='Город']").setValue(DataGenerator.city());
        $("[data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE); // предварительная чистка поля с датой по умолчанию
        $("[data-test-id='date'] input").setValue(DataGenerator.dateMeeting(3));
        $("[name='name']").setValue(DataGenerator.name());
    }
}