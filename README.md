# 🧠 ¿Qué hace el programa?
Simula un sistema básico de inventario de supermercado, que:

Registra productos con información completa

Permite modificar precios

Eliminar productos

Verifica si un producto está vencido hace más de 3 días y descuenta una unidad

Todo se guarda en memoria (no hay base de datos real)


📦 LIBRERÍAS IMPORTADAS
Contiene 5 Librerias importadas de java

🔢 OPCIONES DEL MENÚ
🔹 Opción 1 – Registrar producto

Pide los siguientes datos al usuario:

ID
Nombre del producto 📦
Precio (como double)
Cantidad en bodega (como int)
Si está caducado (true/false)
Fecha de vencimiento (LocalDate)
Dos fotos (String)
Descripción
Proveedor
Luego se agrega el producto a la lista:

🔹 Opción 2 – Mostrar productos 📦
Muestra cada producto con su información.


🔹 Opción 3 – Modificar precio 
Busca un producto por ID. Si lo encuentra:
Actualiza el precio.

🔹 Opción 4 – Eliminar producto X 📦
Busca por ID e elimina el producto:

🔹 Opción 5 – Verificar caducidad
Si el producto está caducado y pasaron 3 días desde la fecha de vencimiento, se descuenta una unidad de la bodega.

🔹 Opción 6 – Salir
Finaliza el bucle.

📌 RESUMEN FINAL
Elemento	Uso
ArrayList<HashMap<>>	Simula base de datos de productos
HashMap<String, Object>	Representa cada producto
Scanner	Lee datos del usuario
LocalDate	Guarda fechas
Period	Calcula diferencia de fechas
switch	Controla el menú interactivo
