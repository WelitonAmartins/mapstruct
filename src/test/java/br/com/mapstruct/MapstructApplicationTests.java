package br.com.mapstruct;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.mapstruct.dto.CategoriaDTO;
import br.com.mapstruct.dto.PessoaDTO;
import br.com.mapstruct.entities.Categoria;
import br.com.mapstruct.entities.Pessoa;
import br.com.mapstruct.mapper.CategoriaMapper;
import br.com.mapstruct.mapper.PessoaMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapstructApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	
	
	@Autowired
	private CategoriaMapper mapper;

	@Test
	public void testarDTOParaEntidade() {

		PessoaDTO pessoaDTO = new PessoaDTO();
		pessoaDTO.setId(1);
		pessoaDTO.setNome("Lito");

		Pessoa pessoa = PessoaMapper.MAPPER.converteDTOparaEntidade(pessoaDTO);

		assertThat(pessoa.getId()).isEqualTo(1);
		assertThat(pessoa.getNome()).isEqualTo("Lito");
	}
	
	@Test
	public void testarEntidadeParaDTO() {
		Categoria cat = new Categoria(1L, "Informatica", "Mouse", 100);
		
		CategoriaDTO dto = mapper.converteEntidadeParaDTO(cat);
				
		assertThat(dto.getId()).isEqualTo(1L);
		assertThat(dto.getNomeProduto()).isEqualTo("Informatica");
		assertThat(dto.getProduto()).isEqualTo("Mouse");
		assertThat(dto.getValor()).isEqualTo(100);
		
	}
	
	@Test
	public void testarListaEntidadeParaDTO() {
		
		
		List<Categoria> list = new ArrayList<Categoria>();
		

		list.add(new Categoria(1L, "Informatica", "Mouse", 100));
		list.add(new Categoria(2L, "Escritorio", "Cadeira", 150));
		
		
		List<CategoriaDTO> dto = mapper.converteListaDeEntidadeParaDTO(list);

		assertEquals(2, dto.size());
		
	}

}
