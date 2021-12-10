
package com.mycompany.reto_3;
import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args)
    {
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
        System.out.println("Ingrese las notas separadas por cosas:");
        Scanner input = new Scanner(System.in);
        String notas = input.nextLine();
        String[] arregloNotas = notas.split(",");
        int i=0;
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
                            continue;
                        }
                        if(mayor!=0 && menor!=0)
                        {
                            if(mayor<arregloNotasFloat[i])
                                mayor=arregloNotasFloat[i];
                            if(menor>arregloNotasFloat[i])
                                menor=arregloNotasFloat[i];
                            i++;
                        }
            } 
        }
        promedio = promedio/i;
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
        //cambiar la entrada de los numeros
        double multiplicacion = 0;
        System.out.println("Ingrese el vector numero 1");
        float[] vector_1 = recibir_valor();
        System.out.println("Ingrese el vector numero 2 ");
        float[] vector_2 = recibir_valor();
        if(vector_1.length==vector_2.length)
        {
            for(int i=0;i<vector_1.length;i++)
            {
                multiplicacion = multiplicacion + (vector_1[i]*vector_2[i]);
            }    
        }
        System.out.println("La multiplicacion escalar de los dos vectores es: "+multiplicacion);   
    }
    static void ejercicio_3()
    {
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
        System.out.println("Ingrese la matriz de la siguiente forma: con ',' para separar las columnas");
        System.out.println("y con ';' para separar las filas");
        System.out.println("Ejemplo: 1,2,3;4,5,6;7,8,9");
        Scanner input = new Scanner(System.in);
        String elementosMatriz = input.nextLine();
        String[] elementosMatrizFilas = elementosMatriz.split(";");
        String[] elementosMatrizColumnas = new String[n];
        double[][] Matriz = new double[m][n];
        if(elementosMatrizColumnas.length==m)
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
