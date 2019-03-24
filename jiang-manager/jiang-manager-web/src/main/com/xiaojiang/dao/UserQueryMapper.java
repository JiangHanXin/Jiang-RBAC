package com.xiaojiang.dao;

import com.xiaojiang.entity.PostUserParameter;
import org.springframework.stereotype.Repository;

/**
 * @创建人:小江
 * @创建时间:2019/2/26 0026
 * @描述:用户查询 mapper
 */

@Repository
public interface UserQueryMapper {

    //查询
    public PostUserParameter queryByUser(PostUserParameter user);

}
