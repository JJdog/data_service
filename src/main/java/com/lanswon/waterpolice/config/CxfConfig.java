package com.lanswon.waterpolice.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.List;

/** CXF配置
 * @Author GU-YW
 * @Date 2019/8/1 14:17
 */
@Configuration
public class CxfConfig {

//    @Bean
//    @ConditionalOnMissingBean
//    @Lazy
//    public DockingBankService bankService(){
//        DockingBankService bankService=new DockingBankServiceImplService().getDockingBankServiceImplPort();
//        Client client= ClientProxy.getClient(bankService);
//        List<Interceptor<? extends Message>> in=client.getInInterceptors();
//        in.add(new LoggingInInterceptor());
//        List<Interceptor<? extends Message>> out=client.getOutInterceptors();
//        out.add(new LoggingOutInterceptor());
//        out.add(new WsInterceptor("admin", "admin"));
//        return bankService;
//    }

}
