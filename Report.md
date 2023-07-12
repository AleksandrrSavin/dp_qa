# Отчет по итогам тестирования

### Описание
Произведено автоматизированное тестирование сервиса приобретения туров с банковской карты и оформление тура в кредит с использованием банковской карты с подключением MySQL и PostgreSQL.
Написаны UI тесты для Selenium, а так же тесты для проверки записи данных в БД.
Интегрирован Allure для вывода детализированных отчетов.

Написаны 72 теста:
- 18 тестов провалены (25%)
- 54 теста успешно пройдены (75%)

### Обнаруженные баги
По результатам автотестов составлено 8 баг-репортов.

1. В поле "Месяц" возможно указать значение "00", оплата проходит успешно.
2. Отсутствуют ограничения на ввод данных пользователя.
3. Ошибки записи в БД.

### Отчет Allure c подключенным MySQL
Overview Report

![Overview report mySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/3860dce1-62be-4579-b1ea-a8388e5859ef)


Suite CreditTest Report  
![Suites Credit report MySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/319cf7ad-f5ad-42db-91d5-a1a7ca8ce91a)

![Suites Credit report MySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/a22b9d25-51cd-46ad-9921-502bccc76d7b)


Suite PaymentTest Report
![Suites Payment report mySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/1a84ed39-06fa-401e-837e-5d9dc51f0d6f)

![Suites Payment report mySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/4d09cc39-25b8-45c4-b955-2715632c2a65)


### Отчет Allure c подключенным PostgreSQL
Overview Report
![Overview report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/a6ec516c-b5bf-4116-9065-0f301a833c21)


Suite CreditTest Report
![Suites Credit report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/4c9b6afb-4d6a-4cba-96d5-810decd9b806)

![Suites Credit report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/0175c88d-d2d8-4aae-a282-7c4eab1a29ee)


Suite PaymentTest Report
![Suites Payment report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/ee42a699-f63d-4ea3-898f-b6763f4e9605)

![Suites Payment report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/c096941f-1a96-45d2-844b-ca37e3442ff1)

### Общие выводы:
1. Автоматизация сократила время проходов по тестам в 4 раза. Выполнение автотестов занимает 12-15 минут. Выполнение ручных тестов заняло бы ориентировочно 1 час.
2. Периодически возникали ложные дефекты связанные со сроком действия карты(генерация месяца и года отдельно друг от друга).
3. В последующем возможно потребуется доработка тестов.