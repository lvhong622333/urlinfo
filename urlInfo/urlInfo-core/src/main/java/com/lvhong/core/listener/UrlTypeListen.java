package com.lvhong.core.listener;

import javax.annotation.Resource;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

@SuppressWarnings("serial")
public class UrlTypeListen implements TaskListener {
	
	@Resource
	private RuntimeService runtimeService;

	@Override
	public void notify(DelegateTask delegateTask) {
		delegateTask.setAssignee((String) runtimeService.getVariable(delegateTask.getExecutionId(), "user"));
	}

}
