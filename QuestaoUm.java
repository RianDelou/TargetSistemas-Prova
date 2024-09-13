public class QuestaoUm {
    public static void main(String[] args) {
        int numero = 405; //numero que vai ser verificado
        double[] sequenciaFibonacci = vetorFibonacci(numero);

        System.out.print("Sequência de Fibonacci: ");
        for (double valor : sequenciaFibonacci) {
            System.out.print((int) valor + " ");
        }

        boolean pertence = pertenceFibonacci(numero, sequenciaFibonacci);
        if (pertence) {
            System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static double[] vetorFibonacci(int max) {

        double[] fibonacci = new double[50]; // limitei o vetor para 50 posições, já que em fibonacci cresce infinitamente!
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            if (fibonacci[i] > max) { // caso ache o número, ele vai parar de fazer o fibonacci!
                break;
            }
        }
        return fibonacci;
    }

    public static boolean pertenceFibonacci(int numero, double[] sequencia) {
    
        for (double valor : sequencia) {
            if (valor == numero) {
                return true;
            }
        }
        return false;
    }
}