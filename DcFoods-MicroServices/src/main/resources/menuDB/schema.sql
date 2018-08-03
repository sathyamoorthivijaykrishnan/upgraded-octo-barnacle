drop table T_MENU if exists;

create table T_MENU (ID bigint identity primary key, DAY varchar(3),
                        BRK_FST varchar(50) not null, LUNCH varchar(50) not null,DINNER varchar(50) not null, unique(DAY));
                        
