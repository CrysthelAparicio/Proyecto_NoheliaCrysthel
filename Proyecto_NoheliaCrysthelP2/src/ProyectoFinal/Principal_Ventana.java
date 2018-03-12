package ProyectoFinal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal_Ventana extends javax.swing.JFrame {

    public Principal_Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Red Elecciones");

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
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_modificar_correo = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cb_opcion_correo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_tarea = new javax.swing.JTable();
        calendar = new com.toedter.calendar.JCalendar();
        tareas_dia = new javax.swing.JToggleButton();
        boton_guardar_tarea = new javax.swing.JToggleButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_admin = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_cuentas = new javax.swing.JTable();
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
        jScrollPane8 = new javax.swing.JScrollPane();
        ta_ListaCandidatos = new javax.swing.JTextArea();
        cb_ListaCandidatos = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        cb_listaAmigos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_ListaAmigos = new javax.swing.JTextArea();
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
        tf_usuario_signup1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        rb_m1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        boton_modificar = new javax.swing.JButton();
        tf_apellido1 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
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
        boton_registrarse3 = new javax.swing.JButton();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_signup = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmi_registrarse = new javax.swing.JMenuItem();
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
            .addGap(0, 905, Short.MAX_VALUE)
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

        tabla_modificar_correo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_modificar_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabla_modificar_correoMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_modificar_correo);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        tab_principal2.addTab("Modificar Correo", jPanel14);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Seleccione");

        cb_opcion_correo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_opcion_correo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inbox", "Correos Enviados", "Correos Leidos", "Correos no Leidos", "Correos Eliminados", "Spam" }));
        cb_opcion_correo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_opcion_correoItemStateChanged(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
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
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel36)
                        .addGap(41, 41, 41)
                        .addComponent(cb_opcion_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_opcion_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        tab_principal2.addTab("Correo", jPanel15);

        tabla_tarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7:00 AM", null, null},
                {"8:00 AM", null, null},
                {"9:00 AM", null, null},
                {"10:00 AM", null, null},
                {"11:00 AM", null, null},
                {"12:00 PM", null, null},
                {"1:00 PM", null, null},
                {"2:00 PM", null, null},
                {"3:00 PM", null, null},
                {"4:00 PM", null, null},
                {"5:00 PM", null, null},
                {"6:00 PM", null, null},
                {"7:00 PM", null, null},
                {"8:00 PM", null, null},
                {"9:00 PM", null, null},
                {"10:00 PM", null, null},
                {"11:00 PM", null, null},
                {"12:00 AM", null, null}
            },
            new String [] {
                "Hora", "Tarea", "Remind Me"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_tarea.setRowHeight(25);
        tabla_tarea.setRowMargin(2);
        tabla_tarea.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tabla_tareaComponentRemoved(evt);
            }
        });
        jScrollPane5.setViewportView(tabla_tarea);

        tareas_dia.setText("Ver Tareas de tal Dia");
        tareas_dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tareas_diaMouseClicked(evt);
            }
        });
        tareas_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tareas_diaActionPerformed(evt);
            }
        });

        boton_guardar_tarea.setText("Guardar");
        boton_guardar_tarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_guardar_tareaMouseClicked(evt);
            }
        });
        boton_guardar_tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardar_tareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tareas_dia)
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(boton_guardar_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(287, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tareas_dia, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(boton_guardar_tarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );

        tab_principal2.addTab("Tarea", jPanel16);

        tabla_admin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabla_admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabla_adminMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tabla_admin);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        tab_principal2.addTab(" Administrar Mi cuenta", jPanel17);

        tabla_cuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_cuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabla_cuentasMouseReleased(evt);
            }
        });
        jScrollPane7.setViewportView(tabla_cuentas);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        tab_principal2.addTab("Directorio de Cuentas", jPanel18);

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
                        .addContainerGap(183, Short.MAX_VALUE))
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
                .addContainerGap(218, Short.MAX_VALUE))
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

        ta_ListaCandidatos.setColumns(20);
        ta_ListaCandidatos.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        ta_ListaCandidatos.setRows(5);
        jScrollPane8.setViewportView(ta_ListaCandidatos);

        cb_ListaCandidatos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel46.setText("Candidatos Presidenciales");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel46))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(cb_ListaCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(cb_ListaCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_principal.addTab("Candidatos", jPanel3);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel45.setText("Lista de Amigos");

        cb_listaAmigos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jt_ListaAmigos.setColumns(20);
        jt_ListaAmigos.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jt_ListaAmigos.setRows(5);
        jScrollPane2.setViewportView(jt_ListaAmigos);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(cb_listaAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(270, 270, 270))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel45)
                .addGap(36, 36, 36)
                .addComponent(cb_listaAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        tab_principal.addTab("Usuario Comun", jPanel7);

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
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombrePerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)))
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
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)))
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

        tf_usuario_signup1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_modificarPerfilLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(rb_m1)
                        .addGap(50, 50, 50)
                        .addComponent(rb_f1))
                    .addComponent(tf_usuario_signup1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(tf_usuario_signup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        boton_registrarse3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_registrarse3.setText("Ir a Modificar");
        boton_registrarse3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_registrarse3MouseClicked(evt);
            }
        });
        boton_registrarse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarse3ActionPerformed(evt);
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
                        .addComponent(boton_registrarse3)
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
                .addComponent(boton_registrarse3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jm_signup.setText("Abrir");

        jMenuItem1.setText("Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm_signup.add(jMenuItem1);

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
        jm_signup.add(jmi_registrarse);

        jMenuBar1.add(jm_signup);

        jMenu2.setText("Edit");
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
    }//GEN-LAST:event_boton_modificarMouseClicked

    private void boton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_modificarActionPerformed

    private void tabla_modificar_correoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_modificar_correoMouseReleased

    }//GEN-LAST:event_tabla_modificar_correoMouseReleased

    private void cb_opcion_correoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_opcion_correoItemStateChanged

    }//GEN-LAST:event_cb_opcion_correoItemStateChanged

    private void tabla1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseReleased

    }//GEN-LAST:event_tabla1MouseReleased

    private void tabla_tareaComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tabla_tareaComponentRemoved

    }//GEN-LAST:event_tabla_tareaComponentRemoved

    private void tareas_diaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareas_diaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tareas_diaMouseClicked

    private void tareas_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tareas_diaActionPerformed

    }//GEN-LAST:event_tareas_diaActionPerformed

    private void boton_guardar_tareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_guardar_tareaMouseClicked

    }//GEN-LAST:event_boton_guardar_tareaMouseClicked

    private void boton_guardar_tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardar_tareaActionPerformed

    }//GEN-LAST:event_boton_guardar_tareaActionPerformed

    private void tabla_adminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_adminMouseReleased

    }//GEN-LAST:event_tabla_adminMouseReleased

    private void tabla_cuentasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_cuentasMouseReleased

    }//GEN-LAST:event_tabla_cuentasMouseReleased

    private void enviar_sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_sendMouseClicked

    }//GEN-LAST:event_enviar_sendMouseClicked

    private void enviar_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviar_sendActionPerformed

    private void boldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boldMouseClicked

    }//GEN-LAST:event_boldMouseClicked

    private void boldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boldActionPerformed
        // TODO add your handling code here:

        //tp_mensaje_send.insertComponent(bold);
    }//GEN-LAST:event_boldActionPerformed

    private void boton_italicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_italicMouseClicked

    }//GEN-LAST:event_boton_italicMouseClicked

    private void tab_principal2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tab_principal2StateChanged

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

    private void boton_registrarse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarse3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_registrarse3ActionPerformed

    private void boton_registrarse3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarse3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_registrarse3MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.jd_login.setModal(true);
        this.jd_login.pack();
        this.jd_login.setLocationRelativeTo(this);
        this.jd_login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    }//GEN-LAST:event_boton_modificar1ActionPerformed

    private void rb_comunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_comunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_comunActionPerformed

    private void bt_modificarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_modificarPerfilActionPerformed

    private void bt_modificarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_modificarPerfilMouseClicked

    private void tf_correoCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_correoCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_correoCandidatoActionPerformed

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
    private javax.swing.ButtonGroup bg_genero;
    private javax.swing.ButtonGroup bg_tipoUser;
    private javax.swing.JButton bold;
    private javax.swing.JToggleButton boton_guardar_tarea;
    private javax.swing.JButton boton_italic;
    private javax.swing.JButton boton_login;
    private javax.swing.JButton boton_modificar;
    private javax.swing.JButton boton_modificar1;
    private javax.swing.JButton boton_registrarse;
    private javax.swing.JButton boton_registrarse3;
    private javax.swing.JButton bt_modificarPerfil;
    private javax.swing.JButton btn_sucandidato;
    private javax.swing.JButton btn_sucomun;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JComboBox<String> cb_LPubliCandidatos;
    private javax.swing.JComboBox<String> cb_ListaCandidatos;
    private javax.swing.JComboBox<String> cb_listaAmigos;
    private javax.swing.JComboBox<String> cb_opcion_correo;
    private javax.swing.JComboBox<String> cb_paramensaje;
    private com.toedter.calendar.JDateChooser dtFechaCandidato;
    private com.toedter.calendar.JDateChooser dt_fecha;
    private javax.swing.JEditorPane editorpane;
    private javax.swing.JButton enviar_send;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_escoger;
    private javax.swing.JDialog jd_homecandidato;
    private javax.swing.JDialog jd_homecomun;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_modifcarCandidato;
    private javax.swing.JDialog jd_modificarPerfil;
    private javax.swing.JDialog jd_signup;
    private javax.swing.JLabel jl_direccion;
    private javax.swing.JMenu jm_signup;
    private javax.swing.JMenuItem jmi_registrarse;
    private javax.swing.JTextArea jt_ListaAmigos;
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
    private javax.swing.JTextArea ta_ListaCandidatos;
    private javax.swing.JTextArea ta_PubliCandidatos;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTabbedPane tab_principal1;
    private javax.swing.JTabbedPane tab_principal2;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla_admin;
    private javax.swing.JTable tabla_cuentas;
    private javax.swing.JTable tabla_modificar_correo;
    private javax.swing.JTable tabla_tarea;
    private javax.swing.JToggleButton tareas_dia;
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
    private javax.swing.JTextField tf_usuarioCandidadto;
    private javax.swing.JTextField tf_usuario_login;
    private javax.swing.JTextField tf_usuario_signup;
    private javax.swing.JTextField tf_usuario_signup1;
    // End of variables declaration//GEN-END:variables
    Lista lista = new Lista();
    String nombre;
    String apellido;
    Date fecha;
    String sexo;
    String usuario;
    String password, direccion, correo;
    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

    UsuarioComun usuario_loggeado;
    UsuarioCandidato usuario_loggeadoC;
    //adminUsuario au;
    //Mensaje correo = new Mensaje();
}
