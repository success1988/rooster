package cn.fetosoft.rooster.broadcast;

import cn.fetosoft.rooster.core.Result;
import cn.fetosoft.rooster.core.TaskInfo;

import java.util.List;

/**
 * 任务广播
 * @author guobingbing
 * @create 2020/1/27 11:05
 */
public interface TaskBroadcast {

	/**
	 * 注册
	 * @param taskInfo
	 * @return
	 */
	default Result broadcast(TaskInfo taskInfo){
		return null;
	}

	/**
	 * 获取已注册的任务
	 * @return
	 */
	default List<TaskInfo> getRegisterdTasks(){ return null; }

	/**
	 * 销毁资源
	 */
	default void close(){}
}
