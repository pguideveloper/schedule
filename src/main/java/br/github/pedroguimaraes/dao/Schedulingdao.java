package br.github.pedroguimaraes.dao;

import br.github.pedroguimaraes.model.Scheduling;
import java.util.List;
import javax.persistence.Query;

public class Schedulingdao extends DAO<Scheduling> {

    @Override
    public List<Scheduling> findAll() {

        return this.entityManager.createQuery("FROM Scheduling ORDER BY scheduleTime DESC").getResultList();
    }

    public List<Scheduling> search(String exam, String driver, String date) {

        try {

            String hql = "From Scheduling as s where 1 = 1";

            if (exam != null) {
                hql += " and s.exam.name like :exam ";
            }

            if (driver != null) {
                hql += " and s.driver.person.name like :driver";
            }

            if (date != null) {
                hql += " and s.scheduleTime like :date";
            }

            Query query = this.entityManager.createQuery(hql);

            if (exam != null) {
                query.setParameter("exam", "'%'" + exam + "'%'");
            }

            if (driver != null) {
                query.setParameter("driver", "'%'" + driver + "'%'");
            }

            if (date != null) {
                query.setParameter("date", "'%'" + date + "'%'");
            }

            return query.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public Scheduling getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
