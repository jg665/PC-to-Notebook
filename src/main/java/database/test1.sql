SELECT ename, job 
FROM emp;
DROP TABLE jobs;
CREATE TABLE jobs
AS SELECT DISTINCT job,
		  '권한		' auth, 
		  '			' grade	
	FROM emp;
SELECT * FROM jobs;