package DAO.impl;

import DAO.DAO;
import Model.Turist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TuristDaoImpl implements DAO<Turist , Integer> {
    final SessionFactory factory;

    public TuristDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Turist turist) {

    }

    @Override
    public Turist read(Integer id) {
        try (Session session = factory.openSession()) {
            final Turist result = session.get(Turist.class, id);
//            if (result != null) {
//                Hibernate.initialize(result);
//            }
            return result;
        }
    }

    @Override
    public void update(Turist turist) {

    }

    @Override
    public void delete(Turist turist) {

    }
}
