package appbancodados;

import br.com.leonardo.dominio.Categoria;
import br.com.leonardo.dominio.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class AppBancoDados {

    public static void main(String[] args) {
        
        EntityManager em = Persistence.createEntityManagerFactory("AppBancoDadosPU").createEntityManager();
        
        // Utilizando o metodo para inserir e listar os dados
        //insereProduto(em);
        //insereCategoria(em);
        //listaProduto(em);
        //listaCategoria(em);
        listaProdutoPeloId(em);
        
    }
    
    public static void insereProduto(EntityManager em) {
        // inicializacao do objeto
        Produto produto = new Produto(null, "Produto 1", 349.99, em.find(Categoria.class, 1L));
        // inserindo um objeto no banco
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
    }
    
    public static void insereCategoria(EntityManager em) {
        // inicializacao do objeto
        Categoria categoria = new Categoria(1L, "Esporte");
        // inserindo um objeto no banco
        em.getTransaction().begin();
        em.merge(categoria);
        em.getTransaction().commit();
    }
    
    private static void listaProduto(EntityManager em) {
        List<Produto> listaProdutos = em.createQuery("SELECT p FROM Produto p").getResultList();
        System.out.println(listaProdutos); // mostra toda a lista com os produtos pegados do banco
        //aqui nossa lista agora pode ser manipulada
    }
    
    private static void listaProdutoPeloId(EntityManager em) {
        Produto produto = em.find(Produto.class, 51L);
        System.out.println(produto);
    }
    
    private static void listaCategoria(EntityManager em) {
        List<Categoria> listaCategoria = em.createQuery("SELECT c FROM Categoria c").getResultList();
        System.out.println(listaCategoria); // mostra toda a lista com os produtos pegados do banco
        //aqui nossa lista agora pode ser manipulada
    }

}