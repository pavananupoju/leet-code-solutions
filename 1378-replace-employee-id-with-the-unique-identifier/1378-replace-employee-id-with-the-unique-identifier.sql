# Write your MySQL query statement below

select u.unique_id , v. name  
from Employees v 
left join EmployeeUNI u 
on  u.id = v.id
