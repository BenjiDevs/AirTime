package edu.psu.ist.view;

import edu.psu.ist.controller.ListController;

import javax.swing.*;

public class ListView extends JFrame {

    private ListController listController;
    private JPanel pnlRoot;
    private JPanel pnlTable;
    private JPanel pnlButtons;
    private JScrollPane scrollPane;
    private JTable tblItem;
    private JButton btnNew;
    private JButton btnDetail;
    private JButton btnDone;
    private JButton btnTransaction;
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;

    /*
    public void createListComponents() {
        this.add(pnlRoot);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Item List Screen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Set the table model for tblItem using the ItemTableModel from the ListController
        tblItem.setModel(listController.getItemTableModel());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

     */


    public ListController getListController() {
        return listController;
    }

    public void setListController(ListController listController) {
        this.listController = listController;
    }

    public JPanel getPnlRoot() {
        return pnlRoot;
    }

    public void setPnlRoot(JPanel pnlRoot) {
        this.pnlRoot = pnlRoot;
    }

    public JPanel getPnlTable() {
        return pnlTable;
    }

    public void setPnlTable(JPanel pnlTable) {
        this.pnlTable = pnlTable;
    }

    public JPanel getPnlButtons() {
        return pnlButtons;
    }

    public void setPnlButtons(JPanel pnlButtons) {
        this.pnlButtons = pnlButtons;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JTable getTblItem() {
        return tblItem;
    }

    public void setTblItem(JTable tblItem) {
        this.tblItem = tblItem;
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public void setBtnNew(JButton btnNew) {
        this.btnNew = btnNew;
    }

    public JButton getBtnDetail() {
        return btnDetail;
    }

    public void setBtnDetail(JButton btnDetail) {
        this.btnDetail = btnDetail;
    }

    public JButton getBtnDone() {
        return btnDone;
    }

    public JButton getBtnTransaction() {
        return btnTransaction;
    }

    public void setBtnDone(JButton btnDone) {
        this.btnDone = btnDone;
    }

    public ListView(ListController listController) {
        this.listController = listController;
        createListComponents();
    }


    public void createListComponents() {
        this.add(pnlRoot);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Item List Screen");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        tblItem.setModel(listController.getItemTableModel());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    }


}
