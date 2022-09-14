# Prueba DSJR-2022

## Base de datos
Ingresa a src/docker desde tu consola y ejecuta el comando de abajo para iniciar una nueva base de datos MySQL a través del puerto 3307 del host.
```bash
sudo docker-compose up
```

## API REST
Descarga o clona el repositorio en tu local y luego importalo en tu IDE. En este caso el utilizado es Intellij.
Asegurate de tener las siguientes versiones de Java y Maven
```bash
Openjdk version "11.0.8" 2020-07-14
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
```
Una vez configurado en tu IDE inicial el servicio de Maven para poder iniciar el servicio REST por el puerto 8080.

## React
Asegurate de tener las siguientes versiones:
```bash
node 16.17.0
```

Ingresa a src/docker desde tu consola e instala las dependencias con Yarn.
```bash
yarn install
```
Una vez instaladas las dependencias inicia crea el archivo .env con la variable de entorno REACT_APP_API_URL="http://localhost:8080".
Inicia el servicio con el comando
```bash
yarn start
```
