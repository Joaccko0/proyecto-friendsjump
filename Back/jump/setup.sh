#!/bin/bash

echo "🛠️  Verificando si la base de datos JumpDB existe..."

# Crea la base si no existe (ajustá usuario y contraseña si es necesario)
mysql -u root -p  -e "CREATE DATABASE IF NOT EXISTS JumpDB;"

echo "✅ Base de datos verificada o creada."

# Ejecuta las migraciones de Flyway
mvn flyway:migrate

