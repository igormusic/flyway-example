
    create table address (
       id bigint identity not null,
        address_line_1 varchar(255),
        address_line_2 varchar(255),
        city varchar(255),
        country varchar(255),
        state_or_province varchar(255),
        person_id bigint,
        primary key (id)
    );

    alter table address 
       add constraint FK81ihijcn1kdfwffke0c0sjqeb 
       foreign key (person_id) 
       references person;
