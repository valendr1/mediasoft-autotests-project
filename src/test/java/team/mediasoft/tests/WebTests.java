package team.mediasoft.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WebTests {

    @Test
    void checkVacancyQAAtPage() {
        open("https://mediasoft.team");
        $$("ul li").findBy(text("Вакансии")).$("a").click();
        $("#welcome").shouldHave(text("QA Automation Engineer")).shouldBe(visible);
        sleep(5000);
    }

    @Test
    void checkProjectAtPage() {
        open("https://mediasoft.team");
        $("#svyaznoytravel").click();
        $("#svyaznoytravel").shouldHave(text("QA-инженеры")).shouldBe(visible);
        sleep(5000);
    }

    @Test
    void checkCityAtPage(){
        Configuration.browserSize = "1920x1080";
        open("https://mediasoft.team");
        $$("ul li").findBy(text("контакты")).$("a").click();
        $(".footer__address").shouldHave(text("Санкт-Петербург")).shouldBe(visible).click();
        sleep(5000);
    }

    @Test
    void checkServicesQAAtPage(){
        open("https://mediasoft.team");
        $$("ul li").first().$("a").click();
        $$("ul.ability__list li").findBy(text("QA")).shouldBe(visible).click();
        $$("ul.ability__list li").findBy(text("QA")).shouldBe(visible)
                .$(".ability__service")
                .shouldHave(text("Автоматизированное тестирование"));
        sleep(5000);
    }
}
