package giocatoreAutomatico;


/* Griglia.java 
*Interfaccia relativa alla Griglia*/

/*le classi che implementano questa interfaccia devono contenere esattamente 16 chiavi.
Alla Location (0,0), dovrà essere associato il numero (2, oppure 4, oppure 8, ...) associato a quella casella.
Qualora nella posizione non ci siano numeri, sarà associato il valore -1

@autor Francesca Trudu
@autor Nadia Fulgheri
*/



public interface Griglia extends java.util.Map<game2048.Location,Integer> { 
}
