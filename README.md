### This is the learning project for springboot.

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
* #### setter dependency injection(setter is spring used to inject the dependency)
  * we inject `String type = "Equilateral"` into the bean Triangle.
  ![](images/Screen%20Shot%202022-05-11%20at%205.15.45%20AM.png)
  * under the hood, spring user setter of the bean Triangle to set the type.
  ![](images/Screen%20Shot%202022-05-11%20at%205.25.25%20AM.png)
* #### constructor dependency injection**
  " we use constructor `String type ` dependency injection into the bean Triangle.
  ![](images/Screen%20Shot%202022-05-11%20at%205.33.44%20AM.png)
  ![](images/Screen%20Shot%202022-05-11%20at%205.33.31%20AM.png)
  **contitionaly run program by setting diffent denpencies in the configuration file**
  ![](/images/Screen%20Shot%202022-05-11%20at%205.46.14%20AM.png)
  ![](images/Screen%20Shot%202022-05-11%20at%205.46.31%20AM.png)
  **add type to constructor-args**
  ![](images/Screen%20Shot%202022-05-11%20at%205.56.35%20AM.png)
  **add index to constructor-args**
  ![](images/Screen%20Shot%202022-05-11%20at%206.03.04%20AM.png)


#### get bean using `context.getBean("beanName")`(preferably)
![](/images/Screen%20Shot%202022-05-10%20at%207.31.16%20PM.png)
#### get bean using `BeanFactory.getBean("beanName")`
![](images/Screen%20Shot%202022-05-11%20at%204.13.09%20AM.png)
![](images/Screen%20Shot%202022-05-10%20at%207.29.11%20PM.png)
![](images/Screen%20Shot%202022-05-10%20at%207.31.16%20PM.png)

#### Inject object into the bean
![](/images/Screen%20Shot%202022-05-11%20at%208.37.29%20AM.png)
##### Setter is used to inject the dependency
![](/images/Screen%20Shot%202022-05-11%20at%208.43.57%20AM.png)

##### Inner bean
![](images/Screen%20Shot%202022-05-11%20at%206.04.58%20PM.png)

##### Autowiring
![](/images/Screen%20Shot%202022-05-11%20at%206.52.12%20PM.png)
![]()
![]()
![]()
![]()


















##### database
![](images/Screen%20Shot%202022-05-10%20at%203.28.04%20PM.png)



##### RESTful API(Spring MVC)
##### 











