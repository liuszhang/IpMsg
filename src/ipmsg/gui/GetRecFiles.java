/*
 * GetRecFiles.java
 *
 * Created on 2008年10月28日, 下午5:13
 */

package ipmsg.gui;

import ipmsg.etc.Command;
import ipmsg.etc.FileLinkList;
import ipmsg.etc.FileNode;
import ipmsg.etc.GlobalConstant;
import ipmsg.etc.GlobalVar;
import ipmsg.etc.UtilityGlobal;
import ipmsg.network.UtilityNet;

/**
 *
 * @author  Noeru
 */
public class GetRecFiles extends javax.swing.JFrame 
        implements InterfaceSetVisible_GetRecFiles{

    private FileLinkList flist;
    /** Creates new form GetRecFiles */
    public GetRecFiles(FileLinkList flist) {
        initComponents();
        this.setTitle("收到文件");
        this.flist=flist;
        if(this.flist!=null){
            this.guiFiles.setListData(flist.exportFileList());
            this.jLabel10.setText(this.flist.getIp());
            this.jLabel8.setText(GlobalVar.getUser(
                    this.flist.getIp()).getName());
            this.jLabel12.setText(flist.getFiles().size()+"");
        }else this.dispose();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        guiFiles = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        guiChooseAll = new javax.swing.JCheckBox();
        guiCoverExist = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(509, 369));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "文件列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("宋体", 0, 10))); // NOI18N

        jScrollPane1.setAutoscrolls(true);

        guiFiles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        guiFiles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                guiFilesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(guiFiles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        guiChooseAll.setText("全部接收");

        guiCoverExist.setText("覆盖同名文件");

        jButton1.setText("取消");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("接收");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guiChooseAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiCoverExist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guiChooseAll)
                    .addComponent(guiCoverExist)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "详细信息", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("宋体", 0, 10))); // NOI18N

        jLabel1.setFont(new java.awt.Font("宋体", 1, 12));
        jLabel1.setText("类型：");

        jLabel2.setText(" ");

        jLabel3.setFont(new java.awt.Font("宋体", 1, 12));
        jLabel3.setText("大小：");

        jLabel4.setText(" ");

        jLabel5.setFont(new java.awt.Font("宋体", 1, 12));
        jLabel5.setText("长度：");

        jLabel6.setText(" ");

        jLabel7.setFont(new java.awt.Font("宋体", 1, 12));
        jLabel7.setText("发送者：");

        jLabel8.setText("LanMsg");

        jLabel9.setFont(new java.awt.Font("宋体", 1, 12));
        jLabel9.setText("IP：");

        jLabel10.setText("0.0.0.0");

        jLabel11.setFont(new java.awt.Font("宋体", 1, 12));
        jLabel11.setText("文件数：");

        jLabel12.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.EAST);

        jMenu1.setText("系统");

        jMenuItem3.setText("发送");
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("退出");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("聊天");

        jMenuItem2.setText("和对方聊天");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-434)/2, (screenSize.height-369)/2, 434, 369);
    }// </editor-fold>//GEN-END:initComponents

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
    this.exit();
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
    /*if (!UtilityMsgSendRecv.newWindow(
            (String) this.clientConnect.getInetAddress().getHostAddress()
            , null)) {
        UtilityGui.showNotice(this, "窗口已打开！");
    }*/
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    this.exit();
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    //获取用户选择的文件
    int choice=-1;
    if(this.guiChooseAll.isSelected()){
        choice=this.flist.getFiles().size();
    }
    else if(this.guiFiles.getSelectedValue()!=null){
        choice=UtilityGlobal.atoi(
                ((String) this.guiFiles.getSelectedValue()).trim());
    }else {
        UtilityGui.showNotice(this, "请标记您需要接收的文件!");
        return;
    }
    
    //接收的文件放在哪里。
    String savePath;
    if((savePath=UtilityGui.chooseFile(this, false))==null)return;

    this.setVisible(false);
    new RecvingFile(this.flist,choice,savePath,this,
            this.guiCoverExist.isSelected()).setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

private void guiFilesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_guiFilesValueChanged
// TODO add your handling code here:
    int selectLen=this.guiFiles.getSelectedIndices().length;
    if(selectLen==1){
        FileNode fnode=this.flist.getFiles().get(
                this.guiFiles.getSelectedIndex());
        if(fnode.getFileKind()==GlobalConstant.IPMSG_FILE_DIR)
            this.jLabel2.setText("目录");
        else if(fnode.getFileKind()==GlobalConstant.IPMSG_FILE_REGULAR)
            this.jLabel2.setText("普通文件");
        else this.jLabel2.setText("未知类型");
        
        this.jLabel6.setText(fnode.getFileLen()+" B");
        this.jLabel4.setText(this.getSize(fnode.getFileLen()));
    }
}//GEN-LAST:event_guiFilesValueChanged

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
// TODO add your handling code here:
    this.exit();
}//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox guiChooseAll;
    private javax.swing.JCheckBox guiCoverExist;
    private javax.swing.JList guiFiles;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void exit(){
        Command com=new Command(GlobalConstant.IPMSG_RELEASEFILES);
        com.setIp(this.flist.getIp());
        com.setAdditional(this.flist.getPacketNo()+"");
        UtilityNet.sendUdpPacket(com);
        this.dispose();
    }
    
    private String getSize(long size){
        if(size>>12<=0)return size+" B";
        else if(size>>22<=0) return (size>>10)+" KB";
        else if(size>>32<=0) return (size>>20)+" MB";
        else return (size>>30)+" GB";
    }

    public void enableVisible() {
        this.guiFiles.setListData(flist.exportFileList());
        if(this.guiFiles.getModel().getSize()==0)this.dispose();
        else this.setVisible(true);
    }
}