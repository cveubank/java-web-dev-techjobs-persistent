## Part 1: Test it with SQL
job: id(int), name(varchar), description(varchar)
## Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "Saint Louis City";
## Part 3: Test it with SQL
DROP TABLE jobs;
## Part 4: Test it with SQL
SELECT name, description
FROM skill
WHERE (job = NotNull)
ORDER BY
asc;