package DAO.impl;

import DAO.DAO;
import Model.Turoperator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TuroperatorDaoImpl implements DAO<Turoperator, Integer> {
    final SessionFactory factory;

    public TuroperatorDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Turoperator turoperator) {

    }

    @Override
    public Turoperator read(Integer id) {
        try (Session session = factory.openSession()){
            final Turoperator result = session.get(Turoperator.class, id);
//            if(result != null) {
//                Hibernate.initialize(result);
//            }
            return result;
        }
    }

    @Override
    public void update(Turoperator turoperator) {

    }

    @Override
    public void delete(Turoperator turoperator) {

    }
}
