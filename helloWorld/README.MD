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

