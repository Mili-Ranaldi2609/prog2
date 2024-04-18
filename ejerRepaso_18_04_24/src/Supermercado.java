import java.util.List;
import java.util.ArrayList;
public class Supermercado {
    private List<Producto> inventario;

    public Supermercado() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarCompra(Cliente cliente) {
        List<Producto> productosAEliminar = new ArrayList<>();
        for (Producto producto : cliente.getCarrito()) {
            Producto productoEnInventario = buscarProducto(producto.getNombre());
            if (productoEnInventario != null && productoEnInventario.getCantStock() > 0) {
                productoEnInventario.setCantStock(productoEnInventario.getCantStock() - 1);
                if (productoEnInventario.getCantStock() == 0) {
                    productosAEliminar.add(productoEnInventario);
                }
            }
        }
        // Eliminar productos del inventario
        for (Producto producto : productosAEliminar) {
            inventario.remove(producto);
        }
    }


    public void mostrarInventario() {
        for (Producto producto : inventario) {
            producto.infoProduct();
        }
    }
}
