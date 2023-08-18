package com.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.test.entity.Book;
import org.apache.ibatis.annotations.Update;

/**
 * ClassName: BookMapper
 * Package: com.test.mapper
 *
 * @author yovinchen
 * @Create 2023/8/14 17:02
 */
@Mapper
public interface BookMapper {

    @Select("select * from DB_BOOK where bid = #{bid}")
    Book getBookById(int bid);

    @Select("select count from DB_BOOK  where bid = #{bid}")
    int getRemain(int bid);

    @Update("update DB_BOOK set count = #{count}  where bid = #{bid}")
    int setRemain(int bid, int count);
}
