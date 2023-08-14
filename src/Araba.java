import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ArabaGUI extends JFrame {
    private final JTextField markaField;
    private final JTextField renkField;
    private final JTextField vitesField;
    private final JTextField aracdurumuField;
    private final JTextField kmField;
    private final JTextField kasatipiField;
    private final JTextField motorhacmiField;
    private final JTextField cekisField;
    private final JCheckBox takasliCheckbox;
    private final JCheckBox degisenparcaCheckbox;
    private final JCheckBox hasarkayitiCheckbox;

    public ArabaGUI() {
        setTitle("Araba Bilgi Girişi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(new GridLayout(17, 2));

        add(new JLabel("Araba Markası:"));
        markaField = new JTextField();
        add(markaField);

        add(new JLabel("Araba Rengi:"));
        renkField = new JTextField();
        add(renkField);

        add(new JLabel("Araba Modeli:"));
        JTextField modelField = new JTextField();
        add(modelField);

        add(new JLabel("Beygir Gücü:"));
        JTextField beygirgucuField = new JTextField();
        add(beygirgucuField);

        add(new JLabel("Yakıt Türü:"));
        JTextField yakitturuField = new JTextField();
        add(yakitturuField);

        add(new JLabel("Vites:"));
        vitesField = new JTextField();
        add(vitesField);

        add(new JLabel("Araç Durumu:"));
        aracdurumuField = new JTextField();
        add(aracdurumuField);

        add(new JLabel("Km:"));
        kmField = new JTextField();
        add(kmField);

        add(new JLabel("Kasa Tipi:"));
        kasatipiField = new JTextField();
        add(kasatipiField);

        add(new JLabel("Motor Hacmi:"));
        motorhacmiField = new JTextField();
        add(motorhacmiField);

        add(new JLabel("Çekiş Bilgisi:"));
        cekisField = new JTextField();
        add(cekisField);

        add(new JLabel("Takas Durumu:"));
        takasliCheckbox = new JCheckBox();
        add(takasliCheckbox);

        add(new JLabel("Değişen Parça:"));
        degisenparcaCheckbox = new JCheckBox();
        add(degisenparcaCheckbox);

        add(new JLabel("Hasar Kaydı:"));
        hasarkayitiCheckbox = new JCheckBox();
        add(hasarkayitiCheckbox);


        JButton kaydetButton = new JButton("Kaydet");
        kaydetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String marka = markaField.getText();
                String renk = renkField.getText();
                // Diğer alanlardaki verileri de alın.

                // Verileri kullanarak Araba nesnesi oluşturabilirsiniz.
                Araba araba = new Araba();
                araba.marka = marka;
                araba.renk = renk;
                // Diğer özellikleri de Araba nesnesine atayın.

                // Verileri işledikten sonra kullanıcıya bilgi verebilirsiniz.
                JOptionPane.showMessageDialog(ArabaGUI.this, "Araba bilgileri kaydedildi!");
            }
        });
        add(kaydetButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ArabaGUI();
            }
        });
    }
}

class Araba {
    String marka;
    String model;
    String renk;
    String beygirgucu;
    String yil;
    String yakitturu;
    String vites;
    String aracdurumu;
    String km;
    String kasatipi;
    String motorhacmi;
    String cekis;
    String takasli;
    String degisenparca;
    String hasarkayiti;
}
