/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmischedule.xprint.components;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rmischeduleserver.control.ClientController;
import schedfoxlib.model.Client;

/**
 *
 * @author ira
 */
public class SelectClientsDialog extends javax.swing.JDialog {

    private ClientSelectionModel model = null;
    
    /**
     * Creates new form SelectClientsDialog
     */
    public SelectClientsDialog(java.awt.Frame parent, boolean modal, String companyId) {
        super(parent, modal);
        model = new ClientSelectionModel();
        initComponents();
        
        ClientController clientController = ClientController.getInstance(companyId);
        try {
            ArrayList<Client> clients = clientController.getActiveClients();
            
        } catch (Exception exe) {
            
        }
    }

    private class ClientSelectionModel extends AbstractTableModel {

        private ArrayList<Client> clients;
        private ArrayList<Boolean> selected;
        
        public ClientSelectionModel() {
            clients = new ArrayList<Client>();
            selected = new ArrayList<Boolean>();
        }
        
        public void setData(ArrayList<Client> clients) {
            this.clients = clients;
            selected = new ArrayList<Boolean>();
            for (int c = 0; c < clients.size(); c++) {
                selected.add(allClientsChk.isSelected());
            }
        }
        
        public int getRowCount() {
            return clients.size();
        }

        public int getColumnCount() {
            return 2;
        }

        public Class getColumnClass(int columnIndex) {
            if (columnIndex == 0) {
                return Boolean.class;
            }
            return String.class;
        }
        
        public Object getValueAt(int rowIndex, int columnIndex) {
            Client client = clients.get(rowIndex);
            Boolean selectedBool = selected.get(rowIndex);
            if (columnIndex == 0) {
                return selectedBool;
            } else {
                return client.getName();
            }
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        allClientsChk = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 20));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 20));

        allClientsChk.setText("Select All Clients");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(allClientsChk)
                .addGap(0, 277, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(allClientsChk)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout());

        clientTable.setModel(model);
        jScrollPane1.setViewportView(clientTable);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2);

        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 35));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 35));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 35));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jButton2.setText("Cancel");
        jButton2.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(jButton2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jButton1.setText("Ok");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(jButton1);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allClientsChk;
    private javax.swing.JTable clientTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}