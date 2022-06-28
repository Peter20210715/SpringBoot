package springboot.learn.auto_generate_code.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (RoleUser)表实体类
 *
 * @author makejava
 * @since 2022-05-24 16:45:15
 */
@SuppressWarnings("serial")
public class RoleUser extends Model<RoleUser> {
    //主键
    private Long id;
    //用户姓名
    private String name;
    //用户联系方式：微信码
    private String wechatcode;
    //用户年龄
    private Date age;
    //用户性别
    private String sex;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWechatcode() {
        return wechatcode;
    }

    public void setWechatcode(String wechatcode) {
        this.wechatcode = wechatcode;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }

