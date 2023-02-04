
/**
 * <p>PRODUTTORIA</p>
 * <p>classe che permette il calcolo della produttoria<p>
 * 
 * <p>Classe: <U>4AI</U>
 * Data: <i>04/02/2023</i></p>
 * @author <b>Leone_Francesco</b>
 *
 */

public class LeoneFrancescoClass {

	public LeoneFrancescoClass() {
		
	}
	
	/**
	 * @param s Inizio Produttoria
	 * @param f Fine Produttoria
	 * @return Valore_Produttoria
	 */
	
	public int leoneMet(int s,int f) {
		//Errore 1: la variabile contatore del ciclo "i" deve essere inizializzata con il valore della variabile "s"
		//Errore 2: il ciclo deve continuare ad essere eseguito fino al valore di "f" (incluso) 
		//Errore 3: La variabile r deve contenere la produttoria. Quindi deve effetuare la moltiplicazione
		//			tra se stessa e il valore della variabile "i"
		//Errore 4: la variabile "r" deve essere inizializzata con il valore 1, in modo che non influisca con il calcolo
		//			della moltiplicazione
		int r=1;
		for(int i=s;i<=f;i++) {
			r=r*i;
		}
		return r;
	}
	
	public static void main(String[] args) {
		LeoneFrancescoClass v=new LeoneFrancescoClass();
		System.out.println(v.leoneMet(5, 7));

	}

}
