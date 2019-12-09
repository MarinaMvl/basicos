
package basicosmarynaulasava;


public class BasicosMarynaUlasava {

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
    
    public static void main(String[] args) {
        
        cadenas(); //llamada al método
        
       
    }
    
}
