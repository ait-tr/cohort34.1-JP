### DTO

DTO, или Data Transfer Object, это паттерн проектирования, который используется в программировании для передачи данных
между подсистемами приложения. В контексте Java, DTO часто используются для упаковки и передачи данных между различными
слоями приложения, например, между слоем данных и слоем представления.

Основные цели использования DTO в Java:

1. **Сокращение числа вызовов методов**: Если данные группируются в DTO, то можно передать множество данных одним
   вызовом метода, вместо того чтобы делать множество вызовов для каждого элемента данных отдельно.

2. **Разграничение логики**: DTO позволяют отделить модель данных, используемую в бизнес-логике, от модели, используемой
   для отображения или передачи данных. Это обеспечивает большую гибкость при изменении логики обработки данных, не
   затрагивая другие части приложения.

3. **Инкапсуляция данных**: DTO инкапсулируют данные и, таким образом, скрывают сложность структуры данных, используемых
   в приложении. Это упрощает взаимодействие между различными слоями или компонентами приложения.

4. **Сетевая оптимизация**: В распределенных приложениях, где компоненты могут взаимодействовать через сеть,
   использование DTO помогает уменьшить количество сетевого трафика за счет сокращения числа передаваемых вызовов и
   данных.

Пример DTO в Java:

```java
public class UserDTO {
    private String name;
    private String email;

    // Конструкторы, геттеры и сеттеры
    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
```

В этом примере `UserDTO` используется для передачи данных о пользователе. Он может быть использован для передачи данных
между слоями без необходимости использования сущности пользователя, связанной с базой данных, что помогает избежать
ненужной зависимости между слоями и упрощает код.