/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MrbUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class MrbControllerUsuarios extends AbstractTableModel {

    private List lstMrbUsuario;

    public void setList(List lstMrbUsuario) {
        this.lstMrbUsuario = lstMrbUsuario;
    }
    
    public MrbUsuario getBean(int rowIndex) {
        return (MrbUsuario) lstMrbUsuario.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstMrbUsuario.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MrbUsuario usuarios = (MrbUsuario) lstMrbUsuario.get( rowIndex);
        if ( columnIndex == 0 ){
            return usuarios.getMrbIdUsuario();
        } else if (columnIndex ==1) {
            return usuarios.getMrbNome();        
        } else if (columnIndex ==2) {
            return usuarios.getMrbApelido();
        } else if (columnIndex ==3) {
            return usuarios.getMrbCpf();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
