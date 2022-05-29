# Автоматизированное тестирование сайта MediaSoft
## <a target="_blank" href="https://mediasoft.team">Главная страница MediaSoft</a>

## :floppy_disk: Содержание:

- <a href="#computer-технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#notebook_with_decorative_cover-реализованные-проверки">Реализованные проверки</a>
- <a href="#electric_plug-сборка-в-Jenkins">Сборка в Jenkins</a>
- <a href="#arrow_forward-запуск-из-терминала">Запуск из терминала</a>
- <a href="#open_book-allure-отчет">Allure отчет</a>
- <a href="#hammer-allure-test-ops-отчет">Allure Test Ops отчет</a>
- <a href="#wrench-интеграция-с-jira">Интеграция с Jira</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-примеры-прохождения-тестов">Видео примеры прохождения тестов</a>

## :computer: Технологии и инструменты
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :notebook_with_decorative_cover: Реализованные проверки
- Проверка наличия вакансии QA в разделе "Вакансии"
- Проверка участия QA в проекте СВЯЗНОЙ ТРЭВЭЛ
- Проверка наличия услуг во вкладке QA департамента
- Проверка наличия услуг во вкладке BACKEND департамента

В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.

> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
> 
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
> 
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> <code>Jenkins</code> выполняет запуск тестов.
> 
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Главная страница сборки [Jenkins](https://jenkins.autotests.cloud/job/012-bublikxoxo-mediasoft-autotests/)
<p align="center">
<img title="Jenkins Dashboard" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/screens/jenkins.png">
</p>  

## :arrow_forward: Запуск из терминала
Локальный запуск:
```
gradle clean mainTests
```

Удаленный запуск:
```
clean
mainTests
"-DchooseBrowser=${BROWSER}"
"-DsetBrowserSize=${BROWSERSIZE}"
```

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/012-bublikxoxo-mediasoft-autotests/allure/)
- ### Главный экран отчета
<p align="center">
<img title="Allure Overview Dashboard" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/screens/allure_overview.png">
</p>

- ### Страница с проведенными тестами
<p align="center">
<img title="Allure Test Page" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/screens/allure_behaviors.png">
</p>

## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/13127/)
<p align="center">
<img title="Allure Test Ops Launch" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/screens/allure_testops.png">
</p>

## :wrench: Интеграция с Jira
<p align="center">
<img title="Jira Issue Dashboard" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/screens/jira.png">
</p>

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота
<p align="center">
<img title="Telegram notification message" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/screens/tg1.png">
</p>

<p align="center">
<img title="Telegram notification message" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/screens/tg2.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid
> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="https://github.com/valendr1/mediasoft-autotests-project/blob/infrastructure/images/gif/gif_example.gif">
</p>
