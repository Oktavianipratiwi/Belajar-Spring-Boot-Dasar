package com.ani.belajarspringdasar.spring.core.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import com.ani.belajarspringdasar.spring.core.data.User;

public class LoginSuccessEvent extends ApplicationEvent {

  @Getter
  private final User user;

  public LoginSuccessEvent(User user){
    super(user);
    this.user = user;
  }

}
