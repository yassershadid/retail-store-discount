# retail-store-discount
Retail Store Discount Service

This project calculates the net amount for a given bill. Once the app starts 4 users get created as initial data, user's information below:<br/>
<table>
  <tr>
    <td>ID</td>    <td>firstName</td>   <td>LastName</td>    <td>CreationDate</td>    <td>UserType</td>
    </tr>
  <tr>
    <td>1</td>     <td>Yasser</td>      <td>Shadid</td>      <td>startup time</td>    <td>customer</td>
  </tr>
   <tr>
     <td>2</td>   <td>Jack</td>     <td>Nicklson</td>      <td>startup time</td>      <td>customer</td>
  </tr>
  <tr>
      <td>3</td>   <td>John</td>     <td>Doe</td>      <td>startup time</td>      <td>affiliate</td>
  </tr>
  <tr>
    <td>4</td>   <td>Reem</td>     <td>Abdullah</td>      <td>startup time</td>      <td>employee</td>
  </tr>
<table>
  
I used h2 in memory database for the sake of demo, please consider that the data will not be available if the application is not running. 

### Class Diagram
Please go to documentation/Class Diagram.html

### Run the application
1- Clone the repo.<br/>
2- From command line open the project directory and run `mvn spring-boot:run`<br/>
3- open http://localhost:8080/swagger-ui.html.<br/>

### Run test & coverage report
1- Open the terminal.<br/>
2- Naviagate to project folder.<br/>
3- Run the below maven command<br/>
 ~~~~
mvn test
~~~~
Search for _target/site/jacoco/index.html

### Run SonarCube
1- Open the terminal.<br/>
2- Naviagate to project folder.<br/>
3- Run the below maven command<br/>
~~~~
mvn verify sonar:sonar
~~~~
Open the browser and go to https://sonarcloud.io/dashboard?id=yassershadid_retail-store-discount

