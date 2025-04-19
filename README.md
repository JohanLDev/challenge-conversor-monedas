# 💱 Conversor de Monedas - Reto Programa ONE G8

Este proyecto es parte del **Reto de Consumo de API con Java** del programa [Oracle Next Education (ONE) - Generación 8](https://www.oracle.com/lad/education/oracle-next-education/).  
Su objetivo principal es implementar un **conversor de monedas** que utilice una API externa para realizar conversiones en tiempo real, utilizando buenas prácticas de programación en Java.

---

## 🧠 Tecnologías y herramientas utilizadas

- **Java 17**
- **Gson** (para deserializar respuestas JSON)
- **HttpClient** (de Java 11+ para realizar solicitudes HTTP)
- **POO** (Programación Orientada a Objetos)
- **Records** (novedad de Java para modelar objetos inmutables)
- **Interfaces y herencia**
- **Manejo de excepciones**
- **Menú interactivo en consola**

---

## 🔁 Funcionalidad del conversor

El sistema permite convertir montos entre las siguientes monedas:

1. Dólar estadounidense ⇄ Peso argentino  
2. Dólar estadounidense ⇄ Real brasileño  
3. Dólar estadounidense ⇄ Peso colombiano  

El usuario puede seleccionar una opción desde el menú interactivo, ingresar el monto deseado y obtener la conversión actualizada al instante.

La conversión se realiza consultando la API pública de ExchangeRate:
```
https://v6.exchangerate-api.com/v6/0dd6631f166ad408e67fd5e6/pair/{FROM}/{TO}/{AMOUNT}
```

---

## ✅ Características del proyecto

- ✅ Consumo de API REST con `HttpClient`
- ✅ Deserialización de JSON con `record` + Gson
- ✅ Separación por paquetes (modularidad y buenas prácticas)
- ✅ Lógica encapsulada en clases e interfaces
- ✅ Sistema de menú amigable en consola
- ✅ Validación de opciones y errores en tiempo de ejecución

---

## 🚀 Cómo usarlo

1. Clona el repositorio o copia el proyecto a tu entorno.
2. Asegúrate de tener **Java 17** instalado.
3. Ejecuta la clase `Main.java`.
4. Sigue las instrucciones del menú y disfruta convirtiendo monedas 😊

---

## 📚 Aprendizajes aplicados

Este reto fue una excelente oportunidad para reforzar:
- Uso de `HttpClient` moderno
- Uso práctico de `record` en Java
- Aplicación de principios SOLID (en particular, separación de responsabilidades)
- Control de flujo con menús
- Trabajo con formatos de respuesta JSON

---

## 👨‍💻 Autor

**Johan**  
Estudiante del programa Oracle Next Education - G8  
Apasionado por el backend, la automatización y el diseño de software modular 💻
