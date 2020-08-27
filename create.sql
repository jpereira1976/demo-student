create table student (id varchar(255) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(255) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(255) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(15) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(15) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(15) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(15) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(15) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student (id varchar(15) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(15) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, email varchar(255), first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, mail varchar(255), first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, mail varchar(255), first_name varchar(255), last_name varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, mail varchar(255), first_name varchar(255), last_name varchar(255), email_domain varchar(255), email_name varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, mail varchar(255), first_name varchar(255), last_name varchar(255), email_domain varchar(255), email_name varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, mail varchar(255), first_name varchar(255), last_name varchar(255), email_domain varchar(255), email_name varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, email_domain varchar(255), email_name varchar(255), first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, email_domain varchar(255), email_name varchar(255), first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
create table student (id varchar(16) not null, email_domain varchar(255), email_name varchar(255), first_name varchar(255), last_name varchar(255), mail varchar(255), primary key (id)) engine=InnoDB
create table student_subjects (student_id varchar(16) not null, subjects varchar(255)) engine=InnoDB
alter table student_subjects add constraint FKlcmxo19kkhwdmk263520p0r2i foreign key (student_id) references student (id)
