package Refactoring;

public class Main {
    public static void main(String[] args) {
        int []numeros = { 10, 20, 40, 60, 80 };
        imprimeMayoryMenor(numeros);
        imprimeMayorYMenorRefactored(numeros);
    }

    public static void imprimeMayoryMenor(int []numeros){
        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if(mayor < numeros[i]) {
                mayor = numeros[i];
            }

            if (menor > numeros[i]){
                menor = numeros[i];
            }
        }

        System.out.println("Mayor: " + mayor + "Menor: " + menor);
    }

    public static void imprimeMayorYMenorRefactored (int []numeros){
        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            mayor = mayor < numeros[i] ? numeros[i] : mayor;
        }

        System.out.println("Mayor: " + mayor + "Menor: " + menor);
    }
}
