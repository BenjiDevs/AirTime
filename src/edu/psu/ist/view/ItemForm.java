package edu.psu.ist.view;

import javax.swing.*;

public class ItemForm {
    private JTextField NameTextField;
    private JTextField CostTextField;
    private JComboBox CategoryComboBox;
    private JLabel NameLabel;
    private JLabel CategoryLabel;
    private JLabel CostLabel;

    public JTextField getNameTextField() {
        return NameTextField;
    }

    public JTextField getCostTextField() {
        return CostTextField;
    }

    public JComboBox getCategoryComboBox() {
        return CategoryComboBox;
    }

    public JLabel getNameLabel() {
        return NameLabel;
    }

    public JLabel getCategoryLabel() {
        return CategoryLabel;
    }

    public JLabel getCostLabel() {
        return CostLabel;
    }
}
