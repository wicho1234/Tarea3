
package tarea3;

import java.util.Scanner;


public class MenuUsuarios {
    
    public MenuUsuarios(){
        while(true){
            
          
        
        tec in = new tec();
        System.out.println("MENU");
        System.out.println("201602724");
        System.out.println("1. Usuario");
        System.out.println("2. Palabras Palindromas");
        System.out.println("3. Salir");
        
        int opcion = in.getInt("Seleccionar: ");
        opciones(opcion);
      }
    }
    
    public static void opciones(int opcion){
        switch(opcion){
            case 1:
                UsuariosMenu in = new UsuariosMenu();
                
                break;
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese la frase");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    
}
