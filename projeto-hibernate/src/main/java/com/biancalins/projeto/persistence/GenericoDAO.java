
package com.biancalins.projeto.persistence;

import com.biancalins.model.dto.*;
import java.io.Serializable;
import javax.persistence.EntityManager;


/**
 *
 * @author CAP
 * @param <T>
 */
public class GenericoDAO <T extends EntidadeBase> implements Serializable {
   
    private EntityManager em;
    public String mensagem = "";
    private Class classePersistente;
    
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the classePersistente
     */
    public Class getClassePersistente() {
        return classePersistente;
    }

    /**
     * @param classePersistente the classePersistente to set
     */
    public void setClassePersistente(Class classePersistente) {
        this.classePersistente = classePersistente;
    }
    
    public void roolback()
    {
        if (em.getTransaction().isActive() == false)
        {
            em.getTransaction().begin();
        }
        em.getTransaction().rollback();
    }
    
    
    public boolean salvar(T obj)
    {
        try
        {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
            mensagem = "Persistido com sucesso!";
            return true;
        }
        catch (Exception e)
        {
            roolback();
            mensagem = "Erro ao persistir:"+ Util.getMensagemErro(e);
            return false;
        }
    }
    
    public boolean Atualizar(T obj)
    {
       try
       {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            mensagem = "Atualizado com sucesso!";
            return true;
        }
        catch (Exception e)
        {
            roolback();
            mensagem = "Erro ao atualizar:"+Util.getMensagemErro(e);
            return false;
        } 
    }
    
    public boolean remover(T obj)
    {
       try
        {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
            mensagem = "Removido com sucesso!";
            return true;
        }
        catch (Exception e)
        {
            roolback();
            mensagem = "Erro ao remover:" + Util.getMensagemErro(e);
            return false;
        } 
    }
    
    public T localizar (Integer id)
    {
        roolback();
        T obj = (T) em.find(getClassePersistente(), id);
        return obj;
    }

}
////            if(t.getId() == null){
////                em.persist(t);
//            }else {
//                if(!em.contains(t)){
//                    if(em.find(t.getClass(), t.getId()) == null){
//                        throw new Exception("Erro ao atualizar");
//                    }
                
//                t = em.merge(t);
//            }
//            em.getTransaction().commit();
//        }finally{
//            em.close();
//        }
//        return t;
//    }
    
//    public void remover(Class<T> ab, Integer id){
//        EntityManager em = getEm();
//        T t = em.find(ab, id);
//        try{
//            em.getTransaction().begin();
//            em.remove(t);
//            em.getTransaction().commit();
//        }finally{
//            em.close();
//        }
//    }
//    
//    public T consultar (Class<T> ab, Integer id){
//        EntityManager em = getEm();
//        T t = null;
//        try{
//            t = em.find(ab,id);
//        }finally {
//            em.close();
//        }
//        return t;
//    }
//    
//}
