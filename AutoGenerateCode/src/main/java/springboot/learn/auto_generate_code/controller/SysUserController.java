package springboot.learn.auto_generate_code.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.json.JSONObject;
import springboot.learn.auto_generate_code.entity.SysUser;
import springboot.learn.auto_generate_code.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 用户表(SysUser)表控制层
 *
 * @author makejava
 * @since 2022-05-24 14:19:55
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param sysUser 查询实体
     * @return 所有数据
     */
    @GetMapping("/index")
    public R selectAll(Page<SysUser> page, SysUser sysUser) {
        logger.info("you have into index api,congratulation!");
        return success(this.sysUserService.page(page, new QueryWrapper<>(sysUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/getById")
    public R selectOne(@RequestParam String  id) {
        logger.info("**********你已经成功进入到getById接口内部了：");
        logger.info("此时传入的id值为：{}",id);

        return success(this.sysUserService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param sysUser 实体对象
     * @return 新增结果
     */
    @PostMapping("/addUser")
    public R insert(@RequestBody SysUser sysUser) {
        logger.info("you have into addUser api ,congratulation!");
        logger.info("your input the information of newUser is :{}",sysUser);
        return success(this.sysUserService.save(sysUser));
    }

    /**
     * 修改数据
     *
     * @param sysUser 实体对象
     * @return 修改结果
     */
    @PutMapping("/updateUser")
    public R update(@RequestBody SysUser sysUser) {

        logger.info("you have into the updateUser api, congratulation!");
        logger.info(sysUser.toString());
        return success(this.sysUserService.updateById(sysUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.sysUserService.removeByIds(idList));
    }
}

