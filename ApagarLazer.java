package CondoWare2;

import javax.swing.JOptionPane;

public class ApagarLazer extends javax.swing.JFrame {

    String tipo = "";
    int capacidade = 0;
    float aluguel = 0;
    /**
     * Creates new form EditLazer
     */
    private ApagarLazer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private static ApagarLazer apagarLazerUnic;
    public static ApagarLazer getApagarLazerUnic() {
        if (apagarLazerUnic == null) {
            apagarLazerUnic = new ApagarLazer();
        }
        return apagarLazerUnic;
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotCapacidade = new javax.swing.JLabel();
        rotAluguel = new javax.swing.JLabel();
        cxId = new javax.swing.JTextField();
        cxTipo = new javax.swing.JTextField();
        cxCapacidade = new javax.swing.JTextField();
        cxAluguel = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        rotId = new javax.swing.JLabel();
        rotTipo = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deletar Area de Lazer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotCapacidade.setText("Capacidade:");

        rotAluguel.setText("Aluguel:");

        btSalvar.setText("Deletar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        rotId.setText("Id:");

        rotTipo.setText("Tipo:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addGap(126, 126, 126)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotTipo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotCapacidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxCapacidade))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotAluguel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rotId))
                    .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rotTipo))
                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCapacidade)
                    .addComponent(cxCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rotAluguel))
                    .addComponent(cxAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addComponent(btSalvar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        travarCx();
        mostrarDados();
    }//GEN-LAST:event_formWindowActivated

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        int id = Integer.parseInt(cxId.getText());
        int res = Conexao.getConexao().apagarAreaLazer(id);
        if(res == 1){
            JOptionPane.showMessageDialog(
                        null,
                        "Área apagada com sucesso!",
                        "Apagar área de lazer",
                        1);
        }
        else {
            JOptionPane.showMessageDialog(
                        null,
                        "Erro ao apagar área de laer",
                        "Apagar área de lazer",
                        0);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    public void receberLazer(String tp, int cap, float valor){
        tipo = tp;
        capacidade = cap;
        aluguel = valor;
    }
    
    public void mostrarDados(){
        int index = Conexao.getConexao().achaLazer(tipo, capacidade, aluguel);
        cxId.setText(Integer.toString(Bancos.getBancos().getBdAreaDeLazer().get(index).getId()));
        cxTipo.setText(Bancos.getBancos().getBdAreaDeLazer().get(index).getTipo());
        cxCapacidade.setText(Integer.toString(Bancos.getBancos().getBdAreaDeLazer().get(index).getCapacidade()));
        cxAluguel.setText(Float.toString(Bancos.getBancos().getBdAreaDeLazer().get(index).getValor()));
    }
    
    public void limpar(){
        cxId.setText("");
        cxTipo.setText("");
        cxCapacidade.setText("");
        cxAluguel.setText("");
    }
    
    public void travarCx(){
        cxId.setEnabled(false);
        cxTipo.setEnabled(false);
        cxCapacidade.setEnabled(false);
        cxAluguel.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxAluguel;
    private javax.swing.JTextField cxCapacidade;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JLabel rotAluguel;
    private javax.swing.JLabel rotCapacidade;
    private javax.swing.JLabel rotId;
    private javax.swing.JLabel rotTipo;
    // End of variables declaration//GEN-END:variables
}
