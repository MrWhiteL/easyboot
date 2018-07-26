package org.greattimes.easyvue.system.service.impl;

import org.greattimes.easyvue.system.entity.User;
import org.greattimes.easyvue.system.mapper.UserMapper;
import org.greattimes.easyvue.system.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author LiHua
 * @since 2018-07-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
