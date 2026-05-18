alter table "order"
    add column user_id uuid,
    add constraint fk_order_user foreign key (user_id) references "user" (id);
