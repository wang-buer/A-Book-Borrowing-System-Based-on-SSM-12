package com.entity.vo;

import com.entity.JieyuezhengjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 借阅证件
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
public class JieyuezhengjianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 个人账号
	 */
	
	private String gerenzhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 相片
	 */
	
	private String xiangpian;
		
	/**
	 * 可借天数
	 */
	
	private Integer kejietianshu;
		
	/**
	 * 可借数量
	 */
	
	private Integer kejieshuliang;
		
	/**
	 * 可续天数
	 */
	
	private Integer kexutianshu;
		
	/**
	 * 备注信息
	 */
	
	private String beizhuxinxi;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：个人账号
	 */
	 
	public void setGerenzhanghao(String gerenzhanghao) {
		this.gerenzhanghao = gerenzhanghao;
	}
	
	/**
	 * 获取：个人账号
	 */
	public String getGerenzhanghao() {
		return gerenzhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：相片
	 */
	 
	public void setXiangpian(String xiangpian) {
		this.xiangpian = xiangpian;
	}
	
	/**
	 * 获取：相片
	 */
	public String getXiangpian() {
		return xiangpian;
	}
				
	
	/**
	 * 设置：可借天数
	 */
	 
	public void setKejietianshu(Integer kejietianshu) {
		this.kejietianshu = kejietianshu;
	}
	
	/**
	 * 获取：可借天数
	 */
	public Integer getKejietianshu() {
		return kejietianshu;
	}
				
	
	/**
	 * 设置：可借数量
	 */
	 
	public void setKejieshuliang(Integer kejieshuliang) {
		this.kejieshuliang = kejieshuliang;
	}
	
	/**
	 * 获取：可借数量
	 */
	public Integer getKejieshuliang() {
		return kejieshuliang;
	}
				
	
	/**
	 * 设置：可续天数
	 */
	 
	public void setKexutianshu(Integer kexutianshu) {
		this.kexutianshu = kexutianshu;
	}
	
	/**
	 * 获取：可续天数
	 */
	public Integer getKexutianshu() {
		return kexutianshu;
	}
				
	
	/**
	 * 设置：备注信息
	 */
	 
	public void setBeizhuxinxi(String beizhuxinxi) {
		this.beizhuxinxi = beizhuxinxi;
	}
	
	/**
	 * 获取：备注信息
	 */
	public String getBeizhuxinxi() {
		return beizhuxinxi;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
