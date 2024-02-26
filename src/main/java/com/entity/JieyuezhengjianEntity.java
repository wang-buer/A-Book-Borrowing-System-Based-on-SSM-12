package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 借阅证件
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-20 22:41:45
 */
@TableName("jieyuezhengjian")
public class JieyuezhengjianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JieyuezhengjianEntity() {
		
	}
	
	public JieyuezhengjianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 证件编号
	 */
					
	private String zhengjianbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：证件编号
	 */
	public void setZhengjianbianhao(String zhengjianbianhao) {
		this.zhengjianbianhao = zhengjianbianhao;
	}
	/**
	 * 获取：证件编号
	 */
	public String getZhengjianbianhao() {
		return zhengjianbianhao;
	}
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
