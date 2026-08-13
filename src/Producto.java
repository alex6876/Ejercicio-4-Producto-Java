import java.util.Scanner;

public class Producto {

     String nombre;
     double precio;

     public Producto(String nombre,double precio){
         this.nombre = nombre;
         this.precio = precio;

     }

     public double CalcularDescuento(){

         return precio - (precio * 0.15);

     }

     public double CalcularRecargo(){

         return precio + (precio * 0.30);
     }

     public void MostrarProducto(){

         System.out.println("========= Información =========");
         System.out.println("Nombre de producto:"+nombre);
         System.out.println("Precio:"+precio);
         System.out.println("Precio con Descuento:"+CalcularDescuento());
         System.out.println("Precio con Recargo:"+CalcularRecargo());
         System.out.println("================================");
     }

     public static void main(String[] args) {

         Scanner teclado = new Scanner(System.in);

         System.out.println("Ingrese el nombre del producto:");
         String nombre = teclado.nextLine();

         System.out.println("Ingrese el precio del producto:");
         double precio = teclado.nextDouble();

         teclado.nextLine();

         Producto producto = new Producto(nombre,precio);
         producto.MostrarProducto();

         //Producto 2;

         System.out.println("Ingrese el nombre del producto:");
         nombre = teclado.nextLine();

         System.out.println("Ingrese el precio del producto:");
         precio = teclado.nextDouble();

         teclado.nextLine();

         Producto producto2 = new Producto(nombre,precio);
         producto2.MostrarProducto();

         //producto 3 ;

         System.out.println("Ingrese el nombre del producto:");
         nombre = teclado.nextLine();

         System.out.println("Ingrese el precio del producto:");
         precio = teclado.nextDouble();

         Producto producto3 = new Producto(nombre,precio);
         producto3.MostrarProducto();


     }
}
