package ru.netology.test;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
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
    }
}