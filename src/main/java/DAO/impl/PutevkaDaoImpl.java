package DAO.impl;

import DAO.DAO;
import Model.Putevka;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PutevkaDaoImpl implements DAO<Putevka,Integer> {
    final SessionFactory factory;

    public PutevkaDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }
@Override
    public void create(Putevka putevka) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.save(putevka);
            session.getTransaction().commit();

        }

    }
@Override
    public Putevka read(Integer id) {

        try (Session session = factory.openSession()){
            final Putevka result = session.get(Putevka.class, id);
            if(result != null) {
                Hibernate.initialize(result);
            }
            return result;
        }
    }
@Override
    public void update(Putevka putevka) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.update(putevka);
            session.getTransaction();
        }
    }
@Override
    public void delete(Putevka putevka) {
        try (Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(putevka);
            session.getTransaction();
        }
    }
}
