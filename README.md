<h1 align="center">Почта. Слияние пользователей.👋</h1>

## Технологии и инструменты:
<p align="center">
<img src="https://www.vectorlogo.zone/logos/java/java-ar21.svg" alt="Java" width="120" height="60"/>
<img src="pic/id.png" alt="intellij" height="50"/>
<img src="https://www.vectorlogo.zone/logos/github/github-ar21.svg" alt="github" height="60"/>
<img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg" alt="Maven" height="40"/>
</p>

## Требуется:
* написать работающий код, решающий задачу.
* приложить инструкцию, как код собрать и запустить.
* написать **unittest-ы.**


Задачу реализовать на **Java** (достаточно как консольное **JAVA** приложение).
Код выложить на любой репозиторий (**GitHub, GitLab, Butbucket**)

Имеется **n** пользователей, каждому из них соответствует список **email-ов** (всего у всех пользователей **m email-ов**).

Например:
* `user1 ->xxx@ya.ru,foo@gmail.com,lol@mail.ru`
* `user2 ->foo@gmail.com,ups@pisem.net`
* `user3 ->xyz@pisem.net,vasya@pupkin.com`
* `user4 ->ups@pisem.net,aaa@bbb.ru`
* `user5 ->xyz@pisem.net`

Считается, что если у двух пользователей есть общий **email**, значит это один и тот же пользователь. 

Требуется построить и реализовать алгоритм, выполняющий слияние пользователей. На выходе должен быть список пользователей с их **email-ами** (такой же как на входе).

В качестве имени объединенного пользователя можно брать любое из исходных имен. Список **email-ов** пользователя должен содержать только уникальные **email-ы.**

Параметры **n** и **m** произвольные, длина конкретного списка **email-ов** никак не ограничена.
Требуется, чтобы асимптотическое время (вычисли́тельная сло́жность) работы полученного решения было линейным, или близким к линейному.

Возможный ответ на задачу в указанном примере:
* `user1 ->xxx@ya.ru,foo@gmail.com,lol@mail.ru,ups@pisem.net,aaa@bbb.ru`
* `user3 ->xyz@pisem.net,vasya@pupkin.com`

## Методические материалы:

![Pic](pic/mailpic.png)

---

![Pic](pic/mergeUsers.png)

## Код
![Pic](pic/merge.png)

## Лицензия
	
[MIT. Free Software!](https://github.com/ViktorJava/job4j/tree/master/LICENSE)

---

>e-mail:[gmail.com](mailto:gipsyscrew@gmail.com) &nbsp;&middot;&nbsp;
>fb:[Facebook.com](https://www.facebook.com/viktor.vdovichenko) &nbsp;&middot;&nbsp;
> GitHub:[@ViktorJava](https://github.com/ViktorJava) &nbsp;&middot;&nbsp;
> OK:[Odnoklassniki](https://ok.ru/profile/571539586668)

