public class Main {
    public static void main(String[] args) {
        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

        int somaViaFuncao = somarValores(primeiroNumero, segundoNumero);
        System.out.println("valor soma: "+ somaViaFuncao);

        int subtrairViaFuancao = subtrairValores(primeiroNumero, segundoNumero);
        System.out.println( "valor subtração: "+ subtrairViaFuancao);

        int multiplicarViaFuncao = multiplicarValores(primeiroNumero, segundoNumero);
        System.out.println("valor multiplicação: "+ multiplicarViaFuncao);

        int dividirViaFuncao = dividirValores(primeiroNumero, segundoNumero);
        System.out.println("valor divisão: "+ dividirViaFuncao);
    }

    public static int somarValores(int numA, int numB){
        return numA + numB;
    }
    public  static int subtrairValores(int numA, int numB){
        if(numA < 0){
            numA = numA * -1;
        }
        return numA - numB;

    }
    public static int multiplicarValores ( int numA, int numB){
        return  numA * numB;
    }
    public  static int dividirValores ( int numA, int numB){
        return  numA / numB;
    }
}