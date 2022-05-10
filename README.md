### This is the learning project for springboot.

#### Fist step: Restful API design
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









