
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
		int r=0;
		for(int i=1;i<f;i++) {
			r=r+r;
		}
		return r;
	}
	
	public static void main(String[] args) {
		LeoneFrancescoClass v=new LeoneFrancescoClass();
		System.out.println(v.leoneMet(5, 7));

	}

}
