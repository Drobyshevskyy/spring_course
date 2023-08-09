<h2>Overview</h2>
This repository contains examples from the Spring Framework and Hibernate course
<br>
<br>
It consists of three parts:
<br> 
<ul>
  <li>Spring introduction</li>
  <li>AOP(aspect-oriented programming)</li>
  <li>Hibernate</li>
</ul>
All the projects are created with Maven
<h3>Spring introduction</h3>
/src/spring_introduction
<br>
<br>
File Test2.java is an example of use Inversion of Controle
<br>
File Test3.java is an example of use Inversion of Controle and Dependency Injection
<br>
Interface "Pet", classes "Dog", "Cat" and "Person" are used
<br>
We use the configuration with .xml file. It is located at /resurces/applicationContext.xml
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

