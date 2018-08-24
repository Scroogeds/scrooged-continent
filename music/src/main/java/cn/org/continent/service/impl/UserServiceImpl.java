package cn.org.continent.service.impl;

import cn.org.continent.base.entity.DataTable;
import cn.org.continent.base.service.impl.BaseServiceImpl;
import cn.org.continent.entity.User;
import cn.org.continent.mapper.IUserMapper;
import cn.org.continent.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Design By Scrooged
 * @version 1.0
 * @description
 * @date 2018/8/23 16:47
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<IUserMapper, User> implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    @Override
    public User selectByUid(String sid) {
        return selectById(sid);
    }

    @Override
    public boolean delById(String sid) {
        return deleteById(sid);
    }

    @Override
    public boolean modifyById(User user) {
        return updateById(user);
    }

    @Override
    public boolean add(User user) {
        return insert(user);
    }

    @Override
    public List<User> selectAll() {
        return selectList(null);
    }

    @Override
    public DataTable<User> findByPage(DataTable dataTable) {
        return pageSearch(dataTable);
    }
}
