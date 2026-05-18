ALTER TABLE tb_car
    ADD COLUMN fipe_id UUID,
    ADD CONSTRAINT fk_car_fipe
    FOREIGN KEY (fipe_id) REFERENCES fipe (id);