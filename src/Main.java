public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio if");
        int numeroIf = 6;
        if (numeroIf == 0) {
            System.out.println("igual a 0");
        } else if (numeroIf < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("positivo");
        }

        System.out.println("Ejercicio While");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("Ejercicio doWhile");
        int numerodoWhile = 4;
        do {
            System.out.println(numerodoWhile);
            numeroWhile = numerodoWhile + 1;
        } while (numerodoWhile < 3);
        System.out.println("Ejercicio for");
        for(int numeroFor= 0; numeroFor<=3; numeroFor= numeroFor+1){
            System.out.println(numeroFor);
        }
        System.out.println("Ejercicio Switch");
        var estacion= "esa";
        switch (estacion){
            case "verano":
            case "otoño":
            case "invierno":
            case "primavera":
                System.out.println(estacion);
                break;
            default:
                System.out.println("eso no es verdad");
        }
    }
}