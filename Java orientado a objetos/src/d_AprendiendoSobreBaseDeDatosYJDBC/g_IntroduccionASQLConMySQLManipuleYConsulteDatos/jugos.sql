# CREACIÓN DE BASE DE DATOS

CREATE DATABASE jugos;

# ELIMINACIÓN DE SCHEMAS Y TABLAS

DROP SCHEMA Bebidas;

DROP TABLE PRODUCTOS;

# MOSTRAR BASE DE DATOS Y TABLAS

SHOW DATABASES;

SHOW tables;

# USO DE BASE DE DATOS

USE jugos;

# CREACIÓN DE TABLAS

CREATE TABLE CLIENTES (
                          DNI            VARCHAR(20),
                          NOMBRE         VARCHAR(150),
                          DIRECCION1     VARCHAR(150),
                          DIRECCION2     VARCHAR(150),
                          BARRIO         VARCHAR(50),
                          CIUDAD         VARCHAR(50),
                          ESTADO         VARCHAR(50),
                          CP             VARCHAR(10),
                          EDAD           SMALLINT,
                          SEXO           VARCHAR(1),
                          LIMITE_CREDITO FLOAT,
                          VOLUMEN_COMPRA FLOAT,
                          PRIMERA_COMPRA BIT(1)
);

CREATE TABLE jugos.PRODUCTOS (
                                 PRODUCTO VARCHAR(20)  null,
                                 NOMBRE   VARCHAR(150) null,
                                 ENVASE   VARCHAR(50)  null,
                                 VOLUMEN  VARCHAR(20)  null,
                                 SABOR    VARCHAR(50)  null,
                                 PRECIO   FLOAT        null
);

CREATE TABLE jugos.VENDEDORES (
                                  MATRICULA VARCHAR(5),
                                  NOMBRE VARCHAR(100),
                                  PORCENTAJE_COMISION FLOAT
);

# INSERCIÓN DE DATOS

INSERT INTO VENDEDORES VALUES
                           ('00235', 'Márcio Almeida Silva', 8),
                           ('00236', 'Cláudia Morais', 8);

INSERT INTO VENDEDORES (MATRICULA, NOMBRE, PORCENTAJE_COMISION) VALUES
    ('00233', 'Joan Geraldo de la Fonseca', 10);

INSERT INTO PRODUCTOS VALUES
                          ('838819', 'clean', 'botella pet', '1.5 litros', 'naranja', '12.01'),
                          ('103797', 'clean', 'botella pet', '2 litros', 'naranja', '16.01'),
                          ('812829', 'clean', 'lata', '350 ml', 'naranja', '2.81');

INSERT INTO PRODUCTOS (PRODUCTO, NOMBRE, VOLUMEN, SABOR, ENVASE, PRECIO) VALUES
                                                                             ('773912', 'clean', 'botella pet', '1 litro', 'naranja', 8.01),
                                                                             ('479745', 'Clean', '470 ml', 'Naranja', 'Botella de Vidrio', 3.77),
                                                                             ('695594', 'Festival de Sabores', '1,5 Litros', 'Asaí', 'Botella PET', 28.51),
                                                                             ('243083', 'Festival de Sabores', '1,5 Litros', 'Maracuyá', 'Botella PET', 10.51),
                                                                             ('1022450', 'Festival de Sabores', '2 Litros', 'Asái', 'Botella PET', 38.01),
                                                                             ('231776', 'Festival de Sabores', '700 ml', 'Asaí', 'Botella de Vidrio', 13.31),
                                                                             ('723457', 'Festival de Sabores', '700 ml', 'Maracuyá', 'Botella de Vidrio', 4.91),
                                                                             ('746596', 'Light', '1,5 Litros', 'Sandía', 'Botella PET', 19.51),
                                                                             ('1040107', 'Light', '350 ml', 'Sandía', 'Lata', 4.56),
                                                                             ('1002334', 'Línea Citrus', '1 Litro', 'Lima/Limón', 'Botella PET', 7),
                                                                             ('1088126', 'Línea Citrus', '1 Litro', 'Limón', 'Botella PET', 7),
                                                                             ('1041119', 'Línea Citrus', '700 ml', 'Lima/Limón', 'Botella de Vidrio', 4.9),
                                                                             ('1042712', 'Línea Citrus', '700 ml', 'Limón', 'Botella de Vidrio', 4.9),
                                                                             ('520380', 'Pedazos de Frutas', '1 Litro', 'Manzana', 'Botella PET', 12.01),
                                                                             ('788975', 'Pedazos de Frutas', '1,5 Litros', 'Manzana', 'Botella PET', 18.01),
                                                                             ('229900', 'Pedazos de Frutas', '350 ml', 'Manzana', 'Lata', 4.21),
                                                                             ('1101035', 'Refrescante', '1 Litro', 'Frutilla/Limón', 'Botella PET', 9.01),
                                                                             ('1086543', 'Refrescante', '1 Litro', 'Mango', 'Botella PET', 11.01),
                                                                             ('326779', 'Refrescante', '1,5 Litros', 'Mango', 'Botella PET', 16.51),
                                                                             ('826490', 'Refrescante', '700 ml', 'Frutilla/Limón', 'Botella de Vidrio', 6.31),
                                                                             ('1096818', 'Refrescante', '700 ml', 'Mango', 'Botella de Vidrio', 7.71),
                                                                             ('394479', 'Sabor da Montaña', '700 ml', 'Cereza', 'Botella de Vidrio', 8.41),
                                                                             ('783663', 'Sabor da Montaña', '700 ml', 'Frutilla', 'Botella de Vidrio', 7.71),
                                                                             ('1000889', 'Sabor da Montaña', '700 ml', 'Uva', 'Botella de Vidrio', 6.31),
                                                                             ('544931', 'Verano', '350 ml', 'Limón', 'Lata', 2.46),
                                                                             ('235653', 'Verano', '350 ml', 'Mango', 'Lata', 3.86),
                                                                             ('1051518', 'Verano', '470 ml', 'Limón', 'Botella de Vidrio', 3.3),
                                                                             ('1078680', 'Verano', '470 ml', 'Mango', 'Botella de Vidrio', 5.18),
                                                                             ('1004327', 'Vida del Campo', '1,5 Litros', 'Sandía', 'Botella PET', 19.51),
                                                                             ('1013793', 'Vida del Campo', '2 Litros', 'Cereza/Manzana', 'Botella PET', 24.01),
                                                                             ('290478', 'Vida del Campo', '350 ml', 'Sandía', 'Lata', 4.56),
                                                                             ('1002767', 'Vida del Campo', '700 ml', 'Cereza/Manzana', 'Botella de Vidrio', 8.41);

INSERT INTO CLIENTES (DNI, NOMBRE, DIRECCION1, DIRECCION2, BARRIO, CIUDAD, ESTADO, CP, FECHA_NACIMIENTO, EDAD, SEXO, LIMITE_CREDITO, VOLUMEN_COMPRA, PRIMERA_COMPRA) VALUES
                                                                                                                                                                         ('456879548', 'Pedro el Escamoso', 'Calle del Sol', '', 'Los Laureles', 'CDM', 'México', '65784', 55, 'M', 1000000, 2000, 0, '1971-05-25'),
                                                                                                                                                                         ('9283760794', 'Edson Calisaya', 'Sta Úrsula Xitla', '', 'Barrio del Niño Jesús', 'Ciudad de México', 'CDMX', '22002002', '1995-01-07', 25, 'M', 150000, 250000, 1),
                                                                                                                                                                         ('7771579779', 'Marcelo Perez', 'F.C. de Cuernavaca 13', '', 'Carola', 'Ciudad de México', 'CDMX', '88202912', '1992-01-25', 29, 'M', 120000, 200000, 1),
                                                                                                                                                                         ('5576228758', 'Pedro Olivera', 'Pachuca 75', '', 'Condesa', 'Ciudad de México', 'CDMX', '88192029', '1995-01-14', 25, 'F', 70000, 160000, 1),
                                                                                                                                                                         ('8502682733', 'Luis Silva', 'Prol. 16 de Septiembre 1156', '', 'Contadero', 'Ciudad de México', 'CDMX', '82122020', '1995-01-07', 25, 'M', 110000, 190000, 0),
                                                                                                                                                                         ('1471156710', 'Erica Carvajo', 'Heriberto Frías 1107', '', 'Del Valle', 'Ciudad de México', 'CDMX', '80012212', '1990-01-01', 30, 'F', 170000, 245000, 0),
                                                                                                                                                                         ('3623344710', 'Marcos Rosas', 'Av. Universidad', '', 'Del Valle', 'Ciudad de México', 'CDMX', '22002012', '1995-01-13', 26, 'M', 110000, 220000, 1),
                                                                                                                                                                         ('50534475787', 'Abel Pintos', 'Carr. México-Toluca 1499', '', 'Cuajimalpa', 'Ciudad de México', 'CDMX', '22000212', '1995-01-11', 25, 'M', 170000, 260000, 0),
                                                                                                                                                                         ('5840119709', 'Gabriel Roca', 'Eje Central Lázaro Cárdenas 911', '', 'Del Valle', 'Ciudad de México', 'CDMX', '80010221', '1985-01-16', 36, 'M', 140000, 210000, 1),
                                                                                                                                                                         ('94387575700', 'Walter Soruco', 'Calz. de Tlalpan 2980', '', 'Ex Hacienda Coapa', 'Ciudad de México', 'CDMX', '22000201', '1989-01-20', 31, 'M', 60000, 120000, 1),
                                                                                                                                                                         ('8719655770', 'Carlos Santivañez', 'Calz. del Hueso 363', '', 'Floresta Coyoacán', 'Ciudad de México', 'CDMX', '81192002', '1983-01-20', 37, 'M', 200000, 240000, 0),
                                                                                                                                                                         ('5648641702', 'Paolo Mendez', 'Martires de Tacubaya 65', '', 'Héroes de Padierna', 'Ciudad de México', 'CDMX', '21002020', '1991-01-30', 29, 'M', 120000, 220000, 0),
                                                                                                                                                                         ('492472718', 'Jorge Castro', 'Federal México-Toluca 5690', '', 'Locaxco', 'Ciudad de México', 'CDMX', '22012002', '1994-01-19', 26, 'M', 75000, 95000, 1);

# ACTUALIZACIÓN DE DATOS

UPDATE PRODUCTOS SET PRODUCTO = '812829', ENVASE = 'lata' WHERE VOLUMEN = '350 ml';
UPDATE PRODUCTOS SET SABOR = 'limón', PRECIO = 4.90 WHERE PRODUCTO = '838819';

UPDATE VENDEDORES SET PORCENTAJE_COMISION = 11 WHERE MATRICULA = '00236';
UPDATE VENDEDORES SET NOMBRE= 'Joan Geraldo de la Fonseca Junior' WHERE MATRICULA = '00233';

# ACTUALIZACIÓN DE TABLAS

ALTER TABLE PRODUCTOS ADD PRIMARY KEY(PRODUCTO);

ALTER TABLE CLIENTES ADD PRIMARY KEY(DNI);

ALTER TABLE CLIENTES ADD COLUMN(FECHA_NACIMIENTO DATE);

# ELIMINACIÓN DE DATOS

DELETE FROM PRODUCTOS WHERE PRODUCTO = '773912';

DELETE FROM VENDEDORES WHERE NOMBRE = 'Joan Geraldo de la Fonseca Junior';

# CONSULTAS

SELECT * FROM CLIENTES;

SELECT DNI, NOMBRE, DIRECCION1, DIRECCION2, BARRIO, ESTADO, FECHA_NACIMIENTO, EDAD, SEXO, LIMITE_CREDITO, VOLUMEN_COMPRA, PRIMERA_COMPRA FROM CLIENTES;

SELECT DNI, NOMBRE FROM CLIENTES;

SELECT NOMBRE AS NOMBRE_COMPLETO, SEXO AS GÉNERO, EDAD AS AÑOS, DIRECCION1 AS DOMICILIO FROM CLIENTES LIMIT 6;

SELECT * FROM PRODUCTOS WHERE SABOR = 'Maracuyá';

SELECT * FROM PRODUCTOS WHERE PRECIO = 28.51;
SELECT * FROM PRODUCTOS WHERE PRECIO BETWEEN 28.49 AND 28.52; -- Consultas float
SELECT * FROM PRODUCTOS WHERE (PRECIO >= 15 AND PRECIO <= 25) OR (ENVASE = 'lata' OR 'Botella PET');

SELECT * FROM CLIENTES WHERE EDAD <= 35;
SELECT * FROM CLIENTES WHERE EDAD <> 30; -- Diferente

SELECT * FROM CLIENTES WHERE NOMBRE > 'Gabriel Roca';

SELECT * FROM CLIENTES WHERE FECHA_NACIMIENTO = '1995-01-14';
SELECT * FROM CLIENTES WHERE FECHA_NACIMIENTO < '1995-01-14';
SELECT * FROM CLIENTES WHERE YEAR(FECHA_NACIMIENTO) = 1995;
SELECT * FROM CLIENTES WHERE DAY(FECHA_NACIMIENTO) = 20;

/*
DROP = PARA ELIMINAR TABLAS, VISTAS, PROCEDIMIENTOS, FUNCIONES, TRIGGERS, ETC.
DELETE = PARA ELIMINAR REGISTROS DE TABLAS, VISTAS, PROCEDIMIENTOS, FUNCIONES, TRIGGERS, ETC.
*/
