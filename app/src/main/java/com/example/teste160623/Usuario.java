package com.example.teste160623;

public class Usuario {
    private int idUsuario;


    public Usuario() {}

    public Usuario(int idUsuario, ) {
        this.setIdUsuario(idUsuario);

    }



    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario +  };
        //"Usuario{idUsuario=1, nomeUsuario=Ronan, idadeUsuario=30}"
    }

    protected int getIdUsuario() {
        return idUsuario;
    }

    protected void setIdUsuario(int idUsuario) {

        this.idUsuario = idUsuario;
    }


}
