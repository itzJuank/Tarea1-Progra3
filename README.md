# Tarea #1 - Programacion 3

Proyecto en Java para practicar listas enlazadas simples usando nodos y referencias.

## Descripcion

El programa maneja una lista de lineas de detalle para una factura de ferreteria. Cada linea contiene un producto, una cantidad y su importe.

La clase principal es `ListaLineas`, que implementa operaciones basicas de lista enlazada:

- Agregar una linea al final.
- Insertar una linea en cualquier posicion.
- Eliminar una linea.
- Buscar una linea por codigo de producto.
- Obtener la linea con mayor importe.
- Consolidar productos repetidos.
- Invertir el orden de la lista.

## Archivos

- `Producto.java`: representa un producto con codigo, descripcion y precio unitario.
- `LineaDetalle.java`: representa una linea de factura con producto y cantidad.
- `ListaLineas.java`: implementa la lista enlazada y sus operaciones.
- `Main.java`: contiene los datos de prueba y ejecuta las verificaciones.
- `Explicacion_Codigo.docx`: documento explicativo del funcionamiento del codigo.

## Como ejecutar

Desde la carpeta del proyecto:

```bash
javac *.java
java Main
```

## Resultado esperado

El programa debe mostrar que el subtotal inicial es `51000`, que `consolidar()` elimina una linea repetida y que el subtotal se mantiene igual despues de consolidar e invertir la lista.
