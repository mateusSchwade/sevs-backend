package br.com.sevs.controller;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.sevs.entity.Usuario;
import br.com.sevs.repository.UsuarioRepository;

@Path("/usuario")
public class UsuarioController {

    private UsuarioRepository usuarioRep = new UsuarioRepository();

    @GET
    @Produces("application/json; charset=iso-8859-1")
    public List<Usuario> getAll() {
        return usuarioRep.getAll();
    }

    @POST
    @Consumes("application/json; charset=iso-8859-1")
    @Produces("application/json; charset=iso-8859-1")
    public void save(Usuario usuario) {
        usuarioRep.save(usuario);
    }

    @PUT
    @Consumes("application/json; charset=iso-8859-1")
    @Produces("application/json; charset=iso-8859-1")
    public void alterar(Usuario usuario) {
        usuarioRep.update(usuario);
    }

    @GET
    @Produces("application/json; charset=iso-8859-1")
    @Path("/{USUCOD}")
    public Usuario getByUsucod(@PathParam("USUCOD") int usucod) {
        Usuario usuario = usuarioRep.getByUsucod(usucod);
        return usuario;
    }
    
    @DELETE
    @Path("/{USUCOD}")
    public void deleteByUsucod(@PathParam("USUCOD") int usucod) {
        Usuario usuario = usuarioRep.getByUsucod(usucod);
        usuarioRep.remove(usuario);
    }
    
    @POST
    @Consumes("application/json; charset=iso-8859-1")
    @Produces("application/json; charset=iso-8859-1")
    @Path("/login")
    public Usuario autenticaLogin(Usuario usuario) {
        Usuario novousuario = usuarioRep.getBySenhaEmail(usuario.getUsuema(), usuario.getUsusen());
        novousuario.setUsusen(null);
        return novousuario;
    }

}
