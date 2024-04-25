Русский текст смотри ниже

# One-To-Many and Many-To-Many association #

- To implement One-To-Many and Many-To-Many relationships in JPA, the @OneToMany, @ManyToOne and @ManyToMany annotations are provided.

- In the case of unidirectional association, it is enough to put annotations above the corresponding fields of the child entity.

- In the case of bidirectional association, it is necessary to put the @ManyToMany or @OneToMany annotations over the corresponding fields with the mappedBy attribute equal to the name of the field of the child entity.


<br/><hr/><br/>

# Отношение One-To-Many и Many-To-Many #

- Для реализации отношений One-To-Many и Many-To-Many в JPA предусмотреный аннотации @OneToMany, @ManyToOne и @ManyToMany. 

- В случае unidirectional association достаточно поставить аннотации над соответствующими полями дочерней сущности.

- В случае bidirectional association, надо над соответствующими полями поставить аннотации @ManyToMany или @OneToMany с аттрибутом mappedBy равным имени поля дочерней сущности.


<br/>

<a href="https://docs.spring.io/spring-data/jpa/reference/" target="_blank">Spring Data JPA</a>