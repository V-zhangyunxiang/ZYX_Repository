package com.hkd.ithome.tools;

public class NoChange {
	
	/**
	 * 服务器地址
	 */
	public final static String WEB_SERVERS_ADDRESS="http://192.168.1.125:8080/ITHome";
	/**
	 * 查询辣品信息的接口
	 */
	public final static String SELECT_GOODS=WEB_SERVERS_ADDRESS+"/lapin_seletGoodsInfo?";
	
	/**
	 * 查询当前用户默认地址信息的接口
	 */
	public final static String SELECT_DEFAULT_ADDRESS=WEB_SERVERS_ADDRESS+"/lapin_getdefaultAddressInfo?";
    
	/**
	 * 添加当前用户的收货地址
	 */
	public final static String ADD_ADDRESSINFO=WEB_SERVERS_ADDRESS+"/lapin_addAddressInfo?";
	
	/**
	 * 查询当前用户所有的收货地址
	 */
	public final static String SELECT_ADDRESSLIST=WEB_SERVERS_ADDRESS+"/lapin_getAddressList?";
	/**
	 * 更改默认地址
	 */
	public final static String CHANGE_DEFAULT_ADDRESS=WEB_SERVERS_ADDRESS+"/lapin_changDefaultAddress?";
	
	/**
	 * 删除地址信息
	 */
	public final static String DELETE_ADDRESSINFO=WEB_SERVERS_ADDRESS+"/lapin_delete?";
	
	/**
	 * 更新地址信息
	 */
	public final static String UPDATE_ADDRESSINFO=WEB_SERVERS_ADDRESS+"/lapin_update?";
	/**
	 * 添加购物车信息
	 */
	public final static String ADD_SHOP_CAR=WEB_SERVERS_ADDRESS+"/lapin_addShopCar?";
	/**
	 * 查询购物车信息
	 */
	public final static String SELECT_SHOP_CAR=WEB_SERVERS_ADDRESS+"/lapin_selectShopCarInfo?";
	/**
	 * 更新购物车单品数量
	 */
	public final static String UPDATE_SHOPCAR_GOODNUM=WEB_SERVERS_ADDRESS+"/lapin_updateShopCarGoodNum?";
	
	/**
	 * 添加购物订单
	 */
	
}
