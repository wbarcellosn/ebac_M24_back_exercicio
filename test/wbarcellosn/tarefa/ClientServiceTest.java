/**
 * @author winic
 */
package wbarcellosn.tarefa;

import org.junit.Assert;
import org.junit.Test;
import wbarcellosn.tarefa.dao.ClientDao;
import wbarcellosn.tarefa.dao.mocks.ClientMockDao;
import wbarcellosn.tarefa.dao.IClientDao;
import wbarcellosn.tarefa.service.ClientService;

public class ClientServiceTest {

    @Test
    public void salvarTest(){
        IClientDao mockDao = new ClientMockDao();
        ClientService service = new ClientService(mockDao);
        String result = service.salvar();
        Assert.assertEquals("Sucesso!", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest(){
            IClientDao dao = new ClientDao();
            ClientService service = new ClientService(dao);
            String result = service.salvar();
            Assert.assertEquals("Sucesso!", result);
    }
}
