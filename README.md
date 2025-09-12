# JavaFX FlowPane Alignment (FXML)

Este proyecto es un ejemplo de aplicación **JavaFX** que utiliza la arquitectura estándar de **Maven**.  
La interfaz se define en un archivo **FXML** y los estilos se aplican con un archivo **CSS** externo.

## 📌 Descripción

La aplicación muestra cómo:
- Separar la lógica de la interfaz en **App.java** y la vista en **App.fxml**.
- Aplicar estilos mediante **styles.css**.
- Ejecutar un proyecto JavaFX organizado con **Maven**.

## 🛠️ Tecnologías utilizadas

- [Java 17+](https://www.oracle.com/java/technologies/downloads/) (recomendado)  
- [JavaFX](https://openjfx.io/)  
- [Maven](https://maven.apache.org/) para la gestión de dependencias y compilación  
- FXML + CSS  

## ▶️ Ejecución

1. Asegúrate de tener instalado:
   - JDK 17+
   - Maven
   - JavaFX

2. Compila y ejecuta con Maven:

```bash
mvn clean install
mvn javafx:run
