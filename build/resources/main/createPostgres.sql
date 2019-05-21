CREATE DATABASE psqltestdb;
CREATE USER psqltestuser with encrypted password 'mypass';
GRANT ALL ON DATABASE psqltestdb TO psqltestuser;


REVOKE ALL ON DATABASE psqlTestDB FROM psqltestuser;



CREATE DATABASE test2db;

GRANT ALL ON DATABASE test2db TO psqltestuser;
