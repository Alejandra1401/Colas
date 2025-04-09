import java.util.Queue;
import java.util.Scanner;

public class metodos
{
    Scanner sc = new Scanner(System.in);
    public Queue<objComida> IngresarPedido(Queue<objComida> p, int opt) 
    {
        objComida o = new objComida();
        switch (opt) 
        {
            case 1:
                o.setProducto("Perro");
                break;
            case 2:
                o.setProducto("burger");
                break;
            case 3:
                o.setProducto("Corizo");
                break;

            default:
                o.setProducto("French Fries");
                break;
        }
        System.out.println("Ingrese el Nombre del cliente");
        o.setCliente(sc.next());
        System.out.println("Ingrese la cantidad");
        o.setCantidad(sc.nextInt());
        System.out.println("Ingrese el precio");
        o.setPrecio(sc.nextDouble());
        p.offer(o);

        return p;
    }
    public void MostrarTurno(Queue<objComida> p) 
    {
        if (p.isEmpty()) 
        {
            System.out.println("No hay turnos, acabaste de entrar a trabajar.");
        } 
        else
        {
            objComida primerTurno = p.peek(); // peek() devuelve el primero sin eliminarlo
            System.out.println("Primer turno: " + primerTurno.getCliente());
        }
    }
    public Queue<objComida> Despachar(Queue<objComida> p) 
    {
        if (p.isEmpty()) 
        {
            System.out.println("No hay pedidos");

        } else 
        {
            objComida pedidoDespachado = p.poll(); //Elimina y devuelve el primero 
            System.out.println("Pedido despachado:" + pedidoDespachado);

        }
        return p;

    }

}