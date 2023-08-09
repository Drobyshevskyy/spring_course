<h2>Overview</h2>
This repository contains examples from the Spring Framework and Hibernate course
<br>
<br>
It consists of three parts:
<br> 
<ul>
  <li>Spring Introduction</li>
  <li>AOP (aspect-oriented programming)</li>
  <li>Hibernate</li>
</ul>
All the projects are created with Maven
<h3>Spring Introduction</h3>
/src/spring_introduction
<br>
<br>
File Test2.java is an example of use Inversion of Controle
<br>
File Test3.java is an example of use Inversion of Controle and Dependency Injection
<br>
Interface "Pet", classes "Dog", "Cat" and "Person" are used
<br>
We use the configuration of Spring Container with .xml file. It is located at /resurces/applicationContext.xml
<br>
The examples show Dependency Injection with setters and injection of strings and other values. As not to change this values in congif file, properties file was created
<br>
Located at /resources/myApp.properties
<br>
<br>
Test4.java and Test5.java represent scope management and working with the life cycle of a bean
<br>
We use init and destroy methods of the class "Dog"
<br>
The declaration of scope, init and destroy methods is in the config file located at /resources/applicationContext2/xml
<br>
<br>
ConfigWithAnnotations1.java is an example of working with the configuration of Spring Container using small .xml config file and annotations
<br>
In .xml config file (located at /resources/applicationContext3) we only describe the scan area and everything else is marked with annotations in classes
<br>
ScopeTest.java represents operations of annotations @Scope, @PostConstruct and @PreDestroy (also with the configuration using small .xml file and annotations)
<br>
<br>
In order to implement the configuration of Spring Container using Java code we created the MyConfig.java file, all the beans and Dependency Injection are described in this file
<br>
Test6.java is an example of working with Spring Container configured with Java code
<br>
<br>
<h3>AOP (aspect-oriented programming)</h3>
/src/aop
<br>
<br>
We implement examples of aspect-oriented programming. In addition to the business logic itself, there is also the cross-cutting functionality that aspects implement
<br>
<br>
The aspects directory contains aspect-classes, differentiated by the cross-cutting logic they implement; it also contains the myPointcuts.java class (poincuts are expressions that define to which methods the logic described in "advice" will be applied)
<br>
<br>
Aspects in our aspect-classes implement end-to-end logic at various points in the execution of methods, using annotations that define this (@Before, @After, @AfterThrowing, @AfterReturning, @Around)
<br>
<br>
The test applications are developed for a school or university library, describing the process of borrowing and returning books by applying the cross-cutting functionality implemented in aspects to the main business logic
Иusiness logic is implemented only in test form in order not to be distracted by its implementation, paying more attention to the implementation of cross-cutting functionality in the examples
<br>
<br>
<h3>Hibernate</h3>
Config file (/src/hibernate.cfg.xml) connects our project to mySQL
<br>
<br>
/src/hibernate_test
<br>
<br>
Java class Employee.java (/entity/Employee.java) is connected to mySQL table "employee" using Hibernate annotations 
<br>
The class has getters, setters, constuctor, fields that are equal to "employee" table columns and toString() method
<br>
<br>
Test1.java, Test2.java, Test3.java, Test4.java, Test5.java are examples of performing all the CRUD operations using SessionFactory
<br>
<br>
