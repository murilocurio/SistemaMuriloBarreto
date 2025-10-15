/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MrbPagamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class MrbControllerPagamento extends AbstractTableModel {

    private List lstMrbPagamento;

    public void setList(List lstMrbPagamento) {
        this.lstMrbPagamento = lstMrbPagamento;
    }
    
    public MrbPagamento getBean(int rowIndex) {
        return (MrbPagamento) lstMrbPagamento.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstMrbPagamento.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MrbPagamento cliente = (MrbPagamento) lstMrbPagamento.get( rowIndex);
        if ( columnIndex == 0 ){
            return cliente.getMrbIdPagamento();
        } else if (columnIndex ==1) {
            return cliente.getMrbValorPago();        
        } else if (columnIndex ==2) {
            return cliente.getMrbConfirmacao();
        } else if (columnIndex ==3) {
            return cliente.getMrbCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Valor Pago";         
        } else if ( columnIndex == 2) {
            return "Confimração";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
