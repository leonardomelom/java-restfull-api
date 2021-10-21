package com.leonardo.osworks.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.osworks.domain.exception.NegocioException;
import com.leonardo.osworks.domain.model.Cliente;
import com.leonardo.osworks.domain.repository.ClienteRepository;

@Service
public class CadastroCliente {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		
		Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());
		
		if(clienteExistente != null && !clienteExistente.equals(cliente)) {
		throw new NegocioException("Já existe um cliente com este email");
		}
			return clienteRepository.save(cliente);
		
	}

		public void excluir(Long clienteId) {
			clienteRepository.deleteById(clienteId);
		}
}
