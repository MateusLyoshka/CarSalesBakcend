alter table "user"
    drop column deleted,
    add column deleted_at bigint;