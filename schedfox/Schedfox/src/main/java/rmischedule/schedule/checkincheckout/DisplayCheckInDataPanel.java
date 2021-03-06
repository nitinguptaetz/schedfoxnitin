/*
 * DisplayCheckInDataPanel.java
 *
 * Created on December 23, 2004, 10:24 AM
 */

package rmischedule.schedule.checkincheckout;

import java.awt.*;
import schedfoxlib.model.AssembleCheckinScheduleType;
/**
 *
 * @author  ira
 */
public class DisplayCheckInDataPanel extends javax.swing.JPanel {
    
    public static final int DISPLAY_CLIENT_INFO   = 1;
    public static final int DISPLAY_EMPLOYEE_INFO = 2;
    public static final int DISPLAY_OTHER_INFO    = 3;
    
    /** Creates new form DisplayCheckInDataPanel */
    public DisplayCheckInDataPanel() {
        initComponents();
        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(255,255,255));
    }
    
    public void showData(IndividualCheckInCheckOutPanel myPanel, int InfoToDisplay) {
        AssembleCheckinScheduleType checkinInfo = myPanel.getCheckinType();
        if (InfoToDisplay == this.DISPLAY_CLIENT_INFO) {
            NameLabel.setText    (myPanel.ClientNameLabel.getText());
            NameHeaderLabel.setText("Location:");
            PhoneLabel.setText(checkinInfo.getClient_phone());
            CellLabel.setText(checkinInfo.getClient_phone2());
            AddressLabel.setText (checkinInfo.getClient_address());
            Address2Label.setText(checkinInfo.getClient_city() +", " + checkinInfo.getClient_state() + " " + checkinInfo.getClient_zip());
        } else if (InfoToDisplay == this.DISPLAY_EMPLOYEE_INFO) {
            NameLabel.setText(myPanel.EmployeeNameLabel.getText());
            EmployeeIDLabel.setText(checkinInfo.getEid().toString());
            NameHeaderLabel.setText("Name:");
            PhoneLabel.setText(checkinInfo.getEmp_phone());
            CellLabel.setText(checkinInfo.getEmp_cell());
            AddressLabel.setText(checkinInfo.getEmp_address());
            Address2Label.setText(checkinInfo.getEmp_city() + ", " + checkinInfo.getEmp_state() + " " + checkinInfo.getEmp_zip());
        }
    }
    
    public void setMyForeground(Color newColor) {
        NameLabel.setForeground(newColor);
        CellLabel.setForeground(newColor);
        AddressLabel.setForeground(newColor);
        Address2Label.setForeground(newColor);
        PhoneLabel.setForeground(newColor);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NamePanel = new javax.swing.JPanel();
        NameHeaderLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        EmployeeIDPanel = new javax.swing.JPanel();
        EmployeeIDLabel = new javax.swing.JLabel();
        EmployeeIDHeaderLabel = new javax.swing.JLabel();
        PhonePanel = new javax.swing.JPanel();
        PhoneHeaderLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        CellPanel = new javax.swing.JPanel();
        CellHeaderLabel = new javax.swing.JLabel();
        CellLabel = new javax.swing.JLabel();
        AddressPanel = new javax.swing.JPanel();
        AddressHeaderLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        Address2Panel = new javax.swing.JPanel();
        NameHeaderLabel4 = new javax.swing.JLabel();
        Address2Label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setMaximumSize(new java.awt.Dimension(200, 100));
        setMinimumSize(new java.awt.Dimension(200, 100));
        setPreferredSize(new java.awt.Dimension(200, 100));
        setLayout(new java.awt.GridLayout(0, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 100));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        NamePanel.setOpaque(false);
        NamePanel.setLayout(new javax.swing.BoxLayout(NamePanel, javax.swing.BoxLayout.LINE_AXIS));

        NameHeaderLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10)); // NOI18N
        NameHeaderLabel.setText("Name:");
        NameHeaderLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        NameHeaderLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        NameHeaderLabel.setPreferredSize(new java.awt.Dimension(50, 15));
        NamePanel.add(NameHeaderLabel);

        NameLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10));
        NamePanel.add(NameLabel);

        jPanel1.add(NamePanel);

        EmployeeIDPanel.setOpaque(false);
        EmployeeIDPanel.setLayout(new javax.swing.BoxLayout(EmployeeIDPanel, javax.swing.BoxLayout.LINE_AXIS));

        EmployeeIDLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10)); // NOI18N
        EmployeeIDPanel.add(EmployeeIDLabel);

        EmployeeIDHeaderLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10)); // NOI18N
        EmployeeIDHeaderLabel.setText("Employee ID");
        EmployeeIDHeaderLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        EmployeeIDHeaderLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        EmployeeIDHeaderLabel.setPreferredSize(new java.awt.Dimension(50, 15));
        EmployeeIDPanel.add(EmployeeIDHeaderLabel);

        jPanel1.add(EmployeeIDPanel);

        PhonePanel.setOpaque(false);
        PhonePanel.setLayout(new javax.swing.BoxLayout(PhonePanel, javax.swing.BoxLayout.LINE_AXIS));

        PhoneHeaderLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10)); // NOI18N
        PhoneHeaderLabel.setText("Phone:");
        PhoneHeaderLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        PhoneHeaderLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        PhoneHeaderLabel.setPreferredSize(new java.awt.Dimension(50, 15));
        PhonePanel.add(PhoneHeaderLabel);

        PhoneLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10));
        PhonePanel.add(PhoneLabel);

        jPanel1.add(PhonePanel);

        CellPanel.setOpaque(false);
        CellPanel.setLayout(new javax.swing.BoxLayout(CellPanel, javax.swing.BoxLayout.LINE_AXIS));

        CellHeaderLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10)); // NOI18N
        CellHeaderLabel.setText("Cell:");
        CellHeaderLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        CellHeaderLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        CellHeaderLabel.setPreferredSize(new java.awt.Dimension(50, 15));
        CellPanel.add(CellHeaderLabel);

        CellLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10));
        CellPanel.add(CellLabel);

        jPanel1.add(CellPanel);

        AddressPanel.setOpaque(false);
        AddressPanel.setLayout(new javax.swing.BoxLayout(AddressPanel, javax.swing.BoxLayout.LINE_AXIS));

        AddressHeaderLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10)); // NOI18N
        AddressHeaderLabel.setText("Address:");
        AddressHeaderLabel.setMaximumSize(new java.awt.Dimension(50, 15));
        AddressHeaderLabel.setMinimumSize(new java.awt.Dimension(50, 15));
        AddressHeaderLabel.setPreferredSize(new java.awt.Dimension(50, 15));
        AddressPanel.add(AddressHeaderLabel);

        AddressLabel.setFont(new java.awt.Font("MS Sans Serif", 0, 10));
        AddressPanel.add(AddressLabel);

        jPanel1.add(AddressPanel);

        Address2Panel.setOpaque(false);
        Address2Panel.setLayout(new javax.swing.BoxLayout(Address2Panel, javax.swing.BoxLayout.LINE_AXIS));

        NameHeaderLabel4.setMaximumSize(new java.awt.Dimension(50, 15));
        NameHeaderLabel4.setMinimumSize(new java.awt.Dimension(50, 15));
        NameHeaderLabel4.setPreferredSize(new java.awt.Dimension(50, 15));
        Address2Panel.add(NameHeaderLabel4);

        Address2Label.setFont(new java.awt.Font("MS Sans Serif", 0, 10));
        Address2Panel.add(Address2Label);

        jPanel1.add(Address2Panel);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address2Label;
    private javax.swing.JPanel Address2Panel;
    private javax.swing.JLabel AddressHeaderLabel;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JPanel AddressPanel;
    private javax.swing.JLabel CellHeaderLabel;
    private javax.swing.JLabel CellLabel;
    private javax.swing.JPanel CellPanel;
    private javax.swing.JLabel EmployeeIDHeaderLabel;
    private javax.swing.JLabel EmployeeIDLabel;
    private javax.swing.JPanel EmployeeIDPanel;
    private javax.swing.JLabel NameHeaderLabel;
    private javax.swing.JLabel NameHeaderLabel4;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JLabel PhoneHeaderLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JPanel PhonePanel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}
