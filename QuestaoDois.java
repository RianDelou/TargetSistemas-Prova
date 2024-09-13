public class QuestaoDois {
    public static void main(String[] args) {
        String stringTest = "pneumoultramicroscopicossilicovulcAnoconiótico";
        int aux = 0;

        for(int i = 0; i < stringTest.length(); i++) {
            if (stringTest.charAt(i) == 'a' || stringTest.charAt(i) == 'A' ) {
                aux++;
            }
        }

        if (aux == 0) {
            System.out.println("Não foi encontrado a letra a na string: "+stringTest);
        } else {
            System.out.println("Foi encontrado a letra 'a' ou 'A' "+ aux + " vezes");
        }

    }
}
