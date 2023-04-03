package quebracabec;

import javax.swing.JButton;
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
        
        List<String> jogo = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","");
        Collections.shuffle(jogo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bum.setText(jogo.get(0));
        bum.setName("bum"); 
        bum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bumActionPerformed(evt);
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
        bdois.setName("bdois");
        bdois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdoisActionPerformed(evt);
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
        btres.setName("btres"); 
        btres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresActionPerformed(evt);
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
        bquatro.setName("bquatro"); 
        bquatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquatroActionPerformed(evt);
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
        bcinco.setName("bcinco"); 
        bcinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcincoActionPerformed(evt);
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
        bseis.setName("bseis"); 
        bseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bseisActionPerformed(evt);
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
        bsete.setName("bsete"); 
        bsete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bseteActionPerformed(evt);
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
        boito.setName("boito"); 
        boito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boitoActionPerformed(evt);
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
        bnove.setName("bnove"); 
        bnove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnoveActionPerformed(evt);
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

        btreze.setText(jogo.get(9));
        btreze.setName("btreze"); 
        btreze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrezeActionPerformed(evt);
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

        bdez.setText(jogo.get(10));
        bdez.setName("bdez"); 
        bdez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdezActionPerformed(evt);
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

        bonze.setText(jogo.get(11));
        bonze.setName("bonze"); 
        bonze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonzeActionPerformed(evt);
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

        bdoze.setText(jogo.get(12));
        bdoze.setName("bdoze"); 
        bdoze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdozeActionPerformed(evt);
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
        bquatorze.setName("bquatorze"); 
        bquatorze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquatorzeActionPerformed(evt);
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

        bdezesseis.setText(jogo.get(14));
        bdezesseis.setName("bdezesseis"); 
        bdezesseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdezesseisActionPerformed(evt);
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

        bquinze.setText(jogo.get(15));
        bquinze.setName("bquinze");
        bquinze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquinzeActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void bdezesseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdezesseisActionPerformed
      
        movebutton.mover(bdezesseis, bdoze, bquinze);
    }

    private void bumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bumActionPerformed
       
        movebutton.mover(bum,bdois,bcinco);
    }
    private void bdoisActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bdois, bum, btres, bseis);
    }
    private void btresActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(btres, bdois, bquatro, bsete);
    }
    private void bquatroActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bquatro, btres, boito);
    }
    private void bcincoActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bcinco, bum, bseis, bnove);
    }
    private void bseisActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bseis, bdois, bcinco, bsete, bdez);
    }
    private void bseteActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bsete, btres, bseis, boito, bonze);
    }
    private void boitoActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(boito, bquatro, bsete, bdoze);
    }
    private void bnoveActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bnove, bcinco, bdez, btreze);
    }
    private void bdezActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bdez, bseis, bnove, bonze, bquatorze);
    }
    private void bonzeActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bonze, bsete, bdez, bdoze, bquinze);
    }
    private void bdozeActionPerformed(java.awt.event.ActionEvent evt){
       
        movebutton.mover(bdoze, boito, bonze, bdezesseis);
    }
    private void btrezeActionPerformed(java.awt.event.ActionEvent evt){
      
        movebutton.mover(btreze, bnove, bquatorze);
    }
    private void bquatorzeActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bquatorze, bdez, btreze,bquinze);
    }
    private void bquinzeActionPerformed(java.awt.event.ActionEvent evt){
        
        movebutton.mover(bquinze, bonze, bquatorze,bdezesseis);
    }
    private boolean verifica(){
        if(bum.getText().equals("1")){
            if(bdois.getText().equals("2")){
                if(btres.getText().equals("3")){
                    if(bquatro.getText().equals("4")){
                        if(bcinco.getText().equals("5")){
                            if(bseis.getText().equals("6")){
                                if(bsete.getText().equals("7")){
                                    if(boito.getText().equals("8")){
                                        if(bnove.getText().equals("9")){
                                            if(bdez.getText().equals("10")){
                                                if(bonze.getText().equals("11")){
                                                    if(bdoze.getText().equals("12")){
                                                        if(btreze.getText().equals("13")){
                                                            if(bquatorze.getText().equals("14")){
                                                                if(bquinze.getText().equals("15")){
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
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

}
