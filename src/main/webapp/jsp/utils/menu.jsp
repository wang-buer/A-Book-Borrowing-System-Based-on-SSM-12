<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
var menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除","生成证件"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改","删除"],"menu":"借阅证件","menuJump":"列表","tableName":"jieyuezhengjian"}],"menu":"借阅证件管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","审核","删除"],"menu":"挂失信息","menuJump":"列表","tableName":"guashixinxi"}],"menu":"挂失信息管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"图书分类","menuJump":"列表","tableName":"tushufenlei"}],"menu":"图书分类管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","删除","审核","催还"],"menu":"借书信息","menuJump":"列表","tableName":"jieshuxinxi"}],"menu":"借书信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","审核","删除"],"menu":"归还信息","menuJump":"列表","tableName":"guihaixinxi"}],"menu":"归还信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","删除","审核"],"menu":"续借信息","menuJump":"列表","tableName":"xujiexinxi"}],"menu":"续借信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","删除","审核"],"menu":"图书挂失","menuJump":"列表","tableName":"tushuguashi"}],"menu":"图书挂失管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"催还信息","menuJump":"列表","tableName":"cuihaixinxi"}],"menu":"催还信息管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","挂失"],"menu":"借阅证件","menuJump":"列表","tableName":"jieyuezhengjian"}],"menu":"借阅证件管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","修改","删除"],"menu":"挂失信息","menuJump":"列表","tableName":"guashixinxi"}],"menu":"挂失信息管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","借书"],"menu":"图书信息","menuJump":"列表","tableName":"tushuxinxi"}],"menu":"图书信息管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","归还","续借","挂失"],"menu":"借书信息","menuJump":"列表","tableName":"jieshuxinxi"}],"menu":"借书信息管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"归还信息","menuJump":"列表","tableName":"guihaixinxi"}],"menu":"归还信息管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除"],"menu":"续借信息","menuJump":"列表","tableName":"xujiexinxi"}],"menu":"续借信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","删除"],"menu":"图书挂失","menuJump":"列表","tableName":"tushuguashi"}],"menu":"图书挂失管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"催还信息","menuJump":"列表","tableName":"cuihaixinxi"}],"menu":"催还信息管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"用户","tableName":"yonghu"}];

var hasMessage = '';
