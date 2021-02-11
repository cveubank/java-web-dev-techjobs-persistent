## Part 1: Test it with SQL
job: id(int), name(varchar), description(varchar)
## Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "Saint Louis City";
## Part 3: Test it with SQL
DROP TABLE jobs;
## Part 4: Test it with SQL
SELECT * FROM skill
      LEFT JOIN job_skills ON skill.id = job_skills.skills_id
      WHERE job_skills.jobs_id IS NOT NULL
      ORDER BY name ASC;