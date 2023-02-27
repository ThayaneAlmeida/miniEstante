package miniEstante.repository;

import miniEstante.model.Cliente;

public interface ClienteRepository {

	public void cadastrar(Cliente cliente);

	public void atualizar(Cliente cliente);

	public void procurarCliente(int idCliente);

	public void listarClientes();

	public void deletarCliente(int idCliente);

	void deletarCliente(String nomeCliente);


}
