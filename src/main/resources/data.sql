create table if not exists product_types
(
    id         bigserial    not null primary key,
    name       varchar(255) not null,
    name_short varchar(255)
    );
insert into product_types
values (1, 'Настольные компьютеры', 'наст. комп.'),
       (2, 'Ноутбуки', 'ноут.'),
       (3, 'Мониторы', 'монитор.'),
       (4, 'Жесткие диски', 'жест. диск.');

create table if not exists products
(
    id              bigserial    not null primary key,
    name            varchar(255) not null,
    product_type_id bigint       not null,
    serial_number   varchar(255),
    manufacturer    varchar(255),
    price           integer      not null,
    count           integer
    );

alter table products add foreign key (product_type_id) references product_types;

insert into products (id, name, product_type_id, serial_number, manufacturer, price, count)
values (1, 'Компьютер1', 1, '111E', 'Huawei', 150000, 4),
       (2, 'Компьютер2', 1, '112E', 'Huawei', 149000, 1),
       (3, 'Ноутбук1', 2, '2333E', 'Apple', 600000, 10),
       (4, 'Монитор1', 3, '444BB', 'Samsung', 100000, 50),
       (5, 'Монитор2', 3, '511Y', 'Samsung', 122000, 11),
       (6, 'Монитор3', 3, '888O', 'Samsung', 111000, 9),
       (7, 'Жесткий_диск1', 4, '98989P', 'Test', 35000, 100);

create table if not exists product_detail_types
(
    id         bigserial    not null primary key,
    name       varchar(255) not null,
    name_short varchar(255)
    );
insert into product_detail_types
values (1, 'Форм-фактор', 'форм.факт.'),
       (2, 'Размер', 'разм.'),
       (3, 'Диагональ', 'диаг.'),
       (4, 'Объем', 'объем');

create table if not exists product_details
(
    id                     bigserial    not null primary key,
    product_detail_type_id bigint       not null,
    product_id             bigint       not null,
    `value`                  varchar(255) not null
    );

alter table product_details add foreign key (product_detail_type_id) references product_detail_types;
alter table product_details add foreign key (product_id) references products;

insert into product_details
values (1, 3, 4, '90'),
       (2, 3, 5, '120'),
       (3, 3, 6, '150'),
       (4, 1, 1, 'десктоп'),
       (5, 1, 2, 'моноблок'),
       (6, 2, 3, '14'),
       (7, 4, 7, '128');
