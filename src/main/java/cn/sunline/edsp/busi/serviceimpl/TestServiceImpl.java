package cn.sunline.edsp.busi.serviceimpl;

import cn.sunline.adp.core.util.SpringUtils;
import cn.sunline.adp.metadata.base.util.EdspCoreBeanUtil;
import cn.sunline.edsp.busi.servicetype.TestService;
import cn.sunline.edsp.busi.servicetype.TestService.createName.Input;
import cn.sunline.edsp.busi.servicetype.TestService.createName.Output;

public class TestServiceImpl implements TestService{

	@Override
	public Output createName(Input input) {
		String name = input.getName();
		Output output = EdspCoreBeanUtil.getModelObjectCreator().create(Output.class);
		String port = SpringUtils.getEnv().getProperty("server.port");
		output.setPorttwo(port);
		output.setName(name);
		System.out.println("===================invoke success===================");
		return output;
	}

}
