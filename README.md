   H2 console, Spring Boot, Spring Data JPA.

   Дістати всіх Users, в яких age більше за якесь значення
    Get
   /api/users/get/{age}
   
   
   Дістати всіх Users з Articles, в яких color якесь певне значення з enum-а
   Get
   /api/users/getByArticleColor/{color}
   
   Дістати унікальні name з Users, в яких більше ніж 3 Articles
   Get
   /api/users/get
   
   Зберегти User
   Post
   /api/user/add   
   JSON -> { "name": " Tramp ", "age": " 77 " }
   
   Зберегти Article
   Post
   /api/article/add
    JSON -> { "text": "abrakadabra","color": "red", "userId": "7" }
    
    /api/token
    Post
    Generates the JWT token 
    JSON -> { "username": "name", "id": 123}
    