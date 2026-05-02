/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author ASUS
 */

import javax.swing.*;
import java.awt.*;

public class latihan1 extends JFrame {
    
    private JMenuBar MenuBar = new JMenuBar();

    private JMenu MenuMaster = new JMenu("Master Data");
    private JMenuItem MenuBarang = new JMenuItem("Barang"),
            MenuCustomer = new JMenuItem("Customer"),
            MenuUserAccount = new JMenuItem("User Account");

    private JMenu MenuTransaksi = new JMenu("Transaksi");
    private JMenuItem MenuPenjualan = new JMenuItem("Penjualan"),
            MenuPembelian = new JMenuItem("Pembelian");

    private JMenu MenuFile = new JMenu("File");
    private JMenuItem MenuExit = new JMenuItem("Exit");

    Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    public latihan1() {
        super("Membuat Menu");

        setSize(350, 300);
        setLocation(dimensi.width / 2 - getWidth() / 2,
                dimensi.height / 2 - getHeight() / 2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Master
        MenuMaster.add(MenuBarang);
        MenuMaster.add(MenuCustomer);
        MenuMaster.addSeparator();
        MenuMaster.add(MenuUserAccount);

        // Transaksi
        MenuTransaksi.add(MenuPenjualan);
        MenuTransaksi.add(MenuPembelian);

        // File
        MenuFile.add(MenuExit);

        // Exit action
        MenuExit.addActionListener(e -> System.exit(0));

        // Tambahkan ke MenuBar
        MenuBar.add(MenuMaster);
        MenuBar.add(MenuTransaksi);
        MenuBar.add(MenuFile);

        setJMenuBar(MenuBar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new latihan1();
    }
}
