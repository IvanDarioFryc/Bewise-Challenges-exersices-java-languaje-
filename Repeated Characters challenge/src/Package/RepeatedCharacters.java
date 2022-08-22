package Package;

import java.util.Scanner;

public class RepeatedCharacters {

	
		// TODO Auto-generated method stub
		private static boolean HayDiferencia(int[] arrayDeContadores) {
			 for (int i = 0; i < arrayDeContadores.length; i++)
	         {
	             if (arrayDeContadores[i]==0)
	             {
	                 arrayDeContadores[i] = arrayDeContadores[i - 1];
	             }
	         }
	         int flag=0;
	         for (int i = 0; i < arrayDeContadores.length; i++)
	         {

	             flag = 0;
	             for (int j = 0; j < i; j++)
	             {
	                 
	                 if (arrayDeContadores[i] != arrayDeContadores[j] && arrayDeContadores[j]!=0)
	                 {
	                     j = i;
	                     flag = 1;
	                 }
	             }
	             

	         }
	         if (flag == 1)
	         {
	             return true;
	         }
	         else
	         {
	             return false;
	         }
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     
			Scanner sc= new Scanner(System.in);
			
		    System.out.println("Ingrese una cadena de caracteres:\n");
	        
	        
	        //se declara la cadena ingresada por consola
			
	        String cadenaInicial = sc.nextLine();
	        
	        System.out.println("\nLa cadena de caracteres inicial es: " + cadenaInicial + "\n");

	        //Declaramos las variables y los vectores con los que vamos a trabajar
	        
	        char[] letras = new char[cadenaInicial.length()];

	        int[] contadoresDeLetras = new int[cadenaInicial.length()];

	        char letraInicial = ' ';

	        int contadorDeLetras = 0;
	        

	            
	        
	//metemos la cadena dentro de un array para que se pueda trabajar mejor
	        
	        char[] arrayCadena = cadenaInicial.toCharArray();
	        
	        for (int i = 0; i < cadenaInicial.length(); i++)
	        {

	            if (arrayCadena[i] != letraInicial)
	            {
	                letras[contadorDeLetras] = arrayCadena[i];
	                letraInicial = arrayCadena[i];
	                contadorDeLetras++;
	            }
	        }
	        
	      //contar las repeticiones de cada letra

	        for (int i = 0; i < letras.length; i++)
	        {
	            int cont = 0;
	            for (int j = 0; j < arrayCadena.length; j++)
	            {

	                if (arrayCadena[j] == letras[i])
	                {
	                    cont++;
	                }

	            }

	            contadoresDeLetras[i] = cont;
	        }
	        
	        
	        
	      //Limpiar los arrays

	        int contadorDeLetrasPreciso = 0;
	        for (int i = 0; i < letras.length; i++)
	        {
	            if (letras[i] != ' ')
	            {
	                contadorDeLetrasPreciso++;
	            }
	        }
	        
	        char[] letrasPreciso = new char[contadorDeLetrasPreciso];

	        for (int i = 0; i < letrasPreciso.length; i++)
	        {
	            letrasPreciso[i] = letras[i];
	        }
	        
	        int contadorDeContadoresPreciso = 0;
	        for (int i = 0; i < contadoresDeLetras.length; i++)
	        {
	            if (contadoresDeLetras[i] != 0)
	            {
	                contadorDeContadoresPreciso++;
	            }
	        }
	        
	        int[] contadoresDeLetrasPreciso = new int[contadorDeContadoresPreciso];

	        for (int i = 0; i < contadoresDeLetrasPreciso.length; i++)
	        {
	            contadoresDeLetrasPreciso[i] = contadoresDeLetras[i];
	        }
	        
	        //Se muestran por pantalla la cantidad de veces que se repite un caracter en la cadena
	        
	        System.out.println("letras y sus contadores:\n");

	        for (int i = 0; i < contadoresDeLetrasPreciso.length; i++)
	        {
	            int flag = 0;
	            
	            for (int j = 0; j < i; j++)
	            {
	                if (letrasPreciso[i] == letrasPreciso[j])
	                {
	                    j = i;
	                    flag = 1;
	                }
	            }
	            if (flag == 0) 
	            {
	            	System.out.println("la letra '" + letrasPreciso[i] + "' aparece " + contadoresDeLetrasPreciso[i] + " veces\n");
	            }

	        }
	        
	      //Se aplica el metodo que calcula si hay caracteres que se repiten distinto numero de veces que otros
	        if (HayDiferencia(contadoresDeLetras)==true)
	        {
	        	System.out.println("\nLos caracteres de la cadena se repiten en un numero desigual de veces.");
	        }
	        else if (HayDiferencia(contadoresDeLetras) == false)
	        {
	        	System.out.println("\nLos caracteres de la cadena se repiten en un numero uniforme de veces.");
	        }
	}

}
