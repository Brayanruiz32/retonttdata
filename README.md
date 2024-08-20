Este proyecto es una aplicación simple desarrollada con Spring Boot que realiza peticiones a una API externa utilizando `WebClient` y muestra los resultados en una vista Thymeleaf.
## Uso
La aplicación realiza una petición a la API `https://randomuser.me/api/` para obtener una lista de usuarios. El número de usuarios que se pueden recuperar es configurable a través de un parámetro en la URL.
Para poder ingresar a la aplicacion se debe ingresar el siguiente url  `http://localhost:8080/miapi` y si en caso se desea obtener una cantidad de usuarios especifica se ingresa el siguiente url por ejemplo `http://localhost:8080/miapi?results=8`. 
## Tecnologias 
- **Spring Boot**: Utilizado para manejar el backend de la aplicación, documentación: https://docs.spring.io/spring-boot/index.html.
- **WebClient**: Para realizar peticiones HTTP a la API externa, documentación: https://docs.spring.io/spring-framework/reference/web/webflux-webclient.html.
- **Thymeleaf**: Motor de plantillas utilizado para renderizar la vista con los datos obtenidos, documentación: https://www.thymeleaf.org/documentation.html.



