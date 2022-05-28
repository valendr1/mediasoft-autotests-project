package team.mediasoft.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import team.mediasoft.pages.MediaSoftPage;

import static io.qameta.allure.Allure.step;

@Tag("mainTests")
public class WebTests extends TestBase {

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

        //Шаги
        step("Кликаем на линк" + vacancyAtHeaderName + "в хэдере", () -> {
            mediaSoftPage.clickVacancyAtHeader(vacancyAtHeaderName);
        });
        //Ожидаемый результат
        step("Проверяем наличие вакансии " + vacancy, () -> {
            mediaSoftPage.checkAvailableVacancy(vacancy);
        });
    }

    @Test
    @Owner("valendr1")
    @DisplayName("Проверка участия QA в проекте СВЯЗНОЙ ТРЭВЭЛ")
    void checkProjectAtPage() {
        //Шаги
        step("Кликаем на линк " + projects + " в хэдере", () -> {
            mediaSoftPage.clickProjectAtHeader(projects);
        });

        step("Выбираем проект СВЯЗНОЙ ТРЭВЭЛ", () -> {
            mediaSoftPage.chooseSvyaznoiTravelProject(employees);
        });

        //Ожидаемый результат
        step("Проверка пристуствия " + employees + " в проекте", () -> {
            mediaSoftPage.verificationQAAtProject(employees);
        });
    }

    @Test
    @Owner("valendr1")
    @DisplayName("Проверка наличия офиса в городе")
    @Disabled
    void checkCityAtPage() {
        //Шаги
        step("Кликаем на линк "+ contactsAtHeader + " в хэдере", () -> {
            mediaSoftPage.clickContactAtHeader(contactsAtHeader);
        });
        // Ожидаемый результат
        step("Проверяем наличие города " + city + " в списке", () -> {
            mediaSoftPage.checkCityAtContacts(city);
        });

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
        //Шаги
        step("Кликаем на линк Наши услуги в хэдере", () -> {
            mediaSoftPage.clickOurServicesAtHeader();
        });
        step("Открываем вкладку отдела QA", () -> {
            mediaSoftPage.clickQADepartments();
        });
        //Ожидаемый результат
        step("Проверяем наличие услуги " + servicesQA + " в списке", () -> {
            mediaSoftPage.checkServicesOfQADepartments(servicesQA);
        });

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
        //Шаги
        step("Кликаем на линк Наши услуги в хэдере", () -> {
            mediaSoftPage.clickOurServicesAtHeader();
        });
        step("Открываем вкладку отдела Backend", () -> {
            mediaSoftPage.clickBackendDepartments();
        });
        //Ожидаемый результат
        step("Проверяем наличие услуги " + servicesBackend + " в списке", () -> {
            mediaSoftPage.checkServicesOfBackendDepartments(servicesBackend);
        });
    }
}
