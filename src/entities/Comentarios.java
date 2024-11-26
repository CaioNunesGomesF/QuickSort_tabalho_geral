package entities;

import java.util.Date;

public class Comentarios extends Relatos{

    private Usuario usuario;
    private String comentario;


    public Comentarios(Usuario usuario, Endereco endereco, Date data_hora, String descricao, byte[] imagem, String comentario){
        super(usuario, endereco, data_hora, descricao, imagem);
        this.usuario = usuario;
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Comentarios{" +
                "comentario='" + comentario + '\'' +
                ", usuario=" + usuario +
                "} " + super.toString();
    }
}
