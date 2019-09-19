drop table TBA_USUARIO; 
drop table TBA_VALET; 
drop table TBA_VEICULO;

create table TBA_USUARIO(
    ID_USUARIO integer primary key,
    NM_USUARIO varchar(50), 
    EMAIL_USUARIO varchar(60), 
    PWD_USUARIO varchar(24)
);  

create sequence c_usuario_seq increment by 1 start with 1;