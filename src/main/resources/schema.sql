drop table if exists SAMPLE_EMPLOYEE;

create table SAMPLE_EMPLOYEE
(
    user_id int(11) primary key auto_increment,
    user_name varchar(255) not null,
    user_gender varchar(255) not null,
    department_code varchar(255) not null
)
