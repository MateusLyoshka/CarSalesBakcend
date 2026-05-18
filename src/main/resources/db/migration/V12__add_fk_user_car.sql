alter table car
    add column user_id uuid,
    add constraint fk_car_user foreign key (user_id) references "user" (id);



