alter table car
    add column order_id uuid,
    add constraint fk_car_order foreign key (order_id) references "order" (id);