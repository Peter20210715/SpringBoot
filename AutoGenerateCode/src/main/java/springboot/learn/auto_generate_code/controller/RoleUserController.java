package springboot.learn.auto_generate_code.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import springboot.learn.auto_generate_code.entity.RoleUser;
import springboot.learn.auto_generate_code.service.RoleUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (RoleUser)表控制层
 *
 * @author makejava
 * @since 2022-05-24 16:45:15
 */
@RestController
@RequestMapping("roleUser")
public class RoleUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RoleUserService roleUserService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param roleUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RoleUser> page, RoleUser roleUser) {
        return success(this.roleUserService.page(page, new QueryWrapper<>(roleUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.roleUserService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param roleUser 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RoleUser roleUser) {
        return success(this.roleUserService.save(roleUser));
    }

    /**
     * 修改数据
     *
     * @param roleUser 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RoleUser roleUser) {
        return success(this.roleUserService.updateById(roleUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.roleUserService.removeByIds(idList));
    }
}

