package produto;

import javax.management.RuntimeErrorException;

/**
 * Classe que representa um repositório de produtos usando arrays como estrutura
 * sobrejacente. Alguns métodos (atualizar, remover e procurar) ou executam com
 * sucesso ou retornam um erro. Para o caso desde exercício, o erro será
 * representado por uma RuntimeException que não precisa ser declarada na
 * clausula "throws" do mos metodos.
 * 
 * Obs: Note que você deve utilizar a estrutura de dados array e não
 * implementações de array prontas da API Collections de Java (como ArrayList,
 * por exemplo).
 * 
 * @author Adalberto
 *
 */
public class RepositorioProdutoNaoPerecivelArray {
	/**
	 * A estrutura (array) onde os produtos sao mantidos.
	 */
	private ProdutoNaoPerecivel[] produtos;
	private int posicao;

	/**
	 * A posicao do ultimo elemento inserido no array de produtos. o valor
	 * inicial é -1 para indicar que nenhum produto foi ainda guardado no array.
	 */
	private int index = -1;

	public RepositorioProdutoNaoPerecivelArray(int size) {
		super();
		this.produtos = new ProdutoNaoPerecivel[size];
		this.posicao = 0;
	}

	/**
	 * Recebe o codigo do produto e devolve o indice desse produto no array ou
	 * -1 caso ele nao se encontre no array. Esse método é util apenas na
	 * implementacao com arrays por questoes de localizacao. Outras classes que
	 * utilizam outras estruturas internas podem nao precisar desse método.
	 * 
	 * @param codigo
	 */
	private int procurarIndice(int codigo) {
		
		for (int i = 0; i < produtos.length; i++) {
			
			
			if(codigo == produtos[i].getCodigo()){
				
				return i;
			}
		}
		return -1;
			
	}

	/**
	 * Recebe o codigo e diz se tem produto com esse codigo armazenado
	 * 
	 * @param codigo
	 */
	public void existe(int codigo) {
		
		for(ProdutoNaoPerecivel prod : produtos){
			
			if(prod != null) {
			
				if(prod.getCodigo() == codigo){
					System.out.println("Existe");
				}
				else {
					System.out.println("Não existe");
				}
			}
		}
		
		
	}

	/**
	 * Insere um novo produto (sem se preocupar com duplicatas)
	 */
	public boolean inserir(ProdutoNaoPerecivel produto) {
		this.produtos[posicao] = produto;
		posicao += 1;
		
		return true;
	}

	/**
	 * Atualiza um produto armazenado ou retorna um erro caso o produto nao
	 * esteja no array. Note que, para localizacao, o código do produto será
	 * utilizado.
	 */
	public void atualizar(ProdutoNaoPerecivel produto) {
		int codigo = produto.getCodigo();
		for (int i = 0; i < produtos.length; i++) {
			if(produtos[i].getCodigo() == codigo) {
				produtos[i] = produto;
				break;
			}
		}
	
	}

	/**
	 * Remove produto com determinado codigo, se existir, ou entao retorna um
	 * erro, caso contrário. Note que a remoção NÃO pode deixar "buracos" no
	 * array.
	 * 
	 * @param codigo
	 */
	public void remover(int codigo) {
		// TODO Implement your code here
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	/**
	 * Retorna um produto com determinado codigo ou entao um erro, caso o
	 * produto nao esteja armazenado
	 * 
	 * @param codigo
	 * @return
	 */
	public ProdutoNaoPerecivel procurar(int codigo) {
		return null;
		
		
	}

}
