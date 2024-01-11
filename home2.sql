1
SELECT *
FROM Orders
Order by Orderdate Desc
limit 1 offset 1;

2
SELECT *
FROM Orders
Order by Orderdate Asc
Limit 5

3
SELECT phone
FROM Suppliers
where country not in ("UK","Brazil")

4
SELECT *
FROM Products
Where CategoryID in (4,5) and
price <= 250

С помощью проэкции мы выводим лишь ту часть которую задаем, преимуществами могут  быть, скорость обработки,
экономия памяти, удобство чтения и тд.