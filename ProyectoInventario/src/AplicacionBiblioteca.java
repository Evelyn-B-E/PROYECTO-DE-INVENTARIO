import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AplicacionBiblioteca {
	static int POS;
	static Libro BIBLIOTECA[]=new Libro[10];
	public static boolean Verificar(){
	 if(POS==100){
	   System.out.print("LA BLIOTECA YA NO ACEPTA MAS LIBROS");
	   return true;
	}
	 else return false;
	}
	public static void main(String[] args) throws IOException {
	int opcion=1;
	String CODIGO;
	String TITULO;   
	String AUTOR;
	String EDITORIAL;
	String AÑOEDICION;
	String ESPECIALIDAD;
	String NUMPAG;
	BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
	do{
	  System.out.println("");
	  System.out.println("MENU BILIOTECA");
	  System.out.println("[1] Agregar Libro." );
	  System.out.println("[2] Mostrar Libros.");
	  System.out.println("[3] Eliminar Libro por Titulo.");
	  System.out.println("[4] Ordenar Libro por Titulo.");
	  System.out.println("[5] Modificar Libro por código.");
	  System.out.println("[6] Listado de libros de una determinada editorial.");
	  System.out.println("[7] Listado de libros cuyo año de edición sea superior a un año ingresado por el usuario.");
	  System.out.println("[8] Listado de libros de una especialidad determinada.");
	  System.out.println("[9] Salir.");
	  System.out.print("Ingrese opcion <0 - 5> :");
	  opcion = Integer.parseInt(Teclado.readLine());
	  switch(opcion){
	        case 1:
	        boolean sw=false;
	        if (Verificar()==false){
	        do{
	        System.out.print("Ingrese codigo del libro:");
	    CODIGO=Teclado.readLine();
	        sw=false;
	        if(POS>0){
	              for(int X=0;X<POS;X++)
	                  if(BIBLIOTECA[X].getCODIGO().equalsIgnoreCase(CODIGO)==true){
	                     System.out.println("El codigo ya existe!!!!!"); 
	                     sw=true; 
	                  }
	             }
	         }
	         while(sw);
	       
	        System.out.print("Ingrese titulo del libro:");
	    TITULO=Teclado.readLine();
	        System.out.print("Ingrese autor del libro:");
	    AUTOR=Teclado.readLine();
	    System.out.print("Ingrese editorial del libro:");
	    EDITORIAL=Teclado.readLine();
	    System.out.print("Ingrese año de edicion del libro:");
	    AÑOEDICION=Teclado.readLine();
	        System.out.print("Ingrese especialidad del libro:");
	    ESPECIALIDAD=Teclado.readLine();
	        System.out.print("Ingrese numero de paginas del libro:");
	    NUMPAG=Teclado.readLine();
	        Libro LIB=new Libro();
	        LIB.setCODIGO(CODIGO);
	        LIB.setTITULO(TITULO);
	        LIB.setAUTOR(AUTOR);
	        LIB.setAÑOEDICION(AÑOEDICION);
	        LIB.setEDITORIAL(EDITORIAL);
	        LIB.setESPECIALIDAD(ESPECIALIDAD);
	        LIB.setNUMPAG(NUMPAG);
	        BIBLIOTECA[POS]=LIB;
	        System.out.print("Informacion grabada correctamente:");
	    POS++;
	          }
	        break;
	        case 2:
	        System.out.println("Listado de libros");
	         System.out.println("CODIGO\t\tTITULO\t\tAUTOR\t\tEDITORIAL\t\tAÑO EDICION\t\tESPECIALIDAD\t\tNUM. PAG.");
	    for(int I=0;I<POS;I++){
	          System.out.print( BIBLIOTECA[I].IMPRIMIR());
	        }                        
	        break;
	           
	        case 3:
	        String ConBuscar;
	        String ELIMINAR="";
	        System.out.print("Ingrese Titulo del libro a buscar:");
	    ConBuscar=Teclado.readLine();
	    int I;
	        Libro AUX[]=new Libro[10];
	        boolean SW=false;
	        for(I=0;I<POS;I++){
	               if(ConBuscar.equalsIgnoreCase(BIBLIOTECA[I].getTITULO())==true){
	                   System.out.print("El libro existe...desea eliminarlo S/N?");
	                   ELIMINAR=Teclado.readLine();
	                   if(ELIMINAR.equalsIgnoreCase("S")==true){
	                          for(int X=0;X<POS;X++)
	                              if(X!=I) AUX[X]=BIBLIOTECA[I];
	                          BIBLIOTECA=AUX;
	                          POS--;
	                   }
	               }
	        }
	        if(SW==false)  System.out.print("El libro no existe...!!!");
	        break;
	        case 4:
	        System.out.println("ORDENAMIENTO POR TITULO");
	        Libro AUXI[]=new Libro[1];
	        int X,Y;
	        for(X=0;X<POS;X++)
	            for(Y=X+1;Y<POS;Y++)
	                if(BIBLIOTECA[X].getTITULO().compareTo(BIBLIOTECA[Y].getTITULO())>0){
	                    System.out.print("si ingresa");
	                     AUXI[0]=BIBLIOTECA[X];
	                     BIBLIOTECA[X]=BIBLIOTECA[Y];
	                     BIBLIOTECA[Y]= AUXI[0];
	                }
	        break;
	        case 5:
	        String CodigoBuscar;
	        System.out.print("Ingrese codigo del libro a buscar:");
	    CodigoBuscar=Teclado.readLine();
	    boolean SW1=false;
	        for(I=0;I<POS;I++){
	               if(CodigoBuscar.equalsIgnoreCase(BIBLIOTECA[I].getCODIGO())==true){
	                   System.out.println("EL LIBRO EXISTE!!!!");
	                   System.out.println("Ingrese datos del libro a modificar");
	                   System.out.print("Ingrese titulo del libro:");
	               TITULO=Teclado.readLine();
	                   System.out.print("Ingrese autor del libro:");
	               AUTOR=Teclado.readLine();
	               System.out.print("Ingrese editorial del libro:");
	               EDITORIAL=Teclado.readLine();
	               System.out.print("Ingrese año de edicion del libro:");
	               AÑOEDICION=Teclado.readLine();
	                   System.out.print("Ingrese especialidad del libro:");
	               ESPECIALIDAD=Teclado.readLine();
	                   System.out.print("Ingrese numero de paginas del libro:");
	               NUMPAG=Teclado.readLine();
	                   BIBLIOTECA[I].setTITULO(TITULO);
	                   BIBLIOTECA[I].setAUTOR(AUTOR);
	                   BIBLIOTECA[I].setAÑOEDICION(AÑOEDICION);
	                   BIBLIOTECA[I].setEDITORIAL(EDITORIAL);
	                  BIBLIOTECA[I].setESPECIALIDAD(ESPECIALIDAD);
	                  BIBLIOTECA[I].setNUMPAG(NUMPAG);
	                  SW1=true;
	                  break;
	                   }
	               }
	         if(SW1==false)  System.out.print("El libro no existe...!!!");
	        break;
	           
	        case 6:
	        String CodigoEditorial;
	        System.out.print("Ingrese editorial del libro a buscar:");
	    CodigoEditorial=Teclado.readLine();
	    boolean SW2=false;
	        System.out.println("CODIGO\t\tTITULO\t\tAUTOR\t\tEDITORIAL\t\tAÑO EDICION\t\tESPECIALIDAD\t\tNUM. PAG.");
	        for(I=0;I<POS;I++){
	               if(CodigoEditorial.equalsIgnoreCase(BIBLIOTECA[I].getEDITORIAL())==true){
	                  System.out.print( BIBLIOTECA[I].IMPRIMIR());
	                  SW2=true;
	             
	                   }
	               }
	         if(SW2==false)  System.out.print("No existen libros de esa editorial...!!!");
	            break;
	         
	        case 7:
	        String Especialidad;
	        System.out.print("Ingrese especilidad del libro a buscar:");
	    Especialidad=Teclado.readLine();
	    boolean SW3=false;
	        System.out.println("CODIGO\t\tTITULO\t\tAUTOR\t\tEDITORIAL\t\tAÑO EDICION\t\tESPECIALIDAD\t\tNUM. PAG.");
	        for(I=0;I<POS;I++){
	               if(Especialidad.equalsIgnoreCase(BIBLIOTECA[I].getESPECIALIDAD())==true){
	                  System.out.print( BIBLIOTECA[I].IMPRIMIR());
	                  SW3=true;
	             
	                   }
	               }
	         if(SW3==false)  System.out.print("No existen libros de esa espacialidad...!!!");
	            break;
	        }
	        }
	          while (opcion!=8);
	    }
	  
}
