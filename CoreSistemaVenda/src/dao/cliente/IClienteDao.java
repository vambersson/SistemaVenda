package dao.cliente;

import java.util.List;

import classe.cliente.Cliente;
import erro.cliente.ClienteException;

public interface IClienteDao {
	
	/*
	 * Esse metodo cadastra os clientes aptos para cadastros
	 * @param Cliente
	 * @Autor vamberssons
	 */
	public void cadastar(Cliente c) throws ClienteException;
	
	public void alterar(Cliente c)  throws ClienteException;
	
	public void excluir(Integer codigo)  throws ClienteException;
	
	public Cliente pesquisarCodigo(Integer codigo)  throws ClienteException;
	
	public Cliente pesquisarNome(String nome)  throws ClienteException;
	
	public Cliente pesquisarCPF_CNPJ(String cpfcnpj)  throws ClienteException;
	
	public Cliente pesquisarTipo(char tipo)  throws ClienteException;
	
	public List<Cliente> listaTodos() throws ClienteException;
	

}
