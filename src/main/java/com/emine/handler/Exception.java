package com.emine.handler;


import lombok.Data;

import java.sql.Date;

@Data
public class Exception<E> {
  private  String hostName;

  private String path;

  private Date createTime;

  private E message;
}
