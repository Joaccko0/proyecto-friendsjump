-- Migración para insertar datos de prueba
USE JumpDB;
-- Tu script para insertar los datos

INSERT IGNORE INTO JumpDB.sucursal (avenida, calle, nro, telefono, nombreCiudad) VALUES
                                                                       ('Avenida Siempre Viva', 'Calle 123', '1', '123456789', 'Springfield'),
                                                                       ('Avenida Principal', 'Calle 456', '2', '987654321', 'Shelbyville');

INSERT INTO JumpDB.propietario (dni, nombre, apellido, correo, clave) VALUES
                                                                   ('12345678A', 'Juan', 'Pérez', 'juan.perez@example.com', 'clave123'),
                                                                   ('87654321B', 'María', 'López', 'maria.lopez@example.com', 'clave456');

INSERT INTO JumpDB.empleado (dni, nombre, apellido, correo, clave, idSucursal) VALUES
                                                                            ('11111111C', 'Carlos', 'Ramírez', 'carlos.ramirez@example.com', 'clave789', 1),
                                                                            ('22222222D', 'Ana', 'Gómez', 'ana.gomez@example.com', 'clave101', 2);

INSERT INTO JumpDB.evento (idSucursal, fecha, precio, cantInvitados, asistenciamenores, descripcion) VALUES
                                                                                                  (1, '2025-06-15', 1500.00, 100, 1, 'Fiesta de aniversario'),
                                                                                                  (2, '2025-07-20', 2000.00, 150, 0, 'Concierto de verano');

INSERT INTO JumpDB.copia_contrato (urlCopiaContrato) VALUES
                                                  ('http://example.com/contrato1.pdf'),
                                                  ('http://example.com/contrato2.pdf');

INSERT INTO JumpDB.contrato_evento (idSucursal, fecha, urlCopiaContrato) VALUES
                                                                      (1, '2025-06-15', 'http://example.com/contrato1.pdf'),
                                                                      (2, '2025-07-20', 'http://example.com/contrato2.pdf');

INSERT INTO JumpDB.entrada (fecha, hora, idSucursal, nombreResponsable, apellidoResponsable, cantidadIngresados, correoResponsableAsociado, urlCopiaContrato, dniEmpleado, dniPropietario) VALUES
                                                                                                                                                                                        ('2025-06-15', '18:00:00', 1, 'Roberto', 'Martínez', 50, 'roberto.martinez@example.com', 'http://example.com/contrato1.pdf', '11111111C', '12345678A'),
                                                                                                                                                                                        ('2025-07-20', '20:00:00', 2, 'Laura', 'Fernández', 75, 'laura.fernandez@example.com', 'http://example.com/contrato2.pdf', '22222222D', '87654321B');

INSERT INTO JumpDB.es_propietario (idSucursal, dni) VALUES
                                                 (1, '12345678A'),
                                                 (2, '87654321B');