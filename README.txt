201710_CSOF5101_01 - CONCEP. AVAN. DE INGENI. SOFTW
Tarea 4 psp2 - Rangos de tamaño
Daniel Melgarejo Rodriguez
20/3/2017 11:48

Link de github: https://github.com/dhmelgarejo/Tarea4

Cloar el repositorio ejecutando :
git clone https://github.com/dhmelgarejo/Tarea4.git

El programa fue realizado con JRE 1.8

Descargar o clonar el programa encontrado en git
Debe tener instalado Maven y luego ejecutar 
mvn package

Se ejecutaran las pruebas y se generara un jar de ejecucion el cual puede probar corriendo el comando
java -jar .\Programa4-0.0.1-SNAPSHOT-jar-with-dependencies.jar

Se le preguntara una ruta al archivo a analizar el cual debera cumplir con alguna de las siguientes estructura:
	Si tiene 3 columnas se entendera que se quiere calcular LOC/Method para hallar los rangos, en donde el orden de las columnas sera el Nombre, LOC y cantidad de metodos

	Si se tienen 2 columnas se utilizara el valor de la segunda para hallar los rangos,en donde el orden de las columnas sera el Nombre y la cantidad a calcular

Los archivos estaran separados por espacios " " 
Se pueden apreciar y ejecutar las pruebas con los archivos encontrados en \src\test\resources\