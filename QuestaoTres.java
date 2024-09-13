public class QuestaoTres {
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;

        for (int k = 1; k < indice; k++) {
            soma = k + 1 + soma;
        }
        
        System.out.println(soma);
    }
}
