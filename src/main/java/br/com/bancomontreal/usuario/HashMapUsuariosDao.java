package br.com.bancomontreal.usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;

@ApplicationScoped
public class HashMapUsuariosDao implements Usuarios {

	private static Map<Long, Usuario> database = new HashMap<>();
	
	static {
		System.out.println("Criando database");
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

	@Override
	public List<Usuario> listaTodos() {
		List<Usuario> lista = new ArrayList<>();
		database.keySet().stream().forEach(id -> lista.add(database.get(id)));
		
		return lista;
	}

	@Override
	public void remove(Usuario usuario) {
		database.remove(usuario.getId());
	}

}
