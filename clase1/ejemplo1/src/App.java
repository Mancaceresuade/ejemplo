public class App {
    public static void main(String[] args) throws Exception {
        Cajero cajero = new Cajero(0, "Carlos","10:00");
        System.out.println(cajero);
        cajero.cerrar(cajero.getHorarioCierreCaja());
    }
}
