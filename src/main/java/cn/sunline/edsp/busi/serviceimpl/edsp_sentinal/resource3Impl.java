
package cn.sunline.edsp.busi.serviceimpl.edsp_sentinal;

/**
 * 资源3的实现类
 */
@cn.sunline.adp.core.annotation.Generated
@cn.sunline.adp.metadata.model.annotation.ConfigType(value = "resource3Impl", longname = "资源3的实现类", type = cn.sunline.adp.metadata.model.annotation.ConfigType.Type.SERVICE)
public class resource3Impl implements cn.sunline.edsp.busi.servicetype.edsp_sentinal.resource3 {
    /**
     * 测试场景：异常可控  采用奇偶规则
     * 偶数：返回goodsId
     * 奇数：抛异常
     */
    public Integer odevityInvoke(final cn.sunline.edsp.busi.servicetype.edsp_sentinal.resource3.odevityInvoke.Input input) {
        String goodsId = input.getGoodsId();
        Integer result = Integer.valueOf(goodsId);
        if (result % 2 == 0) {
            return result;
        } else {
            throw new RuntimeException("请求异常");
        }
    }

    /**
     * 测试场景：和上面接口组合测试，应用对配置了rule和灭有配置rule的控制
     * 调用成功 返回0
     */
    public Integer noRuleInvoke(final cn.sunline.edsp.busi.servicetype.edsp_sentinal.resource3.noRuleInvoke.Input input) {
        String goodsId = input.getGoodsId();
        return Integer.valueOf(0);
    }
}

