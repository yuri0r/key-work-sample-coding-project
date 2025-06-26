create table if not exists user
(
    id   bigint auto_increment primary key,
    username varchar(255) null,
    password varchar(128) null
);

alter table form_data add column user_id BIGINT not null;
alter table form_data add constraint fk_form_data_user
    foreign key (user_id) references user(id) on delete cascade;