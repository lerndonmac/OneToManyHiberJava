package DAO.impl;

import DAO.DAO;
import Model.Hostel;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HostelDaoImpl implements DAO<Hostel, Integer> {
    final SessionFactory factory;

    public HostelDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Hostel hostel) {

    }

    @Override
    public Hostel read(Integer id) {
        try (Session session = factory.openSession()){
            final Hostel result = session.get(Hostel.class, id);

            if(result != null) {
                Hibernate.initialize(result);
            }
            return result;
        }
    }

    @Override
    public void update(Hostel hostel) {

    }

    @Override
    public void delete(Hostel hostel) {

    }
}
