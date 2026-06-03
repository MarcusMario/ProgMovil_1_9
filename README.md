# Ejercicio 9 - HTTP - Servicio Web Dog API

Aplicación Android desarrollada en **Kotlin** que consume la API pública **Dog CEO API** utilizando **Retrofit** y **Coroutines** para obtener imágenes de distintas razas de perros. La aplicación permite buscar una raza mediante un `SearchView` y visualizar las imágenes obtenidas en un `RecyclerView`.

---

## Información General

- **Materia:** Programación Móvil
- **Práctica:** Servicio Web Dog API (Ejercicio 9)
- **Lenguaje:** Kotlin
- **IDE:** Android Studio
- **SDK Mínimo:** API 26 (Android 8.0 Oreo)
- **Arquitectura:** Consumo de API REST mediante Retrofit
- **API Utilizada:** Dog CEO API

---

## Objetivo

Implementar el consumo de un servicio web REST utilizando Retrofit y Kotlin Coroutines para recuperar imágenes de perros desde la API Dog CEO y mostrarlas dinámicamente en una interfaz gráfica mediante RecyclerView.

---

## Tecnologías Utilizadas

- Kotlin
- Android SDK
- Retrofit 2
- Gson Converter
- Kotlin Coroutines
- Picasso
- RecyclerView
- CardView
- View Binding
- Dog CEO API

---

## Estructura del Proyecto

```text
HTTP/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/mx/unam/
│   │   │   │   ├── http/
│   │   │   │   │   └── ServiceAPI.kt
│   │   │   │   ├── model/
│   │   │   │   │   ├── DogAdapter.kt
│   │   │   │   │   ├── DogViewHolder.kt
│   │   │   │   │   └── ModeloDog.kt
│   │   │   │   ├── ui/theme/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── item_dog.xml
│   │   │   │   └── values/
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
│   └── libs.versions.toml
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
└── gradlew.bat
```

---

<img width="440" height="996" alt="image" src="https://github.com/user-attachments/assets/3cd0415e-b17b-4e80-86aa-05553dc43c5b" />

<img width="440" height="996" alt="image" src="https://github.com/user-attachments/assets/ac107154-63bb-49b2-8c2d-1c9ea42cb63f" />



## Componentes Principales

###  ServiceAPI.kt

Define la interfaz de comunicación con la API REST mediante Retrofit.

**Responsabilidades:**
- Realizar peticiones HTTP GET.
- Obtener imágenes según la raza solicitada.
- Recibir la respuesta en formato JSON.

---

###  ModeloDog.kt

Modelo de datos encargado de mapear la respuesta JSON recibida desde la API.

**Atributos:**

| Atributo | Tipo |
|-----------|------|
| images | List<String> |

---

###  DogViewHolder.kt

Administra cada elemento visual dentro del RecyclerView.

**Funciones:**
- Asociar una imagen con la vista.
- Cargar imágenes utilizando Picasso.

---

###  DogAdapter.kt

Adaptador encargado de administrar la lista de imágenes obtenidas desde la API.

**Funciones:**
- Crear ViewHolder.
- Vincular datos con cada tarjeta.
- Gestionar el tamaño de la colección.

---

###  MainActivity.kt

Clase principal de la aplicación.

**Responsabilidades:**
- Configurar View Binding.
- Inicializar RecyclerView.
- Gestionar búsquedas desde SearchView.
- Realizar llamadas a la API mediante Retrofit.
- Actualizar dinámicamente la interfaz.

---

##  Diseño de la Interfaz

### activity_main.xml

Contiene:

- SearchView para ingresar la raza.
- RecyclerView para mostrar resultados.

### item_dog.xml

Diseño individual de cada elemento del RecyclerView:

- CardView
- ImageView
- Bordes redondeados
- Visualización de imágenes a pantalla completa

---

##  Flujo de Funcionamiento

1. El usuario escribe una raza de perro.
2. SearchView envía la consulta.
3. Retrofit realiza la petición a Dog CEO API.
4. La API devuelve una lista de imágenes.
5. Se procesa la respuesta JSON.
6. RecyclerView actualiza los resultados.
7. Picasso descarga y muestra las imágenes.

---

## Endpoint Utilizado

```http
https://dog.ceo/api/breed/{raza}/images
```

### Ejemplo

```http
https://dog.ceo/api/breed/husky/images
```

---

##  Ejemplos de Razas Compatibles

- husky
- pug
- boxer
- beagle
- dalmatian
- chihuahua
- labrador
- bulldog
- doberman
- rottweiler

---

##  Permisos Utilizados

En el archivo `AndroidManifest.xml` se agregó:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

Este permiso permite realizar peticiones HTTP hacia servicios web externos.

---

##  Dependencias Principales

```kotlin
implementation(libs.retrofit)
implementation(libs.retrofit.converter.gson)
implementation(libs.picasso)
implementation(libs.kotlinx.coroutines.core)
```

---

##  Aprendizajes Obtenidos

Durante esta práctica se aplicaron los siguientes conceptos:

- Consumo de APIs REST.
- Uso de Retrofit.
- Programación asíncrona con Coroutines.
- Manejo de respuestas JSON.
- Uso de RecyclerView.
- Implementación de Adapter y ViewHolder.
- Carga de imágenes con Picasso.
- View Binding.
- Arquitectura básica de aplicaciones Android conectadas a servicios web.

---

## Licencia

Proyecto desarrollado con fines académicos para la asignatura de **Programación Móvil**.
