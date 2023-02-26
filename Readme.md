run docker command for database

docker run --name timect -d -p 3306:3306  -e MYSQL_DATABASE=timect -e MYSQL_ROOT_PASSWORD=12345 mysql 