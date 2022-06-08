/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroep;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Familiar
 */
public class RegistroInterfaz extends javax.swing.JFrame {

    //REALICÉ CONEXION "LOCAL" DE LA PROPIA INTERFAZ
    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al conectar con el driver..." + e.getMessage());
        }

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/adsi", "root", "");
        } catch (SQLException e) {
            System.out.println("Error al conectar con el servidor... " + e.getMessage());
        }
        //RETORNA TODA LA CONEXION REALIZADA
        return con;
    }

    //DECLARÉ CADA UNO DE LA CONEXION, ESTATUTO Y RESULTADO
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    int id;

    //REALICÉ CAMBIOS EN LA INTERFAZ COMO EL TITULO, TAMAÑO ETC
    public RegistroInterfaz() {
        //EL ICON SIRVE PARA BUSCAR UNA IMAGEN O ICONO EN LA PC, LO USE PARA PONER EL ICONO DE EASY PARKING EN LOS MENSAJES EMERGENTES
        Icon ep = new ImageIcon(getClass().getResource("/registroep/ep.png"));
        setTitle("APARTA TU ESTACIONAMIENTO - EASY PARKING");
        setSize(940, 780);
        this.setLocationRelativeTo(null);
        initComponents();
        //MENSAJE DE BIENVENIDA
        JOptionPane.showMessageDialog(null, "BIENVENIDO A EASY PARKING.", "EASY PARKING", JOptionPane.INFORMATION_MESSAGE, ep);
        //INSTACIAR FECHA ACTUAL PARA QUE LA HORA SEA MOSTRADA SIEMPRE
        horaactual.setText(horaActual());

    }

    @SuppressWarnings("unchecked")
    //CODIGO PARA MOSTRAR LA HORA DE INGRESO AL SISTEMA
    public static String horaActual() {

        Date fecha = new Date();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("  hh:mm:ss");
        return formatoFecha.format(fecha);

    }
    
    public static String fechaActual() {

        Date fecha = new Date();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        return formatoFecha.format(fecha);

    }
    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        general = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        opcVehiculo = new javax.swing.JComboBox<>();
        jlabel1 = new javax.swing.JLabel();
        opcPlanta = new javax.swing.JComboBox<>();
        btnApartar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtAparcamiento = new javax.swing.JTextField();
        btnGenerador = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnAcepto = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        horaactual = new javax.swing.JTextField();
        BtnContacto = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        fechaactual = new javax.swing.JTextField();
        btnsalida = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 172, 238));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 54, 102));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APARTA TU ESTACIONAMIENTO.");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESA TU NOMBRE:");

        txtPlaca.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtPlaca.setToolTipText("");
        txtPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));
        txtPlaca.setMargin(new java.awt.Insets(0, 5, 0, 2));
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroep/logopequeño.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¡ES MUY FACIL!");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("INGRESA LA PLACA DE TU VEHICULO:");

        txtNombre.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.cyan));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DIGITA TU NUMERO DE CEDULA:");

        jlabel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("SELECCIONA TIPO DE VEHICULO:");

        txtCedula.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        opcVehiculo.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        opcVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opción...", "Automovil", "Motocicleta", "Bicicleta" }));

        jlabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jlabel1.setForeground(new java.awt.Color(255, 255, 255));
        jlabel1.setText("SELECCIONA PLANTA:");

        opcPlanta.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        opcPlanta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opción...", "1", "2", "3", "4" }));
        opcPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcPlantaActionPerformed(evt);
            }
        });

        btnApartar.setBackground(new java.awt.Color(1, 255, 170));
        btnApartar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnApartar.setForeground(new java.awt.Color(255, 255, 255));
        btnApartar.setText("APARTAR");
        btnApartar.setFocusPainted(false);
        btnApartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(228, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR CAMPOS");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtAparcamiento.setEditable(false);
        txtAparcamiento.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        txtAparcamiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAparcamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAparcamientoActionPerformed(evt);
            }
        });

        btnGenerador.setBackground(new java.awt.Color(21, 142, 255));
        btnGenerador.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnGenerador.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerador.setText("GENERAR");
        btnGenerador.setToolTipText("");
        btnGenerador.setBorder(null);
        btnGenerador.setFocusPainted(false);
        btnGenerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneradorActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("GENERA NUMERO DE APARCAMIENTO:");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("=");

        btnAcepto.setBackground(new java.awt.Color(0, 54, 102));
        btnAcepto.setForeground(new java.awt.Color(255, 255, 255));
        btnAcepto.setText("Acepto terminos y condiciones.");

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("HORA:");

        horaactual.setEditable(false);
        horaactual.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        horaactual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        horaactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaactualActionPerformed(evt);
            }
        });

        BtnContacto.setBackground(new java.awt.Color(0, 54, 102));
        BtnContacto.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        BtnContacto.setForeground(new java.awt.Color(204, 204, 204));
        BtnContacto.setText("Contactanos");
        BtnContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContactoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("FECHA:");

        fechaactual.setEditable(false);
        fechaactual.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        fechaactual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        fechaactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaactualActionPerformed(evt);
            }
        });

        btnsalida.setBackground(new java.awt.Color(1, 255, 170));
        btnsalida.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnsalida.setForeground(new java.awt.Color(255, 255, 255));
        btnsalida.setText("SALIDA");
        btnsalida.setFocusPainted(false);
        btnsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(btnGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtnContacto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnApartar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAparcamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(horaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAcepto)
                            .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(fechaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAparcamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnAcepto)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnContacto)
                    .addComponent(btnApartar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(0, 172, 238));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Encuentra un estacionamiento disponible");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¡AL ALCANCE DE TUS MANOS! ");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("· Disponible las 24 horas del día.");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("· Apartalo donde quieras y cuando quieras.");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BIENVENIDO.");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroep/coche (1).png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroep/persona.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroep/mujer.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroep/logopequeño.png"))); // NOI18N

        jButton3.setBackground(new java.awt.Color(0, 172, 238));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("¿QUIENES SOMOS?");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("· Una interfaz intuitiva y facil de usar.");

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("· Ahorra tiempo y dinero en la busqueda de tu");

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("estacionamiento.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel21))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed

    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnApartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartarActionPerformed
        
     tickete a = new tickete();
     a.a1 = txtPlaca.getText();
     a.a2 = txtNombre.getText();
      a.a3 = txtCedula.getText();
      a.a4 = opcVehiculo.getSelectedItem().toString();
       a.a5 = opcPlanta.getSelectedItem().toString();
       a.a6 = txtAparcamiento.getText();
       a.a7 = fechaactual.getText();
       a.a8 = horaactual.getText();
       
        
        a.setVisible(true);
        this.dispose();
        
        
        
        
        registro();
    }//GEN-LAST:event_btnApartarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarcampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGeneradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneradorActionPerformed
        generador();
    }//GEN-LAST:event_btnGeneradorActionPerformed

    private void opcPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcPlantaActionPerformed

    }//GEN-LAST:event_opcPlantaActionPerformed

    private void txtAparcamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAparcamientoActionPerformed
        generador();
    }//GEN-LAST:event_txtAparcamientoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Icon ep = new ImageIcon(getClass().getResource("/registroep/ep.png"));

        JOptionPane.showMessageDialog(null, "\n EASYPARKING"
                + "\n"
                + "\n· Easy Parking es un sistema de información que busca facilitar el control del"
                + "\n tráfico y la búsqueda de estacionamiento. "
                + "\n"
                + "\n MISION"
                + "\n· Facilitar la busqueda y seleccion de estacionamientos vehiculares,"
                + "\n implementando un sistema de informacion y gestion seguro,"
                + "\n innovador y accesible a cualquier persona."
                + "\n"
                + "\n VISION"
                + "\n· Reducir el trafico vehicular a la hora de buscar un estacionamiento disponible."
                + "\n"
                + "\n OBJETIVO PRINCIPAL"
                + "\n· Mejorar el servicio de parqueadero tanto en el sector publico como en el privado."
                + "\n"
                + "\n DESARROLLADORES"
                + "\n· Andres Felipe Cruz Sanchez"
                + "\n· Daniel Felipe Sanchez Pinilla"
                + "\n· Juan Esteban Useche Diaz"
                + "\n· Juan David Galeano Diaz"
                + "\n· David Esteban Ordoñez Zambrano", "EASY PARKING", JOptionPane.INFORMATION_MESSAGE, ep);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void horaactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaactualActionPerformed
        horaActual();
    }//GEN-LAST:event_horaactualActionPerformed

    private void BtnContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContactoActionPerformed
        Icon ep = new ImageIcon(getClass().getResource("/registroep/ep.png"));
        JOptionPane.showMessageDialog(null,
                "\n E-MAIL:  easyparking@contacto.com"
                + "\n PAGINA WEB:  www.easyparking.com"
                + "\n NUMERO DE CONTACTO: +57 312 341 0101", "EASYPARKING", JOptionPane.INFORMATION_MESSAGE, ep);
    }//GEN-LAST:event_BtnContactoActionPerformed

    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        txtPlaca.setText(txtPlaca.getText().toUpperCase());
    }//GEN-LAST:event_txtPlacaKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char validar=evt.getKeyChar();
        
        if(Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "ESTE CAMPO SOLO RECIBE LETRAS "); 
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre = txtNombre;
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        txtNombre.setText(txtNombre.getText().toUpperCase());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void fechaactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaactualActionPerformed
            fechaActual();
    }//GEN-LAST:event_fechaactualActionPerformed

    private void btnsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalidaActionPerformed
        consultasalida abrir = new consultasalida();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalidaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "DIGITE SOLO NUMEROS DE CEDULA VALIDOS");
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    public static void main(String args[]) {

        //EL UIMANAGER SE PUEDE UTILIZAR PARA CAMBIAR EL CONOL DEL FONDO DEL MENSAJE EMERGENTE
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResource(51, 153, 228));
        UI.put("Panel.background", new ColorUIResource(51, 153, 228));
        //HASTA AQUÍ VA EL UIMANAGER

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroInterfaz().setVisible(true);
            }
        });
    }

    //REGISTRA DATOS Y LOS ALMACENA EN LA BASE DE DATOS 
    void registro() {
        Calendar fecha = new GregorianCalendar();
        
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR);
        int minutos = fecha.get(Calendar.MINUTE);
        int segundos = fecha.get(Calendar.SECOND);
        
        Icon ep = new ImageIcon(getClass().getResource("/registroep/ep.png"));
        String placa = txtPlaca.getText();
        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        String tipovehiculo = (String) opcVehiculo.getSelectedItem();
        String planta = (String) opcPlanta.getSelectedItem();
        String aparcamiento = (String) txtAparcamiento.getText();
        String date=año+"-"+(mes+1)+"-"+dia;
        String hour=hora + ":" + minutos + ":" + segundos;
        String acepto = (String) btnAcepto.getActionCommand();
        

        if (placa.equals("") || (nombre.equals("")) || (cedula.equals("")) || (tipovehiculo.equals("")) || (planta.equals("") || (aparcamiento.equals("")) || (acepto.equals("")))) {
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS, COMPLETAR REGISTRO PORFAVOR.", "EASY PARKING", JOptionPane.INFORMATION_MESSAGE, ep);
        } else {
            String sql = "insert into registro (placa, nombre, cedula, tipovehiculo, numplanta, numaparcamiento, fecha, horaentrada) values ('" + placa + "','" + nombre + "','" + cedula + "','" + tipovehiculo + "','" + planta + "','" + aparcamiento + "','" + date + "','" + hour + "')";

            try {
                cn = con.getCnn();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO EXITOSAMENTE.", "EASY PARKING", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR AL APARTAR EL APARCAMIENTO" + e.getMessage(), "EASY PARKING", JOptionPane.INFORMATION_MESSAGE, ep);
            }

        }

    }

    //LIMPIAR TODOS LOS CAMPOS 
    void limpiarcampos() {

        txtPlaca.setText("");
        txtNombre.setText("");
        txtCedula.setText("");
        opcVehiculo.setSelectedItem("Elige una opción");
        opcPlanta.setSelectedItem("Elige una opción");
        txtAparcamiento.setText("");

    }

    //GENERAR NUMERO ALEATORIO PARA EL APARCAMIENTO
    void generador() {
        int numero = (int) (Math.random() * 30);
        txtAparcamiento.setText("  " + numero);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContacto;
    private javax.swing.JRadioButton btnAcepto;
    private javax.swing.JButton btnApartar;
    private javax.swing.JButton btnGenerador;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnsalida;
    private javax.swing.JTextField fechaactual;
    private javax.swing.ButtonGroup general;
    private javax.swing.JTextField horaactual;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JComboBox<String> opcPlanta;
    private javax.swing.JComboBox<String> opcVehiculo;
    private javax.swing.JTextField txtAparcamiento;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    private void convertirAMayuscula(JTextField txtNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
