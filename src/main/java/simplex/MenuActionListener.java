/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * 
 * Pontificia Universidade Catolica de Minas Gerais.
 * Otimizacao de Sistemas Computacionais.
 * 
 * Implementacao Simplex Client.
 *
 * Douglas Henrique Silva Correa.
 * Guilherme Silva Santos.
 * Mateus Felipe Martins Miranda.
 * 
 */
public class MenuActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        MenuSobreJFrame sobreJFrame = new MenuSobreJFrame();
        sobreJFrame.setTitle("Sobre");
        sobreJFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        sobreJFrame.setResizable(false);
        sobreJFrame.setLocationRelativeTo(null);
        sobreJFrame.setVisible(true);
    }
    
}
