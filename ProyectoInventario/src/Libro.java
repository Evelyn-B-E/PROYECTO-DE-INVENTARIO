


public class Libro {
	private String CODIGO;
    private String TITULO;
    private String AUTOR;
    private String EDITORIAL;
    private String AÑOEDICION;
    private String ESPECIALIDAD;  
    private String NUMPAG;

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getTITULO() {
        return TITULO;
    }

    public void setTITULO(String TITULO) {
        this.TITULO = TITULO;
    }

    public String getAUTOR() {
        return AUTOR;
    }

    public void setAUTOR(String AUTOR) {
        this.AUTOR = AUTOR;
    }

    public String getEDITORIAL() {
        return EDITORIAL;
    }

    public void setEDITORIAL(String EDITORIAL) {
        this.EDITORIAL = EDITORIAL;
    }

    public String getAÑOEDICION() {
        return AÑOEDICION;
    }

    public void setAÑOEDICION(String AÑOEDICION) {
        this.AÑOEDICION = AÑOEDICION;
    }

    public String getESPECIALIDAD() {
        return ESPECIALIDAD;
    }

    public void setESPECIALIDAD(String ESPECIALIDAD) {
        this.ESPECIALIDAD = ESPECIALIDAD;
    }

    public String getNUMPAG() {
        return NUMPAG;
    }

    public void setNUMPAG(String NUMPAG) {
        this.NUMPAG = NUMPAG;
    }
   public String IMPRIMIR(){
        return getCODIGO()+"\t\t"+getTITULO()+"\t\t"+getAUTOR()+"\t\t"+getEDITORIAL()+"\t\t"+getAÑOEDICION()+"\t\t"+getESPECIALIDAD()+"\t\t"+getNUMPAG()+"\n";
    
   }
	
	
}
