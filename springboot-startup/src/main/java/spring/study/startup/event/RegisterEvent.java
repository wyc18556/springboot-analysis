package spring.study.startup.event;

import org.springframework.context.ApplicationEvent;

public class RegisterEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public RegisterEvent(Object source) {
        super(source);
    }
}
