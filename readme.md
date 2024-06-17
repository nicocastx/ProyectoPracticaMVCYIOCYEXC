# Proyecto Practica MVC, IOC y Exc

## Descripción

Este proyecto es una aplicación de ejemplo que demuestra el uso de patrones MVC (Modelo-Vista-Controlador), IOC (Inversión de Control) y manejo de excepciones en Spring Boot. La aplicación gestiona una lista de playlists, proporcionando endpoints para obtener todas las playlists y buscar una playlist por su ID.

## Requisitos Previos

Antes de comenzar, asegúrate de tener los siguientes requisitos previos instalados:

- [Java JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) o cualquier otro IDE de tu preferencia

## Instalación

Sigue estos pasos para configurar y ejecutar el proyecto en tu máquina local:

1. Clona el repositorio:
    ```bash
    git clone <URL-del-repositorio>
    ```

2. Navega al directorio del proyecto:
    ```bash
    cd proyectopracticamvcyiocyexc
    ```

3. Compila y empaqueta el proyecto usando Maven:
    ```bash
    mvn clean install
    ```

4. Ejecuta la aplicación:
    ```bash
    mvn spring-boot:run
    ```

## Uso

Una vez que la aplicación esté en funcionamiento, puedes acceder a los siguientes endpoints:

- **Obtener todas las playlists**: `GET /playlists`
- **Buscar una playlist por ID**: `GET /playlists/find?id=<ID>`

## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio
2. Crea una rama para tu nueva funcionalidad (`git checkout -b feature/nueva-funcionalidad`)
3. Realiza tus cambios y haz commits (`git commit -m 'Añadir nueva funcionalidad'`)
4. Sube tus cambios a tu rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).
