
package tarea3;


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
               int es = 0;
               int er = sPalabra.leght()-1;
               boolean bError = false;
               
               while ((es<er)&&(!bError)){
               
               }
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    
}
