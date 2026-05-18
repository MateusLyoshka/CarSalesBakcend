CREATE TABLE tb_user(
    id uuid primary key default gen_random_uuid(),
    name text not null,
    email text not null unique,
    password text not null
);

CREATE TABLE tb_car(
    id uuid primary key default gen_random_uuid(),
    price bigint not null,
    description text
);

CREATE TABLE tb_order(
    id uuid primary key default gen_random_uuid(),
    date date not null
);