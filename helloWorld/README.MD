# Getting Started

in this tutorial i learned how to access the database and create sometables and so on

## login to mySQL cli

    mysql -u <username> -p

## list all the databases for the user

    SHOW DATABASES;

or

    SELECT Db FROM mysql.db WHERE User = 'username';

## list all tables in specific database

    USE database_name;
    SHOW TABLES;

# Getting Started

in this section we created simple table called employees with some rows like this:-

## creating table

    create table Employees
        ( id int not null,
          int not null,
          first varchar (255),
          last varchar (255)
        );

## adding table rows

    INSERT INTO Employees VALUES (100, 18, 'Zara', 'Ali');

    INSERT INTO Employees VALUES (101, 25, 'Mahnaz', 'Fatma');

    INSERT INTO Employees VALUES (102, 30, 'Zaid', 'Khan');

    INSERT INTO Employees VALUES (103, 28, 'Sumit', 'Mittal');

## integrating with hava mysql-connector

here i learnt how to use mysql-connector to interface with my db

### login

use this to login to your database

    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement stmt = conn.createStatement();

use this to execute sql queries

    ResultSet rs = stmt.executeQuery(QUERY);

read the sql result like this

    while (rs.next()) {
            // Retrieve by column name
             System.out.print("ID: " + rs.getInt("id"));
             System.out.print(", Age: " + rs.getInt("age"));
             System.out.print(", First: " + rs.getString("first"));
             System.out.println(", Last: " + rs.getString("last"));
    }

## compilation 

to compile this class you need to find your mysql-connector jar file  

    cd / && sudo find -name mysql*.jar

now use the javac to compile the .java file

    javac -cp .:<path to mysql-connector.jar> helloMysql.java

now you can run it like this

    java  -cp .:<path to mysql-connector.jar> helloMysql

or you can compile it in another way like this 

    export CLASSPATH=/path-to/mysql-connector-java-8.3.0.jar:$CLASSPATH

    javac helloMysql.java

    java helloMysql