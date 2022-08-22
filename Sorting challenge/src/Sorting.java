import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
class Jugador {
	
    private String nombre;
    private int puntuacion;
    private int partidasPerdidas;
 
    public Jugador(String nombre, int puntuacion, int partidasPerdidas) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.partidasPerdidas=partidasPerdidas;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public int getPuntuacion() {
        return puntuacion;
    }
    
    public void setPuntuacion(int puntuacion) {
    	this.puntuacion=puntuacion;
    }
    public void setPartidasPerdidas(int partidasPerdidas) {
    	this.partidasPerdidas=partidasPerdidas;
    }
    
    public int getPartidasPerdidas() {
    	return partidasPerdidas;
    }
    
    @Override
    public String toString() {
        return "Jugador: [" +
                "nombre='" + nombre + '\'' +
                ", puntos=" + puntuacion + '\'' +
                ", partidas perdidas=" + partidasPerdidas +
                ']';
    }
}
 
public class Sorting
{
	
	private static void ordenarPorPuntuacionYNombre(List<Jugador> ListaJugadores) {
		for (Jugador jugador : ListaJugadores) {
    		int negativo=jugador.getPuntuacion()*-1;
            jugador.setPuntuacion(negativo);
        }
 
        // Usando el método Comparator.comparing()
        ListaJugadores.sort(Comparator.comparing(Jugador::getPuntuacion)
                .thenComparing(Jugador::getNombre));
        
        
        for (Jugador jugador : ListaJugadores) {
    		int positivo=jugador.getPuntuacion()*-1;
            jugador.setPuntuacion(positivo);
            
            
        }
        
        System.out.println("Lista ordenada por puntos de manera descendente y por orden alfabetico ascendente:");
        for (Jugador jugador : ListaJugadores) {
            System.out.println(jugador);
        }
	}
	private static void ordenarPorPuntuacionPerdidasYNombre(List<Jugador> ListaJugadores) {
		for (Jugador jugador : ListaJugadores) {
    		int PuntuacionNegativa=jugador.getPuntuacion()*-1;
            jugador.setPuntuacion(PuntuacionNegativa);
            /*int PartidasPerdidasNegativa=jugador.getPartidasPerdidas()*-1;
            jugador.setPartidasPerdidas(PartidasPerdidasNegativa);*/
        }
        
        ListaJugadores.sort(Comparator.comparing(Jugador::getPuntuacion).thenComparing(Jugador::getPartidasPerdidas)
                .thenComparing(Jugador::getNombre));
        
        
        for (Jugador jugador : ListaJugadores) {
    		int PuntuacionPositivo=jugador.getPuntuacion()*-1;
            jugador.setPuntuacion(PuntuacionPositivo);
           
        }
 
        
        System.out.println("Lista ordenada por puntos y partidas perdidas de manera descendente y por orden alfabetico ascendente:");
        for (Jugador jugador : ListaJugadores) {
            System.out.println(jugador);
        }
	}
	
	//Main
    public static void main(String[] args)
    {
    	List<Jugador> ListaJugadores = Arrays.asList(
                new Jugador("Ivan", 10000, 10),
                new Jugador("Federico", 8000, 15),
                new Jugador("Sebastian", 8000, 15),
                new Jugador("Lucas", 6000, 20),
                new Jugador("Martin", 6000, 21),
                new Jugador("Alejandro", 6000, 23),
                new Jugador("Damian", 8000, 16)
        );
    	
    	
    	//Aplicando el metodo 1
    	ordenarPorPuntuacionYNombre(ListaJugadores);
    	
    	System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        //Aplicando el metodo 2
    	ordenarPorPuntuacionPerdidasYNombre(ListaJugadores);
    	
    	
        
       
    }
}