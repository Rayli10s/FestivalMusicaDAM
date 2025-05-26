public class GrupoMusical {
    String nombreGrupo;
    String generoMusical;
    String paisOrigen;

    public GrupoMusical(String paisOrigen, String generoMusical, String nombreGrupo) {
        this.paisOrigen = paisOrigen;
        this.generoMusical = generoMusical;
        this.nombreGrupo = nombreGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}
