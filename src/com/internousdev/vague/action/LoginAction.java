package com.internousdev.vague.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.CartDAO;
import com.internousdev.vague.dao.LoginUserDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String userId = "";

	private String password = "";

	private String userIdErrorMsg;

	private String passwordErrorMsg;

	private String errorMsg;

	private int saveId;

	private LoginUserDAO loginUserDAO = new LoginUserDAO();

	private LoginUserDTO dto = new LoginUserDTO();



	private String result;
	private Map<String,Object> session;

	public String execute() throws SQLException {

		if(!session.containsKey("tempUserId")){

			return "session";

		}

		if(saveId != 0){

			session.put("saveId",userId);

		}else{

			session.remove("saveId");

		}


		//エラーメッセージチェック
		userIdErrorMsg = InputChecker.userIdChk(userId);
		passwordErrorMsg = InputChecker.passwordChk(password);

		if(userIdErrorMsg != null || passwordErrorMsg != null){

			return ERROR;

		}

		try{
			result = ERROR;

			//入力されたIDとパスワードを持つユーザーがいるかどうか
			errorMsg = loginUserDAO.passwordIsTrue(userId, password);

			if(errorMsg != null){

				return ERROR;

			}

			dto = loginUserDAO.getUserInfo(userId,password);

			if(dto.getUserId() != null){

				result = SUCCESS;
				//ログイン成功時に以下を使用
				CartDAO cartDAO = new CartDAO();
				String tempUserId = session.get("tempUserId").toString();
				cartDAO.changeTempUserId(userId,tempUserId);
				//dtoをセッションに格納
				session.put("LoginUserDTO",dto);
			}
			return result;
		}catch (SQLException e){
			e.printStackTrace();
		}
		return result;
}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSaveId() {
		return saveId;
	}

	public void setSaveId(int saveId) {
		this.saveId = saveId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getUserIdErrorMsg() {
		return userIdErrorMsg;
	}

	public void setUserIdErrorMsg(String userIdErrorMsg) {
		this.userIdErrorMsg = userIdErrorMsg;
	}

	public String getPasswordErrorMsg() {
		return passwordErrorMsg;
	}

	public void setPasswordErrorMsg(String passwordErrorMsg) {
		this.passwordErrorMsg = passwordErrorMsg;
	}






	}

