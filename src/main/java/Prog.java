import DAO.DAO;
import DAO.impl.HostelDaoImpl;
import DAO.impl.PutevkaDaoImpl;
import DAO.impl.TuristDaoImpl;
import DAO.impl.TuroperatorDaoImpl;
import Model.Hostel;
import Model.Putevka;
import Model.Turist;
import Model.Turoperator;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class Prog {
    public static void main(String[] args) {
        Putevka putevka = new Putevka();
        Hostel hostel = new Hostel();
        Turist turist = new Turist();
        Turoperator turoperator = new Turoperator();
        Set<Hostel> hostels  = new HashSet<Hostel>();
        Set<Turist> turists = new HashSet<Turist>();
        Set<Turoperator> turoperators = new HashSet<Turoperator>();
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
            DAO<Putevka, Integer> dao = new PutevkaDaoImpl(factory);
            DAO<Hostel, Integer> daoHostl = new HostelDaoImpl(factory);
            DAO<Turoperator, Integer> daoTuroperator = new TuroperatorDaoImpl(factory);
            DAO<Turist, Integer> daoTurist = new TuristDaoImpl(factory);
            putevka.setNomber("yersg");
            putevka.setDateOfImport("uydtg");
            putevka.setDatoOfExport("kshegrfg");
            putevka.setHostelCode(daoHostl.read(1));
            putevka.setTuroperator(daoTuroperator.read(1));
            putevka.setTuristCode(daoTurist.read(1));

            dao.create(putevka);
            System.out.println(dao.read(5));
        } finally {
            if (factory != null){factory.close();}

        }
    }
}
