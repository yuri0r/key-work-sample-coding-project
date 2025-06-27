create table if not exists jackpot
(
    id   bigint auto_increment primary key,
    name varchar(255) null,
    description varchar(255) null
);
insert into jackpot (name, description)
values
("Nothing", "Unlucky. the game is over"),
("Something", "Hey, its something!"),
("Something neat", "Hey, its something neat!"),
("Something great", "Hey, its something great!"),
("The Retry", "have I ever told you the Definition of insanity?");


