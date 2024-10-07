package com.spring.core.hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PlayerDAO {

    // Save Player
    public void savePlayer(Player player) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(player);
        transaction.commit(); // تأكيد العملية
        session.close();
    }

    // Update Player
    public void updatePlayer(Player player) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(player);
        transaction.commit();
        session.close();
    }

    // Delete Player
    public void deletePlayer(Player player) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(player);
        transaction.commit();
        session.close();
    }

    // Get Player by ID
    public Player getPlayerById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Player player = session.get(Player.class, id);
        session.close();
        return player;
    }

    // Get Players where name starts with a
    public List<Player> getPlayersWithNameStartingWithA() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Player> players = session.createQuery("FROM Player WHERE name LIKE 'A%'", Player.class).list();
        session.close();
        return players;
    }

    // Get Players where age >= 20
    public List<Player> getPlayersWithAgeAbove20() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Player> players = session.createQuery("FROM Player WHERE age >= 20", Player.class).list();
        session.close();
        return players;
    }

    // Get Players where status is true
    public List<Player> getPlayersWithStatusTrue() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Player> players = session.createQuery("FROM Player WHERE status = true", Player.class).list();
        session.close();
        return players;
    }

    // Get Players where ID is even
    public List<Player> getPlayersWithEvenId() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Player> players = session.createQuery("FROM Player WHERE MOD(id, 2) = 0", Player.class).list();
        session.close();
        return players;
    }
}
