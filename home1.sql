Регистрация (G)
Загрузка видео (G)
Монтаж (U)
Комментирование (U)
Оценка (U)
Просмотр (R)
Удаление (D)
Монетизация (U)
Добавление в плейлисты (U)

ProductName,
Price
FROM Products
Where Price >=20
And
Price <=150;

SELECT
Country
FROM Suppliers
Where not Country= 'USA'

SELECT
ContactName
FROM Suppliers
Where SupplierID =1

SELECT
ContactName
FROM Customers
Where not Country ='France'
and
not Country ='USA'

Country,
City,
Address
FROM Suppliers
Where not Country ='Japan'
and not Country ='Brazil'