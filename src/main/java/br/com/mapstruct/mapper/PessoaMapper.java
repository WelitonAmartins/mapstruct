package br.com.mapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.mapstruct.dto.PessoaDTO;
import br.com.mapstruct.entities.Pessoa;

@Mapper
public interface PessoaMapper {

	PessoaMapper MAPPER = Mappers.getMapper(PessoaMapper.class);

	Pessoa converteDTOparaEntidade(PessoaDTO pessoaDTO);

	PessoaDTO converteEntidadeparaDTO(Pessoa pessoa);
	
	List<Pessoa> converteListaDTOparaEntidade(List<PessoaDTO> pessoaDTO);
}
