/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MrbProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class MrbControllerProdutos extends AbstractTableModel {

    private List lstMrbProdutos;

    public void setList(List lstMrbProdutos) {
        this.lstMrbProdutos = lstMrbProdutos;
    }
    
    public MrbProdutos getBean(int rowIndex) {
        return (MrbProdutos) lstMrbProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstMrbProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MrbProdutos cliente = (MrbProdutos) lstMrbProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return cliente.getMrbIdProduto();
        } else if (columnIndex ==1) {
            return cliente.getMrbNomeProduto();        
        } else if (columnIndex ==2) {
            return cliente.getMrbPeso();
        } else if (columnIndex ==3) {
            return cliente.getMrbDataColheita();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Peso";
        } else if ( columnIndex == 3) {
            return "Data";
        } 
        return "";
    }
    
}
