public class objComida 
{
    private String producto;
    private Double precio;
    private int cantidad;
    private String cliente;
    public objComida() {
    }
    public objComida(String producto, Double precio, int cantidad, String cliente) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }
    public objComida (objComida o)//ESTO ES LO MISMO QUE SET Y GET, TIENEN LA MISMA FUNCIÓN
    {
        this.producto = o.producto;
        this.precio = o.precio;
        this.cantidad = o.cantidad;
        this.cliente = o.cliente;

    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String toString() 
    {
        return "Cliente: " + cliente + ", Pedido: " + producto;
    }
    
    
}
