SELECT e.name as Employee FROM Employee AS e
LEFT JOIN Employee e2 ON e.managerId = e2.id
WHERE e.managerId is not null AND e.salary > e2.salary