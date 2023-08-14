package com.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.entity.Book;

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
}
