package condoware.CondoWare;


public class TelaDoCondomino extends javax.swing.JFrame {

    /**
     * Creates new form TelaDoCondomino
     */
    private TelaDoCondomino() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private static TelaDoCondomino telaCondominoUnic;
    public static TelaDoCondomino getTelaCondominoUnic(){
        if(telaCondominoUnic == null){
            telaCondominoUnic = new TelaDoCondomino();
        }
        return telaCondominoUnic;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btRegistrarProblemas = new javax.swing.JButton();
        btReservarEspaços = new javax.swing.JButton();
        btDadosPessoais = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");

        btRegistrarProblemas.setText("Registrar Problemas");
        btRegistrarProblemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarProblemasActionPerformed(evt);
            }
        });

        btReservarEspaços.setText("Reservar Espaços");
        btReservarEspaços.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarEspaçosActionPerformed(evt);
            }
        });

        btDadosPessoais.setText("Dados Pessoais");
        btDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDadosPessoaisActionPerformed(evt);
            }
        });

        jButton1.setText("Empresas Parceiras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btRegistrarProblemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btReservarEspaços, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btDadosPessoais)
                .addGap(18, 18, 18)
                .addComponent(btReservarEspaços)
                .addGap(18, 18, 18)
                .addComponent(btRegistrarProblemas)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDadosPessoaisActionPerformed
        DadosPessoaisCondômino.getDadosPessoaisCondUnic().setVisible(true);
        Conexao.getConexao().atualizaBancoCondomino();
    }//GEN-LAST:event_btDadosPessoaisActionPerformed

    private void btReservarEspaçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarEspaçosActionPerformed
        ReservarEspaços.getReservarEspaçosUnic().setVisible(true);
    }//GEN-LAST:event_btReservarEspaçosActionPerformed

    private void btRegistrarProblemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarProblemasActionPerformed
        RegistrarProblemas.getRegistrarProblemasUnic().setVisible(true);
    }//GEN-LAST:event_btRegistrarProblemasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EmpresasParceiras.getEmpresasParceirasUnic().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDadosPessoais;
    private javax.swing.JButton btRegistrarProblemas;
    private javax.swing.JButton btReservarEspaços;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}