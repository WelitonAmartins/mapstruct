package br.com.mapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.mapstruct.dto.CategoriaDTO;
import br.com.mapstruct.entities.Categoria;

@Mapper(componentModel="spring")
public interface CategoriaMapper {
	
	//CategoriaMapper MAPPERs = Mappers.getMapper(CategoriaMapper.class);
	
	List<CategoriaDTO> converteListaDeEntidadeParaDTO(List<Categoria> cat);

	
		@Mapping(target="id", source="catDto.id")
		@Mapping(target="nome", source ="catDto.nomeProduto")
		@Mapping(target="produto", source="catDto.produto")
		@Mapping(target="custo", source="catDto.valor")
	Categoria converteDTOparaEntidade(CategoriaDTO catDto);
	

		@Mapping(target="id", source="cat.id")
		@Mapping(target="nomeProduto", source="cat.nome")
		@Mapping(target="produto", source="cat.produto")
		@Mapping(target="valor", source="cat.custo")
	CategoriaDTO converteEntidadeParaDTO(Categoria cat);



}
