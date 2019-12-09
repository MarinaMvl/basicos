

package basicosmarynaulasava;


public class BasicosMarynaUlasava {


    
    /* Método para mostrar ejemplos de tipos numericos.*/
     
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.print("Valor entero ");
        System.out.println(entero);
        System.out.print("Valor doble ");
        System.out.println(doble);
    }

/*metodo para mostrar ejemplos de clase String*/
    public static void cadenas(){
        //creación de la clase String
        String s1;
        String s2;
        String s3;
        
        //ejemplos de asignación de valores a la clase String
        s1="Un String en Java representa ";
        s2= s1 + "una cadena de caracteres ";
        s3= s2+ "no modificable.";
        
        //mostrar en pantalla el contenido del String
        System.out.println(s3);
    } 



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
        
        
        cadenas(); //llamada al método
        
        numericos(); //llamada al método
        
       
        logicos(); //llamada al método
    
    }
    }
