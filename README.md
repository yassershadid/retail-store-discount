# retail-store-discount
Retail Store Discount Service

This project calculates the net amount for a given bill. Once the app starts 4 users get created as initial data, user's information below:
  ID    firstName   LastName    CreationDate    UserType
  1     Yasser      Shadid      startup time    customer
  2     Jack        Nicklson    startup time    customer
  3     John        Doe         startup time    affiliate
  4     Reem        Abdullah    startup time    employee 

I used h2 in memory database for the sake of demo, please consider that the data will not be available if the application is not running. 

### Run the application
1- Clone the repo.
2- From command line open the project directory and run `mvn spring-boot:run`
3- open http://localhost:8080/swagger-ui.html.

### Run test & coverage report
1- Open the terminal.
2- Naviagate to project folder.
3- Run the below maven command
 ~~~~
mvn test
~~~~
Search for _target/site/jacoco/index.html
