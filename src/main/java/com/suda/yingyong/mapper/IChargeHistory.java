package com.suda.yingyong.mapper;

import com.suda.yingyong.pojo.ChargeHistory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 *  implemetion class
 */
@Repository
//
@Component
public interface IChargeHistory {
    @Select("select * from charge_history where ch_id = #{v} ")
      List<ChargeHistory> getHistoriesById(int i);
      List <ChargeHistory> getHistoriesByIds(List<Integer> userids);

     void deleteByCHPOJOMultyParam(int ch_id, int user_id);
     void deleteByCHPOJO(int ch_id);
     void deleteByCHPOJOByHashmap(HashMap<String, String> myMap);
     @Select("select * from charge_history where ch_id = #{v} ")
     List<ChargeHistory> selectChargeAndUser(int user_id);

     @Select("select * from charge_history where ch_id = #{v} ")
     List <ChargeHistory> selectHistoryByIdAan(@Param("ch_id") int ch_id);
    @Update("update charge_history set charge_type = #{charge_type} where ch_id = #{ch_id} ")
    void updateChargeHistory2(@Param("charge_type") int charge_type, @Param("ch_id") int ch_id);

    @Select("<script> "
            +"select * from charge_history "
            +"<if test='page_number!=null and page_size != null '>"
            + "LIMIT #{page_number},#{page_size}"
            + "</if>"
            + "</script>")
    List<ChargeHistory> selectPages(@Param("page_number") Integer page_number, @Param("page_size") Integer page_size);


    @Select("<script> "
            +"select * from charge_history "
            +" where user_id in "
            +  "<foreach item=\"ww\" index=\"ix\" collection=\"idList\" "
            +    "open=\"(\" separator=\",\" close=\")\">"
            +    "#{ww}"
            +"</foreach>  "
            + "</script>")
    List<ChargeHistory> selecHistoriesByInOP(@Param("idList") List<Integer> idList);

}
