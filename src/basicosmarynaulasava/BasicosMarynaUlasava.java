
package basicosmarynaulasava;

public class BasicosMarynaUlasava {
 //ejemplo de uso de operadores lógicos
    public static void logicos(){
        
        int a; //declaración de las variables
        int b;
        boolean resultado=false;
        
        a=5; //asignación del valor a las variables
        b=10;
        if(a==b){
         resultado=true;
         }
        
        //mostrar en pantalla el resultado de la operación lógica booleana
        if(resultado){ 
            System.out.println("a y b son iguales");
        
        }
        else{
            System.out.println("a y b son distintos");
        } 

        
        //mostrar en pantalla el resultado de la operación lógica
        System.out.print("Si a = "+ a + " y b = "+ b + ", entonces " );
        
        if (a<b){
            System.out.println("a es menor que b");
        }
        else if(a>b){
            System.out.println("a es mayor que b");
        }
         
        else{
        System.out.println("a es igual que b");
        }
    
    }
   
    public static void main(String[] args) {
        
        
        logicos(); //llamada al método
    }
        
    }
    

