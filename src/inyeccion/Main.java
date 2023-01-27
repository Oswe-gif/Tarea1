package inyeccion;

public class Main {

    public static void main(String[] args) {
        Servicio claseA = new Servicio(new Mysql());
        claseA.metodo();
    }
}
