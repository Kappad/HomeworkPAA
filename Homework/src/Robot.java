import java.util.ArrayList;

import org.unige.aims.GridWorld;

public class Robot {
	
	private boolean n;
	private boolean s;
	private boolean e;
	private boolean w;
	
	public Robot () {
		n=false;
		s=false;
		e=false;
		w=false;
	}
	
	public boolean NorthFree(GridWorld gw) {
		while (gw.getAdjacentFreeCells().iterator().hasNext()) {
			if (gw.getCurrentCell().row-1 == gw.getAdjacentFreeCells().iterator().next().row) {
				n=true;				
			} else n=false;
		}
		return n;
	}
	
	public boolean SouthFree(GridWorld gw) {
		while (gw.getAdjacentFreeCells().iterator().hasNext()) {
			if (gw.getCurrentCell().row+1 == gw.getAdjacentFreeCells().iterator().next().row) {
				s=true;				
			} else s=false;
		}
		return s;
	}
	
	public boolean EastFree(GridWorld gw) {
		while (gw.getAdjacentFreeCells().iterator().hasNext()) {
			if (gw.getCurrentCell().col+1 == gw.getAdjacentFreeCells().iterator().next().row) {
				e=true;				
			} else e=false;
		}
		return e;
	}
	
	public boolean WestFree(GridWorld gw) {
		while (gw.getAdjacentFreeCells().iterator().hasNext()) {
			if (gw.getCurrentCell().col-1 == gw.getAdjacentFreeCells().iterator().next().row) {
				w=true;				
			} else w=false;
		}
		return w;
	}
	
	public int PathFinder (GridWorld gw) {
		
		gw.getCurrentCell();
		
		
		return 0;
	}

}
