package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Fornecedor;
import com.example.demo.entities.Medicamento;
import com.example.demo.repositories.FornecedorRepository;
import com.example.demo.repositories.MedicamentoRepository;
@Service
public class FornecedorService {
	private final FornecedorRepository fornecedorRepository;

	@Autowired
	public FornecedorService(FornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
	}

	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}

	public Fornecedor buscarFornecedorPorId(Long id) {
		return fornecedorRepository.findById(id).orElse(null);
	}

	public List<Fornecedor> buscarTodosFornecedor() {
		return fornecedorRepository.findAll();
	}

	public void excluirFornecedor(Long id) {
		fornecedorRepository.deleteById(id);
	}

	public Fornecedor atualizarFornecedor(Long id, Fornecedor fornecedorAtualizado) {
		Optional<Fornecedor> fornecedorExistente = fornecedorRepository.findById(id);
		if (fornecedorExistente.isPresent()) {
			Fornecedor Fornecedor = fornecedorExistente.get();
			Fornecedor.setRazaoSocial(fornecedorAtualizado.getRazaoSocial());
			Fornecedor.setNomeFantasia(fornecedorAtualizado.getNomeFantasia());
			Fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
			Fornecedor.setEndereco(fornecedorAtualizado.getEndereco());
			Fornecedor.setFone(fornecedorAtualizado.getFone());
			Fornecedor.setEmail(fornecedorAtualizado.getEmail());
			Fornecedor.setInscricaoEstadual(fornecedorAtualizado.getCnpj());
			return fornecedorRepository.save(Fornecedor);
		} else {
			return null;
		}
	}

	public void medicamentoUsuario(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void deletarMedicamento(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void deletarFornecedor(Long id) {
		// TODO Auto-generated method stub
		
	}
}