Русский текст смотри ниже

# One-To-Many and Many-To-Many association #

- To implement One-To-Many and Many-To-Many relationships in JPA, the @OneToMany, @ManyToOne and @ManyToMany annotations are provided.

- In the case of unidirectional association, it is enough to put annotations above the corresponding fields of the child entity.

- In the case of bidirectional association, it is necessary to put the @ManyToMany or @OneToMany annotations over the corresponding fields with the mappedBy attribute equal to the name of the field of the child entity.

# JPA. Life cycle of an entity #

An Entity object has four lifecycle states: new, managed, detached, or removed. Their description:

1. new - the object has been created, but does not yet have generated primary keys and has not yet been saved in the database

2. managed - the object has been created, is managed by JPA, has generated primary keys

3. detached - the object was created, but is not managed (or is no longer managed) by JPA

4. removed - the object was created, managed by JPA, but will be deleted after the commit transaction.


<br/><hr/><br/>

# Отношение One-To-Many и Many-To-Many #

- Для реализации отношений One-To-Many и Many-To-Many в JPA предусмотреный аннотации @OneToMany, @ManyToOne и @ManyToMany. 

- В случае unidirectional association достаточно поставить аннотации над соответствующими полями дочерней сущности.

- В случае bidirectional association, надо над соответствующими полями поставить аннотации @ManyToMany или @OneToMany с аттрибутом mappedBy равным имени поля дочерней сущности.

# JPA. Жизненный цикл сущности #

У Entity объекта существует четыре статуса жизненного цикла: new, managed, detached, или removed. Их описание:

1. new — объект создан, но при этом ещё не имеет сгенерированных первичных ключей и пока ещё не сохранен в базе данных

2. managed — объект создан, управляется JPA, имеет сгенерированные первичные ключи

3. detached — объект был создан, но не управляется (или больше не управляется) JPA

4. removed — объект создан, управляется JPA, но будет удален после commit'a транзакции.

<img src="https://github.com/ait-tr/cohort34.1-JP/blob/main/front_end/lesson_17/jpaentitystates.png?raw=true" alt="JPA Entity Manager"/>

<br/>

<a href="https://docs.spring.io/spring-data/jpa/reference/" target="_blank">Spring Data JPA</a>