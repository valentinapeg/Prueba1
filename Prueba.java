package forma1;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Auto a0 = new Auto();
        a0.modelo = "clasico";
        a0.color = "lila";
        a0.id =0 ;

        Auto a1 = new Auto();
        a1.modelo = "deportivo";
        a1.color = "verde";
        a1.id =1 ;

        Auto a2 = new Auto();
        a1.modelo = "standar";
        a1.color = "Azul";
        a1.id =2 ;

        System.out.println("a0: "+a0.modelo+" "+a0.id+" "+a0.color);
        System.out.println("a1: "+a1.modelo+" "+a1.id+" "+a1.color);
        System.out.println("a2: "+a2.modelo+" "+a2.id+" "+a2.color);

    }
}
