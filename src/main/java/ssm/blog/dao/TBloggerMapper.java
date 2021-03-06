package ssm.blog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import ssm.blog.entity.TBlogger;
import ssm.blog.entity.TBloggerExample;
@Repository("tBloggerMapper")
public interface TBloggerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    long countByExample(TBloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int deleteByExample(TBloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int insert(TBlogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int insertSelective(TBlogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    List<TBlogger> selectByExampleWithBLOBs(TBloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    List<TBlogger> selectByExample(TBloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    TBlogger selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") TBlogger record, @Param("example") TBloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TBlogger record, @Param("example") TBloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int updateByExample(@Param("record") TBlogger record, @Param("example") TBloggerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int updateByPrimaryKeySelective(TBlogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TBlogger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blogger
     *
     * @mbg.generated Thu Mar 22 06:59:11 CST 2018
     */
    int updateByPrimaryKey(TBlogger record);
}