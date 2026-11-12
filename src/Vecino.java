public class Vecino implements Observer {
    public  String nombre;

    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    // se borra metodo preguntar :D, Porque ahora recibe la notificacion :b
    //public void preguntar(Panaderia panaderia) {
      //  if (panaderia.hayPan()) {
        //    System.out.println(nombre + " pregunta: hay pan? -> si, voy por el pan");
      //  } else {
        //    System.out.println(nombre + " pregunta: hay pan? -> todavia no");
       // }
   // }

    @Override
    public void recibirAviso(String notificacion) {
       System.out.println("Hola " + nombre + " ya llego la notificacion " + notificacion);
       System.out.println("Ya voy por pan :D");
    }


}
