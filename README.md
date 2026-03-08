# 🏠 Sistema de Gestión Inmobiliaria

Sistema integral de gestión inmobiliaria desarrollado en **Java** con base de datos **MariaDB**. Permite administrar propiedades, propietarios, inquilinos, inspectores, vendedores y contratos de alquiler desde una plataforma centralizada con autenticación de usuarios.

---

## ✨ Funcionalidades

- **Gestión de Propiedades** — Alta, modificación y consulta de inmuebles con precio tasado, características, zona y estado
- **Propietarios** — Registro y administración de dueños con su cartera de propiedades
- **Inquilinos** — Alta, baja, modificación y posibilidad de aplicar multas
- **Contratos de Alquiler** — Creación, renovación y cancelación de contratos vinculando inquilino y propiedad
- **Inspecciones** — Gestión de inspectores asignados a propiedades
- **Vendedores** — Administración del equipo de vendedores de la inmobiliaria
- **Autenticación** — Sistema de login con usuario y contraseña

---

## 🗂️ Modelo de datos

| Entidad | Relación |
|---|---|
| `Propietario` | ofrece 1..* `PropiedadInmueble` |
| `Inquilino` | alquila 1..* `PropiedadInmueble` |
| `PropiedadInmueble` | tiene un `Inquilino`, está en 1..* `ContratoAlquiler` |
| `Inquilino` | realiza 1..* `ContratoAlquiler` |

> El proyecto incluye diagramas UML en la carpeta `/UMLDiagrams`

---

## 🛠️ Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| Java | Lenguaje principal |
| MariaDB | Base de datos relacional |
| JDBC | Conexión Java ↔ MariaDB |
| Java Swing | Interfaz de usuario de escritorio |
| IntelliJ IDEA / NetBeans | Entorno de desarrollo |

---

## ⚙️ Requisitos previos

- Java JDK 8 o superior
- MariaDB Server
- Driver JDBC de MariaDB: [mariadb-java-client-3.3.2.jar](https://repo1.maven.org/maven2/org/mariadb/jdbc/mariadb-java-client/3.3.2/mariadb-java-client-3.3.2.jar)

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/ianrodriguezy/Inmobiliaria.git
   ```

2. Importa el proyecto en IntelliJ como proyecto Java existente.

3. Agrega el driver MariaDB:
   - **File → Project Structure → Modules → Dependencies → + → JARs**
   - Selecciona el `.jar` descargado

4. Crea la base de datos en MariaDB y configura las credenciales en la clase `Conectar.java`.

5. Ejecuta la clase principal para iniciar la aplicación.

---

## 📁 Estructura del proyecto

```
Inmobiliaria/
└── src/
    └── inmobiliaria/
        ├── AccesoDatos/         # Conexión y operaciones con la BD
        │   ├── Conectar.java
        │   ├── ContratoData.java
        │   ├── InquilinoData.java
        │   ├── InspectorData.java
        │   ├── LoginData.java
        │   ├── PropiedadData.java
        │   ├── PropietarioData.java
        │   └── VendedorData.java
        └── Vistas/              # Interfaz gráfica (Java Swing)
├── UMLDiagrams/                 # Diagramas de clases del sistema
└── tareas.txt                   # Notas de desarrollo
```

---

## 👤 Autor

**Ian Rodriguez**
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Ian%20Rodriguez-0077B5?style=flat&logo=linkedin)](https://www.linkedin.com/in/ian-rodriguez-8351a1221/)
[![GitHub](https://img.shields.io/badge/GitHub-ianrodriguezy-181717?style=flat&logo=github)](https://github.com/ianrodriguezy)
