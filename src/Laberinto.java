package Project;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Laberinto {
    int tamano, nivel,a,b;
    int matriz[][];
    int [] entradaSalida = new int[2];
    int [] salida = new int[2];

    Random rand = new Random();


    public void rellenar(){
        nivel=9;
        if(nivel<=10){
            tamano=10;
            matriz=new int[tamano][tamano];
        }else if(nivel>10 && nivel < 21){
            tamano=20;
            matriz=new int[tamano][tamano];
        }else if(nivel>20){
            tamano=30;
            matriz=new int[tamano][tamano];
        }
    }

    public void imprimir(){
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------------------------");
    }

    public void entrada_salida(){
        if(nivel<=10){
            a= rand.nextInt(10);
            b= rand.nextInt(10);
            System.out.println(a);
            System.out.println(b);

            while((a==0 && b==0) || (a==9 && b==9) || (a==9 && b==0) || (a==0 && b==9) || (a!=0 && b!=0) || (a!=9 && b!=9)){
                a= rand.nextInt(10);
                b= rand.nextInt(10);
                System.out.println("re");
                if((a==0&&b!=0)||(a==0&&b!=9)||(b==0&&a!=9)||(b==0&&a!=0)||(a==9&&b!=0)||(a==9&&b!=9)||(b==9&&a!=9)||(b==9&&a!=0)){
                    break;
                }
            }


            System.out.println("numero 1 es " + a + " numero dos es " + b);

            entradaSalida[0] = a;
            entradaSalida[1] = b;
        }
    }

    public void declarar_entrada(int [] entrada){
        matriz[entrada[0]][entrada[1]] = 6;
    }

    public void declarar_salida(int [] salida){
        matriz[salida[0]] [salida[1]] = 9;
    }

    public void paredes(){
        int n = matriz.length-1;
        for (int i = 0; i < n ; i++) {
            if ((matriz[0][i] != 6) && (matriz[0][i] != 9)) {
                matriz [0][i] = 1;
            }

            if ((matriz[i][0] != 6) && (matriz[i][0] != 9)) {
                matriz [i][0] = 1;
            }

            if ((matriz[n][i] != 6) && (matriz[n][i] != 9)) {
                matriz [n][i] = 1;
            }

            if ((matriz[i][n] != 6) && (matriz[i][n] != 9)) {
                matriz [i][n] = 1;
            }

            matriz[n][n] = 1;


        }

    }

    public void divisiones(){

        int x;
        int y;
        List<List<Integer>> inicios = new ArrayList<List<Integer>>();
        List<List<Integer>> finales = new ArrayList<List<Integer>>();

        do{
            x= rand.nextInt(matriz.length-1);
            y= rand.nextInt(matriz.length-1);
        } while(matriz[x][y]==1);

        System.out.println("("+x+","+y+")");
        int[] ini = {x,y};
        ArrayList<Integer> inicio= new ArrayList<Integer>(); // Create an ArrayList object
        inicio.add(x);
        inicio.add(y);

        inicios.add(inicio);



        /*
        b= rand.nextInt(matriz.length-1);
        System.out.println(a);
        System.out.println(b);

        while((a==0 && b==0) || (a==9 && b==9) || (a==9 && b==0) || (a==0 && b==9) || (a!=0 && b!=0) || (a!=9 && b!=9)){
            a= rand.nextInt(10);
            b= rand.nextInt(10);
            System.out.println("re");
            if((a==0&&b!=0)||(a==0&&b!=9)||(b==0&&a!=9)||(b==0&&a!=0)||(a==9&&b!=0)||(a==9&&b!=9)||(b==9&&a!=9)||(b==9&&a!=0)){
                break;
            }
        }*/
    }
}
