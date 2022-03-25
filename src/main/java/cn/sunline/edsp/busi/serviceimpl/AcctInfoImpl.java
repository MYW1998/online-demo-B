
package cn.sunline.edsp.busi.serviceimpl;

import java.math.BigDecimal;

import cn.sunline.adp.cedar.busi.sdk.biz.global.SysUtil;
import cn.sunline.adp.core.annotation.Generated;
import cn.sunline.adp.metadata.model.annotation.ConfigType;
import cn.sunline.edsp.busi.errors.AtErrorDef.AtError;
import cn.sunline.edsp.busi.tables.AtTable.Kapp_acctDao;
import cn.sunline.edsp.busi.tables.AtTable.kapp_acct;
import cn.sunline.edsp.busi.type.BasicEnumType.E_ACCTST;

 /**
  * Account information service type implementation
  *
  */
@Generated
@ConfigType(value="AcctInfoImpl", longname="Account information service type implementation", type=ConfigType.Type.SERVICE)
public class AcctInfoImpl implements cn.sunline.edsp.busi.servicetype.AcctInfo{
 /**
  * Create account information
  *
  */
	public void createAcct(final cn.sunline.edsp.busi.servicetype.AcctInfo.createAcct.Input input, final cn.sunline.edsp.busi.servicetype.AcctInfo.createAcct.Output output){
		
		try {
			String custNo = input.getCustno();
			BigDecimal tranam = input.getTranam();
			//Create an account
			kapp_acct acctInfo = SysUtil.getInstance(kapp_acct.class);
			String acctNo = "account number: " + System.currentTimeMillis() / 1000;
			String cardNo = "card number: " + System.currentTimeMillis() / 1000;
			acctInfo.setAcctno(acctNo);
			acctInfo.setAcctst(E_ACCTST.normal);
			acctInfo.setCardno(cardNo);
			acctInfo.setCustno(custNo);
			acctInfo.setAcctam(tranam);
			Kapp_acctDao.insert(acctInfo);
			
			
			output.setAcctno(acctNo);
			output.setAcctst(E_ACCTST.normal);
			output.setCardno(cardNo);
			output.setAcctam(tranam);
			
		
			
		} catch(Exception e) {
			throw AtError.E002();
		}
	}


}

