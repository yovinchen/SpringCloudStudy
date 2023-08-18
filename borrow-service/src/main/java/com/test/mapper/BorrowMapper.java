package com.test.mapper;

import com.test.entity.Borrow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: BorrowMapper
 * Package: com.test.mapper
 *
 * @author yovinchen
 * @Create 2023/8/14 17:04
 */
@Mapper
public interface BorrowMapper {
    @Select("select * from DB_BORROW where uid = #{uid}")
    List<Borrow> getBorrowsByUid(int uid);

    @Select("select * from DB_BORROW where bid = #{bid}")
    List<Borrow> getBorrowsByBid(int bid);

    @Select("select * from DB_BORROW where bid = #{bid} and uid = #{uid}")
    Borrow getBorrow(int uid, int bid);

    @Insert("insert into db_borrow(uid, bid) values (#{uid},#{bid})")
    int addBorrow(int uid, int bid);
}
