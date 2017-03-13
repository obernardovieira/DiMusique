/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obernardovieira.vucor.frames;

import javax.swing.JFrame;
import obernardovieira.vucor.MainWindows;
import obernardovieira.vucor.core.Basic;

/**
 *
 * @author user
 */
public class FrameNoData extends javax.swing.JPanel {

    /**
     * Creates new form FrameNoData
     */
    private final MainWindows window;
    public FrameNoData(JFrame window)
    {
        initComponents();
        this.window = (MainWindows)window;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_above = new javax.swing.JPanel();
        label_no_playlists = new javax.swing.JLabel();
        panel_below = new javax.swing.JPanel();
        button_cf_playlist = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        panel_above.setMaximumSize(new java.awt.Dimension(530, 50));
        panel_above.setMinimumSize(new java.awt.Dimension(530, 50));
        panel_above.setPreferredSize(new java.awt.Dimension(530, 50));

        label_no_playlists.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        label_no_playlists.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_no_playlists.setText("There is no playlists yet!");
        label_no_playlists.setMaximumSize(new java.awt.Dimension(530, 50));
        label_no_playlists.setMinimumSize(new java.awt.Dimension(530, 50));
        label_no_playlists.setPreferredSize(new java.awt.Dimension(530, 50));

        javax.swing.GroupLayout panel_aboveLayout = new javax.swing.GroupLayout(panel_above);
        panel_above.setLayout(panel_aboveLayout);
        panel_aboveLayout.setHorizontalGroup(
            panel_aboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_aboveLayout.createSequentialGroup()
                .addComponent(label_no_playlists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_aboveLayout.setVerticalGroup(
            panel_aboveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_aboveLayout.createSequentialGroup()
                .addComponent(label_no_playlists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(panel_above);

        panel_below.setMaximumSize(new java.awt.Dimension(530, 50));
        panel_below.setMinimumSize(new java.awt.Dimension(530, 50));

        button_cf_playlist.setText("Create first playlist");
        button_cf_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cf_playlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_belowLayout = new javax.swing.GroupLayout(panel_below);
        panel_below.setLayout(panel_belowLayout);
        panel_belowLayout.setHorizontalGroup(
            panel_belowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_belowLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(button_cf_playlist)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        panel_belowLayout.setVerticalGroup(
            panel_belowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_belowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_cf_playlist)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(panel_below);
    }// </editor-fold>//GEN-END:initComponents

    private void button_cf_playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cf_playlistActionPerformed
        // TODO add your handling code here:
        window.setViewer(Basic.frameNewPlaylist);
    }//GEN-LAST:event_button_cf_playlistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cf_playlist;
    private javax.swing.JLabel label_no_playlists;
    private javax.swing.JPanel panel_above;
    private javax.swing.JPanel panel_below;
    // End of variables declaration//GEN-END:variables
}