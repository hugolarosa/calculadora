#Calculadora
Calculadora hecha con un microservicio utilizando Spring Boot y Maven que permite sumar y restar

Se puede acceder mediante una API REST con el siguiente formato:

GET /api/calcula?primerNumero=1&segundoNumero2&operacion=suma

#Requisitos iniciales
Instalar la última vesión de Maven
Instalar el JDK de java

#Uso
1. Descargar del respositorio https://github.com/hugolarosa/calculadora/tree/master
2. Compilar en una instalación Maven limpia
3. Ejecutar jar de la carpeta TARGET

#API REST
Con un cliente REST como Postman ejecutamos un get de la siguiente manera:
http://localhost:8080/api/calcula?primerNumero=10&segundoNumero=5&operacion=resta
Esto nos debería devolver un 5
