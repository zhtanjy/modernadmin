
alter table USER
	add EMAIL varchar(100) not null after NAME;

alter table USER
	add PASSWORD varchar(200) not null;