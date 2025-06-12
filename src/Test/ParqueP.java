package Test;

import Controller.ParqueController;
import view.ParqueView;

public class ParqueP {

	public static void main(String[] args) {
		
		ParqueView view = new ParqueView();
		ParqueController controller = new ParqueController(view);
		controller.start();

	}	
}
