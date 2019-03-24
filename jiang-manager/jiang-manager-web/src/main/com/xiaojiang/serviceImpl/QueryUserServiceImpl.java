package com.xiaojiang.serviceImpl;

import com.xiaojiang.dao.UserQueryMapper;
import com.xiaojiang.entity.PostUserParameter;
import com.xiaojiang.service.QueryUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人:小江
 * @创建时间:2019/2/26 0026
 * @描述:XXX
 */
@Service
public class QueryUserServiceImpl implements QueryUserService {

    @Autowired
    UserQueryMapper dao = null;

    /**
     *@描述   判断登录
     *@参数   userParameter         前端表单提交用户
     *@返回值 PostUserParameter    数据库用户
     *@创建人 小江
     *@创建时间 2019/2/26 0026
     *@修改人和其它信息
     */
    @Override
    public PostUserParameter queryByUser(PostUserParameter userParameter) {
        return dao.queryByUser(userParameter);
    }

}
