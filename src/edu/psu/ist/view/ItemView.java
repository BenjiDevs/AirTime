package edu.psu.ist.view;

import edu.psu.ist.controller.ItemController;
import edu.psu.ist.model.Item;
import edu.psu.ist.model.ItemCategory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Locale;

import static edu.psu.ist.model.ItemCategory.FOOD;

public class ItemView {
    private JPanel pnlItem = new JPanel();
    private JTextField NameTextField;
    private JTextField CostTextField;
    private JComboBox CategoryComboBox;
    private JLabel NameLabel;
    private JLabel CategoryLabel;
    private JLabel CostLabel;
    private JButton addButton;
    private JButton previousButton;
    private JButton nextButton;

    private JLabel errorDisplay;
    private JPanel myPanel;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton updateButton;
    private JButton quitButton;
    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }
    public void setPreviousButton(JButton previousButton) {
        this.previousButton = previousButton;
    }
    public void setNextButton(JButton nextButton) {
        this.nextButton = nextButton;
    }
    public void setErrorDisplay(JLabel errorDisplay) {
        this.errorDisplay = errorDisplay;
    }
    public JPanel getMyPanel() {
        return myPanel;
    }

    public void setMyPanel(JPanel myPanel) {
        this.myPanel = myPanel;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JButton deleteButton) {
        this.deleteButton = deleteButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JButton getUpdateButton() {
        return updateButton;
    }

    public void setUpdateButton(JButton updateButton) {
        this.updateButton = updateButton;
    }

    public JButton getQuitButton() {
        return quitButton;
    }

    public void setQuitButton(JButton quitButton) {
        this.quitButton = quitButton;
    }

    public JLabel getErrorDisplay() {
        return errorDisplay;
    }

    private ItemView itemView;
    private ItemController itemController;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;
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

    public void setNameTextField(JTextField nameTextField) {
        NameTextField = nameTextField;
    }

    public void setCostTextField(JTextField costTextField) {
        CostTextField = costTextField;
    }

    public void setCategoryComboBox(JComboBox categoryComboBox) {
        CategoryComboBox = categoryComboBox;
    }

    public void setNameLabel(JLabel nameLabel) {
        NameLabel = nameLabel;
    }

    public void setCategoryLabel(JLabel categoryLabel) {
        CategoryLabel = categoryLabel;
    }

    public void setCostLabel(JLabel costLabel) {
        CostLabel = costLabel;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getPreviousButton() {
        return previousButton;
    }

    public JButton getNextButton() {
        return nextButton;
    }

    public ItemView getItemView() {
        return itemView;
    }

    public void setItemView(ItemView itemView) {
        this.itemView = itemView;
    }

    public ItemController getItemController() {
        return itemController;
    }

    public void setItemController(ItemController itemController) {
        this.itemController = itemController;
    }

    JFrame frame = new JFrame();

    public void createComponents() {
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Item GUI Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(myPanel); // Assuming pnlItem is a valid component.
        this.CategoryComboBox.setModel(new DefaultComboBoxModel(Locale.Category.values())); // Assuming CategoryComboBox is a valid JComboBox.
        frame.setVisible(true);
    }


    public ItemView(ItemController itemController) {
        this.itemController = itemController;
        createComponents();
    }

    public Item createItem() {
        String name = getNameTextField().getText().trim();
        ItemCategory category = (ItemCategory) CategoryComboBox.getSelectedItem();
        String strCost = getCostLabel().getText();
        double cost = 0;
        try {
            cost = Double.parseDouble(strCost);
        } catch (NumberFormatException e) {
            this.errorDisplay.setText("PRICE FIELD IS EMPTY, can not create a new item");
            return null;
        }
        Item item = new Item(name, category, cost);
        return item;
    }

    public void displayItem(@NotNull Item item) {
        this.NameTextField.setText(item.getItemName());
        this.CategoryComboBox.setSelectedItem(item.getItemCategory());
        this.CostTextField.setText(String.valueOf(item.getCost()));
    }

    public void clearFields() {
        this.NameTextField.setText("");
        this.CategoryComboBox.setSelectedItem(FOOD);
        this.CostTextField.setText("");
    }

    public void setDisplayMessage(String m) {this.errorDisplay.setText(m);}
}
