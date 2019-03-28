package de.ganze.workflow.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity // This tells Hibernate to make a table out of this class
public class Message {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String text;
  private String tag;

  public Message(String text, String tag) {
    this.text = text;
    this.tag = tag;
  }

  public Message() {

  }

}