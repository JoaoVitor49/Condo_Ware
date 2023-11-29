package CondoWare2;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HistoricoVisitas extends javax.swing.JFrame {

    /**
     * Creates new form HistoricoVisitas
     */
    private HistoricoVisitas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private static HistoricoVisitas historicoVisitasUnic;

    public static HistoricoVisitas getHistoricoVisitasUnic() {
        if (historicoVisitasUnic == null) {
            historicoVisitasUnic = new HistoricoVisitas();
        }
        return historicoVisitasUnic;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabHistorico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historico de Visita");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tabHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Apartamento", "Bloco", "Entrada", "Saida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabHistoricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabHistorico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarAll();
    }//GEN-LAST:event_formWindowActivated

    private void tabHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabHistoricoMouseClicked
        mostrarLinha();
    }//GEN-LAST:event_tabHistoricoMouseClicked

     public void mostrarLinha(){
        int row = tabHistorico.getSelectedRow();
        String nome = (String) tabHistorico.getValueAt(row, 0);
        int ap = (int) tabHistorico.getValueAt(row,1);
        int bloco = (int) tabHistorico.getValueAt(row,2);
        Date entrada = (Date) tabHistorico.getValueAt(row,3);
        Date saida = (Date) tabHistorico.getValueAt(row,4);
        JOptionPane.showMessageDialog(
                        null,
                        "Nome: " +nome+
                        "\nApartamento: " +ap+
                        "\nBloco: " +bloco+
                        "\nEntrada: "+entrada+
                        "\nSaida: "+saida,
                        "Dados da Visita",
                        1);
    }
     
    public void listarAll() {
        Bancos.getBancos().getBdVisitante().clear();
        Conexao.getConexao().atualizaBancoVisitante();
        DefaultTableModel tabModel = (DefaultTableModel) tabHistorico.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        for(Visitante v: Bancos.getBancos().getBdVisitante()) {
            tabModel.insertRow(posLin, new Object[]{v.getNomeVisitante(),
                                                       v.getApVisitado(),
                                                       v.getBlocoVisitado(),
                                                       v.getEntrada(),
                                                       v.getSaida()});
            posLin++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabHistorico;
    // End of variables declaration//GEN-END:variables
}
