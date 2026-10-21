Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Gestión de Empleados y Control Salarial (Encapsulamiento en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 👨‍💼 Simulación de Gestión de Empleados y Salarios (Encapsulamiento y Validaciones en Java)

Este proyecto es una aplicación en Java que modela la administración de datos e información financiera de un empleado corporativo. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y modificadores, y la validación de reglas de negocio para incrementos salariales en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Empleado`**: Modela la entidad de recursos humanos y protege la integridad de los datos personales y económicos.
* **Atributos privados (`private`)**: `nombre`, `dni` y `salario`, impidiendo el acceso o modificación directa desde fuera de la clase.
* **Constructor**: Inicializa el perfil del empleado validando de forma defensiva que el salario inicial no sea negativo (`salario >= 0`). Si el valor es inválido, se asigna por defecto en `0`.
* **Métodos accesores y modificadores (*getters/setters*)**: Permiten consultar y actualizar de forma controlada el valor del salario.
* **Métodos operativos de negocio**:
* `actualizarSalario(double porcentajeAumento)`: Incrementa el sueldo actual siempre que el valor ingresado sea mayor estricto a cero.
* `mostrar()`: Imprime por consola la información básica del empleado (nombre y DNI).




* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `Empleado`, aplica una actualización salarial, muestra sus datos por consola y consulta el sueldo final mediante el método accesor.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Protección Defensiva de Salarios Iniciales:** El constructor evalúa que el sueldo ingresado al instanciar el objeto no sea negativo, evitando estados incoherentes en el sistema financiero en memoria.
2. **Validación de Incrementos Salariales:** El método encargado de actualizar los haberes (`actualizarSalario`) comprueba que el valor de aumento sea positivo (`porcentajeAumento > 0`). En caso contrario, intercepta la operación y emite una advertencia informativa por consola.
3. **Encapsulamiento Estricto:** Al ocultar los campos mediante el modificador `private`, se garantiza que cualquier modificación de los datos pase obligatoriamente por los filtros lógicos definidos en la clase.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Nombre: Alex
Dni: 48.446.446
Salario: 7500.0

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento:** Ocultamiento de la estructura interna del objeto para proteger los datos frente a modificaciones accidentales o no autorizadas.
* **Consistencia de Estado:** Garantía de que los valores económicos de la entidad mantengan rangos válidos durante todo su ciclo de vida operativo.
* **Diseño Modular:** Clara separación de responsabilidades entre la entidad de dominio (`Empleado`) y la lógica de ejecución del cliente (`Main`).

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba ilustran cómo aplicar correctamente los conceptos de **encapsulamiento**, control de atributos mediante *getters/setters* y validación de reglas de negocio en Java.
