package br.com.bancomontreal.usuario;

import java.util.HashMap;
import java.util.Map;

public class HashMapUsuariosDao implements Usuarios {

	private Map<Long, Usuario> database = new HashMap<>();
	
	public HashMapUsuariosDao() {
		database.put(1L, new Usuario(1L, "Alexandre Gama", "alexandregama", "123456"));
		database.put(2L, new Usuario(2L, "Fernando Gama", "fernandogama", "123456"));
	}
	
	@Override
	public void cadastra(Usuario usuario) {
		Long id = database.keySet().stream().max(Long::compareTo).get() + 1;
		usuario.setId(id);
		database.put(id, usuario);
		
		System.out.println("Usuario cadastrado: " + usuario);
	}

}
