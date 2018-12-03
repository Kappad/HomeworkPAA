import org.unige.aims.GridWorld;

/**
 * Main class for navigation task resolution
 * @author Daniel Kromer
 *
 */

public class Main {
	
	/**
	 * main methods
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Robot r= new Robot();
		
		GridWorld gw = new GridWorld(Integer.parseInt(args[0]), Double.parseDouble(args[1]), Long.parseLong(args[2]));
		gw.print();
		System.out.println(gw.getMinimumDistanceToTarget());
		gw.moveToAdjacentCell(GridWorld.Direction.EAST);
		gw.moveToAdjacentCell(GridWorld.Direction.SOUTH);
		gw.moveToAdjacentCell(GridWorld.Direction.SOUTH);
		
		
		System.out.println(gw.getAdjacentFreeCells());
		if(r.NorthFree(gw)) {
			System.out.println("est libero");
		}// else System.out.println("est bloccato");
//		for (GridWorld.Coordinate i : gw.getAdjacentFreeCells()) {
//			System.out.println(i);
//		}

	}



/**
 * DUmmy method for Javadoc generation
 * @param someparameter first parameter, an integer
 * @param anotherparameter second parameter, an integer
 * @return return value, a String
 */

public String dummy(int someparameter, int anotherparameter) {
	return "";
}

}
