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
    
}
