package arquivo;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arquivo {
	

	public static void main(String[] args) throws IOException {
		
				
		//cria uma stream de Strings(uma String para cada linha) para os membros do TJ 
		Stream<String> dadosDosMembros= Files.lines(Paths.get("arquivoTeste\\membrosTj.csv"), Charset.defaultCharset());
				
		List<MembrosTj> membros =
				dadosDosMembros.map(dadosDoMembroTj -> dadosDoMembroTj.split(",")) // cria um array de String para cada linha com OS dados do membro
										  .filter(arrayDadosMembro -> arrayDadosMembro[7].equals("NÃO")) // seleciona somente os arrays com valor NÃO para campo vitalicio
										  //.map(arrayDadosMembro -> new MembrosTj(arrayDadosMembro)) //mapeia cada array para um obj MembroTJ
										  .map(MembrosTj::new) //mapeia cada array para um obj MembroTJ
										  .collect(Collectors.toList()); // transforma o precessamento em um List de membros	
										  //.toList();
		
		/**
		 * organiza o List em ordem alfabética por nomes e imprime 
		 * uma lista com nome e cargo de cada membro não vitalício
		 */
		membros.sort((p1,p2) -> p1.getNome().compareTo(p2.getNome()));
		for (MembrosTj membrosTj : membros) {
			System.out.println(membrosTj.getNome() + " - " + membrosTj.getCargo() );
		}
			
	}
}
	

