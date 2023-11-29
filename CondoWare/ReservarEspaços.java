package condoware.CondoWare;

import java.beans.PropertyChangeEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ReservarEspaços extends javax.swing.JFrame {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String dat = "";
    /**
     * Creates new form ReservarEspaços
     */
    private ReservarEspaços() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private static ReservarEspaços reservarEspaçosUnic;
    public static ReservarEspaços getReservarEspaçosUnic(){
        if(reservarEspaçosUnic == null){
            reservarEspaçosUnic = new ReservarEspaços();
        }
        return reservarEspaçosUnic;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabAreasDeLazer = new javax.swing.JTable();
        rotData = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btReservar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservas de Areas de Lazer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabAreasDeLazer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Capacidade", "Aluguel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabAreasDeLazer);

        rotData.setText("Data:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btReservar.setText("Reservar");
        btReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btReservar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarActionPerformed
        int row = tabAreasDeLazer.getSelectedRow();
        int id = (int) tabAreasDeLazer.getValueAt(row,0);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
        try{
            Date data = formato.parse(dat);
            Conexao.getConexao().verificaDataDisp(data, id);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btReservarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarAll();
    }//GEN-LAST:event_formWindowActivated

    private void dcDataPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcDataPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            // Lógica para lidar com a data selecionada
            Date dataSelecionada = (Date) evt.getNewValue();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dat = sdf.format(dataSelecionada);
            System.out.println("Data Selecionada: " + dat);
        }
    }//GEN-LAST:event_dcDataPropertyChange
    
    public void listarAll() {
        Bancos.getBancos().getBdAreaDeLazer().clear();
        Conexao.getConexao().atualizaBancoAreaDeLazer();
        DefaultTableModel tabModel = (DefaultTableModel) tabAreasDeLazer.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        for(AreaDeLazer a: Bancos.getBancos().getBdAreaDeLazer()) {
            tabModel.insertRow(posLin, new Object[]{a.getId(),
                                                       a.getTipo(),
                                                       a.getCapacidade(),
                                                       a.getValor()});
            posLin++;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReservar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotData;
    private javax.swing.JTable tabAreasDeLazer;
    // End of variables declaration//GEN-END:variables
}
