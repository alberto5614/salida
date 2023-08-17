*Consulta 1:*
sql
SELECT P.Nombre AS Nombre_Paciente, D.Nombre AS Nombre_Doctor
FROM Pacientes P
INNER JOIN Citas C ON P.ID = C.Paciente_ID
INNER JOIN Doctores D ON C.Doctor_ID = D.ID;


*Consulta 2:*
sql
SELECT D.Nombre AS Nombre_Doctor, E.Nombre AS Especialidad
FROM Doctores D
INNER JOIN Especialidades E ON D.Especialidad_ID = E.ID
INNER JOIN Citas C ON D.ID = C.Doctor_ID
INNER JOIN Pacientes P ON C.Paciente_ID = P.ID
WHERE P.Nombre = 'Juan Pérez';


*Consulta 3:*
sql
SELECT D.Nombre AS Nombre_Doctor, SUM(F.Monto) AS Total_Facturado
FROM Doctores D
INNER JOIN Citas C ON D.ID = C.Doctor_ID
INNER JOIN Facturas F ON C.Factura_ID = F.ID
GROUP BY D.Nombre
ORDER BY D.Nombre DESC;


*Consulta 4:*
sql
SELECT P.Nombre AS Nombre_Paciente, HC.Diagnostico, HC.Tratamiento
FROM Pacientes P
INNER JOIN Historia_Clinica HC ON P.ID = HC.Paciente_ID
WHERE HC.Fecha_Cita = (SELECT MAX(Fecha_Cita) FROM Historia_Clinica WHERE Paciente_ID = P.ID)
ORDER BY P.ID ASC;


*Consulta 5:*
USE clinica;

SELECT D.Nombre AS Nombre_Doctor, COUNT(C.Paciente_ID) AS Cantidad_Pacientes
FROM Doctores D
LEFT JOIN Citas C ON D.ID = C.Doctor_ID
GROUP BY D.ID, D.Nombre;