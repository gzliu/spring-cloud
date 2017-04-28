/**   
 * @Title: Zuultest.java 
 * @Package  
 * @Description: TODO
 * @author Guzman liu
 * @date 2017年4月28日 上午9:46:59 
 * @version V1.0   
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
/** 
 * @ClassName: Zuultest 
 * @Description: TODO
 * @author Guzman liu
 * @date 2017年4月28日 上午9:46:59 
 *  
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class ZuulApplicationTests {

	@Autowired
	DiscoveryClient discoveryClient;

	@LocalServerPort
	int port;

	@Test
	public void contextLoads() {
		assertEquals("Hello World", new TestRestTemplate()
				.getForObject("http://localhost:" + this.port + "/static", String.class));
	}

	@Test
	public void discoveryClientIsSimple() {
		/*assertTrue("discoveryClient is wrong type",
				this.discoveryClient instanceof SimpleDiscoveryClient);*/
	}
}