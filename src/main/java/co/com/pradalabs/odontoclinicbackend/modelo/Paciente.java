package co.com.pradalabs.odontoclinicbackend.modelo;


import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;
import co.com.pradalabs.odontoclinicbackend.modelo.historiaclinica.Acompanante;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.AvanceTratamientoOdonto;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.AvanceTratamientoOrtho;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.Cita;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.Cuenta;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.DatosBasicos;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.HistoriaClinicaOdonto;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.HistoriaClinicaOrtho;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.TratamientoAcordadoOdonto;
import co.com.pradalabs.odontoclinicbackend.modelo.paciente.TratamientoAcordadoOrtho;



@PersistenceCapable
public class Paciente {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String DNI;
	
	@Persistent
    private DatosBasicos dsDatosBasicos;

	@Persistent
    private Date dsFechaNacimiento;

	@Persistent
    private String dsSexo;

	@Persistent
    private String dsEstadoCivil;

	@Persistent
    private String cdOcupacion;

	@Persistent
    private String dsOcupacion;

	@Persistent
    private List<Acompanante> dsAcompanante;

	@Persistent
    private String dsRH;

	@Persistent
    private List<HistoriaClinicaOdonto> dsHistoriasClinicasOdonto;

	@Persistent
    private List<AvanceTratamientoOdonto> dsAvanceTratamientoOdonto;

	@Persistent
    private List<TratamientoAcordadoOdonto> dsTratamientoAcordadoOdonto;

	@Persistent
    private List<TratamientoAcordadoOrtho> dsTratamientoAcordadoOrtho;

	@Persistent
    private List<AvanceTratamientoOrtho> dsAvanceTratamientoOrtho;

	@Persistent
    private List<Cita> dsCitas;

	@Persistent
    private List<Cuenta> dsCuentasOdonto;

	@Persistent
    private List<Cuenta> dsCuentaOrtho;

	@Persistent
    private List<HistoriaClinicaOrtho> dsHistoriaClinicaOrtho;
	
	@Persistent
	private String estado;

    public Paciente () {
    }

    public String getDNI () {
        return DNI;
    }

    public void setDNI (String val) {
        this.DNI = val;
    }

    public String getCdOcupacion () {
        return cdOcupacion;
    }

    public void setCdOcupacion (String val) {
        this.cdOcupacion = val;
    }

    public List<Acompanante> getDsAcompanante () {
        return dsAcompanante;
    }

    public void setDsAcompanante (List<Acompanante> val) {
        this.dsAcompanante = val;
    }

    public List<AvanceTratamientoOdonto> getDsAvanceTratamientoOdonto () {
        return dsAvanceTratamientoOdonto;
    }

    public void setDsAvanceTratamientoOdonto (List<AvanceTratamientoOdonto> val) {
        this.dsAvanceTratamientoOdonto = val;
    }

    public List<AvanceTratamientoOrtho> getDsAvanceTratamientoOrtho () {
        return dsAvanceTratamientoOrtho;
    }

    public void setDsAvanceTratamientoOrtho (List<AvanceTratamientoOrtho> val) {
        this.dsAvanceTratamientoOrtho = val;
    }

    public List<Cita> getDsCitas () {
        return dsCitas;
    }

    public void setDsCitas (List<Cita> val) {
        this.dsCitas = val;
    }

    public List<Cuenta> getDsCuentaOrtho () {
        return dsCuentaOrtho;
    }

    public void setDsCuentaOrtho (List<Cuenta> val) {
        this.dsCuentaOrtho = val;
    }

    public List<Cuenta> getDsCuentasOdonto () {
        return dsCuentasOdonto;
    }

    public void setDsCuentasOdonto (List<Cuenta> val) {
        this.dsCuentasOdonto = val;
    }

    public DatosBasicos getDsDatosBasicos () {
        return dsDatosBasicos;
    }

    public void setDsDatosBasicos (DatosBasicos val) {
        this.dsDatosBasicos = val;
    }

    public String getDsEstadoCivil () {
        return dsEstadoCivil;
    }

    public void setDsEstadoCivil (String val) {
        this.dsEstadoCivil = val;
    }

    public Date getDsFechaNacimiento () {
        return dsFechaNacimiento;
    }

    public void setDsFechaNacimiento (Date val) {
        this.dsFechaNacimiento = val;
    }

    public List<HistoriaClinicaOrtho> getDsHistoriaClinicaOrtho () {
        return dsHistoriaClinicaOrtho;
    }

    public void setDsHistoriaClinicaOrtho (List<HistoriaClinicaOrtho> val) {
        this.dsHistoriaClinicaOrtho = val;
    }

    public List<HistoriaClinicaOdonto> getDsHistoriasClinicasOdonto () {
        return dsHistoriasClinicasOdonto;
    }

    public void setDsHistoriasClinicasOdonto (List<HistoriaClinicaOdonto> val) {
        this.dsHistoriasClinicasOdonto = val;
    }

    public String getDsOcupacion () {
        return dsOcupacion;
    }

    public void setDsOcupacion (String val) {
        this.dsOcupacion = val;
    }

    public String getDsRH () {
        return dsRH;
    }

    public void setDsRH (String val) {
        this.dsRH = val;
    }

    public String getDsSexo () {
        return dsSexo;
    }

    public void setDsSexo (String val) {
        this.dsSexo = val;
    }

    public List<TratamientoAcordadoOdonto> getDsTratamientoAcordadoOdonto () {
        return dsTratamientoAcordadoOdonto;
    }

    public void setDsTratamientoAcordadoOdonto (List<TratamientoAcordadoOdonto> val) {
        this.dsTratamientoAcordadoOdonto = val;
    }

    public List<TratamientoAcordadoOrtho> getDsTratamientoAcordadoOrtho () {
        return dsTratamientoAcordadoOrtho;
    }

    public void setDsTratamientoAcordadoOrtho (List<TratamientoAcordadoOrtho> val) {
        this.dsTratamientoAcordadoOrtho = val;
    }

    public Boolean getSnCierre () {
        return null;
    }

    public void setSnCierre (Boolean val) {
    }

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}

