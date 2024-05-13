/**
 * @author winic
 */
package wbarcellosn.tarefa.service;

import wbarcellosn.tarefa.dao.IContractDao;

public class ContractService implements IContractService{

    IContractDao dao;
    public ContractService(IContractDao objectDao) {
        this.dao = objectDao;
    }

    @Override
    public String salvar() {
        dao.salvar();
        return "Salvo com sucesso!";
    }

    @Override
    public String buscar() {
        dao.buscar();
        return "Localizado com sucesso!";
    }

    @Override
    public String atualizar() {
        dao.atualizar();
        return "Atualizado com sucesso!";
    }

    @Override
    public String excluir() {
        dao.excluir();
        return "Excluído com sucesso!";
    }
}
