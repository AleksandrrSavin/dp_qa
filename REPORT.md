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

![Overview report mySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/89963f2e-49af-4460-9d3d-32fce07f80da)


Suite CreditTest Report  
![Suites Credit report MySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/d4b6ac18-a855-4926-94c0-381ea58ac57d)

![Suites Credit report MySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/317f6dd0-00b6-4db2-9554-087d5fc075a2)


Suite PaymentTest Report
![Suites Payment report mySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/68643572-dd6e-4705-b3e7-9f4957dd8810)

![Suites Payment report mySQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/3d02a830-4fe8-448d-9d43-c016b174de5f)


### Отчет Allure c подключенным PostgreSQL
Overview Report
![Overview report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/9e7ff787-ffe4-4a7a-9f08-a73a86aa745d)


Suite CreditTest Report
![Suites Credit report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/5c06d72a-49d4-428d-ab76-c39b053ebd7d)

![Suites Credit report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/1d7790b0-e87d-4f12-a3a2-0376bf96dd61)


Suite PaymentTest Report
![Suites Payment report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/8817c531-9065-4fa6-b418-7dbc7acaf8f3)

![Suites Payment report PostgreSQL](https://github.com/AleksandrrSavin/dp_qa/assets/122450661/f40ee63d-0c14-49a7-95f4-e3dd1d092f3f)

### Общие выводы:
1. Автоматизация сократила время проходов по тестам в 4 раза. Выполнение автотестов занимает 12-15 минут. Выполнение ручных тестов заняло бы ориентировочно 1 час.
2. Периодически возникали ложные дефекты связанные со сроком действия карты(генерация месяца и года отдельно друг от друга).
3. В последующем возможно потребуется доработка тестов.