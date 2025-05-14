# 🛒 Products API (Spring Boot + Kotlin + H2)

Este es un proyecto base usando **Spring Boot**, **Kotlin**, y una base de datos **H2 en memoria**.

> Si vienes de Python, aquí aprenderás cómo se estructura un proyecto moderno en Java/Kotlin, cómo funciona la inyección de dependencias, y cómo usar una base de datos sin necesidad de instalar nada.

---

## 📦 Requisitos previos

### ✅ Instalar Java 21 (Instrucciones para Windows)

1. Ve a [https://adoptium.net/temurin/releases/](https://adoptium.net/temurin/releases/)
2. Descarga **Temurin 21** para Windows (x64 MSI Installer)
3. Instálalo. Por defecto quedará en:  
   `C:\Program Files\Eclipse Adoptium\jdk-21.*`

4. Configura la variable de entorno:

   Abre PowerShell o CMD:

   ```bash
   setx JAVA_HOME "C:\Program Files\Eclipse Adoptium\jdk-21.*" /M
   setx PATH "%JAVA_HOME%\bin;%PATH%" /M
   ```

5. Verifica que esté bien instalado:

   ```bash
   java -version
   ```

   Debes ver algo como:
   ```
   openjdk version "21.0.x" ...
   ```

---

### ✅ Instalar IntelliJ IDEA Community

1. Ve a [https://www.jetbrains.com/idea/download](https://www.jetbrains.com/idea/download)
2. Descarga la versión **Community Edition**
3. Instálala como cualquier programa de Windows

---

## 🚀 Clonar y ejecutar el proyecto

### 1. Clona el repositorio

```bash
git clone https://github.com/jsaavedra815/products.git
cd products
```

### 2. Abrir en IntelliJ

- Abre IntelliJ → **File > Open...** → Selecciona la carpeta del proyecto.
- Espera a que IntelliJ detecte y cargue el proyecto (`build.gradle.kts`).
- Si pide instalar Gradle o Kotlin, acepta.

### 3. Ejecutar

- En `src/main/kotlin/com/example/products/ProductsApplication.kt`, haz clic derecho en la función `main` y elige **Run**.
- La app iniciará en `http://localhost:8080`

---

## 🧪 Probar la base de datos H2

### Consola web

1. Ve a: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
2. Usa esta configuración:
    - **JDBC URL**: `jdbc:h2:mem:productdb`
    - **Username**: `admin` (o `sa` si usas el default)
    - **Password**: `admin` (o en blanco)

Haz clic en **Connect** y explora la base de datos en memoria.

---

## 📚 Estructura del proyecto

```
src/
 └── main/
      └── kotlin/
           └── com/example/products/
                ├── ProductsApplication.kt
                ├── controller/
                ├── service/
                └── model/
```

- `controller/`: controla los endpoints HTTP
- `service/`: contiene la lógica de negocio
- `model/`: define las entidades y DTOs
- `ProductsApplication.kt`: punto de entrada principal (`main()`)

---

## 🤖 ¿Preguntas?

Si algo no funciona, revisa:
- Que tengas Java 21 correctamente configurado
- Que hayas abierto el proyecto como **Gradle Project**
- Que el archivo `application.yml` esté correcto

---

¡Bienvenido al mundo de Spring! 🌱