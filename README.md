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
     td>2</td>   <td>Jack</td>     <td>Nicklson</td>      <td>startup time</td>      <td>customer</td>
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
<!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=5,IE=9" ><![endif]-->
<!DOCTYPE html>
<html>
<head>
<title>Untitled Diagram.html</title>
<meta charset="utf-8"/>
</head>
<body>
<div class="mxgraph" style="max-width:100%;border:1px solid transparent;" data-mxgraph="{&quot;highlight&quot;:&quot;#0000ff&quot;,&quot;nav&quot;:true,&quot;resize&quot;:true,&quot;xml&quot;:&quot;&lt;mxfile host=\&quot;app.diagrams.net\&quot; modified=\&quot;2020-05-23T23:22:05.786Z\&quot; agent=\&quot;5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.80 Safari/537.36\&quot; etag=\&quot;zZt3-SVL2m3_AjKsKpij\&quot; version=\&quot;13.1.3\&quot; type=\&quot;device\&quot;&gt;&lt;diagram name=\&quot;Page-1\&quot; id=\&quot;9f46799a-70d6-7492-0946-bef42562c5a5\&quot;&gt;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&lt;/diagram&gt;&lt;/mxfile&gt;&quot;,&quot;toolbar&quot;:&quot;pages zoom layers lightbox&quot;,&quot;page&quot;:0}"></div>
<script type="text/javascript" src="https://app.diagrams.net/js/viewer.min.js"></script>
</body>
</html>

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
