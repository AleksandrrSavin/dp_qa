# Отчет по итогам тестирования

### Описание
Произведено автоматизированное тестирование сервиса приобретения туров с банковской карты и оформление тура в кредит с использованием банковской карты с подключением MySQL и PostgreSQL.
Написаны UI тесты для Selenium, а так же тесты для проверки записи данных в БД.
Интегрирован Allure для вывода детализированных отчетов.

Написаны 72 теста:
- 18 тестов провалены (25%)
- 54 теста успешно пройдены (75%)

### Обнаруженные баги
По результатам автотестов составлено 9 баг-репортов.

1. В поле "Месяц" возможно указать значение "00", оплата проходит успешно.
2. Отсутствуют ограничения на ввод данных пользователя.
3. Ошибки записи в БД.

### Отчет Allure c подключенным MySQL
Overview Report

![Overview report mySQL](https://cloud.mail.ru/public/ujg4/M8cbxpUb1)

Suite CreditTest Report  
![Suites Credit report MySQL](https://cloud.mail.ru/public/fnxW/yBgYFXANw)
![Suites Credit report MySQL](https://cloud.mail.ru/public/1CSH/bHa7QMHt3)

Suite PaymentTest Report
![Suites Payment report mySQL](https://cloud.mail.ru/public/VFcz/macuX3gRE)
![Suites Payment report mySQL](https://cloud.mail.ru/public/cLHT/n1rXqD5wZ)

### Отчет Allure c подключенным PostgreSQL
Overview Report
![Overview report PostgreSQL](https://cloud.mail.ru/public/KbED/7STRTFKhy)

Suite CreditTest Report
![Suites Credit report PostgreSQL](https://cloud.mail.ru/public/BoJz/SjbGRCXo6)
![Suites Credit report PostgreSQL](https://cloud.mail.ru/public/SVZo/KWZNopdJZ)

Suite PaymentTest Report
![Suites Payment report PostgreSQL](https://cloud.mail.ru/public/pbLG/U6NAYJ7sa)
![Suites Payment report PostgreSQL](https://cloud.mail.ru/public/pbLG/U6NAYJ7sa)