create table pets
(
    id    bigint not null
        constraint pets_pk
            primary key,
    name  varchar,
    birth timestamp
);

alter table pets
    owner to coinhat;

