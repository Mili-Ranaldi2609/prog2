import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
       Supermercado supermercado= new Supermercado();
        supermercado.agregarProducto(new Producto("Leche",1090.98,10));
        supermercado.agregarProducto(new Producto("Azucar",900.50,5));
        supermercado.agregarProducto(new Producto("Te ",500,20));
        supermercado.agregarProducto(new Producto("Yerba",1536.34,2));
        supermercado.agregarProducto(new Producto("Jugo",250,0));
        supermercado.mostrarInventario();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombreCliente=scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String apellidoCliente= scanner.nextLine();
        Cliente c1 = new Cliente(nombreCliente,apellidoCliente);
        System.out.println("Desea agregar un producto a su carrito? (s) para si y (n) para no");
        String respuesta=scanner.nextLine();
        do {
        System.out.println("Ingrese el nombre del producto que desea agregar a su carrito:");
        String nombreProducto = scanner.nextLine();
        Producto productoAAgregar = supermercado.buscarProducto(nombreProducto);

         if (productoAAgregar != null && productoAAgregar.getCantStock() > 0) {
          c1.agregarProductoAlCarrito(productoAAgregar);
          System.out.println("Producto agregado al carrito.");
         } else {
          System.out.println("Producto no encontrado en el inventario o no tiene stock disponible.");
         }

        System.out.println("¿Desea agregar otro producto? (s/n)");
        respuesta = scanner.nextLine();

       } while (respuesta.equalsIgnoreCase("s"));
       DecimalFormat formato = new DecimalFormat("#.##");

        double totalCompra=c1.calcularTotalCompra();
        String redondeadoTotal=formato.format(totalCompra);
        System.out.println("El total de su compra es: "+redondeadoTotal);
        supermercado.realizarCompra(c1);
     // Mostrar el inventario después de la compra
     System.out.println("Inventario después de la compra:");
     supermercado.mostrarInventario();
    }
}
