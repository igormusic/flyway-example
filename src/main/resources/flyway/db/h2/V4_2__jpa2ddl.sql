alter table address
  alter column address_line_1 varchar(255) not null;

alter table address
  alter column city varchar(255) not null;

alter table address
  alter column province varchar(2) not null;

alter table address
  alter column person_id bigint not null;
