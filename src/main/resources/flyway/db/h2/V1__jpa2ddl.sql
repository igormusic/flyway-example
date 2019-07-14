
    create table person (
       id bigint identity not null,
        date_of_birth date,
        first_name varchar(255),
        last_name varchar(255),
        middle_name varchar(255),
        primary key (id)
    );
