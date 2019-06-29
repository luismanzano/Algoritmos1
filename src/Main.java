package Project;

public class Main {

    public static void main(String[] args) {


        int [] entrada = new int[2];
        int [] salida = new int[2];


        Laberinto lab=new Laberinto();
        lab.rellenar();
        lab.imprimir();
        lab.entrada_salida();
        lab.declarar_entrada(lab.entradaSalida);
        lab.entrada_salida();
        lab.declarar_salida(lab.entradaSalida);
        lab.imprimir();
        lab.paredes();
        lab.imprimir();
        System.out.println(lab.matriz.length);
        lab.divisiones();


    }


}
