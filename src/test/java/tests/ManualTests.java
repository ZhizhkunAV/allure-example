package tests;

import io.qameta.allure.Manual;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ManualTests {
    @Test
    @Manual
    @DisplayName("Мануальный тест - Наличие текста у чекбокса 'Подписаться на рассылку'")
    public void haveSalesMailsTest() {
        step("Открыть стартовую страницу сайта https://www.aviasales.ru");
        step("Переход на страницу 'Профиль'");
        step("Проверка наличия текста 'Подписаться на рассылку'");
    }
}