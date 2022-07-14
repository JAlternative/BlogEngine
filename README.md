# Blog Engine


### Краткое описание:

В данном проекте реализован блоговый движок, где у пользователя есть собственная страница, на которой он может добавлять новую информацию в свой блог. Пользователь может пройти регистрацию, процедуру восстановления пароля. Пока пользователь не зашёл на свою страницу, он может только просматривать посты, доступные на главной странице. Каждый авторизованный пользователь может комментировать посты, оставленные другими пользователями, ставить лайки и дизлайки, писать собственные посты, присваивая ему теги (но придётся подождать, пока их одобрит модератор), видеть статистику – свою и всего блога в целом и редактировать свой профиль. Главная страница – это список всех сообщений, отсортированный по 4 параметрам (новые, самые обсуждаемые, лучшие, старые).

****
![image](https://user-images.githubusercontent.com/93874462/178959550-99fbc967-4bc8-4cbb-b8df-cf0aaddba9c2.png)


### В проекте был использован следующий стек технологий:

- Spring Boot JPA - механизм для взаимодействия с сущностями базы данных.
- Spring Boot Web - для создания web-приложения
- Spring Security - механизмы аутентификации и авторизации и обеспечения безопасности.
- Spring Boot Mail - для работы с электронной почтой
- Lombok - проект по добавлению дополнительной функциональности в Java c помощью изменения исходного кода перед Java компиляцией.
- Mysql - база данных
- Flywaydb - система управления версиями базы данных.
- Cage — генератор captcha кода.