/*
 * Copyright (C) 2015 markiewb
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package de.markiewb.netbeans.plugins.outline.options;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.awt.HtmlBrowser;
import org.openide.util.Exceptions;

@org.netbeans.spi.options.OptionsPanelController.Keywords(location="Advanced", tabTitle="Code outline", keywords={"code outline"})
public final class CodeoutlineOptionsPanel extends javax.swing.JPanel {

    private final CodeoutlineOptionsPanelController controller;

    CodeoutlineOptionsPanel(final CodeoutlineOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
        spWidth.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                controller.changed();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbWidth = new javax.swing.JLabel();
        spWidth = new javax.swing.JSpinner();
        btnVisitHomePage = new javax.swing.JLabel();
        btnDonate = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(lbWidth, org.openide.util.NbBundle.getMessage(CodeoutlineOptionsPanel.class, "CodeoutlineOptionsPanel.lbWidth.text")); // NOI18N

        spWidth.setModel(new javax.swing.SpinnerNumberModel(90, 50, 500, 10));

        org.openide.awt.Mnemonics.setLocalizedText(btnVisitHomePage, org.openide.util.NbBundle.getMessage(CodeoutlineOptionsPanel.class, "CodeoutlineOptionsPanel.btnVisitHomePage.text")); // NOI18N
        btnVisitHomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisitHomePageMouseClicked(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(btnDonate, org.openide.util.NbBundle.getMessage(CodeoutlineOptionsPanel.class, "CodeoutlineOptionsPanel.btnDonate.text")); // NOI18N
        btnDonate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDonateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbWidth)
                .addGap(18, 18, 18)
                .addComponent(spWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVisitHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWidth)
                    .addComponent(spWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnVisitHomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisitHomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisitHomePageMouseClicked
        try {
            HtmlBrowser.URLDisplayer.getDefault().showURLExternal(new URL("https://github.com/markiewb/nb-codeoutline/"));
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_btnVisitHomePageMouseClicked

    private void btnDonateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDonateMouseClicked
        try {
            HtmlBrowser.URLDisplayer.getDefault().showURLExternal(new URL("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=K4CMP92RZELE2"));
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_btnDonateMouseClicked

    void load() {
        spWidth.setValue(Options.getWidth());
    }

    void store() {
        Options.setWidth((Integer)spWidth.getValue());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDonate;
    private javax.swing.JLabel btnVisitHomePage;
    private javax.swing.JLabel lbWidth;
    private javax.swing.JSpinner spWidth;
    // End of variables declaration//GEN-END:variables
}