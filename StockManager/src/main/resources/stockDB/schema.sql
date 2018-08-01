drop table T_USERS if exists;

create table T_USERS (ID bigint identity primary key, USER_ID varchar(5),
                        NAME varchar(50) not null, PASSWD varchar(6) not null, unique(USER_ID));
                        
drop table T_STOCKS if exists;

create table T_STOCKS (ID bigint identity primary key, ITEM_ID varchar(5),
                        ITEM_DESC varchar(50) not null, unique(ITEM_ID));

