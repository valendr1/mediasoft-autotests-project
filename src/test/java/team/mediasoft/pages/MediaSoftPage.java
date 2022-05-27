package team.mediasoft.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MediaSoftPage {

    String baseUrl = "https://mediasoft.team";
    //locators
    ElementsCollection header = $$("ul li");
    ElementsCollection listOfDepartments = $$("ul.ability__list li");
    SelenideElement vacancy = $("#welcome");
    SelenideElement svyaznoiTravelProject = $("#svyaznoytravel");
    SelenideElement listOfContacts = $(".footer__address");

    //actions
    public void openPage() {
        open(baseUrl);
    }

    public MediaSoftPage clickVacancyAtHeader(String vacancy) {
        header.findBy(text(vacancy)).$("a").click();
        return this;
    }

    public MediaSoftPage checkAvailableVacancy(String availableVacancy){
        vacancy.shouldHave(text(availableVacancy)).shouldBe(visible);
        return this;
    }

    public MediaSoftPage clickProjectAtHeader(String projects){
        header.findBy(text(projects)).$("a").click();
        return this;
    }

    public MediaSoftPage chooseSvyaznoiTravelProject(String employees){
        svyaznoiTravelProject.click();
        svyaznoiTravelProject.shouldHave(text(employees)).shouldBe(visible);
        return this;
    }

    public MediaSoftPage verificationQAAtProject(String employees){
        svyaznoiTravelProject.shouldHave(text(employees)).shouldBe(visible);
        return this;
    }

    public MediaSoftPage clickContactAtHeader(String contactsAtHeader){
        header.findBy(text(contactsAtHeader)).$("a").click();
        return this;
    }

    public MediaSoftPage checkCityAtContacts(String city){
        listOfContacts.shouldHave(text(city)).shouldBe(visible).click();
        return this;
    }

    public MediaSoftPage clickOurServicesAtHeader(){
        header.first().$("a").click();
        return this;
    }

    public MediaSoftPage clickQADepartments(){
        listOfDepartments.findBy(text("QA")).shouldBe(visible).click();
        return this;
    }

    public MediaSoftPage checkServicesOfQADepartments(String servicesQA){
        listOfDepartments.findBy(text("QA")).shouldBe(visible)
                .$(".ability__service")
                .shouldHave(text(servicesQA));
        return this;
    }

    public MediaSoftPage clickBackendDepartments(){
        listOfDepartments.first().shouldBe(visible).click();
        return this;
    }

    public MediaSoftPage checkServicesOfBackendDepartments(String servicesBackend){
        listOfDepartments.first().shouldBe(visible)
                .$(".ability__service")
                .shouldHave(text(servicesBackend));
        return this;
    }
}
