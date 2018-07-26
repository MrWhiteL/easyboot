package org.greattimes.easyvue.system.service.impl;

import org.greattimes.easyvue.system.entity.Role;
import org.greattimes.easyvue.system.mapper.RoleMapper;
import org.greattimes.easyvue.system.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author LiHua
 * @since 2018-07-27
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
