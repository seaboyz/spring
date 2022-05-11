### This is the learning project for springboot.

#### Fist step: Restful API design
##### query parameters vs path parameters vs header parameters vs body parameters
![](/images/Screen%20Shot%202022-05-10%20at%2011.14.21%20AM.png)
##### Authentication:
##### 1. Create a new user account.
POST /register
will get a http status code: 201
##### 2. Login with the user account.
POST /login
will get a token back from the server.
<hr>

##### User
##### 1. Get the user information.
GET /users/{id}

##### 2. Update the user information.
PUT /users/{id}

##### 3. Get a orders by order id.
GET /orders/{id}

##### 4. Create a new order
POST /orders

##### 5. get all orders for a user
GET /orders/{userId}/orders
<hr>

##### Product
##### 1. Get all products.
GET /products

##### 2. Get a product by product id.
GET /products/{id}

##### 3. Create a new product
POST /products

##### 4. Update a product
PUT /products/{id}

##### 5. Delete a product
DELETE /products/{id}

##### 7. Get all categories
GET /categories

##### 8. Get all products by category
GET /products/category/jewelery

##### Cart
##### 1. Get all carts
GET /carts

##### 2. Get a cart by cart id.
GET /carts/{id}

##### 3. Create a new cart
POST /carts

##### 4. Add a product to cart
POST /carts/
https://fakestoreapi.com/docs#:~:text=fetch(%27https%3A//fakestoreapi.com/carts%27%2C%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20method,res%3D%3Eres.json())%0A%20%20%20%20%20%20%20%20%20%20%20%20.then(json%3D%3Econsole.log(json))

##### 5. Update a cart
PUT /carts/{id}

##### 6. Delete a cart
DELETE /carts/{id}

##### Order
##### 1. Get all orders
GET /orders

##### 2. Get a order by order id.
GET /orders/{id}

##### 3. Create a new order
POST /orders

##### 4. cancel an order
DELETE /orders/{id}

#### What is Spring?

##### Manage the singleton objects.

##### Manage the dependency injection.

##### Manage the lifecycle of the objects.

##### manage the relationship between the objects.

##### Srping container
![](/images/Screen%20Shot%202022-05-10%20at%206.38.40%20PM.png)

##### Factory bean
![](./images/Screen%20Shot%202022-05-10%20at%206.41.52%20PM.png)
Spring bean factory is a singleton object.
![](/images/Screen%20Shot%202022-05-10%20at%206.42.45%20PM.png)

##### Bean definition
* no spring 
![](/images/Screen%20Shot%202022-05-10%20at%206.48.46%20PM.png)
![](/images/Screen%20Shot%202022-05-10%20at%206.49.03%20PM.png)

#### java bean vs spring bean

* with spring
* #### context
  *  configuration file: spring.xml
![](/images/Screen%20Shot%202022-05-10%20at%207.29.11%20PM.png)
* #### properties
  **setter dependency injection**.
  * we inject `String type = "Equilateral"` into the bean Triangle.
  ![](images/Screen%20Shot%202022-05-11%20at%205.15.45%20AM.png)
  * under the hood, spring user setter of the bean Triangle to set the type.
  ![](images/Screen%20Shot%202022-05-11%20at%205.25.25%20AM.png)
  **constructor dependency injection**
  " we use constructor `String type ` dependency injection into the bean Triangle.
  ![](images/Screen%20Shot%202022-05-11%20at%205.33.44%20AM.png)
  ![](images/Screen%20Shot%202022-05-11%20at%205.33.31%20AM.png)
  **contitionaly run program by setting diffent denpencies in the configuration file**
  ![](/images/Screen%20Shot%202022-05-11%20at%205.46.14%20AM.png)
  ![](images/Screen%20Shot%202022-05-11%20at%205.46.31%20AM.png)


  * get bean using `context.getBean("beanName")`(preferably)
![](/images/Screen%20Shot%202022-05-10%20at%207.31.16%20PM.png)
  * get bean using `BeanFactory.getBean("beanName")`
![](images/Screen%20Shot%202022-05-11%20at%204.13.09%20AM.png)
![](images/Screen%20Shot%202022-05-10%20at%207.29.11%20PM.png)
![](images/Screen%20Shot%202022-05-10%20at%207.31.16%20PM.png)


















##### database
![](images/Screen%20Shot%202022-05-10%20at%203.28.04%20PM.png)



##### RESTful API(Spring MVC)
##### 











