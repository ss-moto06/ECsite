package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CartDAO;
import com.internousdev.ecsite.dto.CartItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

//cart dao.dto 実装

public class CartAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private CartDAO cartDAO=new CartDAO();
	private ArrayList<CartItemInfoDTO> cartItemList=new ArrayList<CartItemInfoDTO>();
	public String deleteFlg;
	private String message;

	public String execute() throws SQLException{
		//商品履歴を削除しない場合
				if(!session.containsKey("id")){
					return ERROR;
				}
				if(deleteFlg==null){
					String item_transaction_id=session.get("id").toString();
					String user_master_id=session.get("login_user_id").toString();
					cartItemList=cartDAO.getCartUserInfo(item_transaction_id, user_master_id);
				}else if(deleteFlg.equals("1")){
					delete();
				}
				String result=SUCCESS;
				return result;
			}

			public void delete() throws SQLException{
				String item_transaction_id=session.get("id").toString();
				String user_master_id=session.get("login_user_id").toString();
				int res=cartDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
				if(res>0){
					setMessage("商品情報を正しく削除しました。");
				}else if(res==0){
					setMessage("商品情報の削除に失敗しました。");
				}
			}

			public void setDeleteFlg(String deleteFlg){
				this.deleteFlg=deleteFlg;
			}
			@Override
			public void setSession(Map<String,Object> session){
				this.session=session;
			}
			public ArrayList<CartItemInfoDTO> getCartItemList(){
				return this.cartItemList;
			}
			public String getMessage(){
				return this.message;
			}
			public void setMessage(String message){
				this.message=message;
			}

}
