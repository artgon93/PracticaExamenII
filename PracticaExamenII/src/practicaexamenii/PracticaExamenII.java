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
public class PracticaExamenII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FuncionesMetodos objeto1 = new FuncionesMetodos(); //Se crea el primer objeto FuncionesMetodos
                
//        int vector1[] = new int[10];                        //Se crea una variable vector y se le dice que es de tipo int con una longitud de 10
//        objeto1.iniciarVec(vector1);                        //Se inicializa el vector del objeto1
//        
//        /*
//        System.out.println(vector);
//        System.out.println(objeto1.iniciarVec(vector));    //Como el vector solo se ha iniciado la informacion returnada es el lugar en memoria del vector 
//        */
//        
//        /*
//        objeto1.mostrarVec(vector1);                        //Se comienza la funcion mostra con el vector sin incializar. Observar que no se imprime nada 
//        objeto1.mostrarVec(objeto1.iniciarVec(vector1));    //Se muestra el vector llamando vector utilizando su inicializacion. Observar que no se imprime nada 
//        */
//        
//        int vector2[] = new int[10];                        //se crea otro vector para mostrar la diferencia entre mostrar un vector sin inicializar y otro inicializado
////        System.out.println(objeto1.mostrarVec(vector2));
////        System.out.println(objeto1.mostrarVec(objeto1.iniciarVec(vector2)));
////        System.out.println(objeto1.mostrarVecFinal(objeto1.iniciarVec(vector2)));
////        System.out.println(objeto1.invertirVec(vector2));
////        System.out.println(objeto1.invertirVecFinal(vector2));
//        objeto1.iniciarVecRdm(vector2); 
//        
//        System.out.println(objeto1.mostrarVec(vector2));
//        System.out.println(objeto1.ordenSeleccion((vector2)));
//        
        int matriz1[][] = new int[4][4];
        
        objeto1.iniciarMatRdm(matriz1);
        System.out.println(objeto1.mostrarMat(matriz1));
        int valor = 2;
        //System.out.println(objeto1.elimElemMat(matriz1,valor));
        
        int c1 = 2;
        int c2 = 1;
        
        objeto1.intercambiarColumna(c1, c2, matriz1);
        System.out.println(objeto1.mostrarMat(matriz1));
        
        //System.out.println(objeto1.mostrarMat(objeto1.traspuesta(matriz1)));
        
        


    }
    
    
}
