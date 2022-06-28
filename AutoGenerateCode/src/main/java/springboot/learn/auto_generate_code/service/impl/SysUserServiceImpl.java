package springboot.learn.auto_generate_code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import springboot.learn.auto_generate_code.dao.SysUserDao;
import springboot.learn.auto_generate_code.entity.SysUser;
import springboot.learn.auto_generate_code.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(SysUser)表服务实现类
 *
 * @author makejava
 * @since 2022-05-24 14:20:24
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

}

