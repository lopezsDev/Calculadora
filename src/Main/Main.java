package Main;

import Controller.Controller;
import Model.Model;
import View.SystemView;
import java.awt.event.ActionListener;

/**
 * @author samir
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {        
        SystemView view = new SystemView();   
        Model mod = new Model();
        Controller ctrl = new Controller(view, mod);
        view.setVisible(true);
    }
}
