package quebracabec;

import javax.swing.JButton;

public class Movimentacao{

    public void mover (JButton pp, JButton p1, JButton p2) {
        if (p1.getText().equals("")){
            p1.setText(pp.getText());
            pp.setText("");
        }else if (p2.getText().equals("")){ 
            p2.setText(pp.getText());
            pp.setText("");
        }
    }

    public void mover (JButton pp, JButton p1, JButton p2, JButton p3) {
        if (p1.getText().equals("")){
            p1.setText(pp.getText());
            pp.setText("");
        }else if (p2.getText().equals("")){ 
            p2.setText(pp.getText());
            pp.setText("");
        }else if (p3.getText().equals("")){
            p3.setText(pp.getText());
            pp.setText("");
        }
    }

    public void mover (JButton pp, JButton p1, JButton p2, JButton p3, JButton p4) {
        if (p1.getText().equals("")){
            p1.setText(pp.getText());
            pp.setText("");
        }else if (p2.getText().equals("")){ 
            p2.setText(pp.getText());
            pp.setText("");
        }else if (p3.getText().equals("")){
            p3.setText(pp.getText());
            pp.setText("");
        }else if (p4.getText().equals("")){
            p4.setText(pp.getText());
            pp.setText("");
        }
    }
}