package br.com.bancomontreal.usuario;

import java.util.List;

public interface Usuarios {

	void cadastra(Usuario usuario);

	List<Usuario> listaTodos();

	void remove(Usuario usuario);

}
