/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Dokter;
import Model.RumahSakit;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author jarkom
 */
public class TambahDokterDialog extends JDialog implements ActionListener {

    private JLabel namaLabel;
    private JTextField namaText;
    private JLabel nomorPegawaiLabel;
    private JTextField nomorPegawaiText;
    private JToggleButton tambahButton;
    private JLabel tambahDokterLabel;

    public TambahDokterDialog(Frame parent, boolean modal) {
        super(parent, modal);
        setSize(400, 400);
        initComponents();

    }

    private void initComponents() {
        this.setLayout(null);

        namaLabel = new JLabel("Nama ");
        namaLabel.setBounds(20, 40, 220, 25);
        this.add(namaLabel);

        nomorPegawaiLabel = new JLabel("Nomor Pegawai ");
        nomorPegawaiLabel.setBounds(20, 90, 220, 25);
        this.add(nomorPegawaiLabel);

        namaText = new JTextField();
        namaText.setBounds(120, 40, 200, 25);
        this.add(namaText);

        nomorPegawaiText = new JTextField();
        nomorPegawaiText.setBounds(120, 90, 200, 25);
        this.add(nomorPegawaiText);

        tambahDokterLabel = new JLabel("FORMULIR PENDAFTARAN ");
        tambahDokterLabel.setBounds(120, 10, 200, 25);
        this.add(tambahDokterLabel);

        tambahButton = new JToggleButton();
        tambahButton.setText("Tambah");
        tambahButton.setBounds(160, 160, 80, 30);
        tambahButton.addActionListener((ActionListener) this);

        this.add(tambahButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
            Dokter dokter = new Dokter();
            dokter.setNama(namaText.getText());
            dokter.setNomorPegawai(nomorPegawaiText.getText());
            FrameUtama.rumahSakit.tambahDokter(dokter);
            DokterTableModel dokterModel = new DokterTableModel(FrameUtama.rumahSakit.getDaftarDokter());
            FrameUtama.lihatDokter.setDokterTableModel(dokterModel);
            FrameUtama.lihatDokter.updateTable();
            this.dispose();
        }
    }

}
