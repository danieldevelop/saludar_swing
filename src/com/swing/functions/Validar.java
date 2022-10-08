package com.swing.functions;

public class Validar {

	public boolean camposVacios(String... fields) {
		for (String field : fields) {
			if (field.equals(""))
				return true;
		}
		return false;
	}

}
