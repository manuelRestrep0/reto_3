
package com.mycompany.reto_3;
import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args)
    {
        /*
        Para la implementación del menú se utilizó un ciclo while que se mantiene
        activo hasta que el usuario ordene detenerlo. 
        Tambien se hizo uso de la función switch para simplificar el codigo.
        Cada opción invoca una función que corresponde a la solución del ejercicio
        seleccionado.
        */
        boolean ejecucion = true;
        while(ejecucion)
        {
            System.out.println("Ingrese el ejercicio que desea realizar:");
            System.out.println("1) 2) 3) o 4) para dejar de ejecutar");
            Scanner input = new Scanner(System.in);
            if(input.hasNextInt())
            {
                int opcion = input.nextInt();
                switch(opcion)
                {
                    case 1:
                    {
                        ejercicio_1();
                        continue;
                    }
                    case 2:
                    {
                        ejercicio_2();
                        continue;
                    }
                    case 3:
                    {
                        ejercicio_3();
                        continue;
                    }
                    case 4:
                    {
                        ejecucion=false;
                        System.out.println("Adios");
                        continue;
                    }
                        
                    default:
                    {
                        System.out.println("Digite una opción valida");
                    }
                }
            }
            
        }
    }
    static void ejercicio_1()
    {
        /*
        Para recibir las notas se le pide al usuario ingresarlas usando como
        separador el caracter de ',' luego por medio de la funcion split 
        se almacena los datos ingresados en un arreglo tipo String. 
        Luego en el ciclo while se convierte cada elemento de este arreglo a tipo
        float y se realizan las operaciones necesarias para sacar el numero mayor,
        el numero menor, el promedio y la desviacion estandar.
        si un numero no es valido entonces se salta y no se tiene en cuenta para
        las operaciones matematicas.
        Para sacar el promedio utilizamos la variable contadorAux que nos permite
        saber cuanto datos VALIDOS fueron ingresados y así sacar el promedio 
        en base a ese numero.
        */
        System.out.println("Ingrese las notas separadas por cosas:");
        Scanner input = new Scanner(System.in);
        String notas = input.nextLine();
        String[] arregloNotas = notas.split(",");
        int i=0,contadorAux=0;
        float mayor=0,menor=0,promedio=0;
        double sumatoria = 0;
        float[] arregloNotasFloat = new float[arregloNotas.length];
        while(i!=(arregloNotas.length))
        {
            arregloNotasFloat[i] = Float.parseFloat(arregloNotas[i]);
            if(arregloNotasFloat[i] >=0 && arregloNotasFloat[i]<=5)
            {
                  promedio = promedio + arregloNotasFloat[i];
                        if(i==0)
                        {
                            mayor=arregloNotasFloat[i];
                            menor=arregloNotasFloat[i];
                            i++;
                            contadorAux++;
                            continue;
                        }
                        if(mayor!=0 && menor!=0)
                        {
                            if(mayor<arregloNotasFloat[i])
                                mayor=arregloNotasFloat[i];
                            if(menor>arregloNotasFloat[i])
                                menor=arregloNotasFloat[i];
                            i++;
                            contadorAux++;
                        }
            }
            if(arregloNotasFloat[i]<0 || arregloNotasFloat[i]>5)
            {
                i++;
            }
        }
        promedio = promedio/contadorAux;
            for(i=0;i<arregloNotasFloat.length;i++)
            {
                sumatoria = sumatoria + Math.pow((arregloNotasFloat[i]-promedio), 2);
            }        
            sumatoria = (Math.sqrt(sumatoria))/(i-1);
            System.out.println("La mayor nota es:"+mayor);
            System.out.println("La menor nota es:"+menor);
            System.err.println("El promedio de las notas es:"+promedio);
            System.err.println("La desviación estandar del conjunto de las nota es:"+sumatoria);
    }
    static void ejercicio_2()
    {
        /*
        Se le pide al usuario ingresar los vectores separando los valores con ','
        luego se verifica que ambos vectores tengas igual cantidad de elementos
        y se procede a realizar la multiplicación, al finalizar el ciclo for se imprime
        el resultado.
        Si los vectores tienen diferente cantidad de vectores entonces se muestra
        un mensaje y no se realiza la multiplicacion.
        */
        double multiplicacion = 0;
        System.out.println("Ingrese el vector numero 1 (utilice ',' para separar los numeros)");
        float[] vector_1 = recibir_valor();
        System.out.println("Ingrese el vector numero 2 (utilice ',' para separar los numeros)");
        float[] vector_2 = recibir_valor();
        if(vector_1.length==vector_2.length)
        {
            for(int i=0;i<vector_1.length;i++)
            {
                multiplicacion = multiplicacion + (vector_1[i]*vector_2[i]);
            }
            System.out.println("La multiplicacion escalar de los dos vectores es: "+multiplicacion);
        }
        if(vector_1.length!=vector_2.length)
        {
            System.out.println("Los vectores no tienen la misma cantidad de elementos");
        }
           
    }
    static void ejercicio_3()
    {
        /*
        Se le pide al usuario ingresar las dimensiones de la matriz
        para luego invocar una funcion donde se ingresan los valores de esta.
        si la funcion devuelve una matriz vacia entonces se indica que la entrada 
        es erronea; de lo contrario, se imprime fila por fila la matriz.
        */
        System.out.println("Ingrese el numero n(Columnas)");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Ingrese el numero m(filas)");
        int m = input.nextInt();
        double matriz_[][] = recibir_valor_double(n, m);
        if(matriz_==null)
        {
            System.out.println("No ha ingresado bien los valores de la matriz");
            return;
        }
        for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(matriz_[i][j]+" ");
                    }
                    System.out.println("");
                }   
    }
    static float[] recibir_valor()
    {
        /*
        Esta funcion se invoca en la funcion ejercicio_2() para recibir los
        valores y los convierte a un arreglo tipo Float.
        */
        while(true)
        {
            int i = 0;
            Scanner input = new Scanner(System.in);
            String notas = input.nextLine();
            String[] arregloNotas = notas.split(",");
            float[] arregloNotasFloat = new float[arregloNotas.length];
            while(i!=arregloNotasFloat.length)
            {
                arregloNotasFloat[i] = Float.parseFloat(arregloNotas[i]); 
                i++;
            }
            return arregloNotasFloat;
        }      
    }
    static double[][] recibir_valor_double(int n, int m)
    {
        /*
        Esta funcion se invoca en el ejercicio_3() y recibe los valores de 
        la matriz, luego se procede a convertir esos valores ingresados 
        en un arreglo tipo double lo cual retorna la funcion.
        si no coinciden las dimensiones de la matriz con los valores ingresados
        se retorna una matriz vacia.
        */
        System.out.println("Ingrese la matriz de la siguiente forma: con ',' para separar las columnas");
        System.out.println("y con ';' para separar las filas");
        System.out.println("Ejemplo: 1,2,3;4,5,6;7,8,9");
        Scanner input = new Scanner(System.in);
        String elementosMatriz = input.nextLine();
        String[] elementosMatrizFilas = elementosMatriz.split(";");
        String[] elementosMatrizColumnas = new String[n];
        double[][] Matriz = new double[m][n];
        if(elementosMatrizFilas.length==m)
        {
            for(int i=0;i<m;i++)
            {
                String aux = elementosMatrizFilas[i];
                elementosMatrizColumnas = aux.split(",");
                if(elementosMatrizColumnas.length==n)
                {
                    for(int j=0;j<n;j++)
                    {
                       double auxDouble = Double.parseDouble(elementosMatrizColumnas[j]);
                       Matriz[i][j]= auxDouble;                
                    }
                }
                else
                {
                    return null;
                }
                
            }
        }
        return Matriz;    
    }
}
