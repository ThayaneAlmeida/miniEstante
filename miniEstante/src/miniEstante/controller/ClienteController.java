package miniEstante.controller;

import java.util.ArrayList;

import miniEstante.model.Cliente;
import miniEstante.repository.ClienteRepository;

public class ClienteController implements ClienteRepository {
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	@Override
	public void cadastrar(Cliente cliente) {
		listaClientes.add(cliente);
		System.out.println("O cliente foi cadastrado!");

	}

	@Override
	public void atualizar(Cliente cliente) {
		var buscaCliente = buscarClienteCollection(cliente.getIdCliente());

		if (buscaCliente != null) {
			listaClientes.set(listaClientes.indexOf(buscaCliente), cliente);
			System.out.println("\nO cliente " + cliente.getIdCliente() + " foi atualizado!");

		}

		else {
			System.out.println("\nO cliente " + cliente.getIdCliente() + " nao foi encontrado!");
		}
	}

	@Override
	public void procurarCliente(int idCliente) {
		var cliente = buscarClienteCollection(idCliente);

		if (cliente != null)
			cliente.visualizar();
		else
			System.out.println("\nO cliente " + idCliente + " nao foi encontrado!");

	}

	@Override
	public void listarClientes() {
		for (var cliente : listaClientes)
			cliente.visualizar();

	}

	@Override
	public void deletarCliente(String nomeCliente) {
		var cliente = buscarClienteNome(nomeCliente);

		if (cliente != null) {
			if (listaClientes.remove(cliente) == true)
				System.out.println("\nO cliente " + nomeCliente + " foi deletado!");
		} else
			System.out.println("\nO cliente " + nomeCliente + " nao foi encontrado!");

	}

	public Cliente buscarClienteCollection(int idCliente) {
		for (var cliente : listaClientes) {
			if (cliente.getIdCliente() == idCliente)
				return cliente;
		}
		return null;
	}

	public Cliente buscarClienteNome(String nomeCliente) {
		for (var cliente : listaClientes) {
			if (cliente.getNome().equalsIgnoreCase(nomeCliente))
				return cliente;
		}
		return null;
	}

	public int gerarIdCliente() {
		return listaClientes.size() + 1;
	}

	@Override
	public void deletarCliente(int idCliente) {
		// TODO Auto-generated method stub
		
	}
}