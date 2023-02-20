# 啟動H2資料庫
http://localhost:8080/h2-console
去console找資料庫的url，ex. 'jdbc:h2:mem:f8f0e14e-55a1-4a51-8992-c9cb18a94684'後貼在JDBC URL 的欄位。

# Entity Manager 介紹
"Entity Manager" 是一個負責管理、操作資料實體的物件。
它可以提供一系列的方法，讓程式設計師可以透過這些方法來存取、新增、刪除、更新資料實體。
通常，Entity Manager 可以用來封裝對資料庫的操作，使程式設計師不需要直接使用 SQL 語句來操作資料庫，減少了代碼複雜度，提高了程式開發的效率。
在常見的 ORM（Object-Relational Mapping）框架中，Entity Manager 通常也被稱為資料庫上下文（Database Context）。
ORM 框架可以透過 Entity Manager 將資料庫中的資料映射到物件上，並且提供一系列的方法讓開發人員對這些物件進行操作。

# @PersistenceContext 跟 @Autowired 的差別
@Autowired 主要用來進行 bean 的注入，而 @PersistenceContext 主要用來進行 EntityManager 的注入，EntityManager 是用來管理 JPA 實體的，可以對實體進行 CRUD 操作。
它們的作用對象不同，但是都是依賴注入的方式。