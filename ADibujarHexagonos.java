import java.util.*;

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
				
			    }//for
			
			    for(int j=0; j<aux; j++) {

			    	System.out.printf("%c", simbolo);
				
			    }//for
			
		    	System.out.printf("\n");
		    	aux+=2;
		    	aux2--;

	    	}//for
	
	    	for(int j=0; j<aux; j++) {
			
	    		System.out.printf("%c", simbolo);
				
	    	}//for
		
	    	System.out.printf("\n");
		
	    	aux-=2;
	    	aux2++;
		
	    	for(int i=1; i<lados; i++) {
			
                for(int k=0; k<aux2; k++ ) {
				
			        System.out.printf(" ");	
				
	    		}//for
		
		    	for(int j=0; j<aux; j++) {
				
			    	System.out.printf("%c", simbolo);
				
		    	}//for

	    		System.out.printf("\n");
		    	aux-=2;
                aux2++;
			
	    	}//for
	    		
	    	System.out.printf("\n");
	    	
	  	} while(bandera==false); // do while
		
	}//main
	
}
