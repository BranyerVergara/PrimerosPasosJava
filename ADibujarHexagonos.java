import java.util.*;

/* INDICACIONES:
 * 
 * ENTRADA:
 * La entrada consta de una serie de casos de prueba. 
 * Cada caso de prueba es un entero mayor o igual que 0, 
 * seguido del carácter con el que se formará el hexágono.
 * El programa terminara cuando se ingresen los valores 0 0;
 * 
 * SALIDA:
 * Para cada caso de prueba se mostrará el hexágono regular 
 * que tiene como longitud de lado el número de caracteres especificado. 
 * Dicho hexágono estará dibujado con el carácter proporcionado en la entrada. */

public class ADibujarHexagonos {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		boolean bandera=false;	
		
		do {
			
		    int lados=entrada.nextInt();
		    int aux=lados;
		    int aux2=lados-1;
		    char simbolo=entrada.next().charAt(0);
		    
		    if(lados==0 && simbolo=='0') {
			
			bandera=true;
			
		    }//if
		    
		    System.out.printf("\n");
		
		    for(int i=1; i<lados; i++) {
			
			    for(int k=0; k<aux2; k++ ) {
				
			        System.out.printf(" ");	
				
			    }//for espacios
			    
			
			    for(int j=0; j<aux; j++) {

			    	System.out.printf("%c", simbolo);
				
			    }//for columnas
			
		    	System.out.printf("\n");
		    	aux+=2;
		    	aux2--;

	             }//for filas
	
	    	     for(int j=0; j<aux; j++) {
			     
	    		System.out.printf("%c", simbolo); //fila central del hexagono
				
	             }//for
		
	    	     System.out.printf("\n");
	    	    aux-=2;
	    	    aux2++;
		
	    	    for(int i=1; i<lados; i++) {
			
                        for(int k=0; k<aux2; k++ ) {
				
			    System.out.printf(" ");	
				
	    		}//for espacios
		
		    	for(int j=0; j<aux; j++) {
				
			    	System.out.printf("%c", simbolo);
				
		    	}//for columnas

	    		System.out.printf("\n");
		    	aux-=2;
                        aux2++;
			
	    	}//for filas
	    		
	    	System.out.printf("\n");
	    	
	  	} while(bandera==false); // do while
		
	}//main
	
}
