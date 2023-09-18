package Controller;

import Model.Model;
import View.SystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author samir
 */
public class Controller implements ActionListener{

    private SystemView view;
    private Model model;

    public Controller(SystemView view, Model model) {
        this.view = view;
        this.model = model;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
