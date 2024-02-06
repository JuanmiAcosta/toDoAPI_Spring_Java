# To Do Api Java-Spring 📓
  
En este primer acercamiento con Spring he aprendido más sobre Backend y cómo se construye realmente una API aplicando buenas prácticas buenas prácticas. Además también he trabajado con Swagger, una manera más directa y sencilla de ir testeando las diferentes funcionalidades de la misma.

Este diagrama de las diferentes comunicaciones de la arquitectura de la API muestra gráficamente la construcciónd e esta:

<p align="center">
  <img src="https://github.com/JuanmiAcosta/toDoAPI_Spring_Java/blob/master/captures/Flujo%20resumido%20de%20comunicaciones.png?raw=true" alt="Imagen representativa">
</p>

Además en la siguiente imagen muestro las funcionalidades implementadas en la API vistas desde Swagger:

<p align="center">
  <img src="https://github.com/JuanmiAcosta/toDoAPI_Spring_Java/blob/master/captures/swagger.png?raw=true" alt="Imagen representativa">
</p>

Como se puede ver en las imágemnes he implementado 5 funcionalidades:
<ul>
  <li>Listar todas las tareas</li>
  <li>Crear una tarea</li>
  <li>Borrar tareas por Id</li>
  <li>Encontrar tarea por estado</li>
  <li>Actiualizar el estado de una tarea de Id "x"</li>
</ul>

Para ello he utilizado diferentes verbos HTTP y distintas funcionalidades de Spring que he ido aprendiendo con el transcurso del desarrollo de la API.

Además he controlado las excepciones, por ejemplo, si se intenta borrar una tarea con Id no encontrado nos devuelve lo siguiente:

<p align="center">
  <img src="https://github.com/JuanmiAcosta/toDoAPI_Spring_Java/blob/master/captures/ejemplo_excepcion.png?raw=true" alt="Imagen representativa">
</p>

## Tecnologías utilizadas 🛠️ / Lenguajes de programación 👀

* Java - Maven
* Spring
* H2

## Cómo empezar 🫡

1. Clona el repositorio
2. Ejecuta el proyecto
