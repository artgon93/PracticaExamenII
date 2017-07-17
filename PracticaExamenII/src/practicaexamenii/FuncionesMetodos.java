/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexamenii;

/**
 *
 * @author Epoch
 */
public class FuncionesMetodos {
//    1. Cree un vector de enteros para almacenar números del 1 al 30. 
//    Introduzca estos números de forma aleatoria en el vector.
    public static int[] iniciarVec(int[] vector){   // Se crea la funcion para iniciar un vector
        int vec[] = vector;                         //Se crea un vector de tipo entero llamado vec con la info de el parametro recibido "vector" 
        for(int i=0; i<vec.length-1;i++){           //Este for recorre todo el vector hasta llegar a su longitud menos 1 
            vec[i]=i;                               //Por cada pasada del for se llena el campo [i] del vector con el número i
        }                                           //haciendo que el vector se llene con numeros desde el 0 hasta su longitud  
        return vec;                                 //retornamos el vector
    }
//2.A. Cree una función que almacene los números en un String separados por “” y
//retorne esta hilera. Esta es la función imprimir, que se encarga de desplegar
//un vector en pantalla.    
    public static String mostrarVec(int[] vector){  //Se crea la funcion que retorna los valores del vector recibido por parametros
        String str = "";                            //Como lo que se desea es una cadena para mostrar el vector se necesita una variable tipo String en donde se guarde la cadena
        for(int i = 0; i<vector.length-1; i++){     //Se recorre el vector hasta su longitud menos uno
            str += vector[i] + "  ";                //Se va llenando la cadena con el contenido del vector en su posicion [i] más un espacio para mejor lectura
        }
        return str;                                 //Se retorna la cadena
    }
//2.B. Mostrar el vector sin la ultima flecha en la cadena de caracteres  
    
    public static String mostrarVecFinal(int[] vector){  
        String str = "";                            
        for(int i = 0; i<vector.length-1; i++){
            if(i!=vector.length-2){
                str += vector[i] + "  ";              
            }else{
                str += vector[i];
            }
        }
        return str;                                 
    }
//3.A Cree un método que invierta los elementos de un vector. Debe resolver este 
//ejercicio desde 0 y no puede crear un vector auxiliar para su solución, debe 
//trabajar desde el vector original.    
    public static String invertirVec(int[] vector){
        String str= "";
        for(int i = vector.length-2; i>=0; i--){
                str += vector[i] + "  ";                       
        }        
        return str;
    }
    
//3.B. invierte el vector sin la ultima flecha en la cadena de caracteres     
    public static String invertirVecFinal(int[] vector){
        String str= "";
        for(int i = vector.length-2; i>=0; i--){
            if(i!=0){
                str += vector[i] + "  ";                       
            }else{
                str += vector[i];
            }
        }        
        return str;
    }
    
//4. Programe el algoritmo de ordenamiento por selección. Este consiste en buscar 
//el menor número del vector y colocarlo al inicio. Se repite este procedimiento 
//hasta llegar al final de la lista.    
    public static String ordenSeleccion(int[] vector){
        String str = "";
        for(int i = 0; i<vector.length-1; i++){
            int minimo = i;    
            for (int j = i+1; j<vector.length-1;j++){
                if(vector[j]< vector[minimo]){
                    minimo = j;   
                }
            }
            int aux = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = aux;
            if(i!=vector.length-2){
                str += vector[i]+ "  ";
            }else{
                str += vector[i];
            }            
        }
        
        return str;
    }
//4.B Se inicializa un vector con numeros al azar de entre 1 a 30
    
    public int[] iniciarVecRdm(int[] vector){
        int vec[] = vector;
        for (int i=0; i<=vec.length-1; i++){       
            vec[i]=(int) (Math.random()*30+1);            
        }
        return vec;              
    }

//1. Cree una matriz de enteros de 5x5 e inicialícela con valores aleatorios.
    public int[][] iniciarMatRdm(int[][] matriz){
        int mat[][] = matriz;
        for(int i=0; i<mat.length-1; i++){
            for(int j=0; j<mat.length-1; j++){
                mat[i][j]= (int)(Math.random()*5+1);            
            }
        }
        return mat;
    }
    
//2. Cree una función que permita mostrar los valores de la matriz en pantalla.
    public static String mostrarMat(int[][] matriz) {
        String str= "";
        for(int i = 0; i<matriz.length-1; i++){
            for(int j = 0; j<matriz.length-1; j++){
                if(j!=matriz.length-2){
                    str += matriz[i][j] + "  ";   
                }else{
                    str += matriz[i][j];
                }
            }
            str += "\n";   
        }
        return str;
    }
    
// 3. Programe el producto de una matriz por un número. Dado un número x y la 
//    matriz M, el resultado de esta operación es el multiplicar x con cada
//    una de las entradas de la matriz.Programe esto desde 0.
    
    public static String productoMat(int matriz[][], int x){
        String str= "";
        int cont = 0;
        for(int i=0; i<matriz.length-1;i++){
            for(int j=0; j<matriz.length-1;j++){
                cont += cont + (matriz[i][j]*x);
                str += (matriz[i][j]*x) + " ";
            }  
            str += "\n";
        }
            str += "\n" + "Total: " + cont;        
        return str;
    }
//4. Cree un método que reciba un número y convierta en -1 todas las 
//   entradas de la matriz que tengan este número.
    
    public static String elimElemMat(int matriz[][], int valor){
        String str = "";
        for (int i = 0; i < matriz.length-1; i++) {
            for (int j = 0; j < matriz.length-1; j++) {
                if(matriz[i][j]==valor){
                    matriz[i][j] = -1;
                }
                str += matriz[i][j]+ " ";
            }
            str += "\n";
        }
     return str;
    }
    
//5. Cree el método intercambiarColumna(int columna1, int columna2) que 
//   intercambie las entradas de la columna 1 con las de la columna 2. Debe 
//   programar esto desde 0.
    
    public static String intercambiarColumna(int[][] matriz){
        String str = "";
        for (int i = 0; i < matriz.length-1; i++) {
            for (int j = matriz.length-1; j >= 0; j--) {
                str += matriz[i][j]+ " ";
            }
            str += "\n";
        }
        return str;        
    }
    
    
//Otros
    int[][] traspuesta(int mat[][]){
        int matT[][] = new int[mat[0].length][mat.length];
        
        for (int i = 0; i < matT.length; i++) {
            for (int j = 0; j < matT[0].length; j++) {
                matT[i][j] = mat[j][i];
            }
        }
        
        return matT;
    }    
    
}
