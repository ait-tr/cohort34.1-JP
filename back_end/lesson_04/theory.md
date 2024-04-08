Русский текст смотри ниже


# REST

**REST** (representational state transfer) is a software architectural style that was created to guide the design and development of the architecture for the World Wide Web. REST defines a set of constraints for how the architecture of a distributed, Internet-scale hypermedia system, such as the Web, should behave. The REST architectural style emphasizes uniform interfaces, independent deployment of components, the scalability of interactions between them, and creating a layered architecture to promote caching to reduce user-perceived latency, enforce security, and encapsulate legacy systems.

REST has been employed throughout the software industry to create stateless, reliable web-based applications. An application that adheres to the REST architectural constraints may be informally described as RESTful. However, this term is more commonly associated with the design of HTTP-based APIs and what are widely considered best practices regarding the "verbs" (HTTP methods) a resource responds to while having little to do with REST as originally formulated—and is often even at odds with the concept.

## The formal REST constraints are as follows:

- Client/Server - Clients are separated from servers by a well-defined interface

- Stateless - A specific client does not consume server storage when it is "at rest"

- Cache - Responses indicate their cacheability

- Uniform Interface

- Layered System - A client cannot ordinarily tell whether it is connected directly to the end server, or to an intermediary along the way

- Code on Demand (optional) - Servers can temporarily extend or customize the functionality of a client by transferring logic to the client that can be executed within a standard virtual machine

# Dependency injection

In software engineering, dependency injection is a programming technique in which an object or function receives other objects or functions that it requires, as opposed to creating them internally. Dependency injection aims to separate the concerns of constructing objects and using them, leading to loosely coupled programs. The pattern ensures that an object or function which wants to use a given service should not have to know how to construct those services. Instead, the receiving 'client' (object or function) is provided with its dependencies by external code (an 'injector'), which it is not aware of. Dependency injection makes implicit dependencies explicit and helps solve the following problems:

- How can a class be independent from the creation of the objects it depends on?

- How can an application, and the objects it uses support different configurations?

Dependency injection is often used to keep code in-line with the dependency inversion principle.

In statically-typed languages using dependency injection means a client only needs to declare the interfaces of the services it uses, rather than their concrete implementations, making it easier to change which services are used at runtime without recompiling.

Application frameworks often combine dependency injection with inversion of control. Under inversion of control, the framework first constructs an object (such as a controller), then passes control flow to it. With dependency injection, the framework also instantiates the dependencies declared by the application object (often in the constructor method's parameters), and passes the dependencies into the object.[8]

Dependency injection implements the idea of "inverting control over the implementations of dependencies", which is why certain Java frameworks generically name the concept "inversion of control" (not to be confused with inversion of control flow).


# Inversion of control

In software engineering, inversion of control (IoC) is a design pattern in which custom-written portions of a computer program receive the flow of control from a generic framework. The term "inversion" is historical: a software architecture with this design "inverts" control as compared to procedural programming. In procedural programming, a program's custom code calls reusable libraries to take care of generic tasks, but with inversion of control, it is the framework that calls the custom code.

Inversion of control has been widely used by application development frameworks since the rise of GUI environments and continues to be used both in GUI environments and in web server application frameworks. Inversion of control makes the framework extensible by the methods defined by the application programmer.

Event-driven programming is often implemented using IoC so that the custom code need only be concerned with the handling of events, while the event loop and dispatch of events/messages is handled by the framework or the runtime environment. In web server application frameworks, dispatch is usually called routing, and handlers may be called endpoints.

The phrase "inversion of control" has separately also come to be used in the community of Java programmers to refer specifically to the patterns of injecting objects' dependencies that occur with "IoC containers" in Java frameworks such as the Spring framework. In this different sense, "inversion of control" refers to granting the framework control over the implementations of dependencies that are used by application objects[5] rather than to the original meaning of granting the framework control flow (control over the time of execution of application code e.g. callbacks).


<br/><hr/><br/>


# REST

**REST** (от англ. REpresentational State Transfer — «передача репрезентативного состояния» или «передача „самоописываемого“ состояния») — архитектурный стиль взаимодействия компонентов распределённого приложения в сети. Другими словами, REST — это набор правил того, как программисту организовать написание кода серверного приложения, чтобы все системы легко обменивались данными и приложение можно было масштабировать. REST представляет собой согласованный набор ограничений, учитываемых при проектировании распределённой гипермедиа-системы. В определённых случаях (интернет-магазины, поисковые системы; прочие системы, основанные на данных) это приводит к повышению производительности и упрощению архитектуры. В широком смысле[уточнить] компоненты в REST взаимодействуют наподобие взаимодействия клиентов и серверов во Всемирной паутине.

## Формальные ограничения REST следующие:

- Клиент/Сервер. Клиенты отделены от серверов четко определенным интерфейсом.

- Без сохранения состояния — конкретный клиент не использует хранилище сервера, когда он «находится в состоянии покоя».

- Кэш - В ответах указывается их возможность кэширования.

- Единый интерфейс

- Многоуровневая система. Клиент обычно не может определить, подключен ли он напрямую к конечному серверу или к посреднику на этом пути.

- Код по требованию (необязательно). Серверы могут временно расширять или настраивать функциональность клиента, передавая клиенту логику, которая может выполняться на стандартной виртуальной машине.

# Внедрение зависимости

**Внедрение зависимости** (англ. Dependency injection, DI) — процесс предоставления внешней зависимости программному компоненту. Является специфичной формой «инверсии управления» (англ. Inversion of control, IoC), когда она применяется к управлению зависимостями. В полном соответствии с принципом единственной ответственности объект отдаёт заботу о построении требуемых ему зависимостей внешнему, специально предназначенному для этого общему механизму.

# Инверсия управления

**Инверсия управления** (англ. Inversion of Control, IoC) — общий принцип программирования, особенно важный в рамках объектно-ориентированной парадигмы, используемый для уменьшения зацепления (связанности) в компьютерных программах[1]. Также архитектурное решение интеграции, упрощающее расширение возможностей системы, при котором поток управления программы контролируется фреймворком.

В обычной программе программист сам решает, в какой последовательности делать вызовы процедур. Но если используется фреймворк, программист может разместить свой код в определенных точках выполнения (используя callback или другие механизмы), затем запустить «главную функцию» фреймворка, которая обеспечит все выполнение и вызовет код программиста тогда, когда это будет необходимо. Как следствие, происходит утеря контроля над выполнением кода — это и называется инверсией управления (фреймворк управляет кодом программиста, а не программист управляет фреймворком).

Инверсия управления бывает не только во фреймворках, но и в некоторых библиотеках (но обычно библиотеки не создают инверсии управления — они предоставляют набор функций, которые должен вызывать программист).

Другим примером инверсии контроля можно считать облегчённые версии системных драйверов, так называемые фильтрующие драйверы. В этом случае основной поток управления реализуется ядром ОС и обычным «тяжёлым» драйвером, а конкретная функциональность реализуется за счёт функций обратного вызова (callback), которые фильтр регистрирует при старте. Собственно, такой же принцип работает и в случае других фильтров, будь то фильтрация видеопотока или потоков веб-запросов к java-сервлетам.

<br/><br/>

