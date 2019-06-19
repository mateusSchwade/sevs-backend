package br.com.sevs.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.sevs.entity.Produto;
import br.com.sevs.repository.ProdutoRepository;

@Path("/produto")
public class ProdutoController {
	private ProdutoRepository produtoRep = new ProdutoRepository();

    @GET
    @Produces("application/json; charset=iso-8859-1")
    public List<Produto> getAll() {
        return produtoRep.getAll();
    }

    @POST
    @Consumes("application/json; charset=iso-8859-1")
    @Produces("application/json; charset=iso-8859-1")
    public void save(Produto usuario) {
    	produtoRep.save(usuario);
    }

    @PUT
    @Consumes("application/json; charset=iso-8859-1")
    @Produces("application/json; charset=iso-8859-1")
    public void alterar(Produto usuario) {
    	produtoRep.update(usuario);
    }

    @GET
    @Produces("application/json; charset=iso-8859-1")
    @Path("/{PROCOD}")
    public Produto getByUsucod(@PathParam("PROCOD") int procod) {
    	Produto produto = produtoRep.getByProcod(procod);
        return produto;
    }
    
    @DELETE
    @Path("/{PROCOD}")
    public void deleteByUsucod(@PathParam("PROCOD") int procod) {
    	Produto produto = produtoRep.getByProcod(procod);
    	produtoRep.remove(produto);
    }
    
    @GET
    @Consumes("application/json; charset=iso-8859-1")
    @Produces("application/json; charset=iso-8859-1")
    @Path("/tipos/{PROTIP}")
    public List<Produto> autenticaLogin(@PathParam("PROTIP") String protip) {
    	List<Produto> produtosTipo = produtoRep.getByProtip(protip);
        return produtosTipo;
    }
}
