Русский текст смотри ниже

# Transactionality #

To ensure that the operations performed in a method are transactional, Spring Data JPA recommends using the @transactional annotation

# JPQL #

To access the database, JPA provides JPQL (Java Persistence Query Language) - a SQL-like, object-oriented query language.

# Inheritance #

JPA describes three Inheritance Mapping Strategies, that is, how JPA will work with Entity descendant classes:

- one table for the entire inheritance hierarchy (a single table per class hierarchy) - all entities, with all descendants, are recorded in one table; to identify the entity type, a special column “discriminator column” is defined. For example, if there is an entity Animals with descendant classes Cats and Dogs, with this strategy all entities are written to the Animals table, but at the same time they have an additional animalType column in which the value “cat” or “dog” is written accordingly. The downside is that in the general table, all fields will be created unique for each of the descendant classes, which will be empty for all other descendant classes. For example, in the animals table there will be the speed of tree climbing from cats and whether a dog can bring slippers from dogs, which will always have null for dog and cat, respectively.

- joining strategy (joined subclass strategy) - in this strategy, each enity class saves data in its own table, but only unique columns (not inherited from ancestor classes) and the primary key, and all inherited columns are written to the tables of the ancestor class, additionally set relationships between these tables, for example, in the case of the Animals classes (see above), there will be three tables animals, cats, dogs, and in cats only the key and climbing speed will be recorded, in dogs - the key and whether the dog can fetch a stick, and in animals all other data of cats and dogs with a link to the corresponding tables. The downside here is the performance loss from joining tables for any operations.

- one table for each class (table per concrete class strategy) - everything is simple here: each individual descendant class has its own table, i.e. for cats and dogs (see above), all data will simply be written to the cats and dogs tables as if they did not have a common superclass at all. The downside is poor support for polymorphic relationships and the fact that selecting all classes of the hierarchy will require a large number of separate SQL queries or the use of a UNION query.

To set the inheritance strategy, use the Inheritance annotation (or corresponding blocks)
@Inheritance(strategy=JOINED)
( TABLE_PER_CLASS, JOINED,SINGLE_TABLE)


<br/><hr/><br/>

# Транзакционность #

Для обеспечения транзакционности выполняемых в методе операций, Spring Data JPA рекомендует использовать аннотацию @transactional

# JPQL #

Для обращения к БД, JPA предоставляет JPQL (Java Persistence Query Language) - SQL-подобный, объектно-ориентированный язык запросов.

# Наследование #

В JPA описаны три стратегии наследования мапинга (Inheritance Mapping Strategies), то есть как JPA будет работать с классами-наследниками Entity:

- одна таблица на всю иерархию наследования (a single table per class hierarchy) — все enity, со всеми наследниками записываются в одну таблицу, для идентификации типа entity определяется специальная колонка “discriminator column”. Например, если есть entity Animals c классами-потомками Cats и Dogs, при такой стратегии все entity записываются в таблицу Animals, но при это имеют дополнительную колонку animalType в которую соответственно пишется значение «cat» или «dog». Минусом является то что в общей таблице, будут созданы все поля уникальные для каждого из классов-потомков, которые будет пусты для всех других классов-потомков. Например, в таблице animals окажется и скорость лазанья по дереву от cats и может ли пес приносить тапки от dogs, которые будут всегда иметь null для dog и cat соотвественно.

- объединяющая стратегия (joined subclass strategy) — в этой стратегии каждый класс enity сохраняет данные в свою таблицу, но только уникальные колонки (не унаследованные от классов-предков) и первичный ключ, а все унаследованные колонки записываются в таблицы класса-предка, дополнительно устанавливается связь (relationships) между этими таблицами, например в случае классов Animals (см.выше), будут три таблицы animals, cats, dogs, причем в cats будет записана только ключ и скорость лазанья, в dogs — ключ и умеет ли пес приносить палку, а в animals все остальные данные cats и dogs c ссылкой на соответствующие таблицы. Минусом тут являются потери производительности от объединения таблиц (join) для любых операций.

- одна таблица для каждого класса (table per concrete class strategy) — тут все просто каждый отдельный класс-наследник имеет свою таблицу, т.е. для cats и dogs (см.выше) все данные будут записываться просто в таблицы cats и dogs как если бы они вообще не имели общего суперкласса. Минусом является плохая поддержка полиморфизма (polymorphic relationships) и то что для выборки всех классов иерархии потребуются большое количество отдельных sql запросов или использование UNION запроса.

Для задания стратегии наследования используется аннотация Inheritance (или соответствующие блоки)
@Inheritance(strategy=JOINED)
( TABLE_PER_CLASS, JOINED ,SINGLE_TABLE)


<br/>

<a href="https://docs.spring.io/spring-data/jpa/reference/" target="_blank">Spring Data JPA</a>