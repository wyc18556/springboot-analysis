package spring.study.startup.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import spring.study.startup.bean.SimpleBean;
import spring.study.startup.event.RegisterEvent;

@Slf4j
public class RegisterListener implements ApplicationListener<RegisterEvent> {

    @Override
    public void onApplicationEvent(RegisterEvent event) {
        Object source = event.getSource();
        if (source instanceof SimpleBean){
            SimpleBean user = (SimpleBean) source;
            log.info("用户:{}注册成功，监听器逻辑执行...", user.getName());
        }else {
            throw new RuntimeException("用户注册监听器，监听事件类型错误错误");
        }
    }
}
