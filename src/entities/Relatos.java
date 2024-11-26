package entities;

import java.util.Date;

public class Relatos {

    private Usuario usuario;
    private Endereco endereco;
    private Date data_hora;
    private String descricao;
    private byte[] imagem;

    public Relatos(Usuario usuario, Endereco endereco, Date data_hora, String descricao, byte[] imagem) {
        this.usuario = usuario;
        this.endereco = endereco;
        this.data_hora = data_hora;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Relatos {" +
                "\n  Usuário: " + usuario.getNome() +
                "\n  Endereço do relato: " + endereco +
                "\n  Data e Hora do relato: " + data_hora +
                "\n  Descrição do relato: '" + descricao + '\'' +
                "\n}";
    }

}
