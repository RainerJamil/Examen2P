public class Suma {
    //Definir una clase denominada Suma, la cual tiene varios métodos sumar sobrecargados:
    //- Un método sumar que obtiene la suma de dos valores enteros pasados como parámetros.
    //- Un método sumar que obtiene la suma de tres valores enteros pasados como parámetros.
    //- Un método sumar que obtiene la suma de dos valores doublé pasados como parámetros.
    //- Un método sumar que obtiene la suma de tres valores doublé pasados como parámetros.
    void sumar(int valor1,int valor2){
        System.out.println("la suma es:"+(valor1+valor2));
    }
    void sumar(int valor1, int valor2, int valor3){
        System.out.println("la suma es:"+(valor1+valor2+valor3));
    }
    void sumar(double valor1, double valor2){
        System.out.println("la suma es:"+(valor1+valor2));
    }
    void sumar(double valor1, double valor2, double valor3){
        System.out.println("la suma es:"+(valor1+valor2+valor3));
    }
}
