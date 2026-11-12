import java.util.ArrayList;

public class Panaderia implements Observable{
    boolean hayPan = false;
    private ArrayList<Vecino> vecinos = new ArrayList<Vecino>();

    public void sacarPan() {
        hayPan = true;
        notificar(">> Salio el pan caliente");
    }

    public boolean hayPan() {
        return hayPan;
    }

    @Override
    public void suscribir(Vecino v) {
        vecinos.add(v);
    }

    @Override
    public void desuscribir(Vecino v) {
        vecinos.removeIf(vecino -> vecino.nombre.equals(v.nombre));
    }

    @Override
    public void notificar(String notificacion) {
        for (Vecino v : vecinos) {
            v.recibirAviso(notificacion);
        }
    }








}
