/*
 * usked_progress.java
 *
 * Created on December 20, 2004, 8:07 AM
 */

package rmischedule.data_import.ultra32;

/**
 *
 * @author  jason.allen
 */
public class usked_progress extends javax.swing.JDialog {
    
    /** Creates new form usked_progress */
    public usked_progress(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void newProgress(){
        pbClient.setValue(0);
        pbEmployee.setValue(0);
        pbSchedule.setValue(0);
    }
    
    public void setClient(int size, String sp){
        lblClient.setText(sp);
        pbClient.setValue(0);
        pbClient.setMaximum(size);
    }
    
    public void incClient(){
        pbClient.setValue((pbClient.getValue()+1));
    }
    
    public void setEmployee(int size, String sp){
        lblEmployee.setText(sp);
        pbEmployee.setValue(0);
        pbEmployee.setMaximum(size);
    }
    
    public void incEmployee(){
        pbEmployee.setValue((pbEmployee.getValue()+1));
    }

    public void setSchedule(int size, String sp){
        lblSchedule.setText(sp);
        pbSchedule.setValue(0);
        pbSchedule.setMaximum(size);
    }
    
    public void incSchedule(){
        pbSchedule.setValue((pbSchedule.getValue()+1));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        lblClient = new javax.swing.JLabel();
        pbClient = new javax.swing.JProgressBar();
        lblEmployee = new javax.swing.JLabel();
        pbEmployee = new javax.swing.JProgressBar();
        lblSchedule = new javax.swing.JLabel();
        pbSchedule = new javax.swing.JProgressBar();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModal(true);
        getAccessibleContext().setAccessibleParent(null);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBorder(new javax.swing.border.EmptyBorder(new java.awt.Insets(1, 3, 1, 3)));
        lblClient.setText("Client Import:");
        jPanel1.add(lblClient);

        pbClient.setMaximumSize(new java.awt.Dimension(32767, 100));
        pbClient.setStringPainted(true);
        jPanel1.add(pbClient);

        lblEmployee.setText("Employee Import:");
        jPanel1.add(lblEmployee);

        pbEmployee.setMaximumSize(new java.awt.Dimension(32767, 100));
        pbEmployee.setStringPainted(true);
        jPanel1.add(pbEmployee);

        lblSchedule.setText("Schedule Import:");
        jPanel1.add(lblSchedule);

        pbSchedule.setMaximumSize(new java.awt.Dimension(32767, 100));
        pbSchedule.setStringPainted(true);
        jPanel1.add(pbSchedule);

        getContentPane().add(jPanel1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-400)/2, (screenSize.height-300)/2, 400, 300);
    }//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new usked_progress(new javax.swing.JFrame(), true).show();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblSchedule;
    private javax.swing.JProgressBar pbClient;
    private javax.swing.JProgressBar pbEmployee;
    private javax.swing.JProgressBar pbSchedule;
    // End of variables declaration//GEN-END:variables
    
}