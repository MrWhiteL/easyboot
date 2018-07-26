package org.greattimes.easyvue.system.service.impl;

import org.greattimes.easyvue.system.entity.Menu;
import org.greattimes.easyvue.system.mapper.MenuMapper;
import org.greattimes.easyvue.system.service.IMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author LiHua
 * @since 2018-07-27
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
