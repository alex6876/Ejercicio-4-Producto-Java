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

         Producto producto = new Producto("Galleta Diversión", 2800);
         producto.MostrarProducto();

         Producto producto1 = new Producto("Salsa Molto", 900);
         producto1.MostrarProducto();

         Producto producto2 = new Producto("Polvoritas", 600);
         producto2.MostrarProducto();

     }
     
}
