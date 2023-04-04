package quebracabec;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

//autores: Allan fernandes
//arhur de oliveira
//joão pedro ranolfi
//rafael matos

public class Design extends javax.swing.JFrame {
    Movimentacao movebutton = new Movimentacao();
    int contagem = 0;
    

    public Design() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        bum = new javax.swing.JButton();
        bdois = new javax.swing.JButton();
        btres = new javax.swing.JButton();
        bquatro = new javax.swing.JButton();
        bcinco = new javax.swing.JButton();
        bseis = new javax.swing.JButton();
        bsete = new javax.swing.JButton();
        boito = new javax.swing.JButton();
        bnove = new javax.swing.JButton();
        btreze = new javax.swing.JButton();
        bdez = new javax.swing.JButton();
        bonze = new javax.swing.JButton();
        bdoze = new javax.swing.JButton();
        bquatorze = new javax.swing.JButton();
        bdezesseis = new javax.swing.JButton();
        bquinze = new javax.swing.JButton();
        JLabel contatemp = new javax.swing.JLabel();
        
        List<String> jogo = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","");
        Collections.shuffle(jogo);
        movebutton.posit = jogo;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contatemp.setText(Integer.toString(contagem));

        bum.setText(jogo.get(0));
        bum.setName("1"); 
        bum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bumActionPerformed(evt);
                contatemp.setText(Integer.toString(contagem));                
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });
        
        bdois.setText(jogo.get(1));
        bdois.setName("2");
        bdois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdoisActionPerformed(evt);   
                contatemp.setText(Integer.toString(contagem));               
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        btres.setText(jogo.get(2));
        btres.setName("3"); 
        btres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresActionPerformed(evt);   
                contatemp.setText(Integer.toString(contagem));              
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bquatro.setText(jogo.get(3));
        bquatro.setName("4"); 
        bquatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquatroActionPerformed(evt);   
                contatemp.setText(Integer.toString(contagem));              
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bcinco.setText(jogo.get(4));
        bcinco.setName("5"); 
        bcinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcincoActionPerformed(evt); 
                contatemp.setText(Integer.toString(contagem));                
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bseis.setText(jogo.get(5));
        bseis.setName("6"); 
        bseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bseisActionPerformed(evt); 
                contatemp.setText(Integer.toString(contagem));                 
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bsete.setText(jogo.get(6));
        bsete.setName("7"); 
        bsete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bseteActionPerformed(evt);    
                contatemp.setText(Integer.toString(contagem));             
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        boito.setText(jogo.get(7));
        boito.setName("8"); 
        boito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boitoActionPerformed(evt); 
                contatemp.setText(Integer.toString(contagem));                 
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bnove.setText(jogo.get(8));
        bnove.setName("9"); 
        bnove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnoveActionPerformed(evt);  
                contatemp.setText(Integer.toString(contagem));                
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        btreze.setText(jogo.get(12));
        btreze.setName("13"); 
        btreze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrezeActionPerformed(evt); 
                contatemp.setText(Integer.toString(contagem));                
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bdez.setText(jogo.get(9));
        bdez.setName("10"); 
        bdez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdezActionPerformed(evt);  
                contatemp.setText(Integer.toString(contagem));               
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bonze.setText(jogo.get(10));
        bonze.setName("11"); 
        bonze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonzeActionPerformed(evt);  
                contatemp.setText(Integer.toString(contagem));               
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bdoze.setText(jogo.get(11));
        bdoze.setName("12"); 
        bdoze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdozeActionPerformed(evt);        
                contatemp.setText(Integer.toString(contagem));         
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bquatorze.setText(jogo.get(13));
        bquatorze.setName("14"); 
        bquatorze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquatorzeActionPerformed(evt);   
                contatemp.setText(Integer.toString(contagem));              
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bdezesseis.setText(jogo.get(15));
        bdezesseis.setName("16"); 
        bdezesseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdezesseisActionPerformed(evt);   
                contatemp.setText(Integer.toString(contagem));              
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });

        bquinze.setText(jogo.get(14));
        bquinze.setName("15");
        bquinze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquinzeActionPerformed(evt); 
                contatemp.setText(Integer.toString(contagem)); 
                if(bdezesseis.getText().equals("")){
                    if(verifica() == true){
                        int resp;
                        resp = JOptionPane.showConfirmDialog(null, "você deseja continuar?", "continuar",JOptionPane.YES_NO_OPTION,1);
                        if(resp == 0){
                            Design.this.setVisible(false);
                            Design.this.dispose();
                            new Design().setVisible(true);
                        }else{
                            System.exit(0);
                        }
                    }
                } 
            }
        });
        
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(contatemp, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btreze, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(bnove, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bcinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bdez, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bseis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bdois, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bquatorze, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(bonze, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bquatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdoze, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bquinze, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bdezesseis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bquatro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bcinco, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(bseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bsete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bdez, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(bnove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdoze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bonze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btreze, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(bdezesseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bquatorze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bquinze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contatemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void bdezesseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdezesseisActionPerformed
      
        movebutton.mover(bdezesseis, bdoze, bquinze);
        contagem++;
        contatemp.setText(Integer.toString(contagem));
    }

    private void bumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bumActionPerformed
       
        movebutton.mover(bum,bdois,bcinco);
        contagem++;
    }
    private void bdoisActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bdois, bum, btres, bseis);
        contagem++;
    }
    private void btresActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(btres, bdois, bquatro, bsete);
        contagem++;
    }
    private void bquatroActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bquatro, btres, boito);
        contagem++;
    }
    private void bcincoActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bcinco, bum, bseis, bnove);
        contagem++;
    }
    private void bseisActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bseis, bdois, bcinco, bsete, bdez);
        contagem++;
    }
    private void bseteActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bsete, btres, bseis, boito, bonze);
        contagem++;
    }
    private void boitoActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(boito, bquatro, bsete, bdoze);
        contagem++;
    }
    private void bnoveActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bnove, bcinco, bdez, btreze);
        contagem++;
    }
    private void bdezActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bdez, bseis, bnove, bonze, bquatorze);
        contagem++;
    }
    private void bonzeActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bonze, bsete, bdez, bdoze, bquinze);
        contagem++;
    }
    private void bdozeActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bdoze, boito, bonze, bdezesseis);
        contagem++;
    }
    private void btrezeActionPerformed(java.awt.event.ActionEvent evt){
      
        movebutton.mover(btreze, bnove, bquatorze);
        contagem++;
    }
    private void bquatorzeActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bquatorze, bdez, btreze,bquinze);
        contagem++;
    }
    private void bquinzeActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bquinze, bonze, bquatorze,bdezesseis);
        contagem++;
    }
    private boolean verifica(){
        List<String> correto = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","");
        for(int i = 0;i < 16;i++){
            if(movebutton.posit.get(i) != correto.get(i)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design().setVisible(true);
            }            
        }); 
        
        
        
        
    }

    private javax.swing.JButton bcinco;
    private javax.swing.JButton bdez;
    private javax.swing.JButton bdezesseis;
    private javax.swing.JButton bdois;
    private javax.swing.JButton bdoze;
    private javax.swing.JButton bnove;
    private javax.swing.JButton boito;
    private javax.swing.JButton bonze;
    private javax.swing.JButton bquatorze;
    private javax.swing.JButton bquatro;
    private javax.swing.JButton bquinze;
    private javax.swing.JButton bseis;
    private javax.swing.JButton bsete;
    private javax.swing.JButton btres;
    private javax.swing.JButton btreze;
    private javax.swing.JButton bum;
    public javax.swing.JLabel contatemp;

}
