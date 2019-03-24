package com.xiaojiang.service;

import com.xiaojiang.entity.PostUserParameter;

/**
 * @创建人:小江
 * @创建时间:2019/2/26 0026
 * @描述:查询用户服务
 */
public interface QueryUserService {

    public PostUserParameter queryByUser(PostUserParameter userParameter);

}
