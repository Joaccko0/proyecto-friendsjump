-- Migración para crear las tablas del esquema
USE JumpDB;
-- Tu script para crear las tablas
CREATE TABLE IF NOT EXISTS sucursal (

                          idSucursal BIGINT AUTO_INCREMENT PRIMARY KEY,
                          avenida VARCHAR(255),
                          calle VARCHAR(255),
                          nro VARCHAR(10),
                          telefono VARCHAR(20),
                          nombreCiudad VARCHAR(100)
);
CREATE TABLE IF NOT EXISTS propietario (
                             dni VARCHAR(20) PRIMARY KEY,
                             nombre VARCHAR(100),
                             apellido VARCHAR(100),
                             correo VARCHAR(255),
                             clave VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS empleado (
                          dni VARCHAR(20) PRIMARY KEY,
                          nombre VARCHAR(100),
                          apellido VARCHAR(100),
                          correo VARCHAR(255),
                          clave VARCHAR(255),
                          idSucursal BIGINT,
                          FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal)
);
CREATE TABLE IF NOT EXISTS evento (
                        idSucursal BIGINT,
                        fecha DATE,
                        precio DECIMAL(10, 2),
                        cantInvitados INT,
                        asistenciamenores BOOLEAN,
                        descripcion VARCHAR(255),
                        PRIMARY KEY (idSucursal, fecha),
                        FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal)
);
CREATE TABLE IF NOT EXISTS copia_contrato (
                                urlCopiaContrato VARCHAR(255) PRIMARY KEY
);
CREATE TABLE IF NOT EXISTS contrato_evento (
                                 idSucursal BIGINT,
                                 fecha DATE,
                                 urlCopiaContrato VARCHAR(255),
                                 PRIMARY KEY (idSucursal, fecha, urlCopiaContrato),
                                 FOREIGN KEY (idSucursal, fecha) REFERENCES evento (idSucursal, fecha),
                                 FOREIGN KEY (urlCopiaContrato) REFERENCES copia_contrato (urlCopiaContrato)
);
CREATE TABLE IF NOT EXISTS entrada (
                         fecha DATE,
                         hora TIME,
                         idSucursal BIGINT,
                         nombreResponsable VARCHAR(255),
                         apellidoResponsable VARCHAR(255),
                         cantidadIngresados INT,
                         correoResponsableAsociado VARCHAR(255),
                         urlCopiaContrato VARCHAR(255),
                         dniEmpleado VARCHAR(20),
                         dniPropietario VARCHAR(20),
                         PRIMARY KEY (fecha, hora, idSucursal),
                         FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal),
                         FOREIGN KEY (urlCopiaContrato) REFERENCES copia_contrato(urlCopiaContrato),
                         FOREIGN KEY (dniEmpleado) REFERENCES empleado(dni),
                         FOREIGN KEY (dniPropietario) REFERENCES propietario(dni)
);
CREATE TABLE IF NOT EXISTS es_propietario (
                                idSucursal BIGINT PRIMARY KEY,
                                dni VARCHAR(20),
                                FOREIGN KEY (idSucursal) REFERENCES sucursal(idSucursal),
                                FOREIGN KEY (dni) REFERENCES propietario(dni)
);