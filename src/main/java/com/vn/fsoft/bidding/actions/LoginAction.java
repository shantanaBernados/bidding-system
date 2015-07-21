package com.vn.fsoft.bidding.actions;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.json.JSONArray;
import org.json.JSONObject;

import com.vn.fsoft.bidding.ejb.ws.endpoints.Item;

public class LoginAction extends Action {
	
	URL url = null;
	HttpURLConnection connect = null;
	BufferedReader br = null;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Item> items = new ArrayList<Item>();
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
				if (!obj.get("item_description").equals(null)) {
					item.setItemDescription(obj.getString("item_description"));
				}
				item.setItemId(obj.getLong("item_id"));
				item.setItemName(obj.getString("item_name"));
				item.setStartBidAmount(new BigDecimal(obj.getDouble("start_bid_amount")));;
				items.add(item);
			}
			request.setAttribute("items", items);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mapping.findForward("success");
	}
}
