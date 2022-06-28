package springboot.learn.auto_generate_code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import springboot.learn.auto_generate_code.dao.RoleUserDao;
import springboot.learn.auto_generate_code.entity.RoleUser;
import springboot.learn.auto_generate_code.service.RoleUserService;
import org.springframework.stereotype.Service;

/**
 * (RoleUser)表服务实现类
 *
 * @author makejava
 * @since 2022-05-24 16:45:22
 */
@Service("roleUserService")
public class RoleUserServiceImpl extends ServiceImpl<RoleUserDao, RoleUser> implements RoleUserService {

}

