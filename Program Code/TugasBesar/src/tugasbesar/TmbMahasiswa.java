/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasbesar;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ardie
 */
public class TmbMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form TmbAnggota
     */
    Connection con;
    PreparedStatement pst;
    
    private void tampilkanData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. ");
        model.addColumn("Nama");
        model.addColumn("NIM");
        model.addColumn("Email");
        model.addColumn("Gender");
        model.addColumn("Angkatan");
        model.addColumn("Semester");
        model.addColumn("Jurusan");
        model.addColumn("Fakultas");
        model.addColumn("Semester");
        model.addColumn("Infak");
        model.addColumn("Beasiswa");
        model.addColumn("Status Pembayaran");
        
        try{
            int no=1;
            java.sql.Connection conew =(Connection)dataConnection.configDB();
            String sql = "Select * from datamahasiswa";
            PreparedStatement pstnm = conew.prepareStatement(sql);
            ResultSet rst = pstnm.executeQuery();
            
            while(rst.next()){
                model.addRow(new Object[]{no++, rst.getString(1), 
                    rst.getString(2), rst.getString(3), rst.getString(4), 
                    rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), 
                    rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(15)});
            }
            tableData.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
        
    }
    
    
    private void kosongkanForm(){
        txtFieldNama.setText(null);
        txtFieldEmail.setText(null);
        txtFieldNim.setText(null);
        txtFieldSemester.setText(null);
        setGender.clearSelection();
        cmbAngkatan.setSelectedItem(null);
        cmbFakultas.setSelectedItem(null);
        cmbProdi.setSelectedItem(null);
    }
    
    
    
    public TmbMahasiswa() {
        initComponents();
        kosongkanForm();
        tampilkanData();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setGender = new javax.swing.ButtonGroup();
        txtFieldNama = new javax.swing.JTextField();
        txtFieldSemester = new javax.swing.JTextField();
        txtFieldEmail = new javax.swing.JTextField();
        txtFieldNim = new javax.swing.JTextField();
        cmbProdi = new javax.swing.JComboBox<>();
        cmbAngkatan = new javax.swing.JComboBox<>();
        cmbFakultas = new javax.swing.JComboBox<>();
        cbBPP = new javax.swing.JCheckBox();
        cbBea = new javax.swing.JCheckBox();
        cbInfak = new javax.swing.JCheckBox();
        setPerempuan = new javax.swing.JRadioButton();
        setLaki = new javax.swing.JRadioButton();
        btnTmbData = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnCetakData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        Background = new javax.swing.JLabel();
        hideBPP = new javax.swing.JTextField();
        hideInfak = new javax.swing.JTextField();
        hideBea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        txtFieldNama.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        getContentPane().add(txtFieldNama);
        txtFieldNama.setBounds(220, 120, 240, 30);

        txtFieldSemester.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        getContentPane().add(txtFieldSemester);
        txtFieldSemester.setBounds(430, 276, 40, 30);

        txtFieldEmail.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        getContentPane().add(txtFieldEmail);
        txtFieldEmail.setBounds(220, 200, 240, 30);

        txtFieldNim.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        getContentPane().add(txtFieldNim);
        txtFieldNim.setBounds(220, 160, 240, 30);

        cmbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1 Teknik Informatika", "S1 Sistem Informasi", "S1 Software Engineering", "S1 Sains Data", "D3 Teknik Telekomunikasi", "S1 Teknik Telekomunikasi", "S1 Teknik Elektro", "S1 Teknik Industri", "S1 Teknik Logistik", "S1 Teknologi Pangan", "S1 Teknik Biomedis", "S1 Desain Komunikasi Visual" }));
        cmbProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdiActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProdi);
        cmbProdi.setBounds(220, 320, 200, 20);

        cmbAngkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17", "18", "19", "20", "21", "22", " " }));
        cmbAngkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAngkatanActionPerformed(evt);
            }
        });
        getContentPane().add(cmbAngkatan);
        cmbAngkatan.setBounds(220, 280, 90, 20);

        cmbFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fakultas Informatika", "Fakultas Telekomunikasi & Elektro", "Fakultas Rekayasa Industri & Desain" }));
        getContentPane().add(cmbFakultas);
        cmbFakultas.setBounds(220, 360, 200, 20);

        cbBPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBPPActionPerformed(evt);
            }
        });
        getContentPane().add(cbBPP);
        cbBPP.setBounds(670, 141, 150, 21);

        cbBea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBeaActionPerformed(evt);
            }
        });
        getContentPane().add(cbBea);
        cbBea.setBounds(670, 213, 120, 21);

        cbInfak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInfakActionPerformed(evt);
            }
        });
        getContentPane().add(cbInfak);
        cbInfak.setBounds(670, 177, 210, 21);

        setGender.add(setPerempuan);
        getContentPane().add(setPerempuan);
        setPerempuan.setBounds(302, 241, 100, 20);

        setGender.add(setLaki);
        setLaki.setText("                     ");
        setLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLakiActionPerformed(evt);
            }
        });
        getContentPane().add(setLaki);
        setLaki.setBounds(214, 241, 89, 23);

        btnTmbData.setText("Tambah Data");
        btnTmbData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTmbDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnTmbData);
        btnTmbData.setBounds(530, 360, 110, 23);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan);
        btnSimpan.setBounds(650, 360, 70, 23);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(730, 360, 60, 23);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(810, 360, 63, 23);

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal);
        btnBatal.setBounds(890, 360, 57, 23);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar);
        btnKeluar.setBounds(920, 90, 75, 23);

        btnCetakData.setText("Cetak Data Mahasiswa");
        btnCetakData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnCetakData);
        btnCetakData.setBounds(790, 320, 170, 30);

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableData);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 400, 870, 280);

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ardie\\OneDrive\\Dokumen\\NetBeansProjects\\TugasBesar\\src\\tugasbesar\\icon\\Nama .png")); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1150, 710);
        getContentPane().add(hideBPP);
        hideBPP.setBounds(840, 130, 120, 30);
        getContentPane().add(hideInfak);
        hideInfak.setBounds(840, 170, 120, 30);
        getContentPane().add(hideBea);
        hideBea.setBounds(840, 210, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAngkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAngkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAngkatanActionPerformed

    private void cmbProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProdiActionPerformed

    private void setLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setLakiActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnTmbDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTmbDataActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
        
    }//GEN-LAST:event_btnTmbDataActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try{
            String gender = null;
            if(setLaki.isSelected()){
                gender = "Laki-Laki";
            }else if(setPerempuan.isSelected()){
                gender = "Perempuan";
            }
            int biayaSemesterDefault=0, infakPembangunanDefault=0, beasiswaDefault=0;
            
            
           String sql = "INSERT INTO datamahasiswa(nama, nim , email, gender, angkatan, semester, "
                    + "jurusan, fakultas, usersmhs, passmhs, bppsemester, infak, beasiswa) VALUES ('" + txtFieldNama.getText()+ "','" + 
                    txtFieldNim.getText()+ "','" + txtFieldEmail.getText()+ "','" +  gender + "','" + cmbAngkatan.getSelectedItem()+ "','" + 
                    txtFieldSemester.getText()+ "','" + cmbProdi.getSelectedItem()+ "','" + cmbFakultas.getSelectedItem()+ "','" + 
                    txtFieldNim.getText()+ "','" + cmbAngkatan.getSelectedItem() + txtFieldNim.getText() + "','" + biayaSemesterDefault + "','" + infakPembangunanDefault + "','" + beasiswaDefault + "')";
           java.sql.Connection coen =(Connection)dataConnection.configDB();
           PreparedStatement pstm = coen.prepareStatement(sql);
           pstm.execute();
           
           String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
            java.sql.Connection connect = (Connection)dataConnection.configDB();
            PreparedStatement pstmn = connect.prepareStatement(updateTotal);
            pstmn.execute();
            
            String lns = "Lunas";
            String blm = "Belum Lunas";
            String krdt = "Di Kreditkan";
            
            String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
            java.sql.Connection cont = (Connection)dataConnection.configDB();
            PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
            pstmm.execute();
           
           JOptionPane.showMessageDialog(null, "Data Successfully Save to Database");
           tampilkanData();
           kosongkanForm();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void cbBPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBPPActionPerformed
        // TODO add your handling code here:
        try{
            if(cbBPP.isSelected()){
                String bpp = "UPDATE datamahasiswa SET bppsemester='" + 6000000 + "'WHERE nim = '" + txtFieldNim.getText()+"'";
                java.sql.Connection concc =(Connection)dataConnection.configDB();
                PreparedStatement psst = concc.prepareStatement(bpp);
                psst.execute();
                String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
                java.sql.Connection connect = (Connection)dataConnection.configDB();
                PreparedStatement pstmn = connect.prepareStatement(updateTotal);
                pstmn.execute();
            
                String lns = "Lunas";
                String blm = "Belum Lunas";
                String krdt = "Di Kreditkan";
            
                String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
                java.sql.Connection cont = (Connection)dataConnection.configDB();
                PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
                pstmm.execute();
            }else{
                String bpp0 = "UPDATE datamahasiswa SET bppsemester='" + 0 + "'WHERE nim = '" + txtFieldNim.getText()+"'";
                java.sql.Connection conn =(Connection)dataConnection.configDB();
                PreparedStatement pstm = conn.prepareStatement(bpp0);
                pstm.execute();
                
                String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
                java.sql.Connection connect = (Connection)dataConnection.configDB();
                PreparedStatement pstmn = connect.prepareStatement(updateTotal);
                pstmn.execute();
                
                String lns = "Lunas";
                String blm = "Belum Lunas";
                String krdt = "Di Kreditkan";
                String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
                java.sql.Connection cont = (Connection)dataConnection.configDB();
                PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
                pstmm.execute();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tampilkanData();
    }//GEN-LAST:event_cbBPPActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        // TODO add your handling code here:

            
        int baris = tableData.rowAtPoint(evt.getPoint());
        
        String name = tableData.getValueAt(baris, 1).toString();
        txtFieldNama.setText(name);
        
        String nim = tableData.getValueAt(baris, 2).toString();
        txtFieldNim.setText(nim);
        
        String emails = tableData.getValueAt(baris, 3).toString();
        txtFieldEmail.setText(emails);
        
        String angkatan = tableData.getValueAt(baris, 5).toString();
        cmbAngkatan.setSelectedItem(angkatan);
        
        String semesters = tableData.getValueAt(baris, 6).toString();
        txtFieldSemester.setText(semesters);
        
        String jurusan = tableData.getValueAt(baris, 7).toString();
        cmbProdi.setSelectedItem(jurusan);
        
        String fakultass = tableData.getValueAt(baris, 8).toString();
        cmbFakultas.setSelectedItem(fakultass);
        
    }//GEN-LAST:event_tableDataMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try{
            String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
            java.sql.Connection connect = (Connection)dataConnection.configDB();
            PreparedStatement pstmn = connect.prepareStatement(updateTotal);
            pstmn.execute();
            
            String lns = "Lunas";
            String blm = "Belum Lunas";
            String krdt = "Di Kreditkan";
            
            String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
            java.sql.Connection cont = (Connection)dataConnection.configDB();
            PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
            pstmm.execute();
            
            String gender = null;
            if(setLaki.isSelected()){
                gender = "Laki-Laki";
            }else if(setPerempuan.isSelected()){
                gender = "Perempuan";
            }
            String sql = "UPDATE  datamahasiswa SET nama='" + txtFieldNama.getText()+ "',nim='" + 
                    txtFieldNim.getText()+ "',email='" + txtFieldEmail.getText()+ "',gender='" + gender + "',angkatan='" + 
                    cmbAngkatan.getSelectedItem()+ "',semester='" + txtFieldSemester.getText()+ "',jurusan='" + 
                    cmbProdi.getSelectedItem()+ "',fakultas='" + cmbFakultas.getSelectedItem()+ "'WHERE nim = '" + txtFieldNim.getText()+"'";
            java.sql.Connection connn =(Connection)dataConnection.configDB();
            PreparedStatement pstam = connn.prepareStatement(sql);
            pstam.execute();

            JOptionPane.showMessageDialog(null, "Data Has Been Updated from DataBase");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tampilkanData();
        kosongkanForm();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
       try{
            String del = "DELETE FROM datamahasiswa WHERE nim='"+txtFieldNim.getText()+"'";
            java.sql.Connection connn =(Connection)dataConnection.configDB();
            PreparedStatement psmt = connn.prepareStatement(del);
            psmt.execute();
            JOptionPane.showMessageDialog(null, "Data Has Been Deleted from DataBase");
       }catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       tampilkanData();
       kosongkanForm();
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbInfakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInfakActionPerformed
        // TODO add your handling code here:
        try{
            
            if(cbInfak.isSelected()){
                String infak = "UPDATE datamahasiswa SET infak='" + 200000 + "'WHERE nim = '" + txtFieldNim.getText()+"'";
                java.sql.Connection cotn =(Connection)dataConnection.configDB();
                PreparedStatement pstd = cotn.prepareStatement(infak);
                pstd.execute();
                
                
                String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
                java.sql.Connection connect = (Connection)dataConnection.configDB();
                PreparedStatement pstmn = connect.prepareStatement(updateTotal);
                pstmn.execute();
            
                String lns = "Lunas";
                String blm = "Belum Lunas";
                String krdt = "Di Kreditkan";
                String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
                java.sql.Connection cont = (Connection)dataConnection.configDB();
                PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
                pstmm.execute();
                
            }else{
                String infak0 = "UPDATE datamahasiswa SET infak='" + 0 + "'WHERE nim = '" + txtFieldNim.getText()+"'";
                java.sql.Connection conn =(Connection)dataConnection.configDB();
                PreparedStatement pstm = conn.prepareStatement(infak0);
                pstm.execute();
                
                String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
                java.sql.Connection connect = (Connection)dataConnection.configDB();
                PreparedStatement pstmn = connect.prepareStatement(updateTotal);
                pstmn.execute();
            
                String lns = "Lunas";
                String blm = "Belum Lunas";
                String krdt = "Di Kreditkan";
                String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
                java.sql.Connection cont = (Connection)dataConnection.configDB();
                PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
                pstmm.execute();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }tampilkanData();
    }//GEN-LAST:event_cbInfakActionPerformed

    private void cbBeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBeaActionPerformed
        // TODO add your handling code here:
        try{
            if(cbBea.isSelected()){
                String bea = "UPDATE datamahasiswa SET beasiswa='" + 1500000 + "'WHERE nim = '" + txtFieldNim.getText()+"'";
                java.sql.Connection con =(Connection)dataConnection.configDB();
                PreparedStatement pst = con.prepareStatement(bea);
                pst.execute();
                
                
                String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
                java.sql.Connection connect = (Connection)dataConnection.configDB();
                PreparedStatement pstmn = connect.prepareStatement(updateTotal);
                pstmn.execute();
            
                String lns = "Lunas";
                String blm = "Belum Lunas";
                String krdt = "Di Kreditkan";
                String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
                java.sql.Connection cont = (Connection)dataConnection.configDB();
                PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
                pstmm.execute();
            }else{
                String bea0 = "UPDATE datamahasiswa SET beasiswa='" + 0 + "'WHERE nim = '" + txtFieldNim.getText()+"'";
                java.sql.Connection conn =(Connection)dataConnection.configDB();
                PreparedStatement pstm = conn.prepareStatement(bea0);
                pstm.execute();
                
                String updateTotal = "UPDATE datamahasiswa SET totalpembayaran=((bppsemester+infak)-beasiswa)";
                java.sql.Connection connect = (Connection)dataConnection.configDB();
                PreparedStatement pstmn = connect.prepareStatement(updateTotal);
                pstmn.execute();
            
                String lns = "Lunas";
                String blm = "Belum Lunas";
                String krdt = "Di Kreditkan";
                String updatedBPP = "UPDATE datamahasiswa SET statuspembayaran=(CASE WHEN (totalpembayaran = 0) THEN '" + lns +
                    "' WHEN (totalpembayaran >0) THEN '"+ blm +"'WHEN (totalpembayaran < 0) THEN'"+
                    krdt+"'ELSE(totalpembayaran) END)";
                java.sql.Connection cont = (Connection)dataConnection.configDB();
                PreparedStatement pstmm = cont.prepareStatement(updatedBPP);
                pstmm.execute();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tampilkanData();
    }//GEN-LAST:event_cbBeaActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnCetakDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakDataActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbtubes", "root", "");
            JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\ardie\\OneDrive\\Dokumen\\NetBeansProjects\\TugasBesar\\src\\tugasbesar\\laporanMhs.jrxml");
            String query = "select * from datamahasiswa";
            
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);
            
            jdesign.setQuery(updateQuery);
            
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, con);
            
            
            JasperViewer.viewReport(jprint);
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(TmbMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TmbMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TmbMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }            
            
    }//GEN-LAST:event_btnCetakDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TmbMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TmbMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TmbMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TmbMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TmbMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCetakData;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTmbData;
    private javax.swing.JCheckBox cbBPP;
    private javax.swing.JCheckBox cbBea;
    private javax.swing.JCheckBox cbInfak;
    private javax.swing.JComboBox<String> cmbAngkatan;
    private javax.swing.JComboBox<String> cmbFakultas;
    private javax.swing.JComboBox<String> cmbProdi;
    private javax.swing.JTextField hideBPP;
    private javax.swing.JTextField hideBea;
    private javax.swing.JTextField hideInfak;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup setGender;
    private javax.swing.JRadioButton setLaki;
    private javax.swing.JRadioButton setPerempuan;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtFieldEmail;
    private javax.swing.JTextField txtFieldNama;
    private javax.swing.JTextField txtFieldNim;
    private javax.swing.JTextField txtFieldSemester;
    // End of variables declaration//GEN-END:variables
}
