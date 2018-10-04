package com.biancalins.projeto.persistence;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author biancalins
 */


public class PersistenceManager {

    private static PersistenceManager instance = null;
    private EntityManagerFactory emf = null;

    public static PersistenceManager getInstance() {
        if (instance == null) {
            instance = new PersistenceManager();
        }

        return instance;
    }

    // construtor privado para evitar que a classe seja instaciada sem utilizar o 
    // método getInstance()
    private PersistenceManager() {
    }
    
    public void initializeContext() {
        getEntityManagerFactory();
    }

    public void destroyContext() {
        closeEntityManagerFactory();
    }

    private void closeEntityManagerFactory() {
        if (emf != null) {
            emf.close();
            emf = null;
        }
    }

    private EntityManagerFactory getEntityManagerFactory() {

        if (emf == null) {
            synchronized (PersistenceManager.class) {
                try {
                    emf = Persistence.createEntityManagerFactory(
                            "projeto-hibernate");
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException("Não foi possível "
                            + "carregar o unidade de persistência");
                }
            }
        }

        return emf;
    }

    public EntityManager getEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

}
