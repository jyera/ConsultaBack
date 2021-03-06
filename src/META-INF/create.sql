CREATE TABLE CONSULTADB.CLIENTES (
    IDCLIENTE INTEGER,
    NOMBRE VARCHAR(20),
    APELLIDO1 VARCHAR(20),
    APELLIDO2 VARCHAR(20),
    DIRECCION VARCHAR(100),
    CORREO VARCHAR(30),
    FECHANACIMIENTO DATE,
    TELEFONOFIJO VARCHAR(20),
    TELEFONOMOVIL VARCHAR(20),
    PRIMARY KEY (IDCLIENTE)
);

CREATE TABLE CONSULTADB.CITAS (
    IDCITA INTEGER,
    IDCLIENTE INTEGER,
    FECHACITA DATE,
    HORACITA TIME,
    OBSERVACION VARCHAR(150),
    PRIMARY KEY (IDCITA),
    FOREIGN KEY (IDCLIENTE) REFERENCES CLIENTES(IDCLIENTE)
);

CREATE TABLE CONSULTADB.CONSULTAS (
    IDCONSULTA INTEGER,
    IDCLIENTE INTEGER,
    IDCITA INTEGER,
    TRATAMIENTO VARCHAR(150),
    PRIMARY KEY (IDCONSULTA),
    FOREIGN KEY (IDCLIENTE) REFERENCES CLIENTES(IDCLIENTE),
    FOREIGN KEY (IDCITA) REFERENCES CITAS(IDCITA)
);

CREATE TABLE CONSULTADB.MODOPAGO (
    IDMODOPAGO INTEGER,
    NOMBRE VARCHAR(50),
    PRIMARY KEY (IDMODOPAGO)
);

CREATE TABLE CONSULTADB.PAGOS (
    IDPAGO INTEGER,
    IDCONSULTA INTEGER,
    IDCLIENTE INTEGER,
    IDMODOPAGO INTEGER,
    CANTIDAD INTEGER,
    OBSERVACION VARCHAR(100),
    PRIMARY KEY (IDPAGO),
    FOREIGN KEY (IDCONSULTA) REFERENCES CONSULTAS(IDCONSULTA),
    FOREIGN KEY (IDCLIENTE) REFERENCES CLIENTES(IDCLIENTE),
    FOREIGN KEY (IDMODOPAGO) REFERENCES MODOPAGO(IDMODOPAGO)
);

