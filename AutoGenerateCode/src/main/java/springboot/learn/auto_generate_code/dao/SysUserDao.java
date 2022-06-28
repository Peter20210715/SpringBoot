package springboot.learn.auto_generate_code.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springboot.learn.auto_generate_code.entity.SysUser;

/**
 * 用户表(SysUser)表数据库访问层
 *当使用工具自动生成该文件时，记得添加@Mapper注释，不然工具找不到
 * @author makejava
 * @since 2022-05-24 14:19:58
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUser> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<SysUser> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<SysUser> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<SysUser> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<SysUser> entities);

}

