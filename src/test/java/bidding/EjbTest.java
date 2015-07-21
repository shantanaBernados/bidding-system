package bidding;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vn.fsoft.bidding.ejb.ws.endpoints.Account;
import com.vn.fsoft.bidding.ejb.ws.endpoints.BidService;
import com.vn.fsoft.bidding.ejb.ws.endpoints.Item;

public class EjbTest {
		
	BidService service = null;
	Account acct = null;
	
	@Before
	public void setup() {
		service = new BidService();
		acct = new Account();
		acct.setEmailAddress("sample@g.com");
		acct.setAccountId(12);
	}
	
	@After
	public void tearDown() {
		service = null;
		acct = null;
	}

//	@Test
//	public void testWs() {
////		Bid bid = service.getBidWSPort().getBid(acct);
//		System.out.println(acct.getAccountId());
////		List<Item> item = service.getBidWSPort().getItem(acct);
////		System.out.println(item);
//	}
}
