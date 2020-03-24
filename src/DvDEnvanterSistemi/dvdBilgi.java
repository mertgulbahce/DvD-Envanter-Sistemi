
package proje2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class dvdBilgi extends javax.swing.JFrame {
    private DoublyLinkedList dvdBilgi;

    public dvdBilgi() {
        initComponents();
        setTitle("ALBÜM BİGİLERİ");
        dosyaOku();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAlbumEkle = new javax.swing.JPanel();
        jLabelKisiEkleAd = new javax.swing.JLabel();
        jLabelKisiEkleNumara = new javax.swing.JLabel();
        jTextFieldAlbumEkleAd = new javax.swing.JTextField();
        jTextFieldAlbumEkleSarkilar = new javax.swing.JTextField();
        jLabelKisiEkleAciklama = new javax.swing.JLabel();
        jButtonAlbumEkle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAlbumEkleAlbumAdi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAlbumEkleTarih = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAlbumEKleFiyat = new javax.swing.JTextField();
        jPanelAlbumBul = new javax.swing.JPanel();
        jLabelAlbumBul = new javax.swing.JLabel();
        jTextFieldAlbumBul = new javax.swing.JTextField();
        jButtonAlbumBul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAlbumBilgi = new javax.swing.JTextArea();
        jPanelKisiSil = new javax.swing.JPanel();
        jLabelAlbumSilAd = new javax.swing.JLabel();
        jTextFieldAlbumSilAd = new javax.swing.JTextField();
        jButtonKisiSil = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAlbumSilBaslik = new javax.swing.JTextField();
        jPanelAZ = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaRehber = new javax.swing.JTextArea();
        jButtonCikis = new javax.swing.JButton();
        jButtonAZ = new javax.swing.JButton();
        jButtonZA = new javax.swing.JButton();
        jPanelikiBin = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2000 = new javax.swing.JTextArea();
        jButton2000 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelAlbumEkle.setBackground(new java.awt.Color(255, 255, 204));
        jPanelAlbumEkle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Albüm Ekle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N
        jPanelAlbumEkle.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabelKisiEkleAd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelKisiEkleAd.setText("Ad Soyad:");

        jLabelKisiEkleNumara.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelKisiEkleNumara.setText("Şarkı:");

        jTextFieldAlbumEkleSarkilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlbumEkleSarkilarActionPerformed(evt);
            }
        });

        jLabelKisiEkleAciklama.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabelKisiEkleAciklama.setText("*Birden fazla numara girişi yapılacak ise numaralar arasına virgül koyunuz.");

        jButtonAlbumEkle.setText("Albüm Ekle");
        jButtonAlbumEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlbumEkleActionPerformed(evt);
            }
        });

        jLabel1.setText("Albüm Adı:");

        jTextFieldAlbumEkleAlbumAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlbumEkleAlbumAdiActionPerformed(evt);
            }
        });

        jLabel2.setText("Çıkış Tarihi:");

        jLabel3.setText("Fiyat:");

        jTextFieldAlbumEKleFiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlbumEKleFiyatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlbumEkleLayout = new javax.swing.GroupLayout(jPanelAlbumEkle);
        jPanelAlbumEkle.setLayout(jPanelAlbumEkleLayout);
        jPanelAlbumEkleLayout.setHorizontalGroup(
            jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlbumEkleLayout.createSequentialGroup()
                .addComponent(jLabelKisiEkleAciklama)
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(jPanelAlbumEkleLayout.createSequentialGroup()
                .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelKisiEkleAd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabelKisiEkleNumara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldAlbumEkleSarkilar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextFieldAlbumEkleAd, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextFieldAlbumEkleAlbumAdi)
                    .addComponent(jTextFieldAlbumEkleTarih)
                    .addComponent(jTextFieldAlbumEKleFiyat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlbumEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAlbumEkleLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelKisiEkleAd, jLabelKisiEkleNumara});

        jPanelAlbumEkleLayout.setVerticalGroup(
            jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlbumEkleLayout.createSequentialGroup()
                .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAlbumEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAlbumEkleLayout.createSequentialGroup()
                        .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelKisiEkleAd)
                            .addComponent(jTextFieldAlbumEkleAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAlbumEkleAlbumAdi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldAlbumEkleTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldAlbumEKleFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanelAlbumEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKisiEkleNumara, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAlbumEkleSarkilar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKisiEkleAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAlbumEkleLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelKisiEkleAd, jLabelKisiEkleNumara});

        jPanelAlbumBul.setBackground(new java.awt.Color(204, 255, 204));
        jPanelAlbumBul.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Albüm Bul", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabelAlbumBul.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAlbumBul.setText("Ad Soyad:");

        jButtonAlbumBul.setText("Bul");
        jButtonAlbumBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlbumBulActionPerformed(evt);
            }
        });

        jTextAreaAlbumBilgi.setColumns(20);
        jTextAreaAlbumBilgi.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAlbumBilgi);

        javax.swing.GroupLayout jPanelAlbumBulLayout = new javax.swing.GroupLayout(jPanelAlbumBul);
        jPanelAlbumBul.setLayout(jPanelAlbumBulLayout);
        jPanelAlbumBulLayout.setHorizontalGroup(
            jPanelAlbumBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlbumBulLayout.createSequentialGroup()
                .addGroup(jPanelAlbumBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlbumBulLayout.createSequentialGroup()
                        .addComponent(jLabelAlbumBul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAlbumBul, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlbumBul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanelAlbumBulLayout.setVerticalGroup(
            jPanelAlbumBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlbumBulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlbumBulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlbumBul)
                    .addComponent(jTextFieldAlbumBul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlbumBul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelKisiSil.setBackground(new java.awt.Color(255, 153, 153));
        jPanelKisiSil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Albüm Sil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabelAlbumSilAd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAlbumSilAd.setText("Ad Soyad");

        jButtonKisiSil.setText("Sil");
        jButtonKisiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKisiSilActionPerformed(evt);
            }
        });

        jLabel4.setText("Başlık");

        jTextFieldAlbumSilBaslik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlbumSilBaslikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKisiSilLayout = new javax.swing.GroupLayout(jPanelKisiSil);
        jPanelKisiSil.setLayout(jPanelKisiSilLayout);
        jPanelKisiSilLayout.setHorizontalGroup(
            jPanelKisiSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiSilLayout.createSequentialGroup()
                .addGroup(jPanelKisiSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlbumSilAd)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelKisiSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldAlbumSilAd, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextFieldAlbumSilBaslik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonKisiSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanelKisiSilLayout.setVerticalGroup(
            jPanelKisiSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKisiSilLayout.createSequentialGroup()
                .addGroup(jPanelKisiSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonKisiSil, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(jPanelKisiSilLayout.createSequentialGroup()
                        .addGroup(jPanelKisiSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlbumSilAd)
                            .addComponent(jTextFieldAlbumSilAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelKisiSilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldAlbumSilBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAZ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Albümdeki Şarkilar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jTextAreaRehber.setColumns(20);
        jTextAreaRehber.setRows(5);
        jScrollPane4.setViewportView(jTextAreaRehber);

        jButtonCikis.setText("Çıkış");
        jButtonCikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAZLayout = new javax.swing.GroupLayout(jPanelAZ);
        jPanelAZ.setLayout(jPanelAZLayout);
        jPanelAZLayout.setHorizontalGroup(
            jPanelAZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(jButtonCikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAZLayout.setVerticalGroup(
            jPanelAZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAZLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCikis))
        );

        jButtonAZ.setText("A'dan Z'ye Sırala");
        jButtonAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAZActionPerformed(evt);
            }
        });

        jButtonZA.setText("Z'den A'ya Sırala");
        jButtonZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZAActionPerformed(evt);
            }
        });

        jPanelikiBin.setBackground(new java.awt.Color(255, 153, 153));
        jPanelikiBin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2000 Yılından Sonra Çıkmış Albümler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jTextArea2000.setColumns(20);
        jTextArea2000.setRows(5);
        jScrollPane2.setViewportView(jTextArea2000);

        jButton2000.setText("Yazdır");
        jButton2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2000ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelikiBinLayout = new javax.swing.GroupLayout(jPanelikiBin);
        jPanelikiBin.setLayout(jPanelikiBinLayout);
        jPanelikiBinLayout.setHorizontalGroup(
            jPanelikiBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelikiBinLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelikiBinLayout.setVerticalGroup(
            jPanelikiBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
            .addComponent(jButton2000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelAlbumEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                    .addComponent(jPanelAlbumBul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelKisiSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAZ, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonZA, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jPanelAZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelikiBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAZ, jButtonZA});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelAlbumEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelAlbumBul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAZ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonZA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelAZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelKisiSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelikiBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAZ, jButtonZA});

        jPanelAlbumEkle.getAccessibleContext().setAccessibleName("Albüm Ekle");
        jPanelAlbumEkle.getAccessibleContext().setAccessibleDescription("");
        jPanelAlbumBul.getAccessibleContext().setAccessibleName("Albüm Bul");
        jPanelKisiSil.getAccessibleContext().setAccessibleName("Albüm Sil");
        jPanelKisiSil.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DoublyLinkedList dosyaOku()/*rehber dosyası içindeki kişiler okunup
            rehber adlı doublylinkedlist'e atanır.*/
    {
       Scanner File = null;
        try
        {
            File = new Scanner(new FileInputStream("bilgiler.txt"));
        }
        catch (FileNotFoundException e){
            System.out.println("File not found.");
            System.exit(0);
        }
        
        
        DoublyLinkedList dvdBilgi = new DoublyLinkedList();
        
        
        while(File.hasNext())
        {
            
            String line = File.nextLine();
            StringTokenizer parcala = new StringTokenizer(line,",");
            String adSoyad = parcala.nextToken();
            String baslik = parcala.nextToken();
            String gecici = parcala.nextToken();
            gecici=gecici.replace(" ","");
            int cikisTarihi = Integer.valueOf(gecici);
            gecici = parcala.nextToken();
            gecici=gecici.replace(" ", "");
            int fiyat = Integer.valueOf(gecici);
            ArrayList<String> sarkilar = new ArrayList<>();
            
            while(parcala.hasMoreTokens())
            {
                String sarki = parcala.nextToken();
                sarkilar.add(sarki);               
            }
            
            DVD sanatci = new DVD(adSoyad,baslik,cikisTarihi,fiyat,sarkilar);
            dvdBilgi.elemanEkle(sanatci);   
        }
        return this.dvdBilgi;
    }
    public void dosyayiGüncelle(DoublyLinkedList dvdBilgi)
    {
        try
        {
            File dosya = new File("sakla.txt");
            FileWriter fw = new FileWriter(dosya,false);
            BufferedWriter yazdir = new BufferedWriter(fw);
            Node dugum = dvdBilgi.head;
            while(dugum!=null)
            {
                yazdir.write(dugum.getDVD().toString());
                dugum = dugum.getSonraki();
                yazdir.newLine();
            }
            yazdir.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"dosya bulunamadı.");
        }
    }
    private void jButtonAlbumEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlbumEkleActionPerformed
        /*bilgileri girilen kişi ilgili değişkenlere uygun bir biçimde atanıp
        oluşturulan doublylinkedlist e eklenir.*/
        String adSoyad = jTextFieldAlbumEkleAd.getText();
        String baslik = jTextFieldAlbumEkleAlbumAdi.getText();
        int cikisTarihi = Integer.parseInt(jTextFieldAlbumEkleTarih.getText());
        int fiyat =Integer.parseInt(jTextFieldAlbumEKleFiyat.getText());        
        String sarkilar = jTextFieldAlbumEkleSarkilar.getText();
        
        ArrayList<String> sarkiListesi = new ArrayList<>();
        StringTokenizer parcala = new StringTokenizer(sarkilar,",");
        while(parcala.hasMoreTokens())
        {
            String numara = parcala.nextToken();
            sarkiListesi.add(numara);
        }
        
        DVD dvd = new DVD(adSoyad,baslik,cikisTarihi,fiyat,sarkiListesi);
        dvdBilgi.elemanEkle(dvd);
        JOptionPane.showMessageDialog(null,adSoyad+" ALbümü listeye eklendi.");
        jTextFieldAlbumEkleAd.setText("");
        jTextFieldAlbumEkleSarkilar.setText("");
    }//GEN-LAST:event_jButtonAlbumEkleActionPerformed

    private void jButtonAlbumBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlbumBulActionPerformed
        String adSoyad = jTextFieldAlbumBul.getText(); /*girilen kişinin adı ve
        soyadını alır.*/
        dvdBilgi.elemanCagir(jTextAreaAlbumBilgi,adSoyad); /*girilen kişinin ad ve
        soyadına göre kişiyi bulur.*/
        jTextFieldAlbumBul.setText("");/*girilen kişinin bilgilerini ekrana 
        yazdırıldıktan sonra metin alanı boşaltılır. */
    }//GEN-LAST:event_jButtonAlbumBulActionPerformed

    private void jButtonKisiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKisiSilActionPerformed
        /*adı ve soyadı girilen kişinin bilgileri ilgili listeden çıkarılır.*/
        String adSoyad = jTextFieldAlbumSilAd.getText();
        String baslik = jTextFieldAlbumSilBaslik.getText();
        dvdBilgi.elemanSil(adSoyad,baslik);
        JOptionPane.showMessageDialog(null,adSoyad+" "
                + "Kişisinin "+baslik+" adlı dvdsi listeden çıkarıldı");
        
    }//GEN-LAST:event_jButtonKisiSilActionPerformed

    private void jButtonAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAZActionPerformed

        dvdBilgi.bastanYazdir(jTextAreaRehber); /*Oluşturulan doublylinkedlistin 
        elemanlarını alfabetik sıraya göre metin alanına yazdırır.*/
        
    }//GEN-LAST:event_jButtonAZActionPerformed

    private void jButtonZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZAActionPerformed
        dvdBilgi.sondanYazdir(jTextAreaRehber);/*Oluşturulan doublylinkedlistin
        elemanlarını Z'den A'ya doğru metin alanına yazdırır. yazdırır.*/
    }//GEN-LAST:event_jButtonZAActionPerformed

    private void jButtonCikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCikisActionPerformed
        dosyayiGüncelle(dvdBilgi);
        System.exit(0);
    }//GEN-LAST:event_jButtonCikisActionPerformed

    private void jTextFieldAlbumEkleAlbumAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlbumEkleAlbumAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlbumEkleAlbumAdiActionPerformed

    private void jTextFieldAlbumEKleFiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlbumEKleFiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlbumEKleFiyatActionPerformed

    private void jTextFieldAlbumEkleSarkilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlbumEkleSarkilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlbumEkleSarkilarActionPerformed

    private void jTextFieldAlbumSilBaslikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlbumSilBaslikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlbumSilBaslikActionPerformed

    private void jButton2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2000ActionPerformed
        dvdBilgi.ikibin(jTextArea2000);
    }//GEN-LAST:event_jButton2000ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dvdBilgi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dvdBilgi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dvdBilgi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dvdBilgi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dvdBilgi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2000;
    private javax.swing.JButton jButtonAZ;
    private javax.swing.JButton jButtonAlbumBul;
    private javax.swing.JButton jButtonAlbumEkle;
    private javax.swing.JButton jButtonCikis;
    private javax.swing.JButton jButtonKisiSil;
    private javax.swing.JButton jButtonZA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAlbumBul;
    private javax.swing.JLabel jLabelAlbumSilAd;
    private javax.swing.JLabel jLabelKisiEkleAciklama;
    private javax.swing.JLabel jLabelKisiEkleAd;
    private javax.swing.JLabel jLabelKisiEkleNumara;
    private javax.swing.JPanel jPanelAZ;
    private javax.swing.JPanel jPanelAlbumBul;
    private javax.swing.JPanel jPanelAlbumEkle;
    private javax.swing.JPanel jPanelKisiSil;
    private javax.swing.JPanel jPanelikiBin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2000;
    private javax.swing.JTextArea jTextAreaAlbumBilgi;
    private javax.swing.JTextArea jTextAreaRehber;
    private javax.swing.JTextField jTextFieldAlbumBul;
    private javax.swing.JTextField jTextFieldAlbumEKleFiyat;
    private javax.swing.JTextField jTextFieldAlbumEkleAd;
    private javax.swing.JTextField jTextFieldAlbumEkleAlbumAdi;
    private javax.swing.JTextField jTextFieldAlbumEkleSarkilar;
    private javax.swing.JTextField jTextFieldAlbumEkleTarih;
    private javax.swing.JTextField jTextFieldAlbumSilAd;
    private javax.swing.JTextField jTextFieldAlbumSilBaslik;
    // End of variables declaration//GEN-END:variables
}
