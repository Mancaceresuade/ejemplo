public class Cajero extends Persona implements Cerrable{
    private String horarioCierreCaja;
    public Cajero(int id, String nombre,String horarioCierreCaja) {
            super(id, nombre);
            this.horarioCierreCaja = horarioCierreCaja;
    }
    public String getHorarioCierreCaja() {
        return horarioCierreCaja;
    }
    public void setHorarioCierreCaja(String horarioCierreCaja) {
        this.horarioCierreCaja = horarioCierreCaja;
    }
    @Override
    public String toString() {
        return "Cajero [id=" + id + ", horarioCierreCaja=" + horarioCierreCaja + ", nombre=" + nombre + "]";
    }
    @Override
    public void cerrar(String horarioCierre) {
        System.out.println("Cerrar caja a las " + horarioCierre);
    }
    
}
