alter table car drop column order_id;

alter table "order"
    add column car_id uuid,
    add constraint fk_car_order foreign key (car_id) references car (id);