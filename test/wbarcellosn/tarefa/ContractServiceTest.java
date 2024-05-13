/**
 * @author winic
 */
package wbarcellosn.tarefa;


import org.junit.Assert;
import org.junit.Test;
import wbarcellosn.tarefa.dao.ContractDao;
import wbarcellosn.tarefa.dao.IContractDao;
import wbarcellosn.tarefa.dao.mocks.ContractMockDao;
import wbarcellosn.tarefa.service.ContractService;
import wbarcellosn.tarefa.service.IContractService;

public class ContractServiceTest {

    @Test
    public void salvarTest(){
        IContractDao mockdao = new ContractMockDao();
        IContractService service = new ContractService(mockdao);
        String result = service.salvar();
        Assert.assertEquals("Salvo com sucesso!", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
            IContractDao dao = new ContractDao();
            IContractService service = new ContractService(dao);
            String result = service.salvar();
            Assert.assertEquals("Salvo com sucesso!", result);
    }

    @Test
    public void buscarTest(){
        IContractDao mockdao = new ContractMockDao();
        IContractService service = new ContractService(mockdao);
        String result = service.buscar();
        Assert.assertEquals("Localizado com sucesso!", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest(){
        IContractDao dao = new ContractDao();
        IContractService service = new ContractService(dao);
        String result = service.buscar();
        Assert.assertEquals("Localizado com sucesso!", result);
    }

    @Test
    public void atualizarTest(){
        IContractDao mockdao = new ContractMockDao();
        IContractService service = new ContractService(mockdao);
        String result = service.atualizar();
        Assert.assertEquals("Atualizado com sucesso!", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest(){
        IContractDao dao = new ContractDao();
        IContractService service = new ContractService(dao);
        String result = service.atualizar();
        Assert.assertEquals("Atualizado com sucesso!", result);
    }

    @Test
    public void excluirTest(){
        IContractDao mockdao = new ContractMockDao();
        IContractService service = new ContractService(mockdao);
        String result = service.excluir();
        Assert.assertEquals("Excluído com sucesso!", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest(){
        IContractDao dao = new ContractDao();
        IContractService service = new ContractService(dao);
        String result = service.excluir();
        Assert.assertEquals("Excluído com sucesso!", result);
    }
}
