## Запуск проекта по тестированию сервиса для покупки туров
### Предустановленное окружение
- IntelliJ IDEA
- Docker Desktop


## Запуск проекта
1. Клонировать [проект](https://github.com/AleksandrrSavin/dp_qa) в свой репозиторий.
2. Открыть в IntelliJ IDEA.
3. В терминале IDEA выполнить ```docker-compose up```.

(Предварительно запустить приложение Docker Desktop)

## Для подключения mySQL к SUT:

4. Открыть новый терминал.
5. Выполнить команду ```java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/mysql" -jar aqa-shop.jar```.
6. Дождаться успешного запуска SUT. В терминале будет выведено сообщение ```Started ShopApplication in "timetostart" seconds (JVM running for "timetostart")```.
7. Открыть новый терминал.
8. Выполнить команду ```./gradlew clean test -DdbUrl=jdbc:mysql://localhost:3306/mysql```.
9. После завершения тестов выполнить команду ```.\gradlew allureServe```.
10. После выгрузки данных отчета Allure, завершить его работу комбинацией клавиш ```CTRL + C```.
11. Подтвердить завершение выполнения пакетного файла командой ```y```, затем ```ENTER```.
12. Завершить работу Docker командой ```docker-compose down```

## Для подключения PostgreSQL к SUT:

4. Открыть новый терминал.
5. Выполнить команду ```java "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/postgres" -jar aqa-shop.jar```.
6. Дождаться успешного запуска SUT. В терминале будет выведено сообщение ```Started ShopApplication in "timetostart" seconds (JVM running for "timetostart")```.
7. Открыть новый терминал.
8. Выполнить команду ```./gradlew clean test -DdbUrl=jdbc:postgresql://localhost:5432/postgres```.
9. После завершения тестов выполнить команду ```.\gradlew allureServe```.
10. После выгрузки данных отчета Allure, завершить его работу комбинацией клавиш ```CTRL + C```.
11. Подтвердить завершение выполнения пакетного файла командой ```y```, затем ```ENTER```.
12. Завершить работу Docker командой ```docker-compose down```

