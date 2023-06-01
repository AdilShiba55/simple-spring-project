insert into product_types (id, name, name_short)
values (1, 'Настольные компьютеры', 'наст. комп.'),
       (2, 'Ноутбуки', 'ноут.'),
       (3, 'Мониторы', 'монитор.'),
       (4, 'Жесткие диски', 'жест. диск.');

insert into products (id, name, product_type_id, serial_number, manufacturer, price, count)
values (1, 'Компьютер1', 1, '111E', 'Huawei', 150000, 4),
       (2, 'Компьютер2', 1, '112E', 'Huawei', 149000, 1),
       (3, 'Ноутбук1', 2, '2333E', 'Apple', 600000, 10),
       (4, 'Монитор1', 3, '444BB', 'Samsung', 100000, 50),
       (5, 'Монитор2', 3, '511Y', 'Samsung', 122000, 11),
       (6, 'Монитор3', 3, '888O', 'Samsung', 111000, 9),
       (7, 'Жесткий_диск1', 4, '98989P', 'Test', 35000, 100);

insert into product_detail_types (id, name, name_short)
values (1, 'Форм-фактор', 'форм.факт.'),
       (2, 'Размер', 'разм.'),
       (3, 'Диагональ', 'диаг.'),
       (4, 'Объем', 'объем');

insert into product_details (id, product_detail_type_id, product_id, val)
values (1, 3, 4, '90'),
       (2, 3, 5, '120'),
       (3, 3, 6, '150'),
       (4, 1, 1, 'десктоп'),
       (5, 1, 2, 'моноблок'),
       (6, 2, 3, '14'),
       (7, 4, 7, '128');
