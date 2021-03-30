/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter;
import javax.swing.*;
import java.awt.Color;
/**
 *
 * @author Maggie
 */
public class CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CurrencyConverter clsCC = new CurrencyConverter();
        clsCC.mForm();
        clsCC.mLoadMenu();
        clsCC.mMenuItemsEvents();
        clsCC.mPanel();
        clsCC.mButtonSettings();
        clsCC.mButtonEvent();
        clsCC.mRadioSettings();
        clsCC.mRadioEvents();
        clsCC.mTextFieldSettings();
        clsCC.mLabelSettings();
    }
    
    JFrame frmMain = new JFrame();
    JMenuBar mbMenuBar = new JMenuBar();
    JMenu mnuFile = new JMenu("File");
    JMenuItem miInfo = new JMenuItem("Info");
    JMenuItem miExit = new JMenuItem("Exit");
    JPanel pnlPanel = new JPanel();
    JButton btnConvert = new JButton();
    JRadioButton rbRandToDollar = new JRadioButton();
    JRadioButton rbDollarToRand = new JRadioButton();
    JTextField txtInput = new JTextField();
    JTextField txtOutput = new JTextField();
    JLabel lblEqual = new JLabel();
    JLabel lblOutput1 = new JLabel();
    JLabel lblOutput2 = new JLabel();
    JButton btnClear = new JButton();
    
    public void mForm()
    {
        frmMain.show();
        frmMain.setTitle("Currency Converter");
        frmMain.setLayout(null);
        frmMain.setSize(300, 220);
        frmMain.setLocationRelativeTo(null);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setResizable(false);
    }
    
    public void mLoadMenu()
    {
        mbMenuBar.add(mnuFile);
        mnuFile.add(miInfo);
        mnuFile.add(miExit);
        mbMenuBar.setBackground(Color.white);
        miInfo.setBackground(Color.white);
        miExit.setBackground(Color.lightGray);
        
        frmMain.setJMenuBar(mbMenuBar);
    }
    
    private void mMenuItemsEvents()
    {
        miInfo.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae)
            {
                JOptionPane.showMessageDialog(null, "This program Converts Dollar to Rand or Vice Versa");
            }
        }
        );
        
        miExit.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae)
            {
                System.exit(0);
            }
        }
        );
    }
    
    private void mPanel()
    {
        pnlPanel.setLayout(null);
        pnlPanel.add(btnConvert);
        pnlPanel.add(txtInput);
        pnlPanel.add(lblEqual);
        pnlPanel.add(txtOutput);
        pnlPanel.add(lblOutput1);
        pnlPanel.add(lblOutput2);
        pnlPanel.add(rbRandToDollar);
        pnlPanel.add(rbDollarToRand);
        pnlPanel.add(btnClear);
    }
    
    private void mButtonSettings()
    {
        btnConvert.show();
        btnConvert.setText("Convert");
        btnConvert.setSize(90, 23);
        btnConvert.setLocation(100, 110);
        btnConvert.setBackground(Color.white);
        frmMain.add(btnConvert);
        
        btnClear.show();
        btnClear.setText("C");
        btnClear.setSize(43, 19);
        btnClear.setLocation(240, 140);
        btnClear.setBackground(Color.white);
        frmMain.add(btnClear);
    }
    
    private void mButtonEvent()
    {
        btnConvert.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae)
            {
                if(rbRandToDollar.isSelected())
                {
                    String strInput;
                    int intInput;
                    double dblOutput;
                    double dblCurrency = 15.00;
                    
                    strInput = txtInput.getText();
                    intInput = Integer.parseInt(strInput);
                    lblOutput1.setText("R");
                    lblOutput2.setText("$");
                    dblOutput = intInput / dblCurrency;
                    
                    txtOutput.setText(String.valueOf(dblOutput));
                }
                
                else if(rbDollarToRand.isSelected())
                {
                    String strInput;
                    int intInput;
                    double dblOutput;
                    double dblCurrency = 15.00;
                    
                    strInput = txtInput.getText();
                    intInput = Integer.parseInt(strInput);
                    lblOutput1.setText("$");
                    lblOutput2.setText("R");
                    dblOutput = intInput * dblCurrency;
                    
                    txtOutput.setText(String.valueOf(dblOutput));
                }
            }
        }
        );
        
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae)
            {
                txtInput.setText("");
                txtOutput.setText("");
                lblOutput1.setText("");
                lblOutput2.setText("");
            }
        }
        );
    }
    
    private void mRadioSettings()
    {
        rbRandToDollar.show();
        rbRandToDollar.setText("Rand To Dollar");
        rbRandToDollar.setSize(110, 23);
        rbRandToDollar.setLocation(20, 20);
        rbRandToDollar.setBackground(Color.white);
        frmMain.add(rbRandToDollar);
        
        rbDollarToRand.show();
        rbDollarToRand.setText("Dollar To Rand");
        rbDollarToRand.setSize(110, 23);
        rbDollarToRand.setLocation(167, 20);
        rbDollarToRand.setBackground(Color.white);
        frmMain.add(rbDollarToRand);
    }
    
    private void mRadioEvents()
    {
        rbRandToDollar.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae)
            {
                rbRandToDollar.setSelected(true);
                rbDollarToRand.setSelected(false);
            }
        }
        );
        
        rbDollarToRand.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae)
            {
                rbRandToDollar.setSelected(false);
                rbDollarToRand.setSelected(true);
            }
        }
        );
    }
    
    private void mTextFieldSettings()
    {
        txtInput.show();
        txtInput.setText("");
        txtInput.setSize(90, 23);
        txtInput.setLocation(40, 70);
        frmMain.add(txtInput);
        
        txtOutput.show();
        txtOutput.setText("");
        txtOutput.setSize(90, 23);
        txtOutput.setLocation(175, 70);
        frmMain.add(txtOutput);
    }
    
    private void mLabelSettings()
    {
        lblEqual.show();
        lblEqual.setText("=");
        lblEqual.setSize(20, 15);
        lblEqual.setLocation(140, 75);
        frmMain.add(lblEqual);
        
        lblOutput1.show();
        lblOutput1.setText(" ");
        lblOutput1.setSize(20, 15);
        lblOutput1.setLocation(20, 75);
        frmMain.add(lblOutput1);
        
        lblOutput2.show();
        lblOutput2.setText(" ");
        lblOutput2.setSize(20, 15);
        lblOutput2.setLocation(155, 75);
        frmMain.add(lblOutput2);
    }
}
