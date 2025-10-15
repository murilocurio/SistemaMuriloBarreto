/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MrbCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class MrbControllerClientes extends AbstractTableModel {

    private List lstMrbCliente;

    public void setList(List lstMrbCliente) {
        this.lstMrbCliente = lstMrbCliente;
    }
    
    public MrbCliente getBean(int rowIndex) {
        return (MrbCliente) lstMrbCliente.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstMrbCliente.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MrbCliente cliente = (MrbCliente) lstMrbCliente.get( rowIndex);
        if ( columnIndex == 0 ){
            return cliente.getMrbIdCliente();
        } else if (columnIndex ==1) {
            return cliente.getMrbNome();        
        } else if (columnIndex ==2) {
            return cliente.getMrbCelular();
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
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Celular";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
