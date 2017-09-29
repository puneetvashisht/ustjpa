Hibernate Story

1. Why JDBC  - common set of functions to interact with DB
2. Why Hibernate - JDBC is not suffient for achieving DB independence
	a. SQL syntax for DB is different
	b. Object Impedence mismatch: Inheritance, Composition 
3. EntityManagerFactory: represents one database
4. EntityManager: represents a physical connection to DB
5. CRUD Methods: persist, find, call setters, remove
6. Named query: A query written on entity(not on tables), it has a logical name
7. Mappings @OneToOne, @OneToMany, @ManyToOne
8. Lazy Fetching of records
9. Inheritance in Objects and then in DB