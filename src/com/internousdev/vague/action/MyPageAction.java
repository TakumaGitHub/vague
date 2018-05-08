package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.MyPageDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

// マイページ機能 担当：縄田
// ログイン状態かどうかを判別（未ログイン状態→ログイン画面へ、ログイン状態→ホーム画面へ）

public class MyPageAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private String userId;
	private String password;
	private String invisiblePassword; //----パスワード伏せ字機能

	public String execute() throws SQLException{

		 //----ログイン状態かどうかを判別
		String result =ERROR;

		if(session.containsKey("LoginUserDTO")){

			//----セッション情報取得
			MyPageDAO myPageDAO = new MyPageDAO();
			userId = ((LoginUserDTO)session.get("LoginUserDTO")).getUserId();
			myPageList = myPageDAO.getMyPageUserInfo(userId);

			if(myPageList.size() > 0){
				result = SUCCESS;
	//---------------------invisiblePassword パスワード伏字機能---------------------
				//----  パスワードが1文字→"*"
				//----  パスワードが2文字→"**"
				//----  パスワードが3文字以上→頭2文字以外"*"
				password = myPageList.get(0).getPassword().toString();
				if(password.length() == 1){
					invisiblePassword = "*";
				}
				else if(password.length() == 2){
					invisiblePassword = "**";
				}
				else if(password.length() > 2){
					StringBuilder sb = new StringBuilder(password);
					for(int i=2; i<password.length(); i++){
						sb.setCharAt(i, '*');
					}
					invisiblePassword = sb.toString();
				}
	//------------------------------------------------------------------------------
			}
		}
	return result;
	}


	//---------------------getter/setter---------------------
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public String getUserId(){
		return userId;
	}
	public void setSession(String userId){
		this.userId = userId;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public ArrayList<MyPageDTO> getMyPageList(){
		return myPageList;
	}
	public void setMyPageList(ArrayList<MyPageDTO> myPageList){
		this.myPageList = myPageList;
	}

	public String getInvisiblePassword(){
		return invisiblePassword;
	}
	public void setInvisiblePassword(String invisiblePassword){
		this.invisiblePassword = invisiblePassword;
	}
}