package quebracabec;

import javax.swing.JButton;
import java.util.List;
import java.util.Arrays;

public class Movimentacao{
    public List<String> posit = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","");

    public void mover (JButton pp, JButton p1, JButton p2) {
        if (p1.getText().equals("")){
            p1.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p1.getName()) - 1, p1.getText());
        }else if (p2.getText().equals("")){ 
            p2.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p2.getName()) - 1, p2.getText());
        }
    }

    public void mover (JButton pp, JButton p1, JButton p2, JButton p3) {
        if (p1.getText().equals("")){
            p1.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p1.getName()) - 1, p1.getText());
        }else if (p2.getText().equals("")){ 
            p2.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p2.getName()) - 1, p2.getText());
        }else if (p3.getText().equals("")){
            p3.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p3.getName()) - 1, p3.getText());
        }
    }

    public void mover (JButton pp, JButton p1, JButton p2, JButton p3, JButton p4) {
        if (p1.getText().equals("")){
            p1.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p1.getName()) - 1, p1.getText());
        }else if (p2.getText().equals("")){ 
            p2.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p2.getName()) - 1, p2.getText());
        }else if (p3.getText().equals("")){
            p3.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p3.getName()) - 1, p3.getText());
        }else if (p4.getText().equals("")){
            p4.setText(pp.getText());
            pp.setText("");
            posit.set(Integer.parseInt(pp.getName()) - 1,"" );
            posit.set(Integer.parseInt(p4.getName()) - 1, p4.getText());
        }
    }
}