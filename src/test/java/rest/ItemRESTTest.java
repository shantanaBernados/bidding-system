package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vn.fsoft.bidding.ejb.ws.endpoints.Item;

public class ItemRESTTest {

	URL url = null;
	HttpURLConnection connect = null;
	BufferedReader br = null;

	@Before
	public void setup() {
		try {
			url = new URL("http://localhost:8080/bidding-item-restful/item/all");
			InputStream is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is));
			JSONObject obj = new JSONObject("{items:" + br.readLine() + "}");
			JSONArray arr = obj.getJSONArray("items");
			for (int i = 0; i < arr.length(); i++) {
				obj = arr.getJSONObject(i);
				System.out.println(obj);
				Item item = new Item();
				System.out.println(obj.get("item_description"));
				if (!obj.get("item_description").equals(null)) {
					item.setItemDescription(obj.getString("item_description"));
				}
				item.setItemId(obj.getLong("item_id"));
				item.setItemName(obj.getString("item_name"));
				item.setStartBidAmount(new BigDecimal(obj.getDouble("start_bid_amount")));;
				System.out.println(item.getItemDescription());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() {
//		connect.disconnect();
	}

	@Test
	public void testRest() {
//		String output = null;
//		try {
//			String o = "";
//			while (null != (output = br.readLine())) {
//				o = output;
//			}
//			System.out.println(o);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		System.out.println("ASD");
	}
}
