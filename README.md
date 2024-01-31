# Liga Pro Ecuador
![image](https://github.com/whosnnck/LigaProEcuador-SA/assets/131733484/6d6443f7-2047-4108-952a-ae90d0704ac0)

Este proyecto se centra en el desarrollo de una aplicación para gestionar una liga de fútbol profesional en Ecuador. La aplicación utiliza Java con Spring Boot y se integra con una base de datos para almacenar y recuperar información clave relacionada con equipos, jugadores, partidos y más.

# Estructura del Proyecto
La estructura del proyecto se organiza de la siguiente manera:

- src/main/java: Contiene el código fuente principal de la aplicación, dividido en paquetes como com.tuempresa.ligaproecuador.controladores para los controladores y com.tuempresa.ligaproecuador.modelo para las clases de modelo.

- src/main/resources: Incluye recursos principales, como el archivo application.properties para configuración.

- src/test: Contiene el código fuente de las pruebas.

- src/test/resources: Almacena recursos específicos para pruebas.

- src/webapp: Reserva espacio para recursos web, como archivos HTML, CSS y JS (dependiendo de la configuración específica del proyecto).

- target: Carpeta donde se generan los archivos compilados y construidos.

- pom.xml: Archivo de configuración de Maven que especifica las dependencias y configuraciones del proyecto.

# Componentes Principales
- Controladores: Las clases en com.tuempresa.ligaproecuador.controladores manejan las solicitudes HTTP, gestionando la interacción entre la vista y el modelo.

- Modelo: Las clases en com.tuempresa.ligaproecuador.modelo definen las entidades del dominio, como equipos, jugadores, partidos, etc.

- Persistencia: La aplicación utiliza una base de datos para almacenar y recuperar datos. Se han implementado entidades JPA para facilitar la interacción con la base de datos.

# Uso
Para ejecutar la aplicación, asegúrate de tener configurada una base de datos y modifica el archivo application.properties con las credenciales y la URL de tu base de datos.

# Configuración de la base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/ligaproecuador
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
