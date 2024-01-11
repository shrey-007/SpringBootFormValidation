There are two kinds of form validation-:
1-server side=done by java
2-client side=done using js.

Questions-:
1) what is the use of th:object="${User}" in form tag?
2) what is the use of th:value="${User.userName}" in input tag?
3) what is the use of th:classappend="${#fields.hasErrors('userName')}?'is-invalid':''" in input tag?
4) what is the use of th:each="e : ${#fields.errors('userName')}" in div tag?
5) what is the use of th:text="${e}" in div tag?


Answers-:


