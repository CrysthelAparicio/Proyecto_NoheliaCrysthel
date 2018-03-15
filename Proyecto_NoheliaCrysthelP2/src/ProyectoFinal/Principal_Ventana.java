package ProyectoFinal;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal_Ventana extends javax.swing.JFrame {

    public Principal_Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Red Elecciones");
        jmi_cerrarSesion.setVisible(false);
        jmi_cerrarSesion.setEnabled(false);

        /*setIconImage(new ImageIcon(getClass().getResource("./imagenes/red.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("./imagenes/fondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_homecomun = new javax.swing.JDialog();
        tab_principal = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tab_principal2 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cb_opcion_correo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        enviar_send = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        tf_asunto_send = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        cb_paramensaje = new javax.swing.JComboBox<>();
        bold = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        editorpane = new javax.swing.JEditorPane();
        boton_italic = new javax.swing.JButton();
        lbl_mail = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        cb_LPubliCandidatos = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        ta_PubliCandidatos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jl_candidatos = new javax.swing.JList<>();
        btn_cargarCandidatos = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_usuariosComunes = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        bt_modificarPerfil = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        lbNombrePerfil = new javax.swing.JLabel();
        lbDireccionPerfil = new javax.swing.JLabel();
        lbApellidoPerfil = new javax.swing.JLabel();
        lbGeneroPerfil = new javax.swing.JLabel();
        lbUsuarioPerfil = new javax.swing.JLabel();
        lbContraPerfil = new javax.swing.JLabel();
        lbFechaPerfil = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lbCorreoPerfil = new javax.swing.JLabel();
        jd_login = new javax.swing.JDialog();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boton_login = new javax.swing.JButton();
        ps_password_login = new javax.swing.JPasswordField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        tf_usuario_login = new javax.swing.JTextField();
        jd_signup = new javax.swing.JDialog();
        rb_m = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        boton_registrarse = new javax.swing.JButton();
        ps_contraseña_signup = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_usuario_signup = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rb_f = new javax.swing.JRadioButton();
        dt_fecha = new com.toedter.calendar.JDateChooser();
        rb_candidato = new javax.swing.JRadioButton();
        rb_comun = new javax.swing.JRadioButton();
        jl_direccion = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        t_direccion = new javax.swing.JTextField();
        jd_modificarPerfil = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        rb_f1 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf_usuario1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        rb_m1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        boton_modificar = new javax.swing.JButton();
        tf_apellido1 = new javax.swing.JTextField();
        dt_fecha1 = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        tf_correo1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        ps_contraseña1 = new javax.swing.JPasswordField();
        jd_homecandidato = new javax.swing.JDialog();
        tab_principal1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        boton_modificarCP = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        lbNombrePerfil1 = new javax.swing.JLabel();
        lbApellidoPerfil1 = new javax.swing.JLabel();
        lbCorreoPerfil1 = new javax.swing.JLabel();
        lbFechaPerfil1 = new javax.swing.JLabel();
        lbGeneroPerfil1 = new javax.swing.JLabel();
        lbUsuarioPerfil1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jd_escoger = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        btn_sucomun = new javax.swing.JButton();
        btn_sucandidato = new javax.swing.JButton();
        bg_tipoUser = new javax.swing.ButtonGroup();
        bg_genero = new javax.swing.ButtonGroup();
        ListaAmigos = new javax.swing.JPopupMenu();
        poAgregar = new javax.swing.JMenuItem();
        porEliminar = new javax.swing.JMenuItem();
        ListaCandidatos = new javax.swing.JPopupMenu();
        poSeguir = new javax.swing.JMenuItem();
        poEliminar = new javax.swing.JMenuItem();
        jd_modifcarCandidato = new javax.swing.JDialog();
        rb_m2 = new javax.swing.JRadioButton();
        jLabel51 = new javax.swing.JLabel();
        tf_nombreCandidato = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        tf_correoCandidato = new javax.swing.JTextField();
        rb_f2 = new javax.swing.JRadioButton();
        ps_contraseñaCandidato = new javax.swing.JPasswordField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        boton_modificar1 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        tf_apellidoCandidato = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        dtFechaCandidato = new com.toedter.calendar.JDateChooser();
        tf_usuarioCandidadto = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        menu_popA = new javax.swing.JPopupMenu();
        jmi_agregar = new javax.swing.JMenuItem();
        menu_popE = new javax.swing.JPopupMenu();
        jmi_eliminar = new javax.swing.JMenuItem();
        menu_popAC = new javax.swing.JPopupMenu();
        jmi_agregarC = new javax.swing.JMenuItem();
        menu_popEC = new javax.swing.JPopupMenu();
        jmi_eliminarC = new javax.swing.JMenuItem();
        jd_mensaje = new javax.swing.JDialog();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        boton_send = new javax.swing.JButton();
        asunto_send = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        editorpane_send = new javax.swing.JEditorPane();
        menu_responder = new javax.swing.JPopupMenu();
        Responder = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jt_abrir = new javax.swing.JMenu();
        jmi_login = new javax.swing.JMenuItem();
        jmi_registrarse = new javax.swing.JMenuItem();
        jmi_cerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        tab_principal.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tab_principal.setToolTipText("");
        tab_principal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tab_principalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        tab_principal.addTab("Actas", jPanel6);

        tab_principal2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tab_principal2.setToolTipText("");
        tab_principal2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tab_principal2StateChanged(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Seleccione");

        cb_opcion_correo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_opcion_correo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inbox", "Enviados" }));
        cb_opcion_correo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_opcion_correoItemStateChanged(evt);
            }
        });
        cb_opcion_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_opcion_correoActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabla1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel36)
                        .addGap(41, 41, 41)
                        .addComponent(cb_opcion_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_opcion_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        tab_principal2.addTab("Correo", jPanel15);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("To:");

        enviar_send.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enviar_send.setText("Enviar");
        enviar_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_sendMouseClicked(evt);
            }
        });
        enviar_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_sendActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Asunto");

        tf_asunto_send.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setText("Mensaje");

        cb_paramensaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bold.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bold.setText("Bold");
        bold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boldMouseClicked(evt);
            }
        });
        bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boldActionPerformed(evt);
            }
        });

        editorpane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(editorpane);

        boton_italic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boton_italic.setText("Italic");
        boton_italic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_italicMouseClicked(evt);
            }
        });

        lbl_mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_mail.setText("@elecciones.com");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setText("Enviar Mensajes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel37)))
                        .addGap(6, 6, 6))
                    .addComponent(jLabel39))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(bold)
                                .addGap(30, 30, 30)
                                .addComponent(boton_italic))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_asunto_send, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(187, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_paramensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_mail)
                        .addGap(136, 136, 136))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enviar_send, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel47)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel47)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_paramensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bold)
                            .addComponent(boton_italic))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(tf_asunto_send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addComponent(jLabel39)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviar_send, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        tab_principal2.addTab("Send Mail", jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_principal2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_principal2)
                .addContainerGap())
        );

        tab_principal.addTab("Buzon", jPanel4);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel48.setText("Publicaciones Candidatos");

        cb_LPubliCandidatos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ta_PubliCandidatos.setColumns(20);
        ta_PubliCandidatos.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ta_PubliCandidatos.setRows(5);
        jScrollPane9.setViewportView(ta_PubliCandidatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel48))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(cb_LPubliCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(cb_LPubliCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_principal.addTab("Publicaciones", jPanel2);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel46.setText("Candidatos Presidenciales");

        jl_candidatos.setModel(new DefaultListModel());
        jl_candidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_candidatosMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jl_candidatos);

        btn_cargarCandidatos.setText("Cargar Candidatos");
        btn_cargarCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cargarCandidatosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(46, 46, 46)
                .addComponent(btn_cargarCandidatos)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cargarCandidatos))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        tab_principal.addTab("Candidatos", jPanel3);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel45.setText("Conoce gente como tu");

        jl_usuariosComunes.setModel(new DefaultListModel());
        jl_usuariosComunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_usuariosComunesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_usuariosComunes);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(266, 266, 266))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        tab_principal.addTab("Usuarios", jPanel7);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Fecha de Nacimento:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Genero:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Usuario:");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel16.setText("Bienvenido(a)!!!!");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Apellido:");

        bt_modificarPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_modificarPerfil.setText("Ir a Modificar");
        bt_modificarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarPerfilMouseClicked(evt);
            }
        });
        bt_modificarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarPerfilActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Direccion:");

        lbNombrePerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNombrePerfil.setText("1");

        lbDireccionPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDireccionPerfil.setText("1");

        lbApellidoPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbApellidoPerfil.setText("1");

        lbGeneroPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbGeneroPerfil.setText("1");

        lbUsuarioPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbUsuarioPerfil.setText("1");

        lbContraPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbFechaPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFechaPerfil.setText("1");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel49.setText("Correo:");

        lbCorreoPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCorreoPerfil.setText("1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDireccionPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNombrePerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbApellidoPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFechaPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbGeneroPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCorreoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbUsuarioPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContraPerfil)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(bt_modificarPerfil)))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombrePerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbApellidoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(lbDireccionPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFechaPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(lbGeneroPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(lbUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCorreoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContraPerfil)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(bt_modificarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        tab_principal.addTab("Perfil", jPanel5);

        javax.swing.GroupLayout jd_homecomunLayout = new javax.swing.GroupLayout(jd_homecomun.getContentPane());
        jd_homecomun.getContentPane().setLayout(jd_homecomunLayout);
        jd_homecomunLayout.setHorizontalGroup(
            jd_homecomunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_homecomunLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tab_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jd_homecomunLayout.setVerticalGroup(
            jd_homecomunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_homecomunLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tab_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setText("USUARIO");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("LOG IN");

        boton_login.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        boton_login.setText("Log in");
        boton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_loginMouseClicked(evt);
            }
        });
        boton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_loginActionPerformed(evt);
            }
        });

        ps_password_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("CONTRASEÑA");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("@elecciones.com");

        tf_usuario_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_loginLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(22, 22, 22)
                        .addComponent(ps_password_login, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_loginLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(31, 31, 31)
                        .addComponent(tf_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addGap(25, 25, 25))
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)))
                .addGap(80, 80, 80)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(ps_password_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(boton_login)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bg_genero.add(rb_m);
        rb_m.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_m.setText("M");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Contraseña");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Usuario");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Genero");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Fecha de Nacimento");

        tf_apellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        boton_registrarse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_registrarse.setText("Registrarse");
        boton_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_registrarseMouseClicked(evt);
            }
        });
        boton_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarseActionPerformed(evt);
            }
        });

        ps_contraseña_signup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Apellido");

        tf_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("@elecciones.com");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel6.setText("Sign Up");

        tf_usuario_signup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        bg_genero.add(rb_f);
        rb_f.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_f.setText("F");

        bg_tipoUser.add(rb_candidato);
        rb_candidato.setText("Candidato");
        rb_candidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_candidatoActionPerformed(evt);
            }
        });

        bg_tipoUser.add(rb_comun);
        rb_comun.setText("Comun");
        rb_comun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_comunMouseClicked(evt);
            }
        });
        rb_comun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_comunActionPerformed(evt);
            }
        });

        jl_direccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_direccion.setText("Direccion");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("Tipo de Usuario");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Correo");

        tf_correo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        t_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_signupLayout = new javax.swing.GroupLayout(jd_signup.getContentPane());
        jd_signup.getContentPane().setLayout(jd_signupLayout);
        jd_signupLayout.setHorizontalGroup(
            jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_signupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_comun)
                    .addComponent(boton_registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(jd_signupLayout.createSequentialGroup()
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_signupLayout.createSequentialGroup()
                        .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_signupLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)))
                            .addGroup(jd_signupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(22, 22, 22)
                        .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_candidato)
                            .addComponent(jLabel6)
                            .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(tf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(dt_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jd_signupLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jl_direccion)
                            .addGroup(jd_signupLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel43))))
                        .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_signupLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(rb_m)
                                .addGap(42, 42, 42)
                                .addComponent(rb_f))
                            .addGroup(jd_signupLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ps_contraseña_signup, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(tf_usuario_signup)
                                    .addComponent(tf_correo))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jd_signupLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(t_direccion)))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_signupLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel44)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );
        jd_signupLayout.setVerticalGroup(
            jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_signupLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(52, 52, 52)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(dt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_m)
                        .addComponent(rb_f)))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_usuario_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(19, 19, 19)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ps_contraseña_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_candidato)
                    .addComponent(rb_comun))
                .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_signupLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jl_direccion))
                    .addGroup(jd_signupLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(t_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(boton_registrarse)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jd_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_signupLayout.createSequentialGroup()
                    .addContainerGap(528, Short.MAX_VALUE)
                    .addComponent(jLabel44)
                    .addGap(101, 101, 101)))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Fecha de Nacimento");

        rb_f1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_f1.setText("F");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Genero");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Usuario");

        tf_usuario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel23.setText("Modificar");

        rb_m1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_m1.setText("M");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("@elecciones.com");

        tf_nombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Apellido");

        boton_modificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_modificar.setText("Modificar");
        boton_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_modificarMouseClicked(evt);
            }
        });
        boton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarActionPerformed(evt);
            }
        });

        tf_apellido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Direccion");

        tf_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setText("Correo");

        tf_correo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setText("Contraseña");

        ps_contraseña1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jd_modificarPerfilLayout = new javax.swing.GroupLayout(jd_modificarPerfil.getContentPane());
        jd_modificarPerfil.getContentPane().setLayout(jd_modificarPerfilLayout);
        jd_modificarPerfilLayout.setHorizontalGroup(
            jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel5)
                                .addComponent(jLabel27)))
                        .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel50)
                                .addComponent(jLabel18))))
                    .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))))
                .addGap(32, 32, 32)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                        .addComponent(tf_correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25))
                    .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(rb_m1)
                        .addGap(50, 50, 50)
                        .addComponent(rb_f1))
                    .addComponent(tf_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarPerfilLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel61)
                .addGap(32, 32, 32)
                .addComponent(ps_contraseña1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jd_modificarPerfilLayout.setVerticalGroup(
            jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(28, 28, 28)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(dt_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(tf_correo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_m1)
                    .addComponent(rb_f1)
                    .addComponent(jLabel21))
                .addGap(39, 39, 39)
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(boton_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_modificarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(ps_contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tab_principal1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tab_principal1.setToolTipText("");
        tab_principal1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tab_principal1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 818, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );

        tab_principal1.addTab("Publicaciones", jPanel10);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setText("Fecha de Nacimento:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setText("Genero:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setText("Nombre:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setText("Usuario:");

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel32.setText("Bienvenido(a)!");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel34.setText("Apellido:");

        boton_modificarCP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_modificarCP.setText("Ir a Modificar");
        boton_modificarCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_modificarCPMouseClicked(evt);
            }
        });
        boton_modificarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarCPActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setText("Correo:");

        lbNombrePerfil1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNombrePerfil1.setText("jLabel48");

        lbApellidoPerfil1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbApellidoPerfil1.setText("jLabel48");

        lbCorreoPerfil1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCorreoPerfil1.setText("jLabel48");

        lbFechaPerfil1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFechaPerfil1.setText("jLabel48");

        lbGeneroPerfil1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbGeneroPerfil1.setText("jLabel48");

        lbUsuarioPerfil1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbUsuarioPerfil1.setText("jLabel48");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel35)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34))
                .addGap(106, 106, 106)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNombrePerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(lbApellidoPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCorreoPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFechaPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbGeneroPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUsuarioPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(158, 324, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(boton_modificarCP)
                        .addGap(41, 41, 41))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(43, 43, 43)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lbNombrePerfil1))
                .addGap(41, 41, 41)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(lbApellidoPerfil1))
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lbCorreoPerfil1))
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lbFechaPerfil1))
                .addGap(42, 42, 42)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lbGeneroPerfil1))
                .addGap(50, 50, 50)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lbUsuarioPerfil1))
                .addGap(128, 128, 128)
                .addComponent(boton_modificarCP, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        tab_principal1.addTab("Perfil", jPanel13);
        tab_principal1.addTab("tab3", jTabbedPane1);

        javax.swing.GroupLayout jd_homecandidatoLayout = new javax.swing.GroupLayout(jd_homecandidato.getContentPane());
        jd_homecandidato.getContentPane().setLayout(jd_homecandidatoLayout);
        jd_homecandidatoLayout.setHorizontalGroup(
            jd_homecandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_homecandidatoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tab_principal1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_homecandidatoLayout.setVerticalGroup(
            jd_homecandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_homecandidatoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tab_principal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Que tipo de usuario desea registrarse?");

        btn_sucomun.setText("Común");
        btn_sucomun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sucomunMouseClicked(evt);
            }
        });

        btn_sucandidato.setText("Candidato");

        javax.swing.GroupLayout jd_escogerLayout = new javax.swing.GroupLayout(jd_escoger.getContentPane());
        jd_escoger.getContentPane().setLayout(jd_escogerLayout);
        jd_escogerLayout.setHorizontalGroup(
            jd_escogerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escogerLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_escogerLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btn_sucomun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btn_sucandidato)
                .addGap(90, 90, 90))
        );
        jd_escogerLayout.setVerticalGroup(
            jd_escogerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_escogerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jd_escogerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sucomun)
                    .addComponent(btn_sucandidato))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        poAgregar.setText("jMenuItem2");
        poAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poAgregarMouseClicked(evt);
            }
        });
        ListaAmigos.add(poAgregar);

        porEliminar.setText("jMenuItem3");
        ListaAmigos.add(porEliminar);

        poSeguir.setText("jMenuItem2");
        ListaCandidatos.add(poSeguir);

        poEliminar.setText("jMenuItem3");
        ListaCandidatos.add(poEliminar);

        bg_genero.add(rb_m2);
        rb_m2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_m2.setText("M");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("@elecciones.com");

        tf_nombreCandidato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("Fecha de Nacimento");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Apellido");

        tf_correoCandidato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_correoCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_correoCandidatoActionPerformed(evt);
            }
        });

        bg_genero.add(rb_f2);
        rb_f2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_f2.setText("F");

        ps_contraseñaCandidato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setText("Correo");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel55.setText("Genero");

        boton_modificar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_modificar1.setText("Modificar");
        boton_modificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_modificar1MouseClicked(evt);
            }
        });
        boton_modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar1ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel56.setText("Nombre");

        tf_apellidoCandidato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel57.setText("Usuario");

        tf_usuarioCandidadto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel59.setText("Modificar Candidato");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setText("Contraseña");

        javax.swing.GroupLayout jd_modifcarCandidatoLayout = new javax.swing.GroupLayout(jd_modifcarCandidato.getContentPane());
        jd_modifcarCandidato.getContentPane().setLayout(jd_modifcarCandidatoLayout);
        jd_modifcarCandidatoLayout.setHorizontalGroup(
            jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel54))
                            .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel56))))
                        .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel60)
                                .addComponent(jLabel55)
                                .addComponent(jLabel57))))
                    .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52)))
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtFechaCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombreCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_apellidoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_usuarioCandidadto, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(ps_contraseñaCandidato))
                            .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                                .addComponent(tf_correoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jLabel51)))
                        .addContainerGap())
                    .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(rb_m2)
                        .addGap(43, 43, 43)
                        .addComponent(rb_f2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modifcarCandidatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modifcarCandidatoLayout.createSequentialGroup()
                        .addComponent(boton_modificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modifcarCandidatoLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(100, 100, 100))))
        );
        jd_modifcarCandidatoLayout.setVerticalGroup(
            jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modifcarCandidatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addGap(46, 46, 46)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(tf_nombreCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_apellidoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(46, 46, 46)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(dtFechaCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(tf_correoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(30, 30, 30)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(rb_m2)
                    .addComponent(rb_f2))
                .addGap(41, 41, 41)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(tf_usuarioCandidadto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jd_modifcarCandidatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(ps_contraseñaCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(boton_modificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        menu_popA.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                menu_popAPropertyChange(evt);
            }
        });

        jmi_agregar.setText("Agregar");
        jmi_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_agregarMouseClicked(evt);
            }
        });
        jmi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarActionPerformed(evt);
            }
        });
        menu_popA.add(jmi_agregar);

        jmi_eliminar.setText("Eliminar");
        jmi_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_eliminarMouseClicked(evt);
            }
        });
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        menu_popE.add(jmi_eliminar);

        jmi_agregarC.setText("Seguir");
        jmi_agregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarCActionPerformed(evt);
            }
        });
        menu_popAC.add(jmi_agregarC);

        jmi_eliminarC.setText("Dejar de Seguir");
        jmi_eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarCActionPerformed(evt);
            }
        });
        menu_popEC.add(jmi_eliminarC);

        jLabel66.setText("Mensaje");

        jLabel67.setText("Asunto");

        boton_send.setText("Enviar");
        boton_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_sendMouseClicked(evt);
            }
        });

        jScrollPane8.setViewportView(editorpane_send);

        javax.swing.GroupLayout jd_mensajeLayout = new javax.swing.GroupLayout(jd_mensaje.getContentPane());
        jd_mensaje.getContentPane().setLayout(jd_mensajeLayout);
        jd_mensajeLayout.setHorizontalGroup(
            jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mensajeLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67))
                .addGap(26, 26, 26)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(asunto_send))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_mensajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jd_mensajeLayout.setVerticalGroup(
            jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_mensajeLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(asunto_send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jd_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        Responder.setText("Responder Mensajes");
        Responder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResponderActionPerformed(evt);
            }
        });
        menu_responder.add(Responder);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jt_abrir.setText("Abrir");
        jt_abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_abrirMouseClicked(evt);
            }
        });
        jt_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_abrirActionPerformed(evt);
            }
        });

        jmi_login.setText("Login");
        jmi_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loginActionPerformed(evt);
            }
        });
        jt_abrir.add(jmi_login);

        jmi_registrarse.setText("SignUp");
        jmi_registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_registrarseMouseClicked(evt);
            }
        });
        jmi_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_registrarseActionPerformed(evt);
            }
        });
        jt_abrir.add(jmi_registrarse);

        jmi_cerrarSesion.setText("Cerrar Sesión");
        jmi_cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmi_cerrarSesionMouseClicked(evt);
            }
        });
        jmi_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cerrarSesionActionPerformed(evt);
            }
        });
        jt_abrir.add(jmi_cerrarSesion);

        jMenuBar1.add(jt_abrir);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_principalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tab_principalStateChanged
        if (tab_principal.getSelectedIndex() == 4) {

            try {
                DefaultListModel modelo = (DefaultListModel) jl_usuariosComunes.getModel();
                modelo.clear();
                for (int i = 0; i < lista.getTamanio(); i++) {
                    if (lista.getValor(i) instanceof UsuarioComun) {
                        if (lista.getValor(i).equals(usuario_loggeado)) {

                        } else {
                            modelo.addElement(lista.getValor(i));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_tab_principalStateChanged

    private void boton_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarseMouseClicked
        // sign up
        try {
            nombre = tf_nombre.getText();
            apellido = tf_apellido.getText();
            fecha = dt_fecha.getDate();

            //Date fecha = df.parse(dt_fecha.getDateFormatString());
            //System.out.println(fecha.getYear());
            if (rb_m.isSelected()) {
                sexo = "Masculino";
            }
            if (rb_f.isSelected()) {
                sexo = "Femenino";
            }
            usuario = tf_usuario_signup.getText();
            password = ps_contraseña_signup.getText();
            direccion = t_direccion.getText();
            correo = tf_correo.getText();

            if (rb_candidato.isSelected()) {
                UsuarioCandidato uca = new UsuarioCandidato(nombre, apellido, fecha, sexo, usuario, password, correo);
                lista.agregarAlFinal(uca);
            }
            if (rb_comun.isSelected()) {
                UsuarioComun uc = new UsuarioComun(direccion, nombre, apellido, fecha, sexo, usuario, password, correo);
                lista.agregarAlFinal(uc);
            }

            // usuarios.add(new Usuario(nombre, apellido, fecha, sexo, usuario, password));

            /*au = new adminUsuario("./usuario.cbm");
            au.CargarArchivo();
            au.setUsuario(us);
            au.EscribirArchivo();
            //para que no me suscriba los usuarios
            Guardar(usuarios);*/
            JOptionPane.showMessageDialog(this, "Se registró exitosamente");

            tf_nombre.setText("");
            tf_apellido.setText("");
            rb_m.setSelected(true);
            rb_f.setSelected(false);
            tf_usuario_signup.setText("");
            dt_fecha.setDate(new Date());
            ps_contraseña_signup.setText("");
            rb_candidato.setSelected(true);
            rb_comun.setSelected(false);
            tf_correo.setText("");
            t_direccion.setText("");
            this.jd_signup.setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_boton_registrarseMouseClicked

    private void boton_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_boton_registrarseActionPerformed

    private void boton_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_modificarMouseClicked
        // TODO add your handling code here:
        try {
            direccion = tf_direccion.getText();
            nombre = tf_nombre1.getText();
            apellido = tf_apellido1.getText();
            fecha = dt_fecha1.getDate();
            correo = tf_correo1.getText();
            if (rb_m1.isSelected()) {
                sexo = "Masculino";
            }
            if (rb_f1.isSelected()) {
                sexo = "Femenino";
            }
            usuario = tf_usuario1.getText();
            password = ps_contraseña1.getText();

            usuario_loggeado.setDireccion(direccion);
            usuario_loggeado.setNombre(nombre);
            usuario_loggeado.setApelido(apellido);
            usuario_loggeado.setFecha_nacimiento(fecha);
            usuario_loggeado.setCorreo(correo);
            usuario_loggeado.setSexo(sexo);
            usuario_loggeado.setUsuario(usuario);
            usuario_loggeado.setContraseña(password);

            int u = lista.getPosicion(usuario_loggeado);
            lista.editarPorPosicion(u, usuario_loggeado);

            lista.listar();

            //  F A L T A
            tf_direccion.setText("");
            tf_nombre1.setText("");
            tf_apellido1.setText("");
            dt_fecha1.setDate(new Date());
            rb_m1.setSelected(true);
            rb_f1.setSelected(false);
            tf_correo1.setText("");
            tf_usuario1.setText("");
            ps_contraseña1.setText("");

            JOptionPane.showMessageDialog(this, "Modificacion Exitosa");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un Error");
        }
    }//GEN-LAST:event_boton_modificarMouseClicked

    private void boton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_modificarActionPerformed

    private void cb_opcion_correoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_opcion_correoItemStateChanged

        try {
            if (evt.getStateChange() == 1) {
                System.out.println("hola");
                if (cb_opcion_correo.getSelectedItem().toString().equals("Inbox")) {
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("Receptor");
                    modelo.addColumn("Emisor");
                    modelo.addColumn("Asunto");
                    modelo.addColumn("Fecha");
                    for (int i = 0; i < usuario_loggeado.getRecibidos().getTamanio(); i++) {
                        Mensaje m = (Mensaje) usuario_loggeado.getRecibidos().getValor(i);
                        Object[] newrow = {
                            m.getReceptor(), m.getEmisor(), m.getAsunto(), m.getFecha()

                        };
                        modelo.addRow(newrow);

                    }
                    tabla1.setModel(modelo);

                } else if (cb_opcion_correo.getSelectedItem().toString().equals("Enviados")) {
                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("Receptor");
                    modelo.addColumn("Emisor");
                    modelo.addColumn("Asunto");
                    modelo.addColumn("Fecha");
                    for (int i = 0; i < usuario_loggeado.getEnviados().getTamanio(); i++) {
                        Mensaje m = (Mensaje) usuario_loggeado.getEnviados().getValor(i);
                        Object[] newrow = {
                            m.getReceptor(), m.getEmisor(), m.getAsunto(), m.getFecha()
                        };
                        modelo.addRow(newrow);
                    }
                    tabla1.setModel(modelo);
                }
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_cb_opcion_correoItemStateChanged

    private void tabla1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseReleased

        if (cb_opcion_correo.getSelectedItem().toString().equals("Inbox")) {
            tabla1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        JTable source = (JTable) e.getSource();
                        int row = source.rowAtPoint(e.getPoint());
                        int column = source.columnAtPoint(e.getPoint());

                        if (!source.isRowSelected(row)) {
                            source.changeSelection(row, column, false, false);
                        }

                        menu_responder.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
            });
        }
    }//GEN-LAST:event_tabla1MouseReleased

    private void enviar_sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_sendMouseClicked

        try {
            String asunto = tf_asunto_send.getText();
            String descripcion = editorpane.getText();
            Date fecha = new Date();
            UsuarioComun receptor = (UsuarioComun) cb_paramensaje.getSelectedItem();
            mensajeC = new Mensaje(usuario_loggeado, receptor, asunto, descripcion, fecha);
            receptor.getRecibidos().agregarAlFinal(mensajeC);
            usuario_loggeado.getEnviados().agregarAlFinal(mensajeC);

            JOptionPane.showMessageDialog(this, "Mando el correo exitosamente");
            tf_asunto_send.setText("");
            editorpane.setText("");
            cb_paramensaje.setSelectedIndex(0);
            usuario_loggeado.getEnviados().listar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_enviar_sendMouseClicked

    private void enviar_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviar_sendActionPerformed

    private void boldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boldMouseClicked
        String texto = editorpane.getSelectedText();
        Font f = editorpane.getFont();
        Font new_fuente = new Font(f.getFontName(), Font.BOLD, f.getSize());
        editorpane.setFont(new_fuente);
    }//GEN-LAST:event_boldMouseClicked

    private void boldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldActionPerformed
        // TODO add your handling code here:

        //tp_mensaje_send.insertComponent(bold);
    }//GEN-LAST:event_boldActionPerformed

    private void boton_italicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_italicMouseClicked

        String texto = editorpane.getSelectedText();
        Font f = editorpane.getFont();
        Font new_fuente = new Font(f.getFontName(), Font.ITALIC, f.getSize());
        editorpane.setFont(new_fuente);
    }//GEN-LAST:event_boton_italicMouseClicked

    private void tab_principal2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tab_principal2StateChanged
         DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_paramensaje.getModel();
        if (tab_principal2.getSelectedIndex() == 1) {
            try {
                modelo.removeAllElements();
                for (int i = 0; i < usuario_loggeado.getListaAmigos().getTamanio(); i++) {
                    modelo.addElement(usuario_loggeado.getListaAmigos().getValor(i));
                }
                cb_paramensaje.setModel(modelo);
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_tab_principal2StateChanged

    private void boton_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_loginMouseClicked

        try {
            for (int i = 0; i < lista.getTamanio(); i++) {
                if (lista.getValor(i) instanceof UsuarioCandidato) {
                    if (this.tf_usuario_login.getText().equals(((UsuarioCandidato) lista.getValor(i)).getUsuario()) && this.ps_password_login.getText().equals(((UsuarioCandidato) lista.getValor(i)).getContraseña())) {
                        JOptionPane.showMessageDialog(this, "Bienvenido usuario:  \n" + tf_usuario_login.getText()
                                + "\n Bienvenido(a) al Home Menu :)");

                        usuario_loggeadoC = (UsuarioCandidato) lista.getValor(i);
                        this.jd_login.setEnabled(false);
                        this.jd_login.setVisible(false);
                        this.jd_homecandidato.setModal(true);
                        this.jd_homecandidato.pack();
                        this.jd_homecandidato.setLocationRelativeTo(this);
                        this.jd_homecandidato.setVisible(true);
                        this.jd_homecandidato.setEnabled(true);
                        //this.menu_logout.setEnabled(true);

                        tf_usuario_login.setText("");
                        ps_password_login.setText("");

                        System.out.println(usuario_loggeadoC.getNombre());
                        nombre = ((UsuarioCandidato) lista.getValor(i)).getNombre();
                        apellido = ((UsuarioCandidato) lista.getValor(i)).getApelido();
                        fecha = ((UsuarioCandidato) lista.getValor(i)).getFecha_nacimiento();
                        sexo = ((UsuarioCandidato) lista.getValor(i)).getSexo();
                        usuario = ((UsuarioCandidato) lista.getValor(i)).getUsuario();
                        correo = ((UsuarioCandidato) lista.getValor(i)).getCorreo();
                        break;
                    }

                } else if (lista.getValor(i) instanceof UsuarioComun) {
                    if (this.tf_usuario_login.getText().equals(((UsuarioComun) lista.getValor(i)).getUsuario()) && this.ps_password_login.getText().equals(((UsuarioComun) lista.getValor(i)).getContraseña())) {
                        JOptionPane.showMessageDialog(this, "Bienvenido usuario:  \n" + tf_usuario_login.getText()
                                + "\n Bienvenido(a) al Home Menu :)");
                        usuario_loggeado = (UsuarioComun) lista.getValor(i);
                        this.jd_login.setEnabled(false);
                        this.jd_login.setVisible(false);
                        this.jd_homecomun.setModal(true);
                        this.jd_homecomun.pack();
                        this.jd_homecomun.setLocationRelativeTo(this);
                        this.jd_homecomun.setVisible(true);
                        this.jd_homecandidato.setEnabled(true);
                        //this.menu_logout.setEnabled(true);

                        tf_usuario_login.setText("");
                        ps_password_login.setText("");
                        nombre = ((UsuarioComun) lista.getValor(i)).getNombre();
                        usuario_loggeado = (UsuarioComun) lista.getValor(i);
                        apellido = ((UsuarioComun) lista.getValor(i)).getApelido();
                        direccion = ((UsuarioComun) lista.getValor(i)).getDireccion();
                        fecha = ((UsuarioComun) lista.getValor(i)).getFecha_nacimiento();
                        sexo = ((UsuarioComun) lista.getValor(i)).getSexo();
                        usuario = ((UsuarioComun) lista.getValor(i)).getUsuario();
                        correo = ((UsuarioComun) lista.getValor(i)).getCorreo();
                        break;
                    }
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(Principal_Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_boton_loginMouseClicked

    private void boton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_loginActionPerformed
        // TODO add your handling code here:
        try {
            this.lbNombrePerfil.setText(nombre);
            this.lbApellidoPerfil.setText(apellido);
            this.lbFechaPerfil.setText(fecha.toString());
            this.lbDireccionPerfil.setText(direccion);
            this.lbGeneroPerfil.setText(sexo);
            this.lbUsuarioPerfil.setText(usuario);
            this.lbCorreoPerfil.setText(correo);
            this.jmi_cerrarSesion.setVisible(true);
            this.jmi_cerrarSesion.setEnabled(true);
            jmi_login.setVisible(false);
            jmi_registrarse.setVisible(false);
                    
            //////////////////////////////////////////
            //Candidato
            this.lbNombrePerfil1.setText(nombre);
            this.lbApellidoPerfil1.setText(apellido);
            this.lbFechaPerfil1.setText(fecha.toString());
            this.lbGeneroPerfil1.setText(sexo);
            this.lbUsuarioPerfil1.setText(usuario);
            this.lbCorreoPerfil1.setText(correo);
            
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_boton_loginActionPerformed

    private void tab_principal1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tab_principal1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_principal1StateChanged

    private void boton_modificarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarCPActionPerformed
        // TODO add your handling code here:
        this.jd_modifcarCandidato.setModal(true);
        this.jd_modifcarCandidato.pack();
        this.jd_modifcarCandidato.setLocationRelativeTo(this);
        this.jd_modifcarCandidato.setVisible(true);

    }//GEN-LAST:event_boton_modificarCPActionPerformed

    private void boton_modificarCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_modificarCPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_modificarCPMouseClicked

    private void jmi_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loginActionPerformed
        this.jd_login.setModal(true);
        this.jd_login.pack();
        this.jd_login.setLocationRelativeTo(this);
        this.jd_login.setVisible(true);
    }//GEN-LAST:event_jmi_loginActionPerformed

    private void jmi_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_registrarseActionPerformed
        // TODO add your handling code here:
        this.jd_signup.setModal(true);
        this.jd_signup.pack();
        this.jd_signup.setLocationRelativeTo(this);
        this.jd_signup.setVisible(true);
        rb_candidato.setSelected(true);

    }//GEN-LAST:event_jmi_registrarseActionPerformed

    private void jmi_registrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_registrarseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_registrarseMouseClicked

    private void btn_sucomunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sucomunMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_sucomunMouseClicked

    private void rb_candidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_candidatoActionPerformed
        // TODO add your handling code here:
        this.jl_direccion.setVisible(false);
        this.t_direccion.setVisible(false);
    }//GEN-LAST:event_rb_candidatoActionPerformed

    private void rb_comunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_comunMouseClicked
        // TODO add your handling code here:
        this.jl_direccion.setVisible(true);
        this.t_direccion.setVisible(true);
    }//GEN-LAST:event_rb_comunMouseClicked

    private void boton_modificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_modificar1MouseClicked
        // TODO add your handling code here:
        try {
            nombre = tf_nombreCandidato.getText();
            apellido = tf_apellidoCandidato.getText();
            fecha = dtFechaCandidato.getDate();
            correo = tf_correoCandidato.getText();
            if (rb_m2.isSelected()) {
                sexo = "Masculino";
            }
            if (rb_f2.isSelected()) {
                sexo = "Femenino";
            }
            usuario = tf_usuarioCandidadto.getText();
            password = ps_contraseñaCandidato.getText();

            usuario_loggeadoC.setNombre(nombre);
            usuario_loggeadoC.setApelido(apellido);
            usuario_loggeadoC.setFecha_nacimiento(fecha);
            usuario_loggeadoC.setCorreo(correo);
            usuario_loggeadoC.setSexo(sexo);
            usuario_loggeadoC.setUsuario(usuario);
            usuario_loggeadoC.setContraseña(password);

            int u = lista.getPosicion(usuario_loggeadoC);
            lista.editarPorPosicion(u, usuario_loggeadoC);

            lista.listar();

            //  F A L T A
            tf_nombreCandidato.setText("");
            tf_apellidoCandidato.setText("");
            dtFechaCandidato.setDate(new Date());
            rb_m2.setSelected(true);
            rb_f2.setSelected(false);
            tf_correoCandidato.setText("");
            tf_usuarioCandidadto.setText("");
            ps_contraseñaCandidato.setText("");

            JOptionPane.showMessageDialog(this, "Modificacion Exitosa");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrio un Error");
        }
    }//GEN-LAST:event_boton_modificar1MouseClicked

    private void boton_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar1ActionPerformed
        // TODO add your handling code here:
        this.jd_modificarPerfil.setModal(true);
        this.jd_modificarPerfil.pack();
        this.jd_modificarPerfil.setLocationRelativeTo(this);
        this.jd_modificarPerfil.setVisible(true);
    }//GEN-LAST:event_boton_modificar1ActionPerformed

    private void rb_comunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_comunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_comunActionPerformed

    private void bt_modificarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarPerfilActionPerformed
        // TODO add your handling code here:
        this.jd_modificarPerfil.setModal(true);
        this.jd_modificarPerfil.pack();
        this.jd_modificarPerfil.setLocationRelativeTo(this);
        this.jd_modificarPerfil.setVisible(true);
    }//GEN-LAST:event_bt_modificarPerfilActionPerformed

    private void bt_modificarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_modificarPerfilMouseClicked

    private void tf_correoCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_correoCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_correoCandidatoActionPerformed
    private void cb_opcion_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_opcion_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_opcion_correoActionPerformed

    private void jt_abrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_abrirMouseClicked


    }//GEN-LAST:event_jt_abrirMouseClicked

    private void jt_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_abrirActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jt_abrirActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmi_cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_cerrarSesionMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jmi_cerrarSesionMouseClicked

    private void jmi_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarSesionActionPerformed
        // TODO add your handling code here:
        usuario_loggeado = null;
        usuario_loggeadoC = null;
        JOptionPane.showMessageDialog(this, "Usted ha cerrado Sesion, bai");
        jd_login.setEnabled(true);
        jd_signup.setEnabled(true);
        jmi_cerrarSesion.setVisible(false);
    }//GEN-LAST:event_jmi_cerrarSesionActionPerformed

    private void poAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poAgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_poAgregarMouseClicked

    private void jl_usuariosComunesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_usuariosComunesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row = jl_usuariosComunes.getSelectedIndex();
            if (row >= 0) {
                DefaultListModel modelo = (DefaultListModel) jl_usuariosComunes.getModel();
                Usuario u = (Usuario) modelo.getElementAt(jl_usuariosComunes.getSelectedIndex());
                usuario_seleccionado = (UsuarioComun) u;
                if (usuario_loggeado.getListaAmigos().buscar(u)) {
                    menu_popE.show(evt.getComponent(), evt.getX(), evt.getY());
                } else {
                    menu_popA.show(evt.getComponent(), evt.getX(), evt.getY());
                }

            }
        }
    }//GEN-LAST:event_jl_usuariosComunesMouseClicked

    private void menu_popAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_menu_popAPropertyChange

    }//GEN-LAST:event_menu_popAPropertyChange

    private void jmi_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_agregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_agregarMouseClicked

    private void jmi_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmi_eliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_eliminarMouseClicked

    private void jmi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarActionPerformed
        // TODO add your handling code here:

        usuario_loggeado.agregarAmigo(usuario_seleccionado);

        usuario_loggeado.getListaAmigos().listar();
    }//GEN-LAST:event_jmi_agregarActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:
        usuario_loggeado.eliminarAmigo(usuario_seleccionado);
        usuario_loggeado.getListaAmigos().listar();
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void btn_cargarCandidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cargarCandidatosMouseClicked
        // TODO add your handling code here:
        try {

            DefaultListModel modelo = (DefaultListModel) jl_candidatos.getModel();
            for (int i = 0; i < lista.getTamanio(); i++) {
                if (lista.getValor(i) instanceof UsuarioCandidato) {
                    modelo.addElement(lista.getValor(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_cargarCandidatosMouseClicked

    private void jmi_agregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarCActionPerformed
        // TODO add your handling code here:
        usuario_loggeado.agregarCandidato(candidato_seleccionado);
        usuario_loggeado.getListaCandidatos().listar();
    }//GEN-LAST:event_jmi_agregarCActionPerformed

    private void jl_candidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_candidatosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row = jl_candidatos.getSelectedIndex();
            if (row >= 0) {
                DefaultListModel modelo = (DefaultListModel) jl_candidatos.getModel();
                Usuario u = (Usuario) modelo.getElementAt(jl_candidatos.getSelectedIndex());
                candidato_seleccionado = (UsuarioCandidato) u;
                if (usuario_loggeado.getListaCandidatos().buscar(u)) {
                    menu_popEC.show(evt.getComponent(), evt.getX(), evt.getY());
                } else {
                    menu_popAC.show(evt.getComponent(), evt.getX(), evt.getY());
                }

            }
        }
    }//GEN-LAST:event_jl_candidatosMouseClicked

    private void jmi_eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarCActionPerformed
        // TODO add your handling code here:
        usuario_loggeado.eliminarCandidato(candidato_seleccionado);
        usuario_loggeado.getListaCandidatos().listar();
    }//GEN-LAST:event_jmi_eliminarCActionPerformed

    private void boton_sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_sendMouseClicked
        try {
            int row = tabla1.getSelectedRow();
            String asunto = asunto_send.getText();
            String descripcion = editorpane_send.getText();
            Date fecha = new Date();
            usuario_receptor =(UsuarioComun)((Mensaje) usuario_loggeado.getRecibidos().getValor(row)).getEmisor();
            Mensaje m = new Mensaje(usuario_loggeado,usuario_receptor,asunto,descripcion,fecha);
            usuario_loggeado.getEnviados().agregarAlFinal(m);
            usuario_receptor.getRecibidos().agregarAlFinal(m);
            
            JOptionPane.showMessageDialog(this, "respondio el correo exitosamente");
            jd_mensaje.setVisible(false);
            asunto_send.setText("");
            editorpane_send.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_boton_sendMouseClicked

    private void ResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResponderActionPerformed
        // TODO add your handling code here:
        this.jd_mensaje.setModal(true);
        this.jd_mensaje.pack();
        this.jd_mensaje.setLocationRelativeTo(this);
        this.jd_mensaje.setVisible(true);
    }//GEN-LAST:event_ResponderActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        // TODO add your handling code here:
        if(evt.isMetaDown()){
            if (cb_paramensaje.getSelectedItem().toString().equals("Inbox")) {
                menu_responder.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tabla1MouseClicked

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
            java.util.logging.Logger.getLogger(Principal_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Ventana().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu ListaAmigos;
    private javax.swing.JPopupMenu ListaCandidatos;
    private javax.swing.JMenuItem Responder;
    private javax.swing.JTextField asunto_send;
    private javax.swing.ButtonGroup bg_genero;
    private javax.swing.ButtonGroup bg_tipoUser;
    private javax.swing.JButton bold;
    private javax.swing.JButton boton_italic;
    private javax.swing.JButton boton_login;
    private javax.swing.JButton boton_modificar;
    private javax.swing.JButton boton_modificar1;
    private javax.swing.JButton boton_modificarCP;
    private javax.swing.JButton boton_registrarse;
    private javax.swing.JButton boton_send;
    private javax.swing.JButton bt_modificarPerfil;
    private javax.swing.JButton btn_cargarCandidatos;
    private javax.swing.JButton btn_sucandidato;
    private javax.swing.JButton btn_sucomun;
    private javax.swing.JComboBox<String> cb_LPubliCandidatos;
    private javax.swing.JComboBox<String> cb_opcion_correo;
    private javax.swing.JComboBox<String> cb_paramensaje;
    private com.toedter.calendar.JDateChooser dtFechaCandidato;
    private com.toedter.calendar.JDateChooser dt_fecha;
    private com.toedter.calendar.JDateChooser dt_fecha1;
    private javax.swing.JEditorPane editorpane;
    private javax.swing.JEditorPane editorpane_send;
    private javax.swing.JButton enviar_send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_escoger;
    private javax.swing.JDialog jd_homecandidato;
    private javax.swing.JDialog jd_homecomun;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_mensaje;
    private javax.swing.JDialog jd_modifcarCandidato;
    private javax.swing.JDialog jd_modificarPerfil;
    private javax.swing.JDialog jd_signup;
    private javax.swing.JList<String> jl_candidatos;
    private javax.swing.JLabel jl_direccion;
    private javax.swing.JList<String> jl_usuariosComunes;
    private javax.swing.JMenuItem jmi_agregar;
    private javax.swing.JMenuItem jmi_agregarC;
    private javax.swing.JMenuItem jmi_cerrarSesion;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_eliminarC;
    private javax.swing.JMenuItem jmi_login;
    private javax.swing.JMenuItem jmi_registrarse;
    private javax.swing.JMenu jt_abrir;
    private javax.swing.JLabel lbApellidoPerfil;
    private javax.swing.JLabel lbApellidoPerfil1;
    private javax.swing.JLabel lbContraPerfil;
    private javax.swing.JLabel lbCorreoPerfil;
    private javax.swing.JLabel lbCorreoPerfil1;
    private javax.swing.JLabel lbDireccionPerfil;
    private javax.swing.JLabel lbFechaPerfil;
    private javax.swing.JLabel lbFechaPerfil1;
    private javax.swing.JLabel lbGeneroPerfil;
    private javax.swing.JLabel lbGeneroPerfil1;
    private javax.swing.JLabel lbNombrePerfil;
    private javax.swing.JLabel lbNombrePerfil1;
    private javax.swing.JLabel lbUsuarioPerfil;
    private javax.swing.JLabel lbUsuarioPerfil1;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JPopupMenu menu_popA;
    private javax.swing.JPopupMenu menu_popAC;
    private javax.swing.JPopupMenu menu_popE;
    private javax.swing.JPopupMenu menu_popEC;
    private javax.swing.JPopupMenu menu_responder;
    private javax.swing.JMenuItem poAgregar;
    private javax.swing.JMenuItem poEliminar;
    private javax.swing.JMenuItem poSeguir;
    private javax.swing.JMenuItem porEliminar;
    private javax.swing.JPasswordField ps_contraseña1;
    private javax.swing.JPasswordField ps_contraseñaCandidato;
    private javax.swing.JPasswordField ps_contraseña_signup;
    private javax.swing.JPasswordField ps_password_login;
    private javax.swing.JRadioButton rb_candidato;
    private javax.swing.JRadioButton rb_comun;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_f1;
    private javax.swing.JRadioButton rb_f2;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JRadioButton rb_m1;
    private javax.swing.JRadioButton rb_m2;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextArea ta_PubliCandidatos;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTabbedPane tab_principal1;
    private javax.swing.JTabbedPane tab_principal2;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_apellido1;
    private javax.swing.JTextField tf_apellidoCandidato;
    private javax.swing.JTextField tf_asunto_send;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_correo1;
    private javax.swing.JTextField tf_correoCandidato;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_nombreCandidato;
    private javax.swing.JTextField tf_usuario1;
    private javax.swing.JTextField tf_usuarioCandidadto;
    private javax.swing.JTextField tf_usuario_login;
    private javax.swing.JTextField tf_usuario_signup;
    // End of variables declaration//GEN-END:variables
    Lista lista = new Lista();
    String nombre;
    String apellido;
    Date fecha;
    String sexo;
    String usuario;
    String password, direccion, correo;
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

    UsuarioComun usuario_loggeado = null, usuario_receptor=null;
    UsuarioCandidato usuario_loggeadoC = null;
    UsuarioComun usuario_seleccionado = null;
    UsuarioCandidato candidato_seleccionado = null;
    
    //adminUsuario au;
    Mensaje mensajeC = new Mensaje();
}
