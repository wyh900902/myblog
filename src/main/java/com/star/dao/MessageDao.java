package com.star.dao;

import com.star.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 留言持久层接口
 * @Date: Created in 11:25 2020/4/16
 * @Author: HUIGE
 * @QQ群: 530311074
 * @URL: https://huige.work/
 */
@Mapper
@Repository
public interface MessageDao {

    //添加一个评论
    int saveMessage(Message message);

    //查询父级评论
    List<Message> findByParentIdNull(@Param("ParentId") Long ParentId);

    //查询一级回复
    List<Message> findByParentIdNotNull(@Param("id") Long id);

    //查询二级以及所有子集回复
    List<Message> findByReplayId(@Param("childId") Long childId);

    //删除评论
    void deleteMessage(Long id);

    // 根据父评论id查询留言信息
    Message getEmailByParentId(Long parentId);
}