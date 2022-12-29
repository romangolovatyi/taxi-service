# TAXI-SERVICE 🚕
## 🖊️ Description
This is a simple application that allows you to work with a taxi service. This app follows SOLID principles and based on N-tier architecture. It supports registration, authentication, and all CRUD-based operations. The technologies that I used in this project made it possible to realize all the functionality that was conceived.
## 🏃 How to Install and Run the Project
1. Install JDK v11 or later
2. Clone this project to your JDK
3. Install MySQLWorkbench v8.0 or later
4. Create the shema with tables using a script from [this](src/main/resources/init_db.sql) file
5. Configure [ConnectionUtil.java](src/main/java/taxi/util/ConnectionUtil.java) file
6. Install Apache Tomcat v8.5.83 or later
7. [Configure Apache Tomcat in JDK](#configure-apache-tomcat)
8. Click on debug on the toolbar to use the application
## ⚙ Technologies
### **Web**
* Apache Tomcat v8.5.83 as servlet
* Javax Servlet API v4.0.1
* JSTL v1.2
### **Database**
* MySql Database v8.0.22
* JDBS driver for MySQL connector
### **Enviroments**
* MySqlWorkbench enviroment v8.0 CE
* IntelliJ IDEA
### **Others**
* Apache Maven as application builder
* JSP
* HTML
* CSS