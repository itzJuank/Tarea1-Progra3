# Tarea #1 - Programacion 3

Proyecto en Java para practicar listas enlazadas simples usando nodos y referencias.

## Descripcion

El programa maneja una lista de lineas de detalle para una factura de ferreteria. Cada linea contiene un producto, una cantidad y su importe.

La clase principal es `ListaLineas`, que implementa operaciones basicas de lista enlazada:

- Agregar una linea al final.
- Buscar una linea por codigo de producto.
- Obtener la linea con mayor importe.
- Contar las lineas recorriendo los nodos.
- Calcular el subtotal recorriendo la lista.
- Mostrar el contenido de la lista.

## Archivos

- `Producto.java`: representa un producto con codigo, descripcion y precio unitario.
- `LineaDetalle.java`: representa una linea de factura con producto y cantidad.
- `ListaLineas.java`: implementa una lista enlazada simple con nodos y referencias.
- `Main.java`: contiene los datos de prueba y ejecuta las verificaciones basicas.

## Como ejecutar

Desde la carpeta del proyecto:

```bash
javac *.java
java Main
```

## Resultado esperado

El programa debe mostrar que el subtotal inicial es `51000`, que la lista tiene `5` lineas, que puede buscar productos por codigo y que puede recorrer la cadena completa hasta llegar a `null`.
