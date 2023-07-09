/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Services.IManageKhachHangService;
import Services.ManageKhachHangService;
import Uheper.Heper;
import ViewModels.QLKhachHang;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmQLKhachHang extends javax.swing.JFrame {

    private final IManageKhachHangService _imaIManageKhachHangService = new ManageKhachHangService();

    public FrmQLKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
        loadDataToTable();
    }

    private void loadDataToTable() {
        ArrayList<QLKhachHang> ds = _imaIManageKhachHangService.selectAllkh();

        DefaultTableModel dtm = (DefaultTableModel) this.tblNhanvien.getModel();
        dtm.setRowCount(0);
        dtm.setColumnCount(0);
        dtm.addColumn("Id");
        dtm.addColumn("Mã");
        dtm.addColumn("Tên");
        dtm.addColumn("Ngày sinh");
        dtm.addColumn("Sđt");
        dtm.addColumn("Địa chỉ");
        dtm.addColumn("Thành phố");
        dtm.addColumn("Quốc gia");
        dtm.addColumn("Mật khẩu");

        for (QLKhachHang kh : ds) {
            Object[] rowData = {
                kh.getId(),
                kh.getMa(),
                kh.getTen(),
                kh.getNgaySinh(),
                kh.getSdt(),
                kh.getDiaChi(),
                kh.getThanhPho(),
                kh.getQuocGia(),
                kh.getMatKhau()
            };

            dtm.addRow(rowData);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtThanhpho = new javax.swing.JTextField();
        txtQuocgia = new javax.swing.JTextField();
        txtmatkhau = new javax.swing.JPasswordField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanvien = new javax.swing.JTable();
        txtTimkiem = new javax.swing.JTextField();
        btnTìm = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        jLabel2.setText("Mã ");

        jLabel3.setText("Tên");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Sđt");

        jLabel6.setText("Địa chỉ");

        jLabel7.setText("Thành phố");

        jLabel8.setText("Quốc gia");

        jLabel9.setText("Mật khẩu");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblNhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ma", "Tên", "Ngày sinh", "Sđt", "Địa chỉ", "Thành phố", "Quốc gia", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanvien);

        btnTìm.setText("Tìm kiếm");
        btnTìm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTìmActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel10.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(70, 70, 70)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtma)
                                            .addComponent(txtTen)
                                            .addComponent(txtNgaysinh)
                                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtId))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                                .addComponent(btnTìm, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtQuocgia, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                    .addComponent(txtThanhpho, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtdiachi, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtmatkhau))))))
                                .addGap(40, 40, 40))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnSua, btnThem, btnThoat, btnXoa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTìm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtThanhpho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtQuocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addComponent(jLabel6)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThoat)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnSua, btnThem, btnThoat, btnXoa});

        pack();
    }// </editor-fold>//GEN-END:initComponents
private QLKhachHang getForm() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String ma = txtma.getText();
            String ten = txtTen.getText();
            Date ngaySinh = sdf.parse(txtNgaysinh.getText());
            String sdt = txtsdt.getText();
            String diachi = txtdiachi.getText();
            String thanhPho = txtThanhpho.getText();
            String quocGia = txtQuocgia.getText();
            String matKhau = new String(txtmatkhau.getPassword());
            QLKhachHang ql = new QLKhachHang();
            ql.setMa(ma);
            ql.setTen(ten);
            ql.setNgaySinh(ngaySinh);
            ql.setSdt(sdt);
            ql.setDiaChi(diachi);
            ql.setThanhPho(thanhPho);
            ql.setQuocGia(quocGia);
            ql.setMatKhau(matKhau);
            return ql;
        } catch (ParseException ex) {
            ex.printStackTrace();
            Logger.getLogger(FrmQLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private boolean checkTrung(String ma) {
        boolean kq = false;//mặc định kết quả là không trùng
        for (int i = 0; i < tblNhanvien.getRowCount(); i++) {
            if (tblNhanvien.getValueAt(i, 0).toString().equalsIgnoreCase(ma)) {
                kq = true;
            }
        }
        return kq;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //validate 
        if (Heper.checkRong(txtma, "Mã khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtTen, "Tên khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtNgaysinh, "Ngày sinh khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtsdt, "Số đt khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtdiachi, "Địa chỉ khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtThanhpho, "Thành phố không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtQuocgia, "Quốc gia không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtmatkhau, "Mật khẩu không được trống !")) {
            return;
        }
        // check trùng cách 1
        if (checkTrung(txtma.getText())) {
            JOptionPane.showMessageDialog(this, "Mã khách hàng đã có rồi không được trùng");
            return;
        }
        //check ngày 
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(txtNgaysinh.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày nhập vào không đúng định dạng");
            txtNgaysinh.requestFocus();
            return;
        }
        String input = txtsdt.getText();
        String phoneNumberPartten = "^0\\d{9,10}$";
        Pattern pattern = Pattern.compile(phoneNumberPartten);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {

        } else {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ,phải nhập 9-10 số");
            txtsdt.requestFocus();
            return;
        }
        QLKhachHang ql = getForm();
        System.out.println(ql);
        if (_imaIManageKhachHangService.insert(ql) != null) {
            JOptionPane.showMessageDialog(this, " Thêm Thành công");
        } else {
            JOptionPane.showMessageDialog(this, " Thêm Thất bại");
        }
        loadDataToTable();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanvienMouseClicked
        int selectedRow = tblNhanvien.getSelectedRow();
        if (selectedRow == -1) {
            return;
        }
        txtId.setText(tblNhanvien.getValueAt(selectedRow, 0).toString());
        txtma.setText(tblNhanvien.getValueAt(selectedRow, 1).toString());
        txtTen.setText(tblNhanvien.getValueAt(selectedRow, 2).toString());
        txtNgaysinh.setText(tblNhanvien.getValueAt(selectedRow, 3).toString());
        txtsdt.setText(tblNhanvien.getValueAt(selectedRow, 4).toString());
        txtdiachi.setText(tblNhanvien.getValueAt(selectedRow, 5).toString());
        txtThanhpho.setText(tblNhanvien.getValueAt(selectedRow, 6).toString());
        txtQuocgia.setText(tblNhanvien.getValueAt(selectedRow, 7).toString());
        txtmatkhau.setText(tblNhanvien.getValueAt(selectedRow, 8).toString());


    }//GEN-LAST:event_tblNhanvienMouseClicked
    private String getMaFromInput() {
        int selectedRow = tblNhanvien.getSelectedRow();
        String makh = tblNhanvien.getValueAt(selectedRow, 0).toString();
        return makh;
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //validate 
        if (Heper.checkRong(txtma, "Mã khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtTen, "Tên khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtNgaysinh, "Ngày sinh khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtsdt, "Số đt khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtdiachi, "Địa chỉ khách hàng không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtThanhpho, "Thành phố không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtQuocgia, "Quốc gia không được trống !")) {
            return;
        }
        if (Heper.checkRong(txtmatkhau, "Mật khẩu không được trống !")) {
            return;
        }
        // check trùng cách 1
        if (checkTrung(txtma.getText())) {
            JOptionPane.showMessageDialog(this, "Mã khách hàng đã có rồi không được trùng");
            return;
        }
        //check ngày 
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(txtNgaysinh.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày nhập vào không đúng định dạng");
            txtNgaysinh.requestFocus();
            return;
        }
        String input = txtsdt.getText();
        String phoneNumberPartten = "^0\\d{9,10}$";
        Pattern pattern = Pattern.compile(phoneNumberPartten);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {

        } else {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ,phải nhập 9-10 số");
            txtsdt.requestFocus();
            return;
        }


        int selectedRow = tblNhanvien.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng để sửa");
            return;
        }

        QLKhachHang ql = getForm();
        String makh = getMaFromInput();
        ql.setMa(makh);
        System.out.println(ql);
        if (_imaIManageKhachHangService.update(ql) != null) {
            JOptionPane.showMessageDialog(this, " Sửa Thành công");
        } else {
            JOptionPane.showMessageDialog(this, " Sửa Thất bại");
        }
        loadDataToTable();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = tblNhanvien.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng để xóa");
            return;
        }
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (hoi != JOptionPane.YES_OPTION) {
            return;
        }
        QLKhachHang ql = getForm();
        String maCanXoa = getMaFromInput();
        if (_imaIManageKhachHangService.delete(maCanXoa) != null) {
            JOptionPane.showMessageDialog(this, " Xóa Thành công");
        } else {
            JOptionPane.showMessageDialog(this, " Xóa Thất bại");
        }
        loadDataToTable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTìmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTìmActionPerformed
        String maTim = txtTimkiem.getText();
        DefaultTableModel model = (DefaultTableModel) this.tblNhanvien.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Mã");
        model.addColumn("Tên");
        model.addColumn("Ngày sinh");
        model.addColumn("Sđt");
        model.addColumn("Địa chỉ");
        model.addColumn("Thành phố");
        model.addColumn("Quốc gia");
        model.addColumn("Mật khẩu");

        ArrayList<QLKhachHang> qls = _imaIManageKhachHangService.selectById(maTim);
        System.out.println(qls);
        for (QLKhachHang q : qls) {
            model.addRow(new Object[]{q.getMa(),
                q.getTen(), q.getNgaySinh(), q.getSdt(), q.getDiaChi(),
                q.getThanhPho(), q.getQuocGia(), q.getMatKhau()});
        }

    }//GEN-LAST:event_btnTìmActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?");
        if (hoi != JOptionPane.YES_OPTION) {
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtma.setText("");
        txtTen.setText("");
        txtsdt.setText("");
        txtNgaysinh.setText("");
        txtdiachi.setText("");
        txtThanhpho.setText("");
        txtQuocgia.setText("");
        txtQuocgia.setText("");
        txtmatkhau.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(FrmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmQLKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTìm;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhanvien;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtQuocgia;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThanhpho;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtma;
    private javax.swing.JPasswordField txtmatkhau;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables
}
