/*
 * ExpiredCertification.java
 *
 * Created on March 3, 2006, 1:32 PM
 */

package rmischedule.misc;
import schedfoxlib.model.util.Record_Set;
import rmischeduleserver.data_connection_types.*;
/**
 *
 * @author  Ira Juneau
 */
public class ExpiredCertification extends javax.swing.JPanel {
    
    /** Creates new form ExpiredCertification */
    public ExpiredCertification() {
        initComponents();
    }
    
    public void initData(Record_Set rs) {
        Name.setText(rs.getString("employee_first_name") + " " + rs.getString("employee_last_name"));
        CertificationName.setText(rs.getString("certification_name"));
        DateExpired.setText(rs.getString("cert_expires_on"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        Name = new javax.swing.JLabel();
        CertificationName = new javax.swing.JLabel();
        DateExpired = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        setBackground(new java.awt.Color(169, 191, 241));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Name.setMaximumSize(new java.awt.Dimension(120, 20));
        Name.setMinimumSize(new java.awt.Dimension(120, 20));
        Name.setPreferredSize(new java.awt.Dimension(120, 20));
        add(Name);

        CertificationName.setMaximumSize(new java.awt.Dimension(140, 20));
        CertificationName.setMinimumSize(new java.awt.Dimension(140, 20));
        CertificationName.setPreferredSize(new java.awt.Dimension(140, 20));
        add(CertificationName);

        DateExpired.setMaximumSize(new java.awt.Dimension(140, 20));
        DateExpired.setMinimumSize(new java.awt.Dimension(140, 20));
        DateExpired.setPreferredSize(new java.awt.Dimension(140, 20));
        add(DateExpired);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CertificationName;
    private javax.swing.JLabel DateExpired;
    private javax.swing.JLabel Name;
    // End of variables declaration//GEN-END:variables
    
}
