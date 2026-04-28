public class ex3 {

    
    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0]; 

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] entrada1 = {4, 7, 2, 9, 1};
        int[] entrada2 = {100, 50, 75};

        System.out.println("Maior valor: " + encontrarMaior(entrada1));
        System.out.println("Maior valor: " + encontrarMaior(entrada2));
    }
}