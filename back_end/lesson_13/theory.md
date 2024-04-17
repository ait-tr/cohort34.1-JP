Русский текст смотри ниже

** PathMatcher ** implementation for Ant-style path patterns.

Part of this mapping code has been kindly borrowed from Apache Ant.

The mapping matches URLs using the following rules:

- ? matches one character
- * matches zero or more characters
- ** matches zero or more directories in a path
- {spring:[a-z]+} matches the regexp [a-z]+ as a path variable named "spring"

** Examples **

- com/t?st.jsp — matches com/test.jsp but also com/tast.jsp or com/txst.jsp

- com/*.jsp — matches all .jsp files in the com directory

- com/**/test.jsp — matches all test.jsp files underneath the com path

- org/springframework/**/*.jsp — matches all .jsp files underneath the org/springframework path

- org/**/servlet/bla.jsp — matches org/springframework/servlet/bla.jsp but also org/springframework/testing/servlet/bla.jsp and org/servlet/bla.jsp

- com/{filename:\\w+}.jsp will match com/test.jsp and assign the value test to the filename variable

** Note** : a pattern and a path must both be absolute or must both be relative in order for the two to match. Therefore, it is recommended that users of this implementation to sanitize patterns in order to prefix them with "/" as it makes sense in the context in which they're used.

# Spring Data JPA #

Spring Data JPA provides repository support for the Jakarta Persistence API (JPA). It eases development of applications with a consistent programming model that need to access JPA data sources.



<br/><hr/><br/>

** PathMatcher ** реализация шаблонов путей в стиле Ant.

Часть этого кода сопоставления была любезно заимствована у Apache Ant.

Сопоставление сопоставляет URL-адреса с использованием следующих правил:

- ? соответствует одному символу
- * соответствует нулю или более символам
- ** соответствует нулю или более каталогам в пути
- {spring:[a-z]+} соответствует регулярному выражению [a-z]+ как переменная пути с именем "spring"

** Примеры **

- com/t?st.jsp — соответствует com/test.jsp, но также com/tast.jsp или com/txst.jsp

- com/*.jsp — соответствует всем файлам .jsp в каталоге com.

- com/**/test.jsp — соответствует всем файлам test.jsp, расположенным по пути com.

- org/springframework/**/*.jsp — соответствует всем файлам .jsp по пути org/springframework.

- org/**/servlet/bla.jsp — соответствует org/springframework/servlet/bla.jsp, а также org/springframework/testing/servlet/bla.jsp и org/servlet/bla.jsp

- com/{filename:\\w+}.jsp будет соответствовать com/test.jsp и назначит проверку значения переменной имени файла.

**Примечание**: для обеспечения соответствия шаблон и путь должны быть абсолютными или относительными. Поэтому пользователям этой реализации рекомендуется очистить шаблоны, чтобы добавлять к ним префикс «/», поскольку это имеет смысл в контексте, в котором они используются.

# Spring Data JPA #

Spring Data JPA обеспечивает поддержку репозитория для Jakarta Persistence API (JPA). Это упрощает разработку приложений с помощью согласованной модели программирования, которым необходим доступ к источникам данных JPA.

<br/>

<a href="https://docs.spring.io/spring-data/jpa/reference/" target="_blank">Spring Data JPA</a>