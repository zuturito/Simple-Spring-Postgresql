# Simple-Spring-Postgresql
A simple postgresql API CRUD Application

This example was made with springboot and Netbeans. <br>
You can download Netbeans IDE from: <a href="https://netbeans.apache.org/"> Oficial website </a>.

<h2>Configure Spring</h2>

First you need to download springboot from <a href="https://start.spring.io/">Spring oficial website</a> <br>
Once you're there, you need to specify dependencies on the right side column. Select next ones:
<ol>
  <li> Spring Web </li>
  <li> Spring dev tools </li>
  <li> PostgreSQL Driver </li>
  <li> Spring Data JPA </li>
</ol>

Once you're finished, this example was made under next parameters from the left column:

<ol>
  <li> Language Java </li>
  <li> Java JDK 17 </li>
  <li> Maven Project </li>
  <li> Springboot 3.0.0 (SNAPSHOT) </li>
  <li> Metadata you like to add </li>
</ol>

![Spring parameters](https://github.com/zuturito/Simple-Spring-Postgresql/blob/main/img/1.jpg)

Then on Netbeans there's a "src" folder. You can put the code from this repository. Let's explain the code: <br>
The project structure looks like:

![Project structure](https://github.com/zuturito/Simple-Spring-Postgresql/blob/main/img/structure.jpg)

Under "modelo" folder you can see the "model" from the class that represents the <Table> <br>
Under "repository" folder you can see the JPA configuration <br
Under "rest" folder you will see the "/link" to the api services and other rest functions like delete <br>
Under "service" theres the functions to make it work <br>

<h3> Extra configurations </h3>

Under Other sources > default_package > application properties. You need to configure at least the next lines:

```
spring.jpa.database=POSTGRESQL 
spring.datasource.platform=postgres 
spring.datasource.url=jdbc:postgresql://localhost:5432/<database_name> 
spring.datasource.username=<postgresql_username>
spring.datasource.password=<postgresql_password>
spring.jpa.show-sql=true
```

<h2> Running project </h2>

One of the files it's called "DemoCrudApplication", this is the main java program to run, you must run this file to execute the apache tomcat server. Like it's shown on the next image:

![Running project](https://github.com/zuturito/Simple-Spring-Postgresql/blob/main/img/2.jpg)

Once it's running, you can use a POSTMAN or restfull IDE to get the data from the table on the database. <br>
You only need to remember that the link to the data its called like: http:localhost:8080/<link_you_configure_on_REQUEST_MAPPING> <br>
The request mapping was under the REST folder java file. <br>

If its ok, you will see the data on your database table.

![Running postman to get data](https://github.com/zuturito/Simple-Spring-Postgresql/blob/main/img/3.jpg)
