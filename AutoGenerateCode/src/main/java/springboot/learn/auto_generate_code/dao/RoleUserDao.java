package springboot.learn.auto_generate_code.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springboot.learn.auto_generate_code.entity.RoleUser;

/**
 * (RoleUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-24 16:45:15
 */
@Mapper
public interface RoleUserDao extends BaseMapper<RoleUser> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<RoleUser> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<RoleUser> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<RoleUser> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<RoleUser> entities);

}

