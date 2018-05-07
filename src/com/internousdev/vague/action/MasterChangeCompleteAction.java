package com.internousdev.vague.action;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.MasterDAO;
import com.internousdev.vague.dto.MasterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterChangeCompleteAction extends ActionSupport implements SessionAware {

	//フィールド
	private Map<String, Object> session;

	private MasterDTO masterDTO;

	private MasterDAO masterDAO = new MasterDAO();


	//actionメソッドs

	public String execute(){

		String result = SUCCESS;

		if(!(session.containsKey("MasterChangeCompleteDTO"))){

			return ERROR;

		}

		masterDTO = (MasterDTO)session.get("MasterChangeCompleteDTO");

		//商品情報を変更する
		masterDAO.update(masterDTO);

			//画像ファイルをコピー
			if(masterDTO.getFromImageFilePath() != null && masterDTO.getToImageFilePath() != null){

				File fromFile = new File(masterDTO.getFromImageFilePath());

				File toFile = new File(masterDTO.getToImageFilePath());


					try{

						//画像ファイルをコピー
						FileUtils.copyFile(fromFile, toFile);

					}catch(IOException e){

						e.printStackTrace();
					}

			}

		//セッションの掃除
		session.remove("maxProductId");
		session.remove("CategorytSearchDTOList");
		session.remove("masterChangeProductId");
		session.remove("MasterChangeCompleteDTO");
		session.remove("masterChangeCategoryId");


		return result;

	}


	//フィールドのgetterとsetter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
