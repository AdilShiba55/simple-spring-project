create table if not exists product_types
(
    id         bigint auto_increment not null primary key,
    name       varchar(255) not null,
    name_short varchar(255)
);

create table if not exists products
(
    id              bigint auto_increment not null primary key,
    name            varchar(255) not null,
    product_type_id bigint       not null,
    serial_number   varchar(255),
    manufacturer    varchar(255),
    price           integer      not null,
    count           integer,

    foreign key (product_type_id) references product_types(id)
);

create table if not exists product_detail_types
(
    id         bigserial    not null primary key,
    name       varchar(255) not null,
    name_short varchar(255)
);

create table if not exists product_details
(
    id                     bigserial    not null primary key,
    product_detail_type_id bigint       not null,
    product_id             bigint       not null,
    val                  varchar(255) not null,

    foreign key (product_detail_type_id) references product_detail_types(id),
    foreign key (product_id) references products(id)
);


