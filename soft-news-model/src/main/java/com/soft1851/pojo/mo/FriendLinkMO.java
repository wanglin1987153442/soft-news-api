package com.soft1851.pojo.mo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.Date;

/**
 * @ClassName: dasda @Description: TODO @Author: WangLinLIN @Date: 2020/11/24 15:04:30  @Version:
 * V1.0
 */
@Document("FriendLink")
public class FriendLinkMO {
  @Id private String id;

  @Field("link_name")
  private String linkName;

  @Field("link_url")
  private String linkUrl;

  @Field("is_delete")
  private Integer isDelete;

  @Field("create_time")
  private Date createTime;

  @Field("update_time")
  private Date updateTime;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getLinkName() {
    return linkName;
  }

  public void setLinkName(String linkName) {
    this.linkName = linkName;
  }

  public String getLinkUrl() {
    return linkUrl;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }

  public Integer getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Integer isDelete) {
    this.isDelete = isDelete;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}