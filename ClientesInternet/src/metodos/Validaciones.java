
package metodos;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristhian
 */
public class Validaciones {
    
    public void validacion_letras(java.awt.event.KeyEvent evento){
       if(!(evento.getKeyChar()>=65 && evento.getKeyChar()<=90 
               || evento.getKeyChar()>=97 && evento.getKeyChar()<=122 
               || evento.getKeyChar()==241)){
           Toolkit.getDefaultToolkit().beep();
           evento.consume();
       } 
    }
    public void validacion_numeros(java.awt.event.KeyEvent evento){
        
        if(!(evento.getKeyChar()>=48 && evento.getKeyChar()<=57)){
           Toolkit.getDefaultToolkit().beep();
           evento.consume();       
        }
        
    }
    
    public void validacion_ip(String valor, java.awt.event.KeyEvent evento){
        
        if(!(evento.getKeyChar()>=48 && evento.getKeyChar()<=57 || evento.getKeyChar()==46)){
           Toolkit.getDefaultToolkit().beep();
           evento.consume();       
        }
        if(valor.length()>=15){
           Toolkit.getDefaultToolkit().beep();
           evento.consume(); 
        }
        
    }
    
    public void limite_txtdni(String valor, java.awt.event.KeyEvent evento){
        
        if(valor.length()>=8){
           Toolkit.getDefaultToolkit().beep();
           evento.consume(); 
        }
    }
    
    public void limite_txtcelular(String valor, java.awt.event.KeyEvent evento){
        
        if(valor.length()>=9){
           Toolkit.getDefaultToolkit().beep();
           evento.consume(); 
        }
    }
    
}
