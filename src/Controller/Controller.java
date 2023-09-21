package Controller;

import Model.Model;
import View.SystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.management.Query;
import javax.swing.JOptionPane;
import jdk.dynalink.Operation;

/**
 *
 * @author samir
 */
public class Controller implements ActionListener, KeyListener {

    private SystemView view;
    private Model model;

    public Controller(SystemView view, Model model) {
        this.view = view;
        this.model = model;
        //Ponemos a la escucha los diferentes botones de la interfaz
        //Botón cero
        this.view.btn_cero.addActionListener(this);
        //Botón uno
        this.view.btn_uno.addActionListener(this);
        //Boton dos
        this.view.btn_dos.addActionListener(this);
        //Botón tres
        this.view.btn_tres.addActionListener(this);
        //Botón cuatro
        this.view.btn_cuatro.addActionListener(this);
        //Botón cinco
        this.view.btn_cinco.addActionListener(this);
        //Botón seis
        this.view.btn_seis.addActionListener(this);
        //Botón siete
        this.view.btn_siete.addActionListener(this);
        //Botón ocho
        this.view.btn_ocho.addActionListener(this);
        //Botón nueve
        this.view.btn_nueve.addActionListener(this);
        //Botón sumar
        this.view.btn_suma.addActionListener(this);
        //Botón resta
        this.view.btn_resta.addActionListener(this);
        //Botón multiplicar
        this.view.btn_multiplicacion.addActionListener(this);
        //Botón dividir
        this.view.btn_dividir.addActionListener(this);
        //Botón borrar un numero a la vez
        this.view.btn_borrar_uno.addActionListener(this);
        //Botón borrar todo
        this.view.btn_borrar_todo.addActionListener(this);
        //Botón igual
        this.view.btn_igual.addActionListener(this);
        //Caja de texto 
        this.view.txt_resultado.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.btn_igual) {
            CalcularResultados();
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();

        // Verificar si el carácter es un número (0-9) o uno de los operadores (+, -, *, /)
        if (!(Character.isDigit(c) || c == '+' || c == '-' || c == '*' || c == '/')) {
            e.consume(); // Consumir el evento para evitar que se ingrese el carácter no válido

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == 10) {
            CalcularResultados();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void CalcularResultados(){
        
            if (view.txt_resultado.getText().isEmpty()) {

            } else {
                String[] val = view.txt_resultado.getText().split("[-+*/]");

                model.setNum1(Integer.parseInt(val[0]));
                model.setNum2(Integer.parseInt(val[1]));

                char oper = view.txt_resultado.getText().charAt(val[0].length());

                switch (oper) {
                    case '+':
                        view.txt_resultado.setText(String.valueOf(model.sumar()));

                        break;
                    case '-':
                        view.txt_resultado.setText(String.valueOf(model.restar()));
                        break;
                    case '*':
                        view.txt_resultado.setText(String.valueOf(model.multiplicar()));
                        break;
                    case '/':
                        view.txt_resultado.setText(String.valueOf(model.division()));
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
    }

