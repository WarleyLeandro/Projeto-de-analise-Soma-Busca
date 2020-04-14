public class Multiplicacao {

    public static int multiplicacaoIterativa(int num) {
        int soma = 0;
        for (int i = 0; i < num; i++) {
            soma = soma + 3;
        }
        return soma;
    }

    public static int multiplicacaoRecursiva(int num) {
        if (num == 0) {
            return 0;
        } else {
            return 3 + multiplicacaoRecursiva(num - 1);
        }
    }

    public static void main(String args[]) throws Exception{
        long inicial = System.nanoTime();
        System.out.println("soma: " + multiplicacaoIterativa(13000));
        long fim = System.nanoTime();
        System.out.println("Iterativo: " + (fim - inicial));

        inicial = System.nanoTime();
        System.out.println("soma: " + multiplicacaoRecursiva(13000));
        fim = System.nanoTime();
        System.out.println("Recursivo: " + (fim - inicial));

        // Comparar o tempo
    }
}