alter table "user" rename to person;
drop table "order";
create table image(
    id uuid primary key default gen_random_uuid(),
    url text not null,
    car_id uuid not null,
    constraint fk_image_car foreign key (car_id) references car (id)
);
alter table person add column image text;