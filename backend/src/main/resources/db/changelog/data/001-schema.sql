create table if not exists form_data
(
    id   bigint auto_increment primary key,
    first_name varchar(255) null,
    last_name varchar(255) null,
    email varchar(255) null,
    phone varchar(255) null
);
create table jackpot_history
(
    id           bigint auto_increment
        primary key,
    jackpot      varchar(255) not null,
    form_data_id bigint       not null,
    constraint FK6yqvv5yoedalqbqar30wequl9
        foreign key (form_data_id) references form_data (id)
);
