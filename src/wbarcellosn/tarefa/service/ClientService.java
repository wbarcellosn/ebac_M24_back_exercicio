/**
 * @author winic
 */
package wbarcellosn.tarefa.service;

import wbarcellosn.tarefa.dao.IClientDao;

public class ClientService {

    private IClientDao clientDao;

    public ClientService(IClientDao objectDao){
        this.clientDao = objectDao;
    }

    public String salvar(){
        clientDao.salvar();
        return "Sucesso!";
    }
}
