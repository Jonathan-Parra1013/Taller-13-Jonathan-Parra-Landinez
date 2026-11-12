public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("          Creamos Panaderia y Vecinos");
        System.out.println("========================================");

        Panaderia panaderia = new Panaderia();
        Vecino ana = new Vecino("Ana");
        Vecino luis = new Vecino("Luis");
        Vecino marta = new Vecino("Marta");

        System.out.println("========================================");
        System.out.println("          Suscribimos a los Vecinos");
        System.out.println("========================================");

        panaderia.suscribir(ana);
        panaderia.suscribir(luis);
        panaderia.suscribir(marta);

        System.out.println("========================================");
        System.out.println("          Salio el Pan");
        System.out.println("========================================");


        panaderia.sacarPan();

        System.out.println("========================================");
        System.out.println("          Quitamos un Vecino");
        System.out.println("========================================");

        panaderia.desuscribir(ana);

        System.out.println("========================================");
        System.out.println("          Salio MÁS Pan pero no para Ana");
        System.out.println("========================================");

        panaderia.sacarPan();

    }
}
