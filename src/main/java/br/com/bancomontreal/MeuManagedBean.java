package br.com.bancomontreal;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MeuManagedBean {

	private String nome = "Alexandre Gama";
	
	public String getNome() {
		return nome;
	}
	
}
