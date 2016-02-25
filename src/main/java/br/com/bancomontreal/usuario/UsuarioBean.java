package br.com.bancomontreal.usuario;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	
	private Usuarios usuarios = new HashMapUsuariosDao();
	
	private List<Usuario> listaDeUsuarios;
	
	public void salva() {
		usuarios.cadastra(usuario);
		usuario = new Usuario();
	}
	
	public List<Usuario> getListaDeUsuarios() {
		if (listaDeUsuarios == null) {
			listaDeUsuarios = usuarios.listaTodos();
		}
		return listaDeUsuarios;
	}

	public void remove() {
		System.out.println("Removendo o usuario: " + usuario);
		usuarios.remove(usuario);
		listaDeUsuarios = null;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
