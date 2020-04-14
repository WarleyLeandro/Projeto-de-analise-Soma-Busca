
public class Busca {

    public static int[] criarVetor() {
        int[] vet = new int[20000000];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i + 1;
        }
        return vet;
    }

    //Busca Sequencial
    public static Boolean buscaSequencial(int[] vet, int num) {
        for (int i = 0; i <= vet.length; i++) {
            if (num == vet[i]) {
                return true;
            }
        }
        return false;
    }

    //Busca binaria recursiva
    public static int buscaBinariaRecursiva(int[] vet, int num) {
        return buscaBinaria(vet, num, 0, vet.length - 1);
    }

    public static int buscaBinaria(int[] vet, int num, int menor, int maior) {
        int media = (menor + maior) / 2;

        if (menor > maior) {  // valor nao encontrado
            return -1;
        }
        if (vet[media] == num) {
            return media;
        }
        if (vet[media] < num) {
            return buscaBinaria(vet, num, media + 1, maior); // seleciona a parte direita do vet
        } else {
            return buscaBinaria(vet, num, menor, media - 1); // seleciona a parte esquerda do vet
        }
    }

    public static void main(String args[]) throws Exception {
        int[] dados = criarVetor();

        long inicial = System.nanoTime();
        System.out.println(buscaSequencial(dados, 10000000)); //alterar o segundo parametro
        long fim = System.nanoTime();
        System.out.println("Sequencial: " + (fim - inicial));

        inicial = System.nanoTime();
        System.out.println(buscaBinariaRecursiva(dados, 10000000)); //alterar o segundo parametro
        fim = System.nanoTime();
        System.out.println("Binario: " + (fim - inicial));
    }
}