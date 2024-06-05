package org.entidad;

public class Categoria {
    
    private Integer idCategoria;
    private String Categoria;

    public Categoria() {
    }

    public Categoria(Integer idCategoria, String Categoria) {
        this.idCategoria = idCategoria;
        this.Categoria = Categoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    
}
