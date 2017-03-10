/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontrolebancario.Model.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sistemacontrolebancario.HibernateUtil;
import sistemacontrolebancario.Model.Dominio.Conta;
/**
 *
 * @author Ranna Lys
 */
public class ContaDao {
    public void create(Conta conta){
        Transaction transacao = null;
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        
        try {
            transacao = sessao.beginTransaction();
            sessao.save(conta);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            if(transacao != null){
                transacao.rollback();
            }
            e.printStackTrace();
        }finally{
            sessao.flush();
            sessao.close();
        }
    }
    
    public void delete(int id) {
        Transaction transacao = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transacao = session.beginTransaction();
            Conta conta = (Conta) session.load(Conta.class, id);
            session.delete(conta);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
    
    public void update(Conta conta) {
        Transaction transacao = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transacao = session.beginTransaction();
            session.update(conta);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (transacao != null) {
                transacao.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
    
    public Conta findConta(String numero, String agencia) {
        Conta conta = null;
        Transaction transacao = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transacao = session.beginTransaction();
            String queryString = "from Conta where numero = :numero and agencia = :agencia";
            Query query = session.createQuery(queryString);
            query.setString("numero", numero);
            query.setString("agencia", agencia);
            conta = (Conta) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return conta;
    }
}
