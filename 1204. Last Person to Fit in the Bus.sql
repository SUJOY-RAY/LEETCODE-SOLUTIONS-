-- with OrderedQueue as (
--     select *, 
--             sum(weight) over (order by turn)
--             as culmulative_weight
--     from Queue 
-- ),
-- ValidBoarding as (
--     Select * 
--     from OrderedQueue
--     where culmulative_weight <=1000
-- )
-- select person_name
-- from ValidBoarding
-- order by turn desc
-- limit 1; 

select person_name
from(
    select person_name, turn,
        sum(weight) over (order by turn) as cum
        from queue
) p1
where cum<=1000
order by turn desc
limit 1;
