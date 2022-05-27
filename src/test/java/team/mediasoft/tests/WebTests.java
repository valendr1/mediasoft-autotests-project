package team.mediasoft.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import team.mediasoft.pages.MediaSoftPage;

public class WebTests {

    MediaSoftPage mediaSoftPage = new MediaSoftPage();
    String vacancyAtHeaderName = "Вакансии";
    String vacancy = "QA Automation Engineer";
    String projects = "Проекты";
    String employees = "QA-инженеры";
    String contactsAtHeader = "контакты";
    String city = "Санкт-Петербург";


    @Test
    @Owner("valendr1")
    @DisplayName("Проверка наличия вакансии QA")
    void checkVacancyQAAtPage() {
        //Предусловия
        mediaSoftPage.openPage();
        //Шаги
        mediaSoftPage.clickVacancyAtHeader(vacancyAtHeaderName);
        //Ожидаемый результат
        mediaSoftPage.checkAvailableVacancy(vacancy);

    }

    @Test
    @Owner("valendr1")
    @DisplayName("Проверка участия QA в проекте СВЯЗНОЙ ТРЭВЭЛ")
    void checkProjectAtPage() {
        //Предусловия
        mediaSoftPage.openPage();
        //Шаги
        mediaSoftPage.clickProjectAtHeader(projects)
                .chooseSvyaznoiTravelProject(employees);
        //Ожидаемый результат
        mediaSoftPage.verificationQAAtProject(employees);
    }

    @Test
    @Owner("valendr1")
    @DisplayName("Проверка наличия офиса в городе")
    void checkCityAtPage() {
        //Предусловия
        Configuration.browserSize = "1920x1080";
        mediaSoftPage.openPage();
        //Шаги
        mediaSoftPage.clickContactAtHeader(contactsAtHeader);
        // Ожидаемый результат
        mediaSoftPage.checkCityAtContacts(city);
    }

    @ParameterizedTest(name = "Проверка наличия услуги {0} во вкладке QA департамента")
    @ValueSource(strings = {
            "Автоматизированное тестирование",
            "Регрессионное",
            "Функциональное"
    })
    @Owner("valendr1")
    @DisplayName("Проверка наличия услуги в QA департаменте")
    void checkServicesQAAtPage(String servicesQA) {
        //Предусловия
        mediaSoftPage.openPage();
        //Шаги
        mediaSoftPage.clickOurServicesAtHeader()
                .clickQADepartments();
        //Ожидаемый результат
        mediaSoftPage.checkServicesOfQADepartments(servicesQA);
    }

    @ParameterizedTest(name = "Проверка наличия услуги {0} во вкладке BACKEND департамента")
    @ValueSource(strings = {
            "Интеграция со сторонними сервисами, решениями",
            "Рефакторинг",
            "Работа с СУБД SQL/NoSQL"
    })
    @Owner("valendr1")
    @DisplayName("Проверка наличия услуги в Backend департаменте")
    void checkServicesBackendAtPage(String servicesBackend) {
        //Предусловия
        mediaSoftPage.openPage();
        //Шаги
        mediaSoftPage.clickOurServicesAtHeader()
                .clickBackendDepartments();
        //Ожидаемый результат
        mediaSoftPage.clickBackendDepartments();
    }
}
