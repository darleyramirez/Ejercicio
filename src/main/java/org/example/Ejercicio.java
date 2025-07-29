package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;




public class Ejercicio {
    public static void main(String[] args) {
        System.out.println("Supermercado");
        Scanner scanner = new Scanner(System.in);

         /*//Almacenar en variables la informacion de un producto
        //ID
        //Nombre
        //Precio
        //Cantidad en bodega
        //Caducidad
        //Fecha de vencimiento
        //Fotografia1
        //Fotografia2
        //Descripcion
        //nombreProveedor

        // Si el producto se vence y han pasado 3 dias desde la fecha de vencimiento se debe
        //restar la unidad vencidad a la cantidad en bodega

        //Se debe permmitir registrar n productos en una base de datos simulada en java

        //Se debe permitir modificar el precio unitario de cualquier producto ingresado

        //Se debe permititr eliminar un producto de la bodega */


                ArrayList<HashMap<String, Object>> productos = new ArrayList<>();

                boolean salir = false;

                while (!salir) {
                    System.out.println("\n--- Menú ---");
                    System.out.println("1. Registrar producto");
                    System.out.println("2. Mostrar productos");
                    System.out.println("3. Modificar precio");
                    System.out.println("4. Eliminar producto");
                    System.out.println("5. Verificar caducidad");
                    System.out.println("6. Salir");
                    System.out.print("Elija una opción: ");
                    int opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1 -> {
                            HashMap<String, Object> producto = new HashMap<>();

                            System.out.print("ID: ");
                            producto.put("ID", scanner.nextLine());

                            System.out.print("NombreProducto: ");
                            producto.put("NombreProducto", scanner.nextLine());

                            System.out.print("Precio: ");
                            producto.put("Precio", scanner.nextDouble());

                            System.out.print("Cantidad en bodega: ");
                            producto.put("Cantidad", scanner.nextInt());
                            scanner.nextLine(); // limpiar buffer

                            System.out.print("¿Está caducado? (True/False): ");
                            producto.put("Caducado", scanner.nextBoolean());
                            scanner.nextLine();

                            System.out.print("Fecha que vencimiento (YYYY-MM-DD): ");
                            producto.put("Vencimiento", LocalDate.parse(scanner.nextLine()));

                            System.out.print("Fotografía 1: ");
                            producto.put("Foto1", scanner.nextLine());

                            System.out.print("Fotografía 2: ");
                            producto.put("Foto2", scanner.nextLine());

                            System.out.print("Descripción: ");
                            producto.put("Descripcion", scanner.nextLine());

                            System.out.print("Nombre proveedor: ");
                            producto.put("Proveedor", scanner.nextLine());

                            productos.add(producto);
                            System.out.println("✅ Producto registrado.");
                        }

                        case 2 -> {
                            for (HashMap<String, Object> prod : productos) {
                                System.out.println(prod);
                            }
                        }

                        case 3 -> {
                            System.out.print("Ingrese el ID del producto a modificar: ");
                            String idBuscar = scanner.nextLine();
                            for (HashMap<String, Object> prod : productos) {
                                if (prod.get("ID").equals(idBuscar)) {
                                    System.out.print("Nuevo precio: ");
                                    prod.put("Precio", scanner.nextDouble());
                                    scanner.nextLine();
                                    System.out.println("Valor Actualizado.");
                                    break;
                                }
                            }
                        }

                        case 4 -> {
                            System.out.print("Ingrese el Codigo ID del producto a eliminar: ");
                            String idEliminar = scanner.nextLine();
                            productos.removeIf(prod -> prod.get("ID").equals(idEliminar));
                            System.out.println(" Producto eliminado.");
                        }

                        case 5 -> {
                            for (HashMap<String, Object> prod : productos) {
                                boolean caducado = (boolean) prod.get("Caducado");
                                LocalDate vencimiento = (LocalDate) prod.get("Vencimiento");
                                if (caducado && Period.between(vencimiento, LocalDate.now()).getDays() >= 3) {
                                    int cantidad = (int) prod.get("Cantidad");
                                    if (cantidad > 0) {
                                        prod.put("Cantidad", cantidad - 1);
                                        System.out.println(" Producto vencido, cantidad restada. ID: " + prod.get("ID"));
                                    }
                                }
                            }
                        }

                        case 6 -> salir = true;

                        default -> System.out.println("Opción no válida.");
                    }
                }
            }
        }