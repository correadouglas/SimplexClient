package simplex;

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
public class Main 
{
    public static void main( String[] args )
    {
        SimplexJFrame simplexJFrame = new SimplexJFrame();
        simplexJFrame.setTitle("Simplex");
        simplexJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simplexJFrame.setResizable(false);
        simplexJFrame.setLocationRelativeTo(null);
        simplexJFrame.setVisible(true);
    }
}
