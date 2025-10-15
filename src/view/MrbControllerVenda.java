/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MrbVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class MrbControllerVenda extends AbstractTableModel {

    private List lstMrbVenda;

    public void setList(List lstMrbVenda) {
        this.lstMrbVenda = lstMrbVenda;
    }
    
    public MrbVenda getBean(int rowIndex) {
        return (MrbVenda) lstMrbVenda.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstMrbVenda.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MrbVenda cliente = (MrbVenda) lstMrbVenda.get( rowIndex);
        if ( columnIndex == 0 ){
            return cliente.getMrbIdVenda();
        } else if (columnIndex ==1) {
            return cliente.getMrbCliente();        
        } else if (columnIndex ==2) {
            return cliente.getMrbPagamento();
        } else if (columnIndex ==3) {
            return cliente.getMrbDataVenda();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Cliente";         
        } else if ( columnIndex == 2) {
            return "Pagamento";
        } else if ( columnIndex == 3) {
            return "Data";
        } 
        return "";
    }
    
}
