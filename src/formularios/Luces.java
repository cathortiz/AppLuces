package formularios;

import com.panamahitek.ArduinoException;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.panamahitek.PanamaHitek_Arduino;

public class Luces extends javax.swing.JFrame {
    int encendidas=0, apagadas=0;
    ImageIcon apagado = new ImageIcon(getClass().getResource("/imagenes/of.png"));
    ImageIcon encendido = new ImageIcon(getClass().getResource("/imagenes/on.png"));
    Icon off;
    Icon on;
    PanamaHitek_Arduino arduino = new com.panamahitek.PanamaHitek_Arduino();
    
    public Luces() {
        initComponents();
        this.setLocationRelativeTo(null);
        off = new ImageIcon(apagado.getImage().getScaledInstance(lblO11.getWidth(), 
                lblO11.getHeight(), Image.SCALE_DEFAULT));
        on = new ImageIcon(encendido.getImage().getScaledInstance(lblO11.getWidth(), 
                lblO11.getHeight(), Image.SCALE_DEFAULT));
        JLabel [] labels = {lblO11, lblO12, lblO13, lblO21, lblO22, lblO23, lblO31, lblO32, lblO33};
        for (JLabel label : labels) {
            label.setIcon(off);
        }
        try {
            arduino.arduinoTX("COM7", 9600);
        } catch (ArduinoException ex) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    } 
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage
        (ClassLoader.getSystemResource("iconos/mainIcon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnSecundario = new javax.swing.JPopupMenu();
        mnApagar = new javax.swing.JMenuItem();
        mnEncender = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnDiaSec = new javax.swing.JMenuItem();
        mnNocheSec = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnPrincSec = new javax.swing.JMenuItem();
        mnSecSec = new javax.swing.JMenuItem();
        mnSegSec = new javax.swing.JMenuItem();
        mnCheck = new javax.swing.JPopupMenu();
        mnAp = new javax.swing.JMenuItem();
        mnEn = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        chkOfi1Lp = new javax.swing.JCheckBox();
        chkOfi1Ls = new javax.swing.JCheckBox();
        chkOfi1LSeg = new javax.swing.JCheckBox();
        lblO11 = new javax.swing.JLabel();
        lblO12 = new javax.swing.JLabel();
        lblO13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chkOfi2Lp = new javax.swing.JCheckBox();
        chkOfi2Ls = new javax.swing.JCheckBox();
        chkOfi2LSeg = new javax.swing.JCheckBox();
        lblO21 = new javax.swing.JLabel();
        lblO22 = new javax.swing.JLabel();
        lblO23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chkOfi3Lp = new javax.swing.JCheckBox();
        chkOfi3Ls = new javax.swing.JCheckBox();
        chkOfi3LSeg = new javax.swing.JCheckBox();
        lblO31 = new javax.swing.JLabel();
        lblO32 = new javax.swing.JLabel();
        lblO33 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        tbApagar = new javax.swing.JButton();
        tbEncender = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        tbDia = new javax.swing.JButton();
        tbNoche = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        tbInfoLp = new javax.swing.JButton();
        tbInfoLs = new javax.swing.JButton();
        tbInfoLSeg = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        Prueba = new javax.swing.JButton();
        mnPrincipal = new javax.swing.JMenuBar();
        mnActivacion = new javax.swing.JMenu();
        mnApagarTodas = new javax.swing.JMenuItem();
        mnEncenderTodas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnDia = new javax.swing.JMenu();
        mnDiaOf1 = new javax.swing.JMenuItem();
        mnDiaOf2 = new javax.swing.JMenuItem();
        mnDiaOf3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnDiaTodas = new javax.swing.JMenuItem();
        mnNoche = new javax.swing.JMenu();
        mnNocheOf1 = new javax.swing.JMenuItem();
        mnNocheOf2 = new javax.swing.JMenuItem();
        mnNocheOf3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnNocheTodas = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenuItem();
        mnInfo = new javax.swing.JMenu();
        mnInfoP = new javax.swing.JMenuItem();
        mnInfoS = new javax.swing.JMenuItem();
        mnInfoSeg = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnAcerca = new javax.swing.JMenuItem();

        mnApagar.setText("Apagar Todas");
        mnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnApagarActionPerformed(evt);
            }
        });
        mnSecundario.add(mnApagar);

        mnEncender.setText("Encender Todas");
        mnEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEncenderActionPerformed(evt);
            }
        });
        mnSecundario.add(mnEncender);
        mnSecundario.add(jSeparator5);

        mnDiaSec.setText("Modo Dia");
        mnDiaSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiaSecActionPerformed(evt);
            }
        });
        mnSecundario.add(mnDiaSec);

        mnNocheSec.setText("Modo Noche");
        mnNocheSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNocheSecActionPerformed(evt);
            }
        });
        mnSecundario.add(mnNocheSec);
        mnSecundario.add(jSeparator8);

        mnPrincSec.setText("Principales");
        mnPrincSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPrincSecActionPerformed(evt);
            }
        });
        mnSecundario.add(mnPrincSec);

        mnSecSec.setText("Secundarias");
        mnSecSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSecSecActionPerformed(evt);
            }
        });
        mnSecundario.add(mnSecSec);

        mnSegSec.setText("Seguridad");
        mnSegSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSegSecActionPerformed(evt);
            }
        });
        mnSecundario.add(mnSegSec);

        mnAp.setText("Apagar");
        mnAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnApActionPerformed(evt);
            }
        });
        mnCheck.add(mnAp);

        mnEn.setText("Encender");
        mnEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEnActionPerformed(evt);
            }
        });
        mnCheck.add(mnEn);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Luces de la oficina");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setComponentPopupMenu(mnSecundario);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Oficina 1"));

        chkOfi1Lp.setText("Luz Principal");
        chkOfi1Lp.setComponentPopupMenu(mnCheck);
        chkOfi1Lp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi1LpStateChanged(evt);
            }
        });

        chkOfi1Ls.setText("Luz Secundaria");
        chkOfi1Ls.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi1LsStateChanged(evt);
            }
        });

        chkOfi1LSeg.setText("Luz de Seguridad");
        chkOfi1LSeg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi1LSegStateChanged(evt);
            }
        });

        lblO11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/of.png"))); // NOI18N
        lblO11.setPreferredSize(new java.awt.Dimension(30, 30));

        lblO12.setPreferredSize(new java.awt.Dimension(30, 30));

        lblO13.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOfi1Lp)
                    .addComponent(chkOfi1Ls)
                    .addComponent(chkOfi1LSeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblO11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblO12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblO13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblO11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblO12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblO13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkOfi1Lp)
                        .addGap(25, 25, 25)
                        .addComponent(chkOfi1Ls)
                        .addGap(25, 25, 25)
                        .addComponent(chkOfi1LSeg)))
                .addGap(7, 7, 7))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Oficina 2"));

        chkOfi2Lp.setText("Luz Principal");
        chkOfi2Lp.setToolTipText("Enciende la luz principal");
        chkOfi2Lp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi2LpStateChanged(evt);
            }
        });

        chkOfi2Ls.setText("Luz Secundaria");
        chkOfi2Ls.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi2LsStateChanged(evt);
            }
        });

        chkOfi2LSeg.setText("Luz de Seguridad");
        chkOfi2LSeg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi2LSegStateChanged(evt);
            }
        });

        lblO21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/of.png"))); // NOI18N
        lblO21.setPreferredSize(new java.awt.Dimension(30, 30));

        lblO22.setPreferredSize(new java.awt.Dimension(30, 30));

        lblO23.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOfi2Lp)
                    .addComponent(chkOfi2Ls)
                    .addComponent(chkOfi2LSeg))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblO21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblO22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblO23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkOfi2Lp)
                    .addComponent(lblO21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblO22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblO23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(chkOfi2Ls)
                        .addGap(25, 25, 25)
                        .addComponent(chkOfi2LSeg)))
                .addGap(18, 18, 18))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Oficina 3"));

        chkOfi3Lp.setText("Luz Principal");
        chkOfi3Lp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi3LpStateChanged(evt);
            }
        });

        chkOfi3Ls.setText("Luz Secundaria");
        chkOfi3Ls.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi3LsStateChanged(evt);
            }
        });

        chkOfi3LSeg.setText("Luz de Seguridad");
        chkOfi3LSeg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOfi3LSegStateChanged(evt);
            }
        });

        lblO31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/of.png"))); // NOI18N
        lblO31.setPreferredSize(new java.awt.Dimension(30, 30));

        lblO32.setPreferredSize(new java.awt.Dimension(30, 30));

        lblO33.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOfi3Lp)
                    .addComponent(chkOfi3Ls)
                    .addComponent(chkOfi3LSeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblO31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblO32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblO33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblO31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblO32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblO33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkOfi3Lp)
                        .addGap(25, 25, 25)
                        .addComponent(chkOfi3Ls)
                        .addGap(25, 25, 25)
                        .addComponent(chkOfi3LSeg)))
                .addGap(7, 7, 7))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        tbApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/apagar.png"))); // NOI18N
        tbApagar.setToolTipText("Apagar todas");
        tbApagar.setFocusable(false);
        tbApagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbApagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbApagarActionPerformed(evt);
            }
        });
        jToolBar1.add(tbApagar);

        tbEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/encender.png"))); // NOI18N
        tbEncender.setToolTipText("Encender todas");
        tbEncender.setFocusable(false);
        tbEncender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbEncender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEncenderActionPerformed(evt);
            }
        });
        jToolBar1.add(tbEncender);
        jToolBar1.add(jSeparator6);

        tbDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dia.png"))); // NOI18N
        tbDia.setToolTipText("Modo día");
        tbDia.setFocusable(false);
        tbDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbDia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDiaActionPerformed(evt);
            }
        });
        jToolBar1.add(tbDia);

        tbNoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/noche.png"))); // NOI18N
        tbNoche.setToolTipText("Modo noche");
        tbNoche.setFocusable(false);
        tbNoche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbNoche.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNocheActionPerformed(evt);
            }
        });
        jToolBar1.add(tbNoche);
        jToolBar1.add(jSeparator7);

        tbInfoLp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/info.png"))); // NOI18N
        tbInfoLp.setToolTipText("Luces Principales");
        tbInfoLp.setFocusable(false);
        tbInfoLp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbInfoLp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbInfoLp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInfoLpActionPerformed(evt);
            }
        });
        jToolBar1.add(tbInfoLp);

        tbInfoLs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/info2.png"))); // NOI18N
        tbInfoLs.setToolTipText("Luces Secundarias");
        tbInfoLs.setFocusable(false);
        tbInfoLs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbInfoLs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbInfoLs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInfoLsActionPerformed(evt);
            }
        });
        jToolBar1.add(tbInfoLs);

        tbInfoLSeg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/info3.png"))); // NOI18N
        tbInfoLSeg.setToolTipText("Luces de Seguridad");
        tbInfoLSeg.setFocusable(false);
        tbInfoLSeg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbInfoLSeg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbInfoLSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInfoLSegActionPerformed(evt);
            }
        });
        jToolBar1.add(tbInfoLSeg);
        jToolBar1.add(jSeparator9);

        Prueba.setText("111 Mil");
        Prueba.setFocusable(false);
        Prueba.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prueba.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Prueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PruebaActionPerformed(evt);
            }
        });
        jToolBar1.add(Prueba);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        mnActivacion.setText("Activación");

        mnApagarTodas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnApagarTodas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/apagar - chico.png"))); // NOI18N
        mnApagarTodas.setText("Apagar Todas");
        mnApagarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnApagarTodasActionPerformed(evt);
            }
        });
        mnActivacion.add(mnApagarTodas);

        mnEncenderTodas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnEncenderTodas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/encender - chico.png"))); // NOI18N
        mnEncenderTodas.setText("Encender Todas");
        mnEncenderTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEncenderTodasActionPerformed(evt);
            }
        });
        mnActivacion.add(mnEncenderTodas);
        mnActivacion.add(jSeparator1);

        mnDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/dia - copia.png"))); // NOI18N
        mnDia.setText("Dia");

        mnDiaOf1.setText("Oficina 1");
        mnDiaOf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiaOf1ActionPerformed(evt);
            }
        });
        mnDia.add(mnDiaOf1);

        mnDiaOf2.setText("Oficina 2");
        mnDiaOf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiaOf2ActionPerformed(evt);
            }
        });
        mnDia.add(mnDiaOf2);

        mnDiaOf3.setText("Oficina 3");
        mnDiaOf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiaOf3ActionPerformed(evt);
            }
        });
        mnDia.add(mnDiaOf3);
        mnDia.add(jSeparator2);

        mnDiaTodas.setText("Todas");
        mnDiaTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiaTodasActionPerformed(evt);
            }
        });
        mnDia.add(mnDiaTodas);

        mnActivacion.add(mnDia);

        mnNoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/noche - copia.png"))); // NOI18N
        mnNoche.setText("Noche");

        mnNocheOf1.setText("Oficina 1");
        mnNocheOf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNocheOf1ActionPerformed(evt);
            }
        });
        mnNoche.add(mnNocheOf1);

        mnNocheOf2.setText("Oficina 2");
        mnNocheOf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNocheOf2ActionPerformed(evt);
            }
        });
        mnNoche.add(mnNocheOf2);

        mnNocheOf3.setText("Oficina 3");
        mnNocheOf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNocheOf3ActionPerformed(evt);
            }
        });
        mnNoche.add(mnNocheOf3);
        mnNoche.add(jSeparator3);

        mnNocheTodas.setText("Todas");
        mnNocheTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNocheTodasActionPerformed(evt);
            }
        });
        mnNoche.add(mnNocheTodas);

        mnActivacion.add(mnNoche);

        mnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        mnActivacion.add(mnSalir);

        mnPrincipal.add(mnActivacion);

        mnInfo.setText("Info");

        mnInfoP.setText("Principales");
        mnInfoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoPActionPerformed(evt);
            }
        });
        mnInfo.add(mnInfoP);

        mnInfoS.setText("Secundarias");
        mnInfoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoSActionPerformed(evt);
            }
        });
        mnInfo.add(mnInfoS);

        mnInfoSeg.setText("Seguridad");
        mnInfoSeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnInfoSegActionPerformed(evt);
            }
        });
        mnInfo.add(mnInfoSeg);
        mnInfo.add(jSeparator4);

        mnAcerca.setText("Acerca de...");
        mnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAcercaActionPerformed(evt);
            }
        });
        mnInfo.add(mnAcerca);

        mnPrincipal.add(mnInfo);

        setJMenuBar(mnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnApagarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnApagarTodasActionPerformed
        apagarTodas();
    }//GEN-LAST:event_mnApagarTodasActionPerformed

    private void mnEncenderTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEncenderTodasActionPerformed
        encenderTodas();
    }//GEN-LAST:event_mnEncenderTodasActionPerformed

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        cerrar();
    }//GEN-LAST:event_mnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void mnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAcercaActionPerformed
        JOptionPane.showMessageDialog(null, "Programa realizado por 111Mil", 
                "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnAcercaActionPerformed

    private void mnInfoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoPActionPerformed
        infoPrincipales();
    }//GEN-LAST:event_mnInfoPActionPerformed

    private void chkOfi1LpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi1LpStateChanged
        try {
            if(chkOfi1Lp.isSelected()){
            lblO11.setIcon(on);
            arduino.sendData("O1Lp1\n");
        }
        else {
            lblO11.setIcon(off);
            arduino.sendData("O1Lp0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi1LpStateChanged

    private void chkOfi1LsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi1LsStateChanged
        try {
            if(chkOfi1Ls.isSelected()){
            lblO12.setIcon(on);
            arduino.sendData("O1Ls1\n");
        }
        else {
            lblO12.setIcon(off);
            arduino.sendData("O1Ls0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi1LsStateChanged

    private void chkOfi1LSegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi1LSegStateChanged
        try {
            if(chkOfi1LSeg.isSelected()){
            lblO13.setIcon(on);
            arduino.sendData("O1Lg1\n");
        }
        else {
            lblO13.setIcon(off);
            arduino.sendData("O1Lg0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi1LSegStateChanged

    private void mnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnApagarActionPerformed
        apagarTodas();
    }//GEN-LAST:event_mnApagarActionPerformed

    private void mnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEncenderActionPerformed
        encenderTodas();
    }//GEN-LAST:event_mnEncenderActionPerformed

    private void mnApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnApActionPerformed
        chkOfi1Lp.setSelected(false);
    }//GEN-LAST:event_mnApActionPerformed

    private void mnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEnActionPerformed
        chkOfi1Lp.setSelected(true);
    }//GEN-LAST:event_mnEnActionPerformed

    private void chkOfi2LpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi2LpStateChanged
        try {
            if(chkOfi2Lp.isSelected()){
            lblO21.setIcon(on);
            arduino.sendData("O2Lp1\n");
        }
        else {
            lblO21.setIcon(off);
            arduino.sendData("O2Lp0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi2LpStateChanged

    private void mnDiaTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiaTodasActionPerformed
        diaTodas();
    }//GEN-LAST:event_mnDiaTodasActionPerformed

    private void mnDiaOf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiaOf1ActionPerformed
        chkOfi1LSeg.setSelected(false);
        chkOfi1Lp.setSelected(true);
        chkOfi1Ls.setSelected(true);
    }//GEN-LAST:event_mnDiaOf1ActionPerformed

    private void mnDiaOf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiaOf2ActionPerformed
        chkOfi2LSeg.setSelected(false);
        chkOfi2Lp.setSelected(true);
        chkOfi2Ls.setSelected(true);
    }//GEN-LAST:event_mnDiaOf2ActionPerformed

    private void mnDiaOf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiaOf3ActionPerformed
        chkOfi3LSeg.setSelected(false);
        chkOfi3Lp.setSelected(true);
        chkOfi3Ls.setSelected(true);
    }//GEN-LAST:event_mnDiaOf3ActionPerformed

    private void chkOfi2LsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi2LsStateChanged
        try {
            if(chkOfi2Ls.isSelected()){
            lblO22.setIcon(on);
            arduino.sendData("O2Ls1\n");
        }
        else {
            lblO22.setIcon(off);
            arduino.sendData("O2Ls0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi2LsStateChanged

    private void chkOfi2LSegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi2LSegStateChanged
        try {
            if(chkOfi2LSeg.isSelected()){
            lblO23.setIcon(on);
            arduino.sendData("O2Lg1\n");
        }
        else {
            lblO23.setIcon(off);
            arduino.sendData("O2Lg0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi2LSegStateChanged

    private void chkOfi3LpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi3LpStateChanged
        try {
            if(chkOfi3Lp.isSelected()){
            lblO31.setIcon(on);
            arduino.sendData("O3Lp1\n");
        }
        else {
            lblO31.setIcon(off);
            arduino.sendData("O3Lp0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi3LpStateChanged

    private void chkOfi3LsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi3LsStateChanged
        try {
            if(chkOfi3Ls.isSelected()){
            lblO32.setIcon(on);
            arduino.sendData("O3Ls1\n");
        }
        else {
            lblO32.setIcon(off);
            arduino.sendData("O3Ls0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi3LsStateChanged

    private void chkOfi3LSegStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOfi3LSegStateChanged
        try {
            if(chkOfi3LSeg.isSelected()){
            lblO33.setIcon(on);
            arduino.sendData("O3Lg1\n");
        }
        else {
            lblO33.setIcon(off);
            arduino.sendData("O3Lg0\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de comunicación con Arduino");
        }
    }//GEN-LAST:event_chkOfi3LSegStateChanged

    private void mnDiaSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiaSecActionPerformed
        diaTodas();
    }//GEN-LAST:event_mnDiaSecActionPerformed

    private void mnNocheTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNocheTodasActionPerformed
        nocheTodas();
    }//GEN-LAST:event_mnNocheTodasActionPerformed

    private void mnNocheOf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNocheOf1ActionPerformed
        chkOfi1LSeg.setSelected(true);
        chkOfi1Lp.setSelected(false);
        chkOfi1Ls.setSelected(false);
    }//GEN-LAST:event_mnNocheOf1ActionPerformed

    private void mnNocheOf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNocheOf2ActionPerformed
        chkOfi2LSeg.setSelected(true);
        chkOfi2Lp.setSelected(false);
        chkOfi2Ls.setSelected(false);
    }//GEN-LAST:event_mnNocheOf2ActionPerformed

    private void mnNocheOf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNocheOf3ActionPerformed
        chkOfi3LSeg.setSelected(true);
        chkOfi3Lp.setSelected(false);
        chkOfi3Ls.setSelected(false);
    }//GEN-LAST:event_mnNocheOf3ActionPerformed

    private void mnInfoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoSActionPerformed
        infoSecundarias();
    }//GEN-LAST:event_mnInfoSActionPerformed

    private void mnInfoSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnInfoSegActionPerformed
        infoSeguridad();
    }//GEN-LAST:event_mnInfoSegActionPerformed

    private void tbApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbApagarActionPerformed
        apagarTodas();
    }//GEN-LAST:event_tbApagarActionPerformed

    private void tbEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEncenderActionPerformed
        encenderTodas();
    }//GEN-LAST:event_tbEncenderActionPerformed

    private void tbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDiaActionPerformed
        diaTodas();
    }//GEN-LAST:event_tbDiaActionPerformed

    private void tbNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNocheActionPerformed
        nocheTodas();
    }//GEN-LAST:event_tbNocheActionPerformed

    private void tbInfoLpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInfoLpActionPerformed
        infoPrincipales();
    }//GEN-LAST:event_tbInfoLpActionPerformed

    private void tbInfoLsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInfoLsActionPerformed
        infoSecundarias();
    }//GEN-LAST:event_tbInfoLsActionPerformed

    private void tbInfoLSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInfoLSegActionPerformed
        infoSeguridad();
    }//GEN-LAST:event_tbInfoLSegActionPerformed

    private void mnPrincSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPrincSecActionPerformed
        infoPrincipales();
    }//GEN-LAST:event_mnPrincSecActionPerformed

    private void mnNocheSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNocheSecActionPerformed
        nocheTodas();
    }//GEN-LAST:event_mnNocheSecActionPerformed

    private void mnSecSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSecSecActionPerformed
        infoSecundarias();
    }//GEN-LAST:event_mnSecSecActionPerformed

    private void mnSegSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSegSecActionPerformed
        infoSeguridad();
    }//GEN-LAST:event_mnSegSecActionPerformed

    private void PruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PruebaActionPerformed
        try {
            arduino.sendData("secuencia");
            //Secuencia desde Java. Cambiado a Arduino
//            String txt1 = "O1Lp1\nO2Lp1\nO3Lp1\n";
//            String txt1O = "O1Lp0\nO2Lp0\nO3Lp0\n";
//            String txtM = "O1Lp1\nO2Lp1\nO3Lp1\nO1Lg1\nO2Lg1\nO3Lg1\nO2Ls1\n";
//            String txtMO = "O1Lp0\nO2Lp0\nO3Lp0\nO1Lg0\nO2Lg0\nO3Lg0\nO2Ls0\n";
//            String txtI = "O1Ls1\nO2Ls1\nO3Ls1\n";
//            String txtIO = "O1Ls0\nO2Ls0\nO3Ls0\n";
//            String txtL = "O1Lg1\nO2Lg1\nO3Lg1\nO3Ls1\nO3Lp1\n";
//            String txtLO = "O1Lg0\nO2Lg0\nO3Lg0\nO3Ls0\nO3Lp0\n";
//            for (int i = 0; i < 3; i++) {
//                arduino.sendData(txt1);
//                Thread.sleep(500);
//                arduino.sendData(txt1O);
//                Thread.sleep(500);
//            }
//            arduino.sendData(txtM);
//            Thread.sleep(500);
//            arduino.sendData(txtMO);
//            Thread.sleep(500);
//            arduino.sendData(txtI);
//            Thread.sleep(500);
//            arduino.sendData(txtIO);
//            Thread.sleep(500);
//            arduino.sendData(txtL);
//            Thread.sleep(500);
//            arduino.sendData(txtLO);
//            Thread.sleep(1500);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_PruebaActionPerformed
    
    public void infoPrincipales(){
        JCheckBox [] listchecks = {chkOfi1Lp, chkOfi2Lp, chkOfi3Lp};
        for(JCheckBox check : listchecks){
            if (check.isSelected()==true){
                encendidas++;
            }else{
                apagadas++;
            }
        }
        JOptionPane.showMessageDialog(null, "Luces principales encendidas: " + encendidas 
                + "\nLuces principales apagadas: " + apagadas, "Luces Principales", JOptionPane.INFORMATION_MESSAGE);
        apagadas = encendidas = 0;
    }
    
    public void infoSecundarias(){
        JCheckBox [] listchecks = {chkOfi1Ls, chkOfi2Ls, chkOfi3Ls};
        for(JCheckBox check : listchecks){
            if (check.isSelected()==true){
                encendidas++;
            }else{
                apagadas++;
            }
        }
        JOptionPane.showMessageDialog(null, "Luces secundarias encendidas: " + encendidas 
                + "\nLuces secundarias apagadas: " + apagadas, "Luces Secundarias", JOptionPane.INFORMATION_MESSAGE);
        apagadas = encendidas = 0;
    }
    
    public void infoSeguridad(){
        JCheckBox [] listchecks = {chkOfi1LSeg, chkOfi2LSeg, chkOfi3LSeg};
        for(JCheckBox check : listchecks){
            if (check.isSelected()==true){
                encendidas++;
            }else{
                apagadas++;
            }
        }
        JOptionPane.showMessageDialog(null, "Luces de seguridad encendidas: " + encendidas 
                + "\nLuces de seguridad apagadas: " + apagadas, "Luces de Seguridad", JOptionPane.INFORMATION_MESSAGE);
        apagadas = encendidas = 0;
    }
    
    public void diaTodas(){
        JCheckBox [] encender = {chkOfi1Lp, chkOfi1Ls, chkOfi2Lp, chkOfi2Ls, 
            chkOfi3Lp, chkOfi3Ls};
        JCheckBox [] apagar = {chkOfi1LSeg, chkOfi2LSeg, chkOfi3LSeg};
        for (JCheckBox check : encender) {
            check.setSelected(true);
        }
        for (JCheckBox check : apagar) {
            check.setSelected(false);
        }
    }
    public void nocheTodas(){
        JCheckBox [] apagar = {chkOfi1Lp, chkOfi1Ls, chkOfi2Lp, chkOfi2Ls, 
            chkOfi3Lp, chkOfi3Ls};
        JCheckBox [] encender = {chkOfi1LSeg, chkOfi2LSeg, chkOfi3LSeg};
        for (JCheckBox check : encender) {
            check.setSelected(true);
        }
        for (JCheckBox check : apagar) {
            check.setSelected(false);
        }
    }
        
    public void encenderTodas(){
        JCheckBox [] checks = {chkOfi1LSeg, chkOfi1Lp, chkOfi1Ls, chkOfi2LSeg, 
            chkOfi2Lp, chkOfi2Ls, chkOfi3LSeg, chkOfi3Lp, chkOfi3Ls};
        for (JCheckBox check : checks) {
            check.setSelected(true);
        }
    }
    
    public void apagarTodas(){
        JCheckBox [] checks = {chkOfi1LSeg, chkOfi1Lp, chkOfi1Ls, chkOfi2LSeg, 
            chkOfi2Lp, chkOfi2Ls, chkOfi3LSeg, chkOfi3Lp, chkOfi3Ls};
        for (JCheckBox check : checks) {
            check.setSelected(false);
        }
    }
    
    public void cerrar(){
        int eleccion = JOptionPane.showConfirmDialog(null, "En realidad desea salir?",
                "Mensaje de Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eleccion == 0){
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Luces.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Luces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Prueba;
    private javax.swing.JCheckBox chkOfi1LSeg;
    private javax.swing.JCheckBox chkOfi1Lp;
    private javax.swing.JCheckBox chkOfi1Ls;
    private javax.swing.JCheckBox chkOfi2LSeg;
    private javax.swing.JCheckBox chkOfi2Lp;
    private javax.swing.JCheckBox chkOfi2Ls;
    private javax.swing.JCheckBox chkOfi3LSeg;
    private javax.swing.JCheckBox chkOfi3Lp;
    private javax.swing.JCheckBox chkOfi3Ls;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblO11;
    private javax.swing.JLabel lblO12;
    private javax.swing.JLabel lblO13;
    private javax.swing.JLabel lblO21;
    private javax.swing.JLabel lblO22;
    private javax.swing.JLabel lblO23;
    private javax.swing.JLabel lblO31;
    private javax.swing.JLabel lblO32;
    private javax.swing.JLabel lblO33;
    private javax.swing.JMenuItem mnAcerca;
    private javax.swing.JMenu mnActivacion;
    private javax.swing.JMenuItem mnAp;
    private javax.swing.JMenuItem mnApagar;
    private javax.swing.JMenuItem mnApagarTodas;
    private javax.swing.JPopupMenu mnCheck;
    private javax.swing.JMenu mnDia;
    private javax.swing.JMenuItem mnDiaOf1;
    private javax.swing.JMenuItem mnDiaOf2;
    private javax.swing.JMenuItem mnDiaOf3;
    private javax.swing.JMenuItem mnDiaSec;
    private javax.swing.JMenuItem mnDiaTodas;
    private javax.swing.JMenuItem mnEn;
    private javax.swing.JMenuItem mnEncender;
    private javax.swing.JMenuItem mnEncenderTodas;
    private javax.swing.JMenu mnInfo;
    private javax.swing.JMenuItem mnInfoP;
    private javax.swing.JMenuItem mnInfoS;
    private javax.swing.JMenuItem mnInfoSeg;
    private javax.swing.JMenu mnNoche;
    private javax.swing.JMenuItem mnNocheOf1;
    private javax.swing.JMenuItem mnNocheOf2;
    private javax.swing.JMenuItem mnNocheOf3;
    private javax.swing.JMenuItem mnNocheSec;
    private javax.swing.JMenuItem mnNocheTodas;
    private javax.swing.JMenuItem mnPrincSec;
    private javax.swing.JMenuBar mnPrincipal;
    private javax.swing.JMenuItem mnSalir;
    private javax.swing.JMenuItem mnSecSec;
    private javax.swing.JPopupMenu mnSecundario;
    private javax.swing.JMenuItem mnSegSec;
    private javax.swing.JButton tbApagar;
    private javax.swing.JButton tbDia;
    private javax.swing.JButton tbEncender;
    private javax.swing.JButton tbInfoLSeg;
    private javax.swing.JButton tbInfoLp;
    private javax.swing.JButton tbInfoLs;
    private javax.swing.JButton tbNoche;
    // End of variables declaration//GEN-END:variables
}
