package org.dao.register;

import java.util.List;

import org.modelo.register.Register;

/* 
 * INTERFACE NOSE PROGRAMA SOLO SE AGREGA LOS METODOS A IMPLEMENTAR
 * */

public interface DaoRegister {
	
	public void addRegister(Register register);
	public List<Register> listRegister();
	public Register getRegisterById(int id);
	public void deleteRegister(int id);

}
