package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

public class DatosBasicos {

    private String dsNombre;

    private String dsApellido;

    private String dsTipoDocumento;

    private String dsDireccion;

    private String dsTelefono;

    private String dsCelular;

    private String Ciudad;

    private String dsDepartamento;

    private String dsCorreoElectronico;

    private String DNI;

    public DatosBasicos () {
    }

    public String getCiudad () {
        return Ciudad;
    }

    public void setCiudad (String val) {
        this.Ciudad = val;
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getDsApellido () {
        return dsApellido;
    }

    public void setDsApellido (String val) {
        this.dsApellido = val;
    }

    public String getDsCelular () {
        return dsCelular;
    }

    public void setDsCelular (String val) {
        this.dsCelular = val;
    }

    public String getDsCorreoElectronico () {
        return dsCorreoElectronico;
    }

    public void setDsCorreoElectronico (String val) {
        this.dsCorreoElectronico = val;
    }

    public String getDsDepartamento () {
        return dsDepartamento;
    }

    public void setDsDepartamento (String val) {
        this.dsDepartamento = val;
    }

    public String getDsDireccion () {
        return dsDireccion;
    }

    public void setDsDireccion (String val) {
        this.dsDireccion = val;
    }

    public String getDsNombre () {
        return dsNombre;
    }

    public void setDsNombre (String val) {
        this.dsNombre = val;
    }

    public String getDsTelefono () {
        return dsTelefono;
    }

    public void setDsTelefono (String val) {
        this.dsTelefono = val;
    }

    public String getDsTipoDocumento () {
        return dsTipoDocumento;
    }

    public void setDsTipoDocumento (String val) {
        this.dsTipoDocumento = val;
    }

}
