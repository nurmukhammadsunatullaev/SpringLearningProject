package com.example.springlearningproject.factory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ReplaceClass(replaceClass = ReplaceChildBean.class)
public class ReplaceBean {
  private final  String title = "Parent";
}
