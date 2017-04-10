package dao.cliente;

import java.util.List;

import classe.cliente.Cliente;
import erro.cliente.ClienteException;

public class ClienteDao implements IClienteDao{

	public ClienteDao(){
		
	}
	
	@Override
	public void cadastar(Cliente c) throws ClienteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente c) throws ClienteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Integer codigo) throws ClienteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente pesquisarCodigo(Integer codigo) throws ClienteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente pesquisarNome(String nome) throws ClienteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente pesquisarCPF_CNPJ(String cpfcnpj) throws ClienteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente pesquisarTipo(char tipo) throws ClienteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listaTodos() throws ClienteException {
		// TODO Auto-generated method stub
		return null;
	}

}
