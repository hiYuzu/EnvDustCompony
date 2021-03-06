package com.tcb.env.service;

import java.util.List;

import com.tcb.env.pojo.CollectDeviceBox;

/**
 * 
 * <p>[功能描述]：超标采样箱子服务接口</p>
 * <p>Copyright (c) 1997-2018 TCB Corporation</p>
 * 
 * @author	王垒
 * @version	1.0, 2018年7月24日上午11:06:17
 * @since	EnvDust 1.0.0
 *
 */
public interface ICollectDeviceBoxService {

	/**
	 * 
	 * <p>[功能描述]：获取超标采样设备箱子个数</p>
	 * 
	 * @author	王垒, 2018年7月23日上午10:26:47
	 * @since	EnvDust 1.0.0
	 *
	 * @param collectDeviceBox
	 * @return
	 */
	int getCollectDeviceBoxCount(CollectDeviceBox collectDeviceBox);
	
	/**
	 * 
	 * <p>[功能描述]：获取超标采样设备箱子信息</p>
	 * 
	 * @author	王垒, 2018年7月23日上午10:28:07
	 * @since	EnvDust 1.0.0
	 *
	 * @param collectDeviceBox
	 * @return
	 */
	List<CollectDeviceBox> getCollectDeviceBox(CollectDeviceBox collectDeviceBox);
	
	/**
	 * 
	 * <p>[功能描述]：新增超标采样设备箱子</p>
	 * 
	 * @author	王垒, 2018年7月23日上午10:29:02
	 * @since	EnvDust 1.0.0
	 *
	 * @param collectDeviceBox
	 * @return
	 */
	int insertCollectDeviceBox(CollectDeviceBox collectDeviceBox);
	
	/**
	 * 
	 * <p>[功能描述]：更新超标采样设备箱子</p>
	 * 
	 * @author	王垒, 2018年7月23日上午10:29:02
	 * @since	EnvDust 1.0.0
	 *
	 * @param collectDeviceBox
	 * @return
	 */
	int updateCollectDeviceBox(CollectDeviceBox collectDeviceBox);
	
	/**
	 * 
	 * <p>[功能描述]：删除超标采样设备箱子</p>
	 * 
	 * @author	王垒, 2018年7月23日上午10:30:34
	 * @since	EnvDust 1.0.0
	 *
	 * @param boxIdList
	 * @return
	 */
	int deleteCollectDeviceBox(List<String> boxIdList) throws Exception;
	
	/**
	 * 
	 * <p>[功能描述]：是否存在相同的采样箱子（更新）</p>
	 * 
	 * @author	王垒, 2018年7月30日下午5:38:57
	 * @since	EnvDust 1.0.0
	 *
	 * @param boxId
	 * @param boxNo
	 * @param cdId
	 * @return
	 */
	int getSampleBoxExist(String boxId,String boxNo,String cdId);
	
}
