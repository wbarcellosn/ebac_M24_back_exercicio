/**
 * @author winic
 */
package wbarcellosn.tarefa.dao;

public class ContractDao implements IContractDao{
    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não foi possível salvar o contrato no banco de dados.");
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("Não foi possível buscar o contrato no banco de dados.");
    }

    @Override
    public String atualizar() {
        throw new UnsupportedOperationException("Não foi possível atualizar o contrato no banco de dados.");
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Não foi possível excluir o contrato do banco de dados.");
    }
}
