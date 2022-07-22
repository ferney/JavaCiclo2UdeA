CREATE TABLE profesores(
id_profesor int not null primary key AUTO_INCREMENT,
    nombre varchar(50) not null
);
CREATE TABLE alumnos(
id_alumnos int not null primary key AUTO_INCREMENT,
    nombre varchar(50) not null
);
CREATE TABLE curso(
id_curso int not null primary key AUTO_INCREMENT,
    titulo varchar(50) not null,
    id_profe int DEFAULT null    
);

create TABLE alumnos_cursos(
	id_alumnos int not null AUTO_INCREMENT,
 	id_curso int not null AUTO_INCREMENT,
    PRIMARY key(id_alumnos,id_curso)
);

create TABLE alumnos_cursos_hist(
    semestre varchar(50) not null,
	id_alumnos int not null AUTO_INCREMENT,
 	id_curso int not null AUTO_INCREMENT,
    PRIMARY key(id_alumnos,id_curso)
);

create TABLE alumnos_cursos_tmp(
    id_curso int not null AUTO_INCREMENT,
    titulo varchar(50) not null,
	id_alumnos int not null AUTO_INCREMENT,
 	nombre varchar(50) not null,
    PRIMARY key(id_alumnos,id_curso)
);

alter TABLE alumnos_cursos
ADD CONSTRAINT alumnos_cursos_id_alumnos_fk FOREIGN KEY(id_alumnos) REFERENCES alumnos,
ADD CONSTRAINT alumnos_cursos_id_curso_fk FOREIGN KEY(id_curso) REFERENCES curso;

alter TABLE curso
ADD CONSTRAINT cursos_id_profe_fk FOREIGN KEY(id_profesor) REFERENCES profesores;
