package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "abouts")
public class About {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  public About() {

  }

  public About(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "About [id=" + id + ", title=" + title + ", desc=" + description + "]";
  }

}
