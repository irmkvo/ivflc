package dao.medialog;

import domain.medialog.Patients;
import java.util.List;

/**
 *
 * @author kvo
 */
public interface PatientsDAO {

    public List<Patients> GetPatientsList(); //Получить список Пациентов 

    public Patients GetPatientByIIN(String IIN); //Получить Пациента по ИИН
}
